
public class NumarComplex {
	float im;
	float re;
	
	public NumarComplex(){
		im = 0;
		re = 0;
	}
	
	public NumarComplex(float re, float im){
		this.re = re;
		this.im = im;
	}
	
	public String toString(){

		String str = re + " + " + im + "i";
		
		return str;
	}
}
