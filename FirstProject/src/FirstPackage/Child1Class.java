package FirstPackage;

public class Child1Class extends Parent1Class{

	//child class is also called as subclass
	//parent class is also called as superclass
	
	public void Bike()
	{
		System.out.println("BMW");
		super.Bike();
	}

	
	public static void main(String[] args) {
		
		Child1Class obj = new Child1Class();
		obj.Bike();
		obj.Money();
		

	}

}
