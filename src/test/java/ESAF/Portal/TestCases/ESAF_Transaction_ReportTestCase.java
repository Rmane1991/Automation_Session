package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_LoginPage;
import ESAF.Portal.Pages.ESAF_transaction_ReportPage;

public class ESAF_Transaction_ReportTestCase extends Base
{
	
	ESAF_LoginPage login_page;
	ESAF_transaction_ReportPage Txn_Report;
	
	@BeforeMethod
	public void Initalization() throws Exception 
	{
		launchBrowser();
		login_page = new ESAF_LoginPage(driver);
		Txn_Report = new ESAF_transaction_ReportPage(driver); 
	}
	
	@Test(priority = 1)
	public void Portal_Login() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(3).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(3).getCell(3)));// Password
		
	}
	

	@AfterMethod
	public void tearDown() throws IOException 
	{
		 if (driver != null) 
		 {
	            driver.quit();
	            System.out.println("WebDriver Closed");
	        }
	}

}
