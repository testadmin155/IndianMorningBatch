package ICICIBank;

import org.testng.annotations.Test;

public class FixedLoan {
	
	@Test
	public void FixedLoanwithWeb()
	{
		System.out.println("FixedLoanwithWeb");
	}
	
	@Test(groups= {"Sanity"})
	public void FixedLoanwithAPP()
	{
		System.out.println("FixedLoanwithAPP");
	}
	
	@Test
	public void FixedLoanwithBranch()
	{
		System.out.println("FixedLoanwithBranch");
	}

}
