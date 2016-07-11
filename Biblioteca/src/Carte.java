
public class Carte {
	String titlu;
	String autor;
	String editura;
	int numarPagini;
	

	
	public String toString()
	{
		titlu = titlu.toUpperCase();
		editura = editura.toLowerCase();
		
		return titlu + " " + autor + " " + editura; 
	}

}
