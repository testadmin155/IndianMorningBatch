package FirstPackage;

public class Methods {
	
	//How to create a method
	
	public void login(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println("click on login");
	}
	
	/*public void login_sudha()
	{
		System.out.println("Enter user as Sudha");
		System.out.println("Enter Password as Password@123");
		System.out.println("click on login");
	}
	
	public void login_Rajani()
	{
		System.out.println("Enter user as Rajani");
		System.out.println("Enter Password as Password@123");
		System.out.println("click on login");
	}
	
	public void login_Sravanthi()
	{
		System.out.println("Enter user as Sravanthi");
		System.out.println("Enter Password as Password@123");
		System.out.println("click on login");
	}
	
	public void login_Farhana()
	{
		System.out.println("Enter user as Farhana");
		System.out.println("Enter Password as Password@123");
		System.out.println("click on login");
	}
	*/
	
	public static void staticMethod()
	{
		System.out.println("I am a static Method");
	}
	
	public void logout()
	{
		System.out.println("logout");
	}
	
	public void openwebpage()
	{
		System.out.println("open the url");
	}
	
	public void closewebpage()
	{
		System.out.println("close the webpage");
	}
	


	public static void main(String[] args) {
		
	// Method - whenever we feel that some set of lines / code is repeatedly used then we can create a method/function
		//login  page
		/*System.out.println("open the url");
		System.out.println("Enter user as Sudha");
		System.out.println("Enter Password as Password@123");
		System.out.println("click on login");
		
		System.out.println("logout");
		System.out.println("close the webpage");
		
		System.out.println("Enter user as Rajani");
		System.out.println("Enter Password as Welcome");
		System.out.println("click on login");
		
		System.out.println("logout");
		
		System.out.println("Enter user as Sravanthi");
		System.out.println("Enter Password as Welcome@123");
		System.out.println("click on login");
		
		
		
		System.out.println("Enter user as Soujanya");
		System.out.println("Enter Password as Welcome@444");
		System.out.println("click on login");
		
		System.out.println("logout");
		
		System.out.println("Enter user as Sridevi");
		System.out.println("Enter Password as Welcome@987");
		System.out.println("click on login");
		*/

		
		//how to call the method
		//we have to create an object for class, using this object we can call methods
		// how to create an object
		 Methods obj = new Methods();
		/* obj.openwebpage();
		 obj.login_sudha();
		 obj.logout();
		 obj.closewebpage();
		 
		 obj.openwebpage();
		 obj.login_Rajani();
		 obj.logout();
		 obj.closewebpage();
		 
		 obj.openwebpage();
		 obj.login_Sravanthi();
		 obj.closewebpage();
		 
		 obj.openwebpage();
		 obj.login_Farhana();
		 obj.logout();
		 obj.closewebpage();*/
		 obj.openwebpage();
		 obj.login("Sudha","Password@123");
		 obj.logout();
		 obj.closewebpage();
		 
		 obj.openwebpage();
		 obj.login("Rajani","Welcome@123");
		 obj.logout();
		 obj.closewebpage();
		 
		 obj.openwebpage();
		 obj.login("Sravanthi","Welcome");
		 obj.closewebpage();
		 
		 
		 obj.login("Farhana","Welcome444");
		 obj.login("Tazeen","Password");
		 obj.login("Soujanya","Password999");
		 
		 staticMethod();
		 
		 System.out.println("Hello Sudha how are you");

	}

}
