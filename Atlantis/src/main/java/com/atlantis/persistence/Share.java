package com.atlantis.persistence;

import java.io.Serializable;
import java.sql.Timestamp;

public class Share implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6168274677191425345L;
	private Integer shareId;
	private String name;
	private String symbol;
	private String series = "EQ";
	private Timestamp date;
	private Float previousClosePrice = 0.0f;
	private Float openPrice = 0.0f;
	private Float highPrice = 0.0f;
	private Float lowPrice = 0.0f;
	private Float lastPrice = 0.0f;
	public Integer getShareId() {
		return shareId;
	}
	public String getName() {
		return name;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getSeries() {
		return series;
	}
	public Timestamp getDate() {
		return date;
	}
	public Float getPreviousClosePrice() {
		return previousClosePrice;
	}
	public Float getOpenPrice() {
		return openPrice;
	}
	public Float getHighPrice() {
		return highPrice;
	}
	public Float getLowPrice() {
		return lowPrice;
	}
	public Float getLastPrice() {
		return lastPrice;
	}
	public Float getClosePrice() {
		return closePrice;
	}
	public Float getAveragePrice() {
		return averagePrice;
	}
	public Integer getTotalTradeQuantity() {
		return totalTradeQuantity;
	}
	public Float getTurnoverInLacs() {
		return turnoverInLacs;
	}
	public Integer getNumberOfTrades() {
		return numberOfTrades;
	}
	public Integer getDeliverableQuantity() {
		return deliverableQuantity;
	}
	public void setShareId(Integer shareId) {
		this.shareId = shareId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public void setPreviousClosePrice(Float previousClosePrice) {
		this.previousClosePrice = previousClosePrice;
	}
	public void setOpenPrice(Float openPrice) {
		this.openPrice = openPrice;
	}
	public void setHighPrice(Float highPrice) {
		this.highPrice = highPrice;
	}
	public void setLowPrice(Float lowPrice) {
		this.lowPrice = lowPrice;
	}
	public void setLastPrice(Float lastPrice) {
		this.lastPrice = lastPrice;
	}
	public void setClosePrice(Float closePrice) {
		this.closePrice = closePrice;
	}
	public void setAveragePrice(Float averagePrice) {
		this.averagePrice = averagePrice;
	}
	public void setTotalTradeQuantity(Integer totalTradeQuantity) {
		this.totalTradeQuantity = totalTradeQuantity;
	}
	public void setTurnoverInLacs(Float turnoverInLacs) {
		this.turnoverInLacs = turnoverInLacs;
	}
	public void setNumberOfTrades(Integer numberOfTrades) {
		this.numberOfTrades = numberOfTrades;
	}
	public void setDeliverableQuantity(Integer deliverableQuantity) {
		this.deliverableQuantity = deliverableQuantity;
	}
	private Float closePrice = 0.0f;
	private Float averagePrice = 0.0f;
	private Integer totalTradeQuantity = 0;
	private Float turnoverInLacs = 0.0f;
	private Integer numberOfTrades = 0;
	private Integer deliverableQuantity = 0;
}
