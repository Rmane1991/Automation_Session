package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ESAF.Portal.Pages.ESAF_DashboardPage;
import ESAF.Portal.Pages.ESAF_LoginPage;

public class ESAF_DAshboardTestCase extends Base
{
	ESAF_DashboardPage EsafDash;
	ESAF_LoginPage login_page;
	
	@BeforeMethod
	public void Initalization() throws Exception 
	{
		launchBrowser();
		login_page = new ESAF_LoginPage(driver);
		EsafDash =new ESAF_DashboardPage(driver);
	}
	
	public void verify() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(3).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(3).getCell(3)));// Password
		
		EsafDash.page();
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
