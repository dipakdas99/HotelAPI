package com.test.HotelAPI.Controller;

import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.HotelAPI.GetResponse.Bean.MainGetResponseBean;
import com.test.HotelAPI.GetResponse.Bean.Rates;
import com.test.HotelAPI.PostRequest.Bean.MainSearchBean;
import com.test.HotelAPI.PostResponse.Bean.MainPostResponseBean;
import com.test.HotelAPI.Services.HotelAPIServices;

/**
 * @author dipak.das
 * @see http://localhost:8080/doFilter?minPrice=10&maxPrice=10000&providerCode=priceline.com&hotelId=690184
 * @see http://localhost:8080/doFilter?minPrice=10&maxPrice=10000&providerCode=&hotelId=690184
 * Simple hotel API which will accept JSON data as post request and return some response with search id.
 * Using that search id as request to get the response of every details about hotels. 
 */
@RestController
public class HotelController {
	
	@Autowired
	private HotelAPIServices hotelAPIServices;
	/**
	 * Filtering hotels with min, max price , hotelId  and providerCode
	 * @param search
	 * @param minPrice
	 * @param maxPrice
	 * @param providerCode
	 * @param hotelId
	 * @return {code} if not found HttpStatus.NOT_FOUND {code} HttpStatus.OK
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws URISyntaxException 
	 */
	@SuppressWarnings("unchecked")
	@PostMapping("/doFilter")
	public ResponseEntity<JSONArray> getSearchId(@RequestBody MainSearchBean search, 
			@RequestParam("minPrice") Integer minPrice, 
			@RequestParam("maxPrice") Integer maxPrice,
			@RequestParam("providerCode") String providerCode,
			@RequestParam("hotelId") Integer hotelId) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, URISyntaxException{
		//Base URL
		final String baseUrl = "https://srv.wegostaging.com/v2/metasearch/hotels/searches";
		MainPostResponseBean postMethodResponse = null;
		try {
			// Getting POST response
			postMethodResponse = hotelAPIServices.getPostResponse(baseUrl, search);
		} catch (URISyntaxException e) {
			throw e;
		}
		// Getting the search id from response
		String searchID = postMethodResponse.getSearch().getId();
		final String searchURL = "https://srv.wegostaging.com/v2/metasearch/hotels/searches/"+searchID+"/results?currencyCode=INR";
		
		MainGetResponseBean getMethodResponse = null;
		try {
			getMethodResponse = hotelAPIServices.getSearchIDResponse(searchURL);
		}catch(URISyntaxException e) {
			throw e;
		}
		
		// Min and Max price hotel
		
		JSONObject obj = new JSONObject();
				
		JSONArray arr = new JSONArray();
		
		for (Rates rate : getMethodResponse.getRates()) {
			if ((rate.getPrice().getAmount() >= minPrice && rate.getPrice().getAmount() <= maxPrice) 
					&& (hotelId == null || rate.getHotelId().equals(hotelId)) 
					&& (providerCode.equals("") || rate.getProviderCode().equals(providerCode))) {
				obj.put("id", rate.getId());
				obj.put("hotelId", rate.getHotelId());
				obj.put("providerCode", rate.getProviderCode());
				obj.put("description", rate.getDescription());
				Map<Object, Object> m = new LinkedHashMap<>();
				m.put("amount", rate.getPrice().getAmount());
				m.put("currencyCode", rate.getPrice().getCurrencyCode());
				m.put("taxAmount", rate.getPrice().getTaxAmount());
				m.put("taxInclusive", rate.getPrice().isTaxInclusive());
				m.put("localTaxAmount", rate.getPrice().getLocalTaxAmount());
				m.put("totalAmount", rate.getPrice().getTotalAmount());
				obj.put("price", m);
				obj.put("handOffUrl", rate.getHandoffUrl());
				arr.add(obj);
				obj = new JSONObject();
			}
		}
		if (arr.size() == 0)
			return new ResponseEntity<JSONArray>(arr, HttpStatus.NOT_FOUND);
		return new ResponseEntity<JSONArray>(arr, HttpStatus.OK);
	}
}
