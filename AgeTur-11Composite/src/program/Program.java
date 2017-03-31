package program;

import composite.*;

public class Program {

	public static void main(String[] args) {
		try {
			OptiuneMeniu optiuneMeniu = new Categorie("Cazare");
			OptiuneMeniu subOptiuneMeniuMare = new Categorie("Cazare la mare");
			OptiuneMeniu subOptiuneMeniuMunte = new Categorie("Cazare la munte");
			OptiuneMeniu itemMeniu1=new ItemMeniu("Hotel 2*");
			OptiuneMeniu itemMeniu2=new ItemMeniu("Hotel 3*");
			OptiuneMeniu itemMeniu3=new ItemMeniu("Hotel 4*");
			OptiuneMeniu itemMeniu4=new ItemMeniu("Cabana 3 margarete");
		
			subOptiuneMeniuMare.adaugaOptiune(itemMeniu1);
			subOptiuneMeniuMare.adaugaOptiune(itemMeniu2);
			subOptiuneMeniuMare.adaugaOptiune(itemMeniu3);
			subOptiuneMeniuMunte.adaugaOptiune(itemMeniu4);
			optiuneMeniu.adaugaOptiune(subOptiuneMeniuMare);
			optiuneMeniu.adaugaOptiune(subOptiuneMeniuMunte);
			
			optiuneMeniu.descriere();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
