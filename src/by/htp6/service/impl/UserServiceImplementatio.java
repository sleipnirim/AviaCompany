package by.htp6.service.impl;

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

	
	
	

}
