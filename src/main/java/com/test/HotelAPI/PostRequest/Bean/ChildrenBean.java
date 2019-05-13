package com.test.HotelAPI.PostRequest.Bean;

/**
 * @author dipak.das
 *
 */
public class ChildrenBean {
	
	private Object childrenAges;
	private Integer childrenCount;
	private Integer adultsCount;
	
	public ChildrenBean() {
		super();
		
	}
	public Integer getChildrenCount() {
		return childrenCount;
	}
	public Object getChildrenAges() {
		return childrenAges;
	}


	public void setChildrenAges(Object childrenAges) {
		this.childrenAges = childrenAges;
	}


	public void setChildrenCount(Integer childrenCount) {
		this.childrenCount = childrenCount;
	}
	public Integer getAdultsCount() {
		return adultsCount;
	}
	public void setAdultsCount(Integer adultsCount) {
		this.adultsCount = adultsCount;
	}
}
