package FirstPackage;

public class overLoading {
	
	public String getData(String y, String z)
	{
		System.out.println("Method to get the Data");
		//return "testing";
		return z;
	}
	
	public int getData(int a, int b)
	{
		int c = a+b;
		return c;
	}

	public void getData(int c)
	{
		System.out.println("Method to get the Data1");
	}
	
	
	public void getData(String x)
	{
		System.out.println("Method to get the Data3");
	}
	
	public void getData(int x, int y, int z)
	{
		System.out.println("Method to get the Data4");
	}
	
	public void getData(String x, int y, int z)
	{
		System.out.println("Method to get the Data5");
	}
	
	
	public static void main(String[] args) {
		
		overLoading obj = new overLoading();
		//obj.getData("Testing", 68, 98);
		
		int z = obj.getData(5, 10);
		//System.out.println(z);
		
		System.out.println(obj.getData("Selenium", "Automation"));

	}

}
