package by.htp6.service.impl;

import by.htp6.bean.User;
import by.htp6.dao.DAOFactory;
import by.htp6.dao.UserDAO;
import by.htp6.service.UserService;

public class UserServiceImplementatio implements UserService{

	@Override
	public User login(String login, String password) {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDAO = factory.getUserDAO();
		
		User user = userDAO.login(login, password);
		
		return user;
	}
		

	@Override
	public void addUser(User user, String password) {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO dao = factory.getUserDAO();
		dao.addUser(user, password);
		
	}

	
	
	

}
