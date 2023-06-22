package ICICIBank;

import org.testng.annotations.Test;

public class SmartLoan extends Annotations{
	
	@Test(groups= {"Regression"})
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
