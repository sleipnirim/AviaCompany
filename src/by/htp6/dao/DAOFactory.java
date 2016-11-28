package by.htp6.dao;

import by.htp6.dao.impl.SQLUserDAO;


public class DAOFactory {
	private static final DAOFactory INSTANCE = new DAOFactory();
	
	private DAOFactory(){}
	
	private UserDAO userDAO = new SQLUserDAO();
	
	public static DAOFactory getDAOFactory(){
		return INSTANCE;
		
	}
	
	public UserDAO getUserDAO(){
		return userDAO;
	}
	

}
