package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_Agent_ManagementPage;
import ESAF.Portal.Pages.ESAF_LoginPage;

public class ESAF_Agent_ManagementTestCase extends Base
{

	ESAF_LoginPage login_page;
	ESAF_Agent_ManagementPage Agent_MGMT;
	
	@BeforeMethod
	public void Initalization() throws Exception 
	{
		launchBrowser();
		login_page = new ESAF_LoginPage(driver);
		Agent_MGMT = new ESAF_Agent_ManagementPage(driver); 
	}
	
	@Test
	public void Agent() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(3).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(3).getCell(3)));// Password
		Agent_MGMT.Add_Agent();
		
	}
	
	@AfterMethod
	public void tearDown() throws IOException 
	{
		 if (driver != null) {
	            driver.quit();
	            System.out.println("WebDriver Closed");
	           // TextFileLogger.closeLogger();
	        }
	}
	
}
