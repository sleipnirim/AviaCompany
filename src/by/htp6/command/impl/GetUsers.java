package by.htp6.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp6.bean.User;
import by.htp6.command.Command;
import by.htp6.service.ServiceFactory;
import by.htp6.service.UserService;
import by.htp6.service.exception.ServiceException;

public class GetUsers implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceFactory factory = ServiceFactory.getInstance();
		UserService service = factory.getUserService();
		try {
			List<User> users = (ArrayList<User>) service.getUsers();
			request.setAttribute("users", users);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "DBError");
		}
		
		request.getRequestDispatcher("WEB-INF/users.jsp").forward(request, response);

	}

}
