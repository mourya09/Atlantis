/**
 * 
 */
package com.atlantis.persistence;

import java.io.Serializable;

/**
 * @author Praveen Kumar
 * 
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 632801458614116775L;
	private Integer userID;
	private String userName;
	private String userPassword;
	private String firstName;
	private String userMidName;
	private String lastName;
	private String emailId;
	private String bankId;
	private String userType = "DOM";
	private String address;
	private String mobileNumber;
	public Integer getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getUserMidName() {
		return userMidName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getBankId() {
		return bankId;
	}
	public String getUserType() {
		return userType;
	}
	public String getAddress() {
		return address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setUserMidName(String userMidName) {
		this.userMidName = userMidName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
