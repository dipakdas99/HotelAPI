package com.test.HotelAPI.GetResponse.Bean;

/**
 * @author dipak.das
 *
 */
public class Price {
	private Integer amount;
	private String currencyCode;
	private Double amountUsd;
	private Double taxAmount;
	private Double taxAmountUsd;
	private boolean taxInclusive;
	private Double ecpc;
	private Double localTaxAmount;
	private Double totalAmount;
	private Double totalAmountUsd;
	private Double totalTaxAmount;
	private Double totalTaxAmountUsd;

	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Double getAmountUsd() {
		return amountUsd;
	}
	public void setAmountUsd(Double amountUsd) {
		this.amountUsd = amountUsd;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getTaxAmountUsd() {
		return taxAmountUsd;
	}
	public void setTaxAmountUsd(Double taxAmountUsd) {
		this.taxAmountUsd = taxAmountUsd;
	}
	public boolean isTaxInclusive() {
		return taxInclusive;
	}
	public void setTaxInclusive(boolean taxInclusive) {
		this.taxInclusive = taxInclusive;
	}
	public Double getEcpc() {
		return ecpc;
	}
	public void setEcpc(Double ecpc) {
		this.ecpc = ecpc;
	}
	public Double getLocalTaxAmount() {
		return localTaxAmount;
	}
	public void setLocalTaxAmount(Double localTaxAmount) {
		this.localTaxAmount = localTaxAmount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getTotalAmountUsd() {
		return totalAmountUsd;
	}
	public void setTotalAmountUsd(Double totalAmountUsd) {
		this.totalAmountUsd = totalAmountUsd;
	}
	public Double getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(Double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public Double getTotalTaxAmountUsd() {
		return totalTaxAmountUsd;
	}
	public void setTotalTaxAmountUsd(Double totalTaxAmountUsd) {
		this.totalTaxAmountUsd = totalTaxAmountUsd;
	}
}
