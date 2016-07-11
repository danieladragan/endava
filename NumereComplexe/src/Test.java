
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumarComplex nr1 = new NumarComplex(2,3);
		NumarComplex nr2 = new NumarComplex(5,4);
		NumarComplex nrAdd = new NumarComplex();
		NumarComplex nrMult = new NumarComplex();

		nrAdd = Operatii.addComplex(nr1, nr2);
		System.out.println(nrAdd);
		
		nrMult = Operatii.multComplex(nr1, nr2);
		System.out.println(nrMult);
	}

}
