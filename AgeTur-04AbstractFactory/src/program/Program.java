package program;

import abstractfactory.Factory;
import abstractfactory.FactoryCategoria1;
import abstractfactory.PachetCazare;
import abstractfactory.PachetTransport;

public class Program {
	
	PachetCazare obtineCazare(Factory fabrica){
		return fabrica.createPachetCazare();
	}
	
	private static class Helper{
		
		private Factory fabrica;
		public Helper(Factory fabrica){
			this.fabrica=fabrica;
		}
		
		public PachetCazare obtineCazare(){
			return fabrica.createPachetCazare();
		}
		
		public PachetTransport obtineTransport(){
			return fabrica.createPachetTransport();
		}
	}

	public static void main(String[] args) {
		Factory fabricaAgentie=new FactoryCategoria1();
		PachetCazare cazare= fabricaAgentie.createPachetCazare();
		cazare.descriere();
		
//		Helper helper=new Helper(new FactoryCategoria1());
//		PachetCazare pachetCazare=helper.obtineCazare();
	}

}
