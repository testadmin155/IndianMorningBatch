package ICICIBank;

import org.testng.annotations.Test;

public class SmartLoan {
	
	@Test
	public void SmartLoanwithWeb()
	{
		System.out.println("SmartLoanwithWeb");
	}
	
	@Test(groups= {"Sanity"})
	public void SmartLoanwithAPP()
	{
		System.out.println("SmartLoanwithAPP");
	}
	
	@Test
	public void SmartLoanwithBranch()
	{
		System.out.println("SmartLoanwithBranch");
	}

}
