package by.htp6.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp6.bean.User;
import by.htp6.command.Command;
import by.htp6.service.ServiceFactory;
import by.htp6.service.UserService;
import by.htp6.service.exception.ServiceException;

public class AddUser implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setLogin(request.getParameter("login"));
		user.setName(request.getParameter("name"));
		user.setSurname(request.getParameter("surname"));
		user.setPosition(request.getParameter("position"));
		String password = request.getParameter("password");
		
		if(user.getLogin() != "" & user.getName() != "" & user.getPosition() != "" &
				user.getSurname() != "" & password != ""){
			ServiceFactory factory = ServiceFactory.getInstance();
			UserService service = factory.getUserService();
			try {
				service.addUser(user, password);
			} catch (ServiceException e) {
				request.setAttribute("addStatus", "1");
				e.printStackTrace();
			} 
		} else {
				request.setAttribute("addStatus", "2");
			}	
		
		if(request.getAttribute("addStatus") == null){
			request.setAttribute("addStatus", "3");
		}
		
		request.getRequestDispatcher("WEB-INF/addUser.jsp").forward(request, response);
		
	}
}
