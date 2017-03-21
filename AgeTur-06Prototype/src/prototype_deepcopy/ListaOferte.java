package prototype_deepcopy;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

	private List<String> oferte;
	
	public void setOferte(List<String> oferte) {
		this.oferte = oferte;
	}

	public ListaOferte() {
		oferte=new ArrayList<String>();
	}

	@Override
	public void incarcaListaOferte() {
		oferte.add("Oferta 1");
		oferte.add("Oferta 2");
		oferte.add("Oferta 3");
		oferte.add("Oferta 4");
		oferte.add("Oferta 5");
		oferte.add("Oferta 6");
		oferte.add("Oferta 7");
		oferte.add("Oferta 8");
		oferte.add("Oferta 9");
		
	}
	
	@Override
	public IListaOferte copiaza() {
		ListaOferte listaOferte=new ListaOferte();
		List<String> listaTemporara=new ArrayList<String>();
		for(String oferta:this.oferte){
			listaTemporara.add(oferta);
		}
		listaOferte.setOferte(listaTemporara);
			
		return listaOferte;
	}

	@Override
	public String toString() {
		return "ListaOferte [oferte=" + oferte + "]";
	}

}
