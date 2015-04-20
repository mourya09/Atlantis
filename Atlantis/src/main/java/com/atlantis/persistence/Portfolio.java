/**
 * 
 */
package com.atlantis.persistence;

import java.io.Serializable;

/**
 * @author Praveen Kumar
 * 
 */
public class Portfolio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6752702536380670364L;

	private Integer userId;
	private String portFolioName;
	private Integer alarmId;

	public Integer getUserId() {
		return userId;
	}

	public String getPortFolioName() {
		return portFolioName;
	}

	public Integer getAlarmId() {
		return alarmId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setPortFolioName(String portFolioName) {
		this.portFolioName = portFolioName;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}

}
