package com.atlantis.persistence;

import java.io.Serializable;

public class Bank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7088073263478343597L;
	private Integer id;
	private String name;
	private String customerType = "D";
	private Float minCharge = 25.0f;
	private Float charge = 0.005f;
	private Float ceiling = 0.0025f;
	private Float charge_less_than10 = 0.0025f;
	private Float saleTax = 0.001236f;
	private Float securityTransactionTax = 0.001f;
	private Float securityTransactionTax2 = 0.00001f;
	private Float stampDuty = 0.00001f;
	private Float sembiTurnoverTax = 0.0000022472f;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public Float getMinCharge() {
		return minCharge;
	}
	public void setMinCharge(Float minCharge) {
		this.minCharge = minCharge;
	}
	public Float getCharge() {
		return charge;
	}
	public void setCharge(Float charge) {
		this.charge = charge;
	}
	public Float getCeiling() {
		return ceiling;
	}
	public void setCeiling(Float ceiling) {
		this.ceiling = ceiling;
	}
	public Float getCharge_less_than10() {
		return charge_less_than10;
	}
	public void setCharge_less_than10(Float charge_less_than10) {
		this.charge_less_than10 = charge_less_than10;
	}
	public Float getSaleTax() {
		return saleTax;
	}
	public void setSaleTax(Float saleTax) {
		this.saleTax = saleTax;
	}
	public Float getSecurityTransactionTax() {
		return securityTransactionTax;
	}
	public void setSecurityTransactionTax(Float securityTransactionTax) {
		this.securityTransactionTax = securityTransactionTax;
	}
	public Float getSecurityTransactionTax2() {
		return securityTransactionTax2;
	}
	public void setSecurityTransactionTax2(Float securityTransactionTax2) {
		this.securityTransactionTax2 = securityTransactionTax2;
	}
	public Float getStampDuty() {
		return stampDuty;
	}
	public void setStampDuty(Float stampDuty) {
		this.stampDuty = stampDuty;
	}
	public Float getSembiTurnoverTax() {
		return sembiTurnoverTax;
	}
	public void setSembiTurnoverTax(Float sembiTurnoverTax) {
		this.sembiTurnoverTax = sembiTurnoverTax;
	}
}
