
public class Verificari {

	public static boolean verfDuplicat(Carte carte1, Carte carte2){
		if (!carte1.autor.equals(carte2.autor))
			return false;
		
		if (carte1.editura.equals(carte2.editura) == false)
			return false;
		
		if (carte1.titlu.equals(carte2.titlu) == false)
			return false;
		
		if (carte1.numarPagini != carte2.numarPagini)
			return false;
		
		return true;
	}
	
	public static Carte verifGrosime(Carte carte1, Carte carte2){
		if (carte1.numarPagini >= carte2.numarPagini)
			return carte1;
		else
			return carte2;
	}
}
