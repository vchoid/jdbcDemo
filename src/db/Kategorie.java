package db;

public class Kategorie {

	private int katID;
	private int katBez;
	
	public Kategorie(){
		
	}

	public void setKatID(int katID) {
		this.katID = katID;
	}

	public void setKatBez(int katBez) {
		this.katBez = katBez;
	}

	public void deleteKategorie(){
		//TODO soll eine Kategorie aus der DB löschen
	}
	
	public void setNewKategorie(){
		//TODO legt eine neue Kategorie an
	}
	
	public int getKatID() {
		return katID;
	}

	public int getKatBez() {
		return katBez;
	}

	
	
	
}
