package program;

import prototype.CloneFactory;
import prototype.Sheep;
import prototype_deepcopy.*;

public class Program {
	
	public static void main(String[]args) {
		IListaOferte listaOferte=new ListaOferte();
		listaOferte.incarcaListaOferte();
		
		IListaOferte copieListaOferte = null;
		copieListaOferte = listaOferte.copiaza();		
		
		System.out.println(copieListaOferte.toString());

        CloneFactory cloneFactory = new CloneFactory();
        Sheep dolly = new Sheep();
        System.out.println(System.identityHashCode(dolly));

        Sheep dollyClone = (Sheep) cloneFactory.getClone(dolly);
        System.out.println(System.identityHashCode(dollyClone));
	}

}
