/**
 * 
 */
package com.atlantis.persistence;

import java.io.Serializable;
import java.sql.Timestamp;



/**
 * @author Praveen Kumar
 *
 */
public class AlarmDetails implements Serializable {
	/*ALARM_ID INTEGER NOT NULL,
	USER_ID INTEGER NOT NULL,
	SYMBOL VARCHAR(20) NOT NULL,
	THRESHOLD_PRICE FLOAT DEFAULT 0.0 NOT NULL,
	CURRENT_PRICE FLOAT DEFAULT 0.0 NOT NULL,
	VALIDITY TIMESTAMP DEFAULT NOW,
	BORKERAGE FLOAT DEFAULT 25,
	BUY_OR_SELL VARCHAR(2) DEFAULT 'SE',*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4359010372754992219L;
	private Integer alarmId;
	private String symbol;
	private Float thresholdPrice = 0.0f;
	private Float currentPrice=0.0f;
	private Timestamp validity;
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
	public Timestamp getValidity() {
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
	public void setValidity(Timestamp validity) {
		this.validity = validity;
	}
	public void setBorkerage(Float borkerage) {
		this.borkerage = borkerage;
	}
	public void setBuyOrSell(String buyOrSell) {
		this.buyOrSell = buyOrSell;
	}
}
