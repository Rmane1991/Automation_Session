package ESAF.Portal.TestCases;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_Agent_Registration_Page;

public class ESAF_AgentReg_TestCase extends Base 
{

	ESAF_Agent_Registration_Page manualKyc;

	@BeforeClass
	public void Initalization() throws Exception 
	{
		manualKyc = new ESAF_Agent_Registration_Page(driver);
	}

	@Test(priority = 1)
	public void Agent_Registration() throws InterruptedException, IOException 
	{
		manualKyc.corporateBcClick();
	}

	@Test(priority = 2,dependsOnMethods = "Agent_Registration")
	public void documentUpload() throws InterruptedException

	{
		manualKyc.documentUpload();
	}

	@Test(priority = 3, dependsOnMethods = "documentUpload")
	public void level1OneVerification() throws InterruptedException
	{
		manualKyc.level1OneVerification();
	}

	@Test(priority = 4, dependsOnMethods = "level1OneVerification")
	public void level2Verification() throws InterruptedException
	{
		manualKyc.level2Verification();
	}

	@Test(priority = 5, dependsOnMethods = "level2Verification")
	public void level3Verification() throws InterruptedException

	{
		manualKyc.level3Verification();
	}

	@Test(priority = 6, dependsOnMethods = "level3Verification")
	public void level4Verification() throws InterruptedException

	{
		manualKyc.level4Verification();
	}

}
