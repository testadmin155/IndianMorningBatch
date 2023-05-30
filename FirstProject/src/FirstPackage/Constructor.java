package FirstPackage;

public class Constructor {
	
	//constructorsshould the same name as class
	// constructor should not have void(return type)
	// constructor will be executed automatically when the object is create


	public Constructor(int x)
	{
		System.out.println("this is a constructor1");
	}
	
	public Constructor(int x, int y)
	{
		System.out.println("this is a constructor2");
	}
	
	public Constructor(String a, int x)
	{
		System.out.println("this is a constructor3");
	}
	
	public Constructor(String x, String y)
	{
		System.out.println("this is a constructor4");
	}
	
	public static void main(String[] args) {
		
		Constructor obj =new Constructor(10);
		Constructor obj1 = new Constructor(20,45);
		Constructor obj2 = new Constructor("Testing", 90);
		//obj.getData();
		

	}

}
