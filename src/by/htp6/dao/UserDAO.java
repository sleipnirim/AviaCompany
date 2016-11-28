package by.htp6.dao;

import by.htp6.bean.User;

public interface UserDAO {
	
	public User login(String login, String password);
	public void addUser(User user, String password);
	
}
