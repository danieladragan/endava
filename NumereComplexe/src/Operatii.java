
public class Operatii {
	static float re1;
	static float re2;
	static float im1;
	static float im2;
	
	public Operatii(){}
	/* adunare de nr complexe */
	public static NumarComplex addComplex(NumarComplex nr1, NumarComplex nr2)
	{
		float re;
		float im;
		NumarComplex nrComplex;
		
		re1 = nr1.re;
		re2 = nr2.re;
		
		im1 = nr1.im;
		im2 = nr2.im;
		
		re = re1 + re2;
		im = im1 + im2;
		
		nrComplex = new NumarComplex(re, im);
		
		return nrComplex;
	}
	
	/* inmultire de nr complexe */
	public static NumarComplex multComplex(NumarComplex nr1, NumarComplex nr2)
	{
		float re;
		float im;
		NumarComplex nrComplex;
		
		re1 = nr1.re;
		re2 = nr2.re;
		
		im1 = nr1.im;
		im2 = nr2.im;
		
		re = (re1 * re2) - (im1 * im2) ;
		im = (re1 * im2) + (re2 * im1);
		
		nrComplex = new NumarComplex(re, im);
		
		return nrComplex;
	}
}
