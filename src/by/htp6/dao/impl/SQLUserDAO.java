package by.htp6.dao.impl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp6.bean.PositionsEnum;
import by.htp6.bean.User;
import by.htp6.dao.UserDAO;
import by.htp6.dao.exception.DAOException;
import by.htp6.dao.sql.SQLConnection;


public class SQLUserDAO implements UserDAO{
	
	

	@Override
	public User login(String login, String password) {
		
		Connection conn = null;
		String query = "SELECT * FROM Employees LEFT JOIN Positions ON Positions.id = Employees.Positions_id WHERE Login = '"+login+"';";
		User user = new User();
		
		try {
			conn = SQLConnection.getConnection();
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(query);
			
			if(result.isBeforeFirst()){
				result.next();
				if (result.getString("Password").equals(password)){
					user.setLogin(result.getString("Login"));
					user.setName(result.getString("Name"));
					user.setSurname(result.getString("Surname"));
					user.setPosition(result.getString("Position"));
					user.setId(result.getInt("id"));
				} else {
					user.setErrorStatus(true);
					user.setErrorMessage("Wrong password");
				}
			} else {
				user.setErrorStatus(true);
				user.setErrorMessage("Wrong login");
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			user.setErrorStatus(true);
			user.setErrorMessage("${DBError}");
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return user;
	}

	@Override
	public void addUser(User user, String password) throws DAOException {
		
		Connection conn = null;
		
		String login = user.getLogin();
		String name = user.getName();
		String surname = user.getSurname();
		PositionsEnum positions;
		positions = PositionsEnum.valueOf(user.getPosition().toUpperCase());
		String position = null;
		switch (positions) {
			case ADMINISTRATOR: 
				position = "6";
				break;
			case DISPATCHER:
				position = "5";
				break;
			case PILOT:
				position = "1";
				break;
			case NAVIGATOR:
				position = "2";
				break;
			case RADIOMAN:
				position = "3";
				break;
			case STEWARDESS:
				position = "4";
				break;
		}
		
		String query = "INSERT INTO Employees (Login, Password, Name, Surname, Positions_id) VALUES ('"+login+"', '"+password+"', '"+name+"', '"+surname+"', '"+position+"');";
		
		try {
			conn = SQLConnection.getConnection();
			conn.createStatement().executeUpdate(query);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		}
	}

	@Override
	public List<User> getUsers() throws DAOException {
		
		Connection conn = null;
		List<User> users = new ArrayList<User>();
		String query = "SELECT * FROM Employees LEFT JOIN Positions ON Positions.id = Employees.Positions_id;";
		
		try {
			conn = SQLConnection.getConnection();
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(query);
			
			while(result.next()){
				User user = new User();
				user.setLogin(result.getString("Login"));
				user.setName(result.getString("Name"));
				user.setSurname(result.getString("Surname"));
				user.setPosition(result.getString("Position"));
				user.setId(result.getInt("id"));
				users.add(user);
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		}
		
		return users;
	}

	@Override
	public void deleteUser(String id) throws DAOException {
		Connection conn = null;
		String query = "DELETE FROM Employees WHERE id = '" + id + "';";
		
		try {
			conn = SQLConnection.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		}
		
		
	}

	@Override
	public User editUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
