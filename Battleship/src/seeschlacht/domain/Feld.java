package seeschlacht.domain;

public class Feld {
	//private final String name;
	private boolean isSchuss = false;
	private boolean isSchiff = false;
	private final boolean FREUND = true;
	private final boolean FEIND = false;
	private final char SCHUSS = 'X';
	private final char SCHIFF = '\u25A1';
	private final char TREFFER = '\u25A0';
	private char hintergrundFreund;
	private char hintergrundFeind;

	public Feld() {
		//this.name = name;
		this.hintergrundFreund = ' ';
		this.hintergrundFeind = ' ';
	}
	
	public void setSchiff() {
		this.isSchiff = true;
		this.hintergrundFreund = SCHIFF;
	}
	
	public boolean getSchiff() {
		return isSchiff;
	}
	
	public void setSchuss() {
		this.isSchuss = true;
		if (this.isSchiff) {
			this.hintergrundFreund = TREFFER;
			this.hintergrundFeind = TREFFER;
		} else {
			this.hintergrundFreund = SCHUSS;
			this.hintergrundFeind = SCHUSS;
		}
	}
	
	public boolean getSchuss() {
		return isSchuss;
	}
	
	public char getHintergrund(boolean spieler) {
		if (spieler = FREUND) {
			return hintergrundFreund;
		} else {
			return hintergrundFeind;
		}
	}

}
