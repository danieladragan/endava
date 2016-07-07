import java.util.Scanner;

public class Test {

		
		
				
		public static Carte adaugaCarte(Scanner s){
			Carte c = new Carte();
			
			
			System.out.println("Titlul cartii: ");
			c.titlu = s.nextLine();
			System.out.println("Autorul cartii: ");
			c.autor = s.nextLine();
			System.out.println("Editura cartii: ");
			c.editura = s.nextLine();
			System.out.println("Numarul de pagini al cartii: ");
			do {
				c.numarPagini = Integer.parseInt(s.nextLine());
			}while (c.numarPagini == 0);

			return c;
		}
}
