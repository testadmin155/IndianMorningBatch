package ICICIBank;

import org.testng.annotations.Test;

public class MortgageLoan extends Annotations{
	
	@Test
	public void MortgageLoanwithWeb()
	{
		System.out.println("MortgageLoanwithWeb");
	}
	
	@Test(groups= {"Regression"})
	public void MortgageLoanwithAPP()
	{
		System.out.println("MortgageLoanwithAPP");
	}
	
	@Test(groups= {"Sanity"})
	public void MortgageLoanwithBranch()
	{
		System.out.println("MortgageLoanwithBranch");
	}

}
