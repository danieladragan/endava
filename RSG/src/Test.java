
public class Test {

	public static void main(String[] args) {
		
		RandomStringGenerator rd = new RandomStringGenerator(25, "abcdefghijkl");
		System.out.println(RandomStringGenerator.next());
		
		
		PasswordMaker p = new PasswordMaker(new String("Daniela"), 
											new String ("Dragan"),
											22);
		System.out.println(p.getPassword());
	}

}
