package com.test.HotelAPI.PostResponse.Bean;

/**
 * @author dipak.das
 *
 */
public class Search {
	
	private String id;
	private String searchType;
	
	public Search() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	
}
