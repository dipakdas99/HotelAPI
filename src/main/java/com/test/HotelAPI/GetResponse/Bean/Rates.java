package com.test.HotelAPI.GetResponse.Bean;

/**
 * @author dipak.das
 *
 */
public class Rates {
	private String id;
	private Integer hotelId;
	private String providerHotelId;
	private String providerCode;
	private String description;
	private Price price;
	private Object rateAmenityIds;
	private String handoffUrl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getProviderHotelId() {
		return providerHotelId;
	}
	public void setProviderHotelId(String providerHotelId) {
		this.providerHotelId = providerHotelId;
	}
	public String getProviderCode() {
		return providerCode;
	}
	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public Object getRateAmenityIds() {
		return rateAmenityIds;
	}
	public void setRateAmenityIds(Object rateAmenityIds) {
		this.rateAmenityIds = rateAmenityIds;
	}
	public String getHandoffUrl() {
		return handoffUrl;
	}
	public void setHandoffUrl(String handoffUrl) {
		this.handoffUrl = handoffUrl;
	}
}
