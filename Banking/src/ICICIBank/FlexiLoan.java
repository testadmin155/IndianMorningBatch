package ICICIBank;

import org.testng.annotations.Test;

public class FlexiLoan extends Annotations{
	
	@Test(groups= {"Sanity"})
	public void FlexiLoanwithWeb()
	{
		System.out.println("FlexiLoanwithWeb");
	}
	
	@Test(groups= {"Regression"})
	public void FlexiLoanwithAPP()
	{
		System.out.println("FlexiLoanwithAPP");
	}
	
	@Test
	public void FlexiLoanwithBranch()
	{
		System.out.println("FlexiLoanwithBranch");
	}

}
