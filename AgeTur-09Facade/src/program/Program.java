package program;


import facade.Facade;

public class Program {

	public static void main(String[] args) {
		Facade rezervareSejur=new Facade();		
		rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Deva");
	}
}
