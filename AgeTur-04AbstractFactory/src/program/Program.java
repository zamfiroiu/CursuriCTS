package program;

import abstractfactory.Factory;
import abstractfactory.FactoryCategoria1;
import abstractfactory.PachetCazare;
import abstractfactory.PachetTransport;

public class Program {	
	PachetCazare obtineCazare(Factory fabrica){
		return fabrica.createPachetCazare();
	}

	public static void main(String[] args) {
		Factory fabricaAgentie=new FactoryCategoria1();
		PachetCazare cazare= fabricaAgentie.createPachetCazare();
		cazare.descriere();
	}
}
