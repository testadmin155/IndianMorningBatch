package FirstPackage;

public class FinalKeyword {
	
	final double pie = 3.14;
	 
	 public void getData()
	 {
		  pie = 1.50;
		 System.out.println(pie);
	 }

	public static void main(String[] args) {
		
		FinalKeyword obj = new FinalKeyword();
		
		obj.getData();
 
	}

}
