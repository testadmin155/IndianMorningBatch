package FirstPackage;

public class thisKeyword {
	
	// local variable
	//instance variable or Global Variable
	
	int x=10;
	
	public  void getData() {
		int x = 20;
		System.out.println(this.x);
	}

	public void getInfo()
	{
		int y = 15;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		thisKeyword obj = new thisKeyword();
		
		obj.getData();
		obj.getInfo();
		

	}

}
