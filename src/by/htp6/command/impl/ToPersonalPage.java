package by.htp6.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp6.bean.PositionsEnum;
import by.htp6.bean.User;
import by.htp6.command.Command;

public class ToPersonalPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = (User) request.getSession(true).getAttribute("user");
		String page = null;
		
		PositionsEnum position;
		if (user.getPosition() != null){
			position = PositionsEnum.valueOf(user.getPosition().toUpperCase());
			
		
			switch(position) {
				case ADMINISTRATOR: 
					page = "WEB-INF/admin.jsp";
					break;
				case DISPATCHER:
					page = "WEB-INF/disp.jsp";
					break;
				case PILOT:
					page = "WEB-INF/user.jsp";
					break;
				case NAVIGATOR:
					page = "WEB-INF/user.jsp";
					break;
				case RADIOMAN:
					page = "WEB-INF/user.jsp";
					break;
				case STEWARDESS:
					page = "WEB-INF/user.jsp";
					break;
			}
		} else page = "WEB-INF/noAcsess.jsp";
		
		request.getRequestDispatcher(page).forward(request, response);
	}

}
