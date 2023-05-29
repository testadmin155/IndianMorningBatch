package FirstPackage;

public class House1 {
	// there are 4 types Access Modifiers
	
			// public - 
			// default -
			// private -
			// protected -
	
	public int x = 10;
	protected int y = 20;
	private int z = 50;
	String b = "Testing";
	
	public void PublicMethod()
	{
		System.out.println("This is a Public Method");
	}
	
	protected void ProtectedMethod()
	{
		System.out.println("This is a Protected Method");
	}

	
	private void PrivateMethod()
	{
		System.out.println("This is a Private Method");
	}

	
	void DefaultMethod()
	{
		System.out.println("This is a Default Method");
	}


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
