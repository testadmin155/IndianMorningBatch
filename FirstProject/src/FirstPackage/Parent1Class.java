package FirstPackage;

public class Parent1Class extends GrandParent{
	
	public void Bike() 
	{
		System.out.println("Hero");
	}
	
	public void Job() 
	{
		System.out.println("Job");
	}
	
	public void Money() 
	{
		System.out.println("Money");
	}
	
	public void FreeTime() 
	{
		System.out.println("No FreeTime");
	}

	public static void main(String[] args) {
		
		Parent1Class obj = new Parent1Class();
		
		obj.Bike();
		obj.Job();
		obj.Money();
		obj.FreeTime();

	}

}
