package composite;

public interface OptiuneMeniu {

	void adaugaOptiune(OptiuneMeniu optiune) throws Exception;
	void stergeOptiune(OptiuneMeniu optiune) throws Exception;
	OptiuneMeniu getOptiune(int pozitie) throws Exception;
	void apasaOptiuneMeniu();
	void descriere();
}
