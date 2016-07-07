import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Carte c1 = Test.adaugaCarte(s);
		Carte c2 = Test.adaugaCarte(s);
		
		if (Verificari.verfDuplicat(c1, c2))
			System.out.println("Cartile sunt duplicat");
		else
			System.out.println("cartile NU sunt duplicat");
		
		System.out.println("[ " + Verificari.verifGrosime(c1, c2) + " ] este mai groasa");
		
		s.close();
	}

}
