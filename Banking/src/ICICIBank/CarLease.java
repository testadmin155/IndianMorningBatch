package ICICIBank;

import org.testng.annotations.Test;

public class CarLease {
	
	@Test
	public void CarLeasewithWeb()
	{
		System.out.println("CarLeasewithWeb");
	}
	
	@Test
	public void CarLeasewithAPP()
	{
		System.out.println("CarLeasewithAPP");
	}
	
	@Test(groups= {"Sanity"})
	public void CarLeasewithBranch()
	{
		System.out.println("CarLeasewithBranch");
	}

}
