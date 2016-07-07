import java.util.Random;

public class RandomStringGenerator {
	static int nr;
	static String str;
	
	public RandomStringGenerator(int nr, String str)
	{
		this.nr = nr;
		this.str = str;
	}

	public static String next()
	{
		Random generator = new Random();
		char[] chNew = new char[nr];
		char[] ch = str.toCharArray();
		
		for (int i = 0 ; i < nr ; i ++){
			int value = generator.nextInt(str.length());
			chNew[i] = ch[value];
		}
		
		String result = new String(chNew);
		return result;
	}
}
