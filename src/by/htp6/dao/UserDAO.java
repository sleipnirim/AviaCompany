package by.htp6.dao;

import java.util.List;

import by.htp6.bean.User;
import by.htp6.dao.exception.DAOException;

public interface UserDAO {
	
	public User login(String login, String password);
	public void addUser(User user, String password) throws DAOException;
	public List<User> getUsers() throws DAOException;
	public void deleteUser(String id) throws DAOException;
	public User editUser(String id);
	
}
