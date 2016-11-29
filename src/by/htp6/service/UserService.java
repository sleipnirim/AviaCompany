package by.htp6.service;

import by.htp6.bean.User;
import by.htp6.service.exception.ServiceException;

public interface UserService {
	
	public User login(String login, String password);
	public void addUser(User user, String password) throws ServiceException;

}
