package FirstPackage;

public class Strings {

	public static void main(String[] args) {
		
		//String x = "Testing";
		//String text = "Welcome to Automation Testing Training";
		/*System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		boolean s = text.equalsIgnoreCase("welcome to Automation testing Training");
		System.out.println(s);
		*/
		//if condition
		/*String expectedmessage = "Payment is succesful and your order is placed";
		String actualmessage = "Payment is succefu and your order is placed";
		
		if(expectedmessage.equals(actualmessage)) //==
		{
			System.out.println("Test case is passed");
		}
		else
		
			{
				System.out.println("Test case is Failed");
			}
*/
		
		//Split
		/*String testmessage="Automation testing session for selenium by Anees";
		System.out.println(testmessage);
		String[] splitvalue=testmessage.split("for");
		
		System.out.println(splitvalue[0].trim());
		System.out.println(splitvalue[1].trim());
		*/
		/*String testmessage="Automation testing session for testing selenium by Anees";
		System.out.println(testmessage);
		String[] splitvalue=testmessage.split("");*/
		//System.out.println(splitvalue[1].trim());
		
		
		/*String Name="Shaik Anees Ahamed";
		String [] Names=Name.split(" ");
		System.out.println("FirstName ="+Names[1].trim());
		System.out.println("LastName ="+Names[0]);
		System.out.println("MiddleName ="+Names[2]);*/
		/*FirstName = Anees"
		//LastName ="Shaik"
		//MiddleName ="Ahamed
		 */
		
		//Script to print String value in reverse
		/*String word = "Automation testing session";
	
		for(int i=word.length()-1; i>=0;i--)
		{
			System.out.print(word.charAt(i));
		}
		*/
		
		//Enhanced For Loop
		/*String word = "Automation testing session by Anees";
		String[] splitvalue = word.split(" ");
		//Normal ForLoop
		/*for(int i=0;i<splitvalue.length;i++)
		{
			System.out.println(splitvalue[i]);
		}*/
		
		//Enhanced ForLoop
		/*String word = "Automation testing for Selenium by Anees";
		String[] splitvalue = word.split("by");
		for (String x:splitvalue)
		{
			System.out.println(x.trim());
			//System.err.println(x);
			
		}*/
		
		//Substring
		String word = "Automation testing Selenium by for Anees shaik";
		//String[] splitvalue = word.split("for");
		//String splitvalue=word.substring(20);
		//System.out.println(word.length());
		//String splitvalue=word.substring(12,40);
		int x= word.indexOf("for");
		System.out.println(x);
		String firstpart = word.substring(0, x);
		System.out.println(firstpart);
		String lastpart = word.substring(x, word.length());
		System.out.println(lastpart);
		
	}

}
