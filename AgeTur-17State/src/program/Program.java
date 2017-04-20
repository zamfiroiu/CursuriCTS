package program;

import state.Rezervare;
import state.StareNeplatita;
import state.StarePlatita;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1000);
		
		StareNeplatita neplatita=new StareNeplatita();
		neplatita.doAction(rezervare);
		
		StarePlatita platita=new StarePlatita();
		platita.doAction(rezervare);
		
	}

}
