package program;

import strategy.Card;
import strategy.Cash;
import strategy.Client;
import strategy.PayPal;

public class Program {

	public static void main(String[] args) {
		Client client=new Client("Popescu");
		
		client.setModPlata(new Card());
		client.plateste(300);
		
		client.setModPlata(new Cash());
		client.plateste(100);
	}

}
