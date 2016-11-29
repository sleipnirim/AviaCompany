package by.htp6.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp6.bean.User;
import by.htp6.command.Command;
import by.htp6.service.ServiceFactory;
import by.htp6.service.UserService;

public class Login implements Command{

	@Override
	public void execute (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = null;
		String password = null;
		User user;
		
		login = request.getParameter("login");
		password = request.getParameter("password");

		
		ServiceFactory factory = ServiceFactory.getInstance();
		UserService service = factory.getUserService();
		user = service.login(login, password);
		
		request.getSession(true).setAttribute("user", user);
		
		if (!user.isErrorStatus()){	
			
			ToPersonalPage redir = new ToPersonalPage();
			redir.execute(request, response);
			
		} else {
			RequestDispatcher disp2 = request.getRequestDispatcher("login.jsp");
			disp2.forward(request, response);
		}
	}
	
}
