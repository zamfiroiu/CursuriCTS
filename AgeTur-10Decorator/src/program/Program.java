package program;

import codulexistent.PachetCazare;
import codulexistent.PachetTuristic;
import decorator.OfertaPachetCazare;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachetTuristic = new PachetCazare();
		pachetTuristic.descriere();
		System.out.println("Acest pachet nu poate fi anulat");
		System.out.println();
		OfertaPachetCazare pachetTuristicOferta=new OfertaPachetCazare(pachetTuristic);
		pachetTuristicOferta.descriere();
		System.out.println("Acest pachet poate fi anulat");
		pachetTuristicOferta.anulareRezervare();
	}

}
