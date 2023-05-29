package SecondPackage;

import FirstPackage.House1;

public class House3 extends House1{

	public static void main(String[] args) {
		
		House3 H1 = new House3();
		
		System.out.println(H1.x);
		System.out.println(H1.y);
		System.out.println(H1.z);
		System.out.println(H1.b);
		
		H1.PublicMethod();
		H1.DefaultMethod();
		H1.ProtectedMethod();
		H1.PrivateMethod();

	}

}
