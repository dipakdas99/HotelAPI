package com.test.HotelAPI.Services;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.HotelAPI.GetResponse.Bean.MainGetResponseBean;
import com.test.HotelAPI.PostRequest.Bean.MainSearchBean;
import com.test.HotelAPI.PostResponse.Bean.MainPostResponseBean;

/**
 * @author dipak.das
 *
 */
@Service
public class HotelAPIServices {
	
	RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * For POST response
	 * @param baseUrl
	 * @param search
	 * @return
	 * @throws URISyntaxException
	 */
	public MainPostResponseBean getPostResponse(String baseUrl, MainSearchBean search) throws URISyntaxException {
		URI uri = new URI(baseUrl);
		ResponseEntity<MainPostResponseBean> result = restTemplate.postForEntity(uri, search, MainPostResponseBean.class);
		return result.getBody();
	}
	/**
	 * For GET response
	 * @param searchURL
	 * @return
	 * @throws URISyntaxException
	 */
	public MainGetResponseBean getSearchIDResponse(String searchURL) throws URISyntaxException {
		URI uri = new URI(searchURL);
		MainGetResponseBean result = restTemplate.getForObject(uri, MainGetResponseBean.class);
		return result;
	}
}
