package FirstPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		//https://www.javatpoint.com/types-of-exception-in-java
		/*whenever we feel that some line of code might throw exeception, 
		then we will place that code in try block*/
		
		int a =7;
		int b=0;
		//int[] x= new int [5];
		
		System.out.println("BeforeTest");
		
		try {
			int c=a/b;
			//x[6]=50;
		}
		/*catch (Exception e)
		{
			System.out.println(e);
		}*/
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (NullPointerException e1) {
			System.out.println(e1);
		}
		catch (ArithmeticException e2) {
			System.out.println(e2);
		}
      
		finally
		{
			System.out.println("i am final test");
			System.out.println("clear the cache");
			System.out.println("Logout");
		}
		
	}

}
