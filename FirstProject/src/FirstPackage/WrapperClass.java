package FirstPackage;

public class WrapperClass {

	public static void main(String[] args) {
		
		//WrapperClass-
		
		//int-	Integer
		//double- Double
		//char- Character
		//boolean- Boolean
		
		/*String Mobile = "5000";
		String Headset = "1000";
		
		int ActualMobileprice=Integer.parseInt(Mobile);
		int ActualHeadsetPrice=Integer.parseInt(Headset);*/
		
		
		String Mobile = "5000.99";
		String Headset = "1000.99";
		
		double ActualMobileprice=Double.parseDouble(Mobile);
		double ActualHeadsetPrice=Double.parseDouble(Headset);
		
		double TotalAmount = ActualMobileprice+ActualHeadsetPrice;
		System.out.println(TotalAmount);

	}

}
