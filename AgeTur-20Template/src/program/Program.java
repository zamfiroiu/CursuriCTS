package program;

import template.PachetCazare;
import template.PachetCazareTransport;
import template.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachetCazare=new PachetCazare(5);
		pachetCazare.vindePachet();
		
		PachetTuristic pachetCT=new PachetCazareTransport(23);
		pachetCT.vindePachet();
		
	}

}
