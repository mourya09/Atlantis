/**
 * 
 */
package com.atlantis.service;

import com.atlantis.persistence.Bank;

/**
 * @author Praveen Kumar
 * 
 */
public interface BankService {

	public boolean addBankDetails(Bank bank);

	public boolean removeBankDetails(Bank bank);

	public boolean modifyBankDetails(Bank bank);

}
