package seeschlacht;

import java.util.Scanner;

import seeschlacht.domain.Schiff;
import seeschlacht.domain.Spieler;
import seeschlacht.domain.Spielfeld;

public class UI {
	private Scanner input = new Scanner(System.in);
	private Spieler spielerEins = new Spieler();
	private Spieler spielerZwei = new Spieler();
	private int spielfeldGroese, anzSchiffe, schiffslaenge;

	public UI() {		
		System.out.println("Willkommen beim Schiffe Versenken!");
		menu();
	}

	public void menu() {
			System.out.println("Bitte Spielfeldgröße festlegen.");
			spielfeldGroese = this.input.nextInt();
			spielerEins.spielfeldHinzufuegen(spielfeldGroese);
			spielerZwei.spielfeldHinzufuegen(spielfeldGroese);
			
			while (true) {
				System.out.println("Bitte Anzahl der Schiffe festlegen (max. 10 Schiffe)");
				anzSchiffe = this.input.nextInt();
				if (anzSchiffe > 0 && anzSchiffe <= 10) {
					break;
				} 
			}
			
			for (int i = 0; i < anzSchiffe; i++) {
				while (true) {
					System.out.println("Wie goß soll das " + (i + 1) + ". Schiff sein? (max. 5 Felder)");
					schiffslaenge = input.nextInt();
					if (schiffslaenge > 0 && schiffslaenge <= 5) {
						spielerEins.schiffHinzufügen(schiffslaenge);
						spielerZwei.schiffHinzufügen(schiffslaenge);
						break;
					}
				}
	        }
			
			for (int i = 0; i < 2; i++) {
				Spieler aktuellerSpieler;
				String name;
				if (i == 0) {
					aktuellerSpieler = spielerEins;	
					name = "1. Spieler";
				} else {
					aktuellerSpieler = spielerZwei;
					name = "2. Spieler";
				}
				
				for (Schiff schiff : aktuellerSpieler.getSchiffe()) {
					int schiffslaenge = schiff.getSchiffslaenge();
					System.out.println(name);
					System.out.println("Bitte Koordinaten für das " + schiff.getName() + " eingeben.");
					int[][] koordinaten = schiff.getKoordinaten();
					
					for (int j = 0; j < schiffslaenge; j++) {
						while(true) {							
							System.out.println("Bitte " + (j+1) + ". Koordinate eingeben.");
							String eingabe = this.input.next().toUpperCase();					
						
							for (Schiff tempSchiff : aktuellerSpieler.getSchiffe()) {
								int[][] tempKoordinaten = schiff.getKoordinaten();						
							}
							if (true) {
								koordinaten[j][0] = (int)eingabe.charAt(0) - 65;
								koordinaten[j][1] = (int)eingabe.charAt(1) - 49;
								break;							
							}
						}
	
						System.out.println("debug");
					}
				}

			}
	}
	
	
	
			
/*
	public void test() {
		System.out.println();
		System.out.println(spielfeld.textAusgabeAufbereiten());

		System.out.println();
		System.out.print(spielfeld.getAktuellerSpieler() + ", Sie sind dran. Ihr Zug, bitte: ");

		String eingabe = this.input.nextLine().trim().toUpperCase();
		if ("EXIT".equals(eingabe))
			break;
		
		if (eingabe.length() != 2)
			System.out.println("-> Eingabeformat nicht korrekt");

		System.out.println("-> " + spielfeld.schussAusführen(eingabe.charAt(0) - 'A', 8 - (eingabe.charAt(1) - '0') ));
	}
*/

	
	

	public void finalize() {
		input.close();
	}
}
