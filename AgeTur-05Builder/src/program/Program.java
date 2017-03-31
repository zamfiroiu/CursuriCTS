package program;

import v1_builder.*;

public class Program {

	public static void main(String[] args) {
		PachetTransport pachetTransport=new PachetTransportBuilder().setHasAC(true).setHasTV(true).setHasWiFi(true).build();
		System.out.println(pachetTransport.toString());

		PachetTransport pt=new PachetTransport(false,false,false,false,false);
		pt.setHasAC(true);
		pt.setHasTV(true);
	}

}
