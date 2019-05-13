package com.test.HotelAPI.PostRequest.Bean;

import java.util.List;

/**
 * @author dipak.das
 *
 */
public class MainSearchBean {
	
	private SearchPost search;
	
	private List<Integer> rateAmenityIds;
	
	private Integer offset;
	

	public MainSearchBean() {
		super();
	}

	public List<Integer> getRateAmenityIds() {
		return rateAmenityIds;
	}

	public void setRateAmenityIds(List<Integer> rateAmenityIds) {
		this.rateAmenityIds = rateAmenityIds;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}


	public SearchPost getSearch() {
		return search;
	}


	public void setSearch(SearchPost search) {
		this.search = search;
	}
}
