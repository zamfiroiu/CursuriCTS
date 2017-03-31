package program;

import proxy.PachetTransport;
import proxy.Persoana;
import proxy.ProxyPachet;

public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Popescu", 67);
		PachetTransport pachetTransport=new PachetTransport(persoana);
		//pachetTransport.rezervaPachet();
		
		ProxyPachet pachetTransportProxy=new ProxyPachet(persoana);
		pachetTransportProxy.rezervaPachet();

	}

}
