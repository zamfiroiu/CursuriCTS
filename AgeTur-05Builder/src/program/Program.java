package program;

import v2_builder.*;

public class Program {

	public static void main(String[] args) {
		PachetTransport pachetTransport=new PachetTransportBuilder().setHasAC(true).setHasTV(true).setHasWiFi(true).build();
		System.out.println(pachetTransport.toString());

		PachetTransport pt=new PachetTransport();
		pt.setHasAC(true);
		pt.setHasTV(true);
	}

}
