package FirstPackage;

public class Debiugging {
	
	public void Method1()
	{
		System.out.println("Hello1");
		System.out.println("Hi1");
		System.out.println("How are you1");
		System.out.println("Bye bye1");
	
	}
	
	public void Method2()
	{
		System.out.println("Hello2");
		System.out.println("Hi2");
		System.out.println("How are you2");
		System.out.println("Bye bye2");
	}
	
	public void Method3()
	{
		System.out.println("Hello3");
		System.out.println("Hi3");
		System.out.println("How are you3");
		System.out.println("Bye bye3");
	}
	
	public void Method4()
	{
		System.out.println("Hello4");
		System.out.println("Hi4");
		System.out.println("How are you4");
		System.out.println("Bye bye4");
	}

	public static void main(String[] args) {
		
		Debiugging obj = new Debiugging();
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		obj.Method1();
		System.out.println("Fourth Line");
		System.out.println("Fifth Line");
		obj.Method2();
		obj.Method3();
		System.out.println("Sixth Line");
		System.out.println("Seventh Line");
		obj.Method4();
		
	}

}
