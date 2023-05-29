package FirstPackage;

public class House2 {

	public static void main(String[] args) {
		
House1 H1 = new House1();
		
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
