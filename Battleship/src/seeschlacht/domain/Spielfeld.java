package seeschlacht.domain;

public class Spielfeld {
	private final boolean FREUND = true;
	private final boolean FEIND = false;
	private final boolean SPIELER1 = true;
	private final boolean SPIELER2 = false;
	public final int BREITE = 8;
	public final int HOEHE = 8;
	private Feld[][] feldSpieler1 = new Feld[BREITE][HOEHE];
	private Feld[][] feldSpieler2 = new Feld[BREITE][HOEHE];
	
	private boolean aktuellerSpieler = SPIELER1;
	
	public Spielfeld() {
		for (int y = this.HOEHE - 1; y >= 0 ; y--) {
			for (int x = 0; x < this.BREITE; x++) {
				feldSpieler1[x][y] = new Feld();
				feldSpieler2[x][y] = new Feld();
			}
		}		
	}
		
	public Feld getFeld(int x, int y, boolean spieler) {
		if (spieler = SPIELER1) {
			return feldSpieler1[x][y];
		} else {
			return feldSpieler2[x][y];
		}
	}
	
	public void setzeSchiffe() {
		int anzahlFünfer = 1;
		int anzahlVierer = 2;
		int anzahlDreier = 3;
		int anzahlZweier = 4;
		
		
	}

	public String schussAusführen(int x, int y) {
		Feld feld = new Feld();
		
		if (aktuellerSpieler = SPIELER1) {
			feld = feldSpieler2[x][y];
		} else {
			feld = feldSpieler1[x][y];
		}
			
		if (feld == null)
			return "Feld existiert nicht.";
		
		if (feld.getSchuss())
			return "Auf diese Koordinate wurde bereits geschossen.";
		
		if (x > (BREITE - 1) || x < 0 || y > (HOEHE - 1) || y < 0)
			return "Koordinate existiert nicht.";		
		
		if (aktuellerSpieler = SPIELER1) {
			feldSpieler2[x][y].setSchuss();
		} else {
			feldSpieler1[x][y].setSchuss();
		}
		aktuellerSpieler = !aktuellerSpieler;
		
		return "Zug ausgeführt";
	}
	
	public String getAktuellerSpieler() {
		return aktuellerSpieler? "Spieler 1": "Spieler 2";
	}
	
	// Unfertige Methode. Hier müssten jeweils das "eigene" Feld, also das Feld des aktuellen Spielers, und das gegnerische Feld ausgegeben werden.
	public String textAusgabeAufbereiten() {
		StringBuffer spielfeld = new StringBuffer();
		
		for (int y = 0; y < this.HOEHE; y++) {
			spielfeld.append((this.HOEHE - y) + " ");

			for (int x = 0; x < this.BREITE; x++) {
				Feld aktuellesFeld = this.getFeld(x, y, aktuellerSpieler);
				spielfeld.append(aktuellesFeld.getHintergrund(aktuellerSpieler));
			}
			spielfeld.append(System.getProperty("line.separator"));
		}

		spielfeld.append("  ");
		for (char koor = 'A'; koor < (this.BREITE + 'A'); koor++) {
			spielfeld.append(" " + koor + " ");

		}
		
		return spielfeld.toString();
	}
}
