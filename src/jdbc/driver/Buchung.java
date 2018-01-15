package jdbc.driver;

import java.util.Date;
import java.util.List;



public class Buchung {

	private int buchungsID;
	private int transferR;
	private String verwendungszweck;
	private double betrag;
	private Date buchungsDatum;
	private Date erfassungsDatum;
	private int konto;
	private int kategorie;
	private int status;
	private int turnus;
	List<Buchung> buchung;

	public Buchung(List<Buchung> buchung) {
		this.buchung = buchung;
	}

	public Buchung(int buchungsID, int transferR, String verwendungszweck, double betrag, Date buchungsDatum,
			Date erfassungsDatum, int konto, int kategorie, int status, int turnus) {
		super();
		this.buchungsID = buchungsID;
		this.transferR = transferR;
		this.verwendungszweck = verwendungszweck;
		this.betrag = betrag;
		this.buchungsDatum = buchungsDatum;
		this.erfassungsDatum = erfassungsDatum;
		this.konto = konto;
		this.kategorie = kategorie;
		this.status = status;
		this.turnus = turnus;
	}

	public String getVerwendungszweck() {
		return verwendungszweck;
	}

	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public Date getBuchungsDatum() {
		return buchungsDatum;
	}

	public void setBuchungsDatum(Date buchungsDatum) {
		this.buchungsDatum = buchungsDatum;
	}

	public int getTransferR() {
		return transferR;
	}

	public void setTransferR(int transferR) {
		this.transferR = transferR;
	}

	public int getKonto() {
		return konto;
	}

	public void setKonto(int konto) {
		this.konto = konto;
	}

	public int getKategorie() {
		return kategorie;
	}

	public void setKategorie(int kategorie) {
		this.kategorie = kategorie;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTurnus() {
		return turnus;
	}

	public void setTurnus(int turnus) {
		this.turnus = turnus;
	}

	public void setBuchungsID(int buchungsID) {
		this.buchungsID = buchungsID;
	}

	public void setErfassungsDatum(Date erfassungsDatum) {
		this.erfassungsDatum = erfassungsDatum;
	}

	public int getBuchungsID() {
		return buchungsID;
	}

	public Date getErfassungsDatum() {
		return erfassungsDatum;
	}

	public void changeBuchung() {
		// TODO eine Buchung ändern
	}

	public void deleteBuchung() {
		// TODO eine Buchung löschen
	}
}
