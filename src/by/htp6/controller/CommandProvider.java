package by.htp6.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp6.command.Command;
import by.htp6.command.impl.AddUser;
import by.htp6.command.impl.DeleteUser;
import by.htp6.command.impl.EditUser;
import by.htp6.command.impl.GetUsers;
import by.htp6.command.impl.Login;
import by.htp6.command.impl.Logout;
import by.htp6.command.impl.Redirect;
import by.htp6.command.impl.SetLocale;
import by.htp6.command.impl.ToPersonalPage;

public class CommandProvider {
	
	private static Map<String, Command> commands = new HashMap<String, Command>();
	
	public static final CommandProvider provider = new CommandProvider();
	
	private CommandProvider(){
		commands.put("login", new Login());
		commands.put("setLocale", new SetLocale());
		commands.put("toPersonalPage", new ToPersonalPage());
		commands.put("logout", new Logout());
		commands.put("addUser", new AddUser());
		commands.put("redir", new Redirect());
		commands.put("getUsers", new GetUsers());
		commands.put("editUser", new EditUser());
		commands.put("deleteUser", new DeleteUser());
	}
	
	public static Command getCommand(String commandName){
		Command command;
		command = commands.get(commandName);
		return command;
	}

}
