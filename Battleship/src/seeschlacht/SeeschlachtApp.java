package seeschlacht;

import seeschlacht.domain.Spielfeld;

public class SeeschlachtApp {

	public static void main(String[] args) {
		Spielfeld sf = new Spielfeld();
		new UI(sf);	
	}

}
