package ICICIBank;

import org.testng.annotations.Test;

public class FixedLoan extends Annotations{
	
	@Test
	public void FixedLoanwithWeb()
	{
		System.out.println("FixedLoanwithWeb");
	}
	
	@Test(groups= {"Regression"})
	public void FixedLoanwithAPP()
	{
		System.out.println("FixedLoanwithAPP");
	}
	
	@Test(groups= {"Sanity"})
	public void FixedLoanwithBranch()
	{
		System.out.println("FixedLoanwithBranch");
	}

}
