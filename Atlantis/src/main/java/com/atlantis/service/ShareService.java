/**
 * 
 */
package com.atlantis.service;

import com.atlantis.persistence.Share;

/**
 * @author Praveen Kumar
 * 
 */
public interface ShareService {

	/**
	 * @param Share contains the share values with timestamp
	 * This information will add the information in the Share History database.
	 * 
	 * */
	public boolean addShare(Share share);

	/**
	 * @param ShareId to be removed.
	 * */
	public boolean removeShare(Integer shareId);

	/**
	 * @param Share Symbol to be removed.
	 * */
	public boolean removeShare(String symbol);

	/**
	 * @Share update the Share information along with history
	 * */
	public boolean updateShare(Share share);

	
	/***
	 * @param Symbol is the Share symbol. Using this symbol we can 
	 * retrieve the Share information from Atlantis.
	 * */
	public Share getShareInformation(String symbol);

}
