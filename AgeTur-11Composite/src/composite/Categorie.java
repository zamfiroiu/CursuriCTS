package composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuneMeniu {

	private List<OptiuneMeniu> optiuni;
	private String numeCategorie;
	
	public Categorie(String nume) {
		optiuni=new ArrayList<OptiuneMeniu>();
		this.numeCategorie=nume;
	}
	
	@Override
	public void adaugaOptiune(OptiuneMeniu optiune) {
		optiuni.add(optiune);
	}

	@Override
	public void stergeOptiune(OptiuneMeniu optiune) {
		optiuni.remove(optiune);
	}

	@Override
	public OptiuneMeniu getOptiune(int pozitie) {
		return optiuni.get(pozitie);
	}

	@Override
	public void apasaOptiuneMeniu() {
		System.out.println("S-a apasat categoria "+numeCategorie+". Aceasta contine contine urmatoarele sub-optiuni:");
		for(OptiuneMeniu optiune:optiuni) {
			optiune.descriere();
		}
	}

	@Override
	public void descriere() {
		System.out.println("Categoria "+ numeCategorie+" contine urmatoarele sub-optiuni:");
		for(OptiuneMeniu optiune:optiuni) {
			optiune.descriere();
		}		
	}

}
