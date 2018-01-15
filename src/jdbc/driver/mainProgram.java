package jdbc.driver;

import java.sql.SQLException;

public class mainProgram {

	public static void main(String[] args) throws SQLException {
		
		DataService ds = new DataService();
		ds.retrieveAllBuchungen();
		
	}

}
