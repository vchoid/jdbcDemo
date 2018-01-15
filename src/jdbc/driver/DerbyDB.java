package jdbc.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbyDB{

	public Connection connect;
	
	public DerbyDB(){
		try {
			loadDriverForDerbyDB();
			setupConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void setupConnection() throws SQLException{
		connect = DriverManager.getConnection("jdbc:derby://localhost:1527/budgetplanner", "budget", "budget");
	}
	
	private void loadDriverForDerbyDB() throws ClassNotFoundException{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	}
	
	public void shutdownDerbyDB() throws SQLException{
		Statement statement = connect.createStatement();
		statement.execute("SHUTDOWN");
		
	}
	
	public void closeConnection() throws SQLException{
		shutdownDerbyDB();
		connect.close();
	}
	
	
	 
	 
	 
}
