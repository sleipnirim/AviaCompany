package by.htp6.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	
	public static Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection con = null;
				
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AviaCompany","root","1234");
		
		return con;
	}
	

}
