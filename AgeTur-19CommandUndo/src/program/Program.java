package program;

import command.ComandaRezervare;
import command.ComandaVanzare;
import command.Command;
import operator.Operator;
import pachete.PachetCazare;
import pachete.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();
		
		Command vanzare=new ComandaVanzare(pachet);
		Command rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);
		
		operator.undo();
		operator.undo();
	}

}
