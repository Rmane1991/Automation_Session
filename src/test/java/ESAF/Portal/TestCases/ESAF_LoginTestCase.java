package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_LoginPage;


public class ESAF_LoginTestCase extends Base 
{

	ESAF_LoginPage login_page;
	//ExtentTest test;
	
	@BeforeMethod
	//@Test(priority = 0)
	public void Initalization() throws Exception 
	{
		launchBrowser();
		login_page = new ESAF_LoginPage(driver);
		//TextFileLogger.initializeLogger("LoginPage_TestCase");
	}
	
	@Test(priority = 5) // ,groups = "smoke"
	public void Check_Valid_Credentials() throws InterruptedException, IOException

	{
		//ExtentReportNG.logMessage("Login TestCase Start");
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(3).getCell(1)) //UserName 
										  ,getCellValueAsString(sheet.getRow(3).getCell(3)));// Password
		//ExtentReportNG.logMessage("Login TestCase End");
		
		
	}
	
	@Test(priority = 2)
	public void Check_Blank_Username() throws InterruptedException, IOException

	{
		login_page.Blank_UserName(getCellValueAsString(sheet.getRow(3).getCell(3)));
	}
	
	@Test(priority = 3)
	public void Check_Blank_Password() throws InterruptedException, IOException

	{
		login_page.Blank_Password(getCellValueAsString(sheet.getRow(3).getCell(1)));
	}


	@Test(priority = 4) // , groups = "smoke"
	public void Check_InValid_User_Name() throws InterruptedException, IOException

	{
		login_page.Invalid_Username(getCellValueAsString(sheet.getRow(3).getCell(1)),getCellValueAsString(sheet.getRow(3).getCell(3)));
	}
	
	@Test(priority = 1) // , groups = "smoke"
	public void Check_InValid_Password() throws InterruptedException, IOException

	{
		login_page.Invalid_Password(getCellValueAsString(sheet.getRow(3).getCell(1)),getCellValueAsString(sheet.getRow(3).getCell(3)));
	}
	
	@AfterMethod
	//@Test(priority = 7)
	public void tearDown() throws IOException 
	{
		 if (driver != null) {
	            driver.quit();
	            System.out.println("WebDriver Closed");
	           // TextFileLogger.closeLogger();
	        }
	}
}
