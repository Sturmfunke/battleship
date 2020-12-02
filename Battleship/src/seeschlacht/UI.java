package seeschlacht;

import java.util.Scanner;

import seeschlacht.domain.Spielfeld;



public class UI {
	private Spielfeld spielfeld;
	private final Scanner input;

	public UI(Spielfeld spielfeld) {
		this.spielfeld = spielfeld;	
		this.input = new Scanner(System.in);
		
		System.out.println("Willkommen beim Schiffe Versenken!");
		menu();
	}

	public void menu() {
		while(true) {
			
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


	}
	

	public void finalize() {
		input.close();
	}
}
