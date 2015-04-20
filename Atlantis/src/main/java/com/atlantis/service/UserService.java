/**
 * 
 */
package com.atlantis.service;

import com.atlantis.persistence.AlarmDetails;
import com.atlantis.persistence.Portfolio;
import com.atlantis.persistence.User;

/**
 * @author Praveen Kumar
 * 
 */
public interface UserService {

	public boolean addUser(User user);

	public boolean removeUser(User user);

	public boolean modifyUser(User user);

	public User authenticate(String username, String password);

	public boolean addPortfolio(User user, Portfolio portFolio,
			AlarmDetails alarmDetails);

}
