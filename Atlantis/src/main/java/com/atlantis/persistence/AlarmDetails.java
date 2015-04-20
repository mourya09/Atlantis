/**
 * 
 */
package com.atlantis.persistence;

import java.io.Serializable;

import org.voltdb.types.TimestampType;



/**
 * @author Praveen Kumar
 *
 */
public class AlarmDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4359010372754992219L;
	private Integer alarmId;
	private String symbol;
	private Float thresholdPrice = 0.0f;
	private Float currentPrice=0.0f;
	private TimestampType validity;
	private Float borkerage=25.0f;
	private String buyOrSell = "SE";
	public Integer getAlarmId() {
		return alarmId;
	}
	public String getSymbol() {
		return symbol;
	}
	public Float getThresholdPrice() {
		return thresholdPrice;
	}
	public Float getCurrentPrice() {
		return currentPrice;
	}
	public TimestampType getValidity() {
		return validity;
	}
	public Float getBorkerage() {
		return borkerage;
	}
	public String getBuyOrSell() {
		return buyOrSell;
	}
	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public void setThresholdPrice(Float thresholdPrice) {
		this.thresholdPrice = thresholdPrice;
	}
	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public void setValidity(TimestampType validity) {
		this.validity = validity;
	}
	public void setBorkerage(Float borkerage) {
		this.borkerage = borkerage;
	}
	public void setBuyOrSell(String buyOrSell) {
		this.buyOrSell = buyOrSell;
	}
}
