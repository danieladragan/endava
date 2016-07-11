
public class PasswordMaker {
	public static final int MAGIC_NUMBER = 10;
	public static final String MAGIC_STRING = "labhccbkfdhfbdaldfahbebaa";
	String firstName;
	String lastName;
	int age;
	
	public PasswordMaker(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getPassword()
	{
		int aux = age % 3;
		int length = firstName.length();
		char[] chFirstName = firstName.toCharArray();
		char[] lastLetters = new char[aux];
		
		for (int i = 0 ; i < aux ; i ++){
			lastLetters[i] = chFirstName[length - aux + i];
		}
		
		String strLastLetters = new String(lastLetters);
		
		RandomStringGenerator rd2 = new RandomStringGenerator(10, MAGIC_STRING);
		String alfabet = RandomStringGenerator.next();
		
		RandomStringGenerator rd1 = new RandomStringGenerator(MAGIC_NUMBER, alfabet);
		String rdMagicString = RandomStringGenerator.next();
		
		int ageLastName = age + lastName.length();
		String password = strLastLetters + rdMagicString + ageLastName;
		
		return password;
	}
}
