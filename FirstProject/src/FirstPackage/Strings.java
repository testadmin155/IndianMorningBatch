package FirstPackage;

public class Strings {

	public static void main(String[] args) {
		
		String x = "Testing";
		String text = "Welcome to Automation Testing Training";
		/*System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		boolean s = text.equalsIgnoreCase("welcome to Automation testing Training");
		System.out.println(s);
		*/
		//if condition
		String expectedmessage = "Payment is succesful and your order is placed";
		String actualmessage = "Payment is succefu and your order is placed";
		
		if(expectedmessage.equals(actualmessage))
		{
			System.out.println("Test case is passed");
		}
		else
		
			{
				System.out.println("Test case is Failed");
			}
		
		

	}

}