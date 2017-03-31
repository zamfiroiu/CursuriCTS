package composite;

public class ItemMeniu implements OptiuneMeniu {

	private String numeItem;
	public ItemMeniu(String nume) {
		this.numeItem = nume;
	}
	@Override
	public void adaugaOptiune(OptiuneMeniu optiune) throws Exception {
		throw new Exception("Not implemented");
	}

	@Override
	public void stergeOptiune(OptiuneMeniu optiune) throws Exception {
		throw new Exception("Not implemented");
	}

	@Override
	public OptiuneMeniu getOptiune(int pozitie) throws Exception {
		throw new Exception("Not implemented");
	}

	@Override
	public void apasaOptiuneMeniu() {
		System.out.println("S-a apasat item-ul: " + this.numeItem);
	}

	@Override
	public void descriere() {
		System.out.println("	" + this.numeItem);
	}

}
