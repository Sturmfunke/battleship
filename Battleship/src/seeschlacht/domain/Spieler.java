package seeschlacht.domain;

import java.util.ArrayList;

public class Spieler {
    private ArrayList<Schiff> schiffe;
    private Spielfeld spielfeld;

    public Spieler() {
        this.schiffe  = new ArrayList<>();
    }

    public void schiffHinzufügen(int schiffslaenge) {
        Schiff s = new Schiff(schiffslaenge);
        this.schiffe.add(s);
    }

    public void schiffeAnzeigen() {
        for (Schiff schiff : schiffe) {
            System.out.println("Name : " + schiff.getName() + " , Länge: " + schiff.getSchiffslaenge());
        }
    }

    public void spielfeldHinzufuegen(int feld) {
        this.spielfeld = new Spielfeld(feld);
    }



    public ArrayList<Schiff> getSchiffe() {
        return schiffe;
    }

    public Spielfeld getSpielfeld() {
        return spielfeld;
    }
}
