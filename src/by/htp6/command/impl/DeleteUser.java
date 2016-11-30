package by.htp6.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialArray;

import by.htp6.command.Command;
import by.htp6.service.ServiceFactory;
import by.htp6.service.UserService;
import by.htp6.service.exception.ServiceException;

public class DeleteUser implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceFactory factory = ServiceFactory.getInstance();
		UserService service = factory.getUserService();
		
		String id = request.getParameter("userID");
		try {
			service.deleteUser(id);
		} catch (ServiceException e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "${DBError}");
		}
		
		request.setAttribute("command", "getUsers");
		response.sendRedirect("Controller?command=getUsers");

	}
}
