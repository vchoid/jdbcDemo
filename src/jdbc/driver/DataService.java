package jdbc.driver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataService {

	private final String INSERT_TO_BUCHUNG = "INSERT INTO BUCHUNG(transferID, verwendungszweck, betrag, buchungsdatum, kontoID, kategorieID, statusID, turnusID) VALUES(?,?,?,?,?,?,?,?)";

	DerbyDB db = new DerbyDB();

	// private void insertIntoBuchung() {
	// PreparedStatement pSt = null;
	// try {
	// pSt = db.connect.prepareStatement(INSERT_TO_BUCHUNG);
	// pSt.setInt(1, arg1);
	// pSt.setString(2, arg1);
	// pSt.setBigDecimal(3, arg1);
	// pSt.setDate(4, arg1);
	// pSt.setInt(5, arg1);
	// pSt.setInt(6, arg1);
	// pSt.setInt(7, arg1);
	// pSt.setInt(8, arg1);
	// pSt.execute();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// } finally {
	// if (pSt != null) {
	// try {
	// pSt.close();
	// } catch (SQLException e2) {
	// // nichts machen
	// }
	// }
	// }
	// }

	public List<Buchung> retrieveAllBuchungen() throws SQLException {
		List<Buchung> buchungen = new ArrayList<>();
		Statement st = db.connect.createStatement();
		ResultSet res = st.executeQuery("SELCET * FROM BUCHUNG");
		while (res.next()) {
			buchungen.add(new Buchung(res.getInt(1), res.getInt(2), res.getString(3), res.getDouble(4), res.getDate(5),
					res.getDate(6), res.getInt(7), res.getInt(8), res.getInt(9), res.getInt(10)));
		}
		//TODO löschen --------------------
		System.out.println(buchungen);
		// --------------------------------
		st.close();
		return null;
	}

}
