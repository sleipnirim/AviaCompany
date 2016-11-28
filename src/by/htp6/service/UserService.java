package by.htp6.service;

import by.htp6.bean.User;

public interface UserService {
	
	public User login(String login, String password);
	public void addUser(User user, String password);

}
