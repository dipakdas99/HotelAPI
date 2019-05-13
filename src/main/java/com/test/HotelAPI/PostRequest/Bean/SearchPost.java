package com.test.HotelAPI.PostRequest.Bean;

import java.util.List;

/**
 * @author dipak.das
 *
 */
public class SearchPost {
	
	private String siteCode;
	private String locale;
	private String currencyCode;
	private String cityCode;
	private List<ChildrenBean> rooms;
	private String checkIn;
	private String checkOut;
	private String deviceType;
	private String appType;
	private boolean userLoggedIn;
	
	public SearchPost() {
		super();
		
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public List<ChildrenBean> getRooms() {
		return rooms;
	}
	public void setRooms(List<ChildrenBean> rooms) {
		this.rooms = rooms;
	}
	
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public boolean isUserLoggedIn() {
		return userLoggedIn;
	}
	public void setUserLoggedIn(boolean userLoggedIn) {
		this.userLoggedIn = userLoggedIn;
	}
}
