package prototype_shallowcopy;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

	private List<String> oferte;
	public ListaOferte() {
		oferte=new ArrayList<String>();
	}
	
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
	public IListaOferte copiaza() throws CloneNotSupportedException {
		return (IListaOferte) super.clone();
	}

	@Override
	public String toString() {
		return "ListaOferte [oferte=" + oferte + "]";
	}

}
