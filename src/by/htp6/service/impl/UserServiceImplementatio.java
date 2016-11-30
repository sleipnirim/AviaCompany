package by.htp6.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp6.bean.User;
import by.htp6.dao.DAOFactory;
import by.htp6.dao.UserDAO;
import by.htp6.dao.exception.DAOException;
import by.htp6.service.UserService;
import by.htp6.service.exception.ServiceException;

public class UserServiceImplementatio implements UserService{

	@Override
	public User login(String login, String password) {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDAO = factory.getUserDAO();
		
		User user = userDAO.login(login, password);
		
		return user;
	}
		

	@Override
	public void addUser(User user, String password) throws ServiceException {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO dao = factory.getUserDAO();
		try {
			dao.addUser(user, password);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}


	@Override
	public List<User> getUsers() throws ServiceException {
		List<User> users = new ArrayList<User>();
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO dao = factory.getUserDAO();
		try {
			users =  dao.getUsers();
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return users;
	}


	@Override
	public void deleteUser(String id) throws ServiceException {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO user = factory.getUserDAO();
		try {
			user.deleteUser(id);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}


	@Override
	public User editUser(String id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
