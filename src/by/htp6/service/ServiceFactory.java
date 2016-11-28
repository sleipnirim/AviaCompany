package by.htp6.service;

import by.htp6.service.impl.UserServiceImplementatio;

public class ServiceFactory {
	
	private static final ServiceFactory INSTANCE = new ServiceFactory();
	
	private ServiceFactory(){}
	
	private UserService userService = new UserServiceImplementatio();
	
	public static ServiceFactory getInstance(){
		return INSTANCE;
	}
	
	public UserService getUserService(){
		return userService;
	}

}
