package seeschlacht.domain;

import java.util.Arrays;

public class Schiff {
	private int laenge;
    private String name;
    private int[][] koordinaten;

    public Schiff(int laenge) {
        this.name = String.valueOf(laenge) + "er Schiff";
        this.laenge = laenge;
        this.koordinaten = new int[laenge][2];
    }
    
    public void setSchiffslaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getSchiffslaenge() {
        return laenge;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addKoordinaten(int x, int y) {
    	
	}

    public int[][] getKoordinaten() {
        return koordinaten;
    }
}