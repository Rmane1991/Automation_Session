package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_Agent_ManagementPage_OLD;

public class ESAF_Agent_ManagementTestCase_OLD extends Base
{

	ESAF_Agent_ManagementPage_OLD Agent_MGMT;
	
	@BeforeMethod
	public void Initalization() throws Exception 
	{
		Agent_MGMT = new ESAF_Agent_ManagementPage_OLD(driver); 
	}
	
	@Test
	public void Agent() throws InterruptedException, IOException 
	{
		Agent_MGMT.Add_Agent();
		
	}
	
}
