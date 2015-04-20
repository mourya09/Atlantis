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
public class UserShares implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -504861852693106975L;

	
	private Integer userId;
	private Integer shareId;
	private Integer numberOfShares;
	private Float buyPricePerShare;
	private TimestampType buyDate;
	private TimestampType sellDate;
	private Float brokerageBuyCharge;
	private Float brokerageSellCharge;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getShareId() {
		return shareId;
	}
	public void setShareId(Integer shareId) {
		this.shareId = shareId;
	}
	public Integer getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(Integer numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public Float getBuyPricePerShare() {
		return buyPricePerShare;
	}
	public void setBuyPricePerShare(Float buyPricePerShare) {
		this.buyPricePerShare = buyPricePerShare;
	}
	public TimestampType getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(TimestampType buyDate) {
		this.buyDate = buyDate;
	}
	public TimestampType getSellDate() {
		return sellDate;
	}
	public void setSellDate(TimestampType sellDate) {
		this.sellDate = sellDate;
	}
	public Float getBrokerageBuyCharge() {
		return brokerageBuyCharge;
	}
	public void setBrokerageBuyCharge(Float brokerageBuyCharge) {
		this.brokerageBuyCharge = brokerageBuyCharge;
	}
	public Float getBrokerageSellCharge() {
		return brokerageSellCharge;
	}
	public void setBrokerageSellCharge(Float brokerageSellCharge) {
		this.brokerageSellCharge = brokerageSellCharge;
	}
	
	
}
