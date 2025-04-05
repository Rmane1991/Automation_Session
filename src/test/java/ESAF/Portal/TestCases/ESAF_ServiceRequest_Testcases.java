package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_LoginPage;
import ESAF.Portal.Pages.ESAF_ServiceRequest_Page;

public class ESAF_ServiceRequest_Testcases extends Base
{

	
	ESAF_ServiceRequest_Page ESAF_Service;
	ESAF_LoginPage login_page;
	
	@BeforeClass
	public void initalization() throws Exception 
	{
		ESAF_Service = new ESAF_ServiceRequest_Page(driver);
		login_page = new ESAF_LoginPage(driver);
	}
	
	
	@Test(priority = 1) 
	public void  Bankuser_create_agent_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		ESAF_Service.Add_Agent();
		
		/*
		 * ESAF_Service.Add_Agent(); ESAF_Service.AddRequest_All();
		 * ESAF_Service.AddRequest_Contact(); ESAF_Service.AddRequest_Account();
		 * ESAF_Service.AddRequest_Address(); ESAF_Service.AddRequest_Email();
		 * ESAF_Service.AddRequest_EducationalQualification();
		 * ESAF_Service.AddRequest_FathermotherspouseName();
		 */
		ESAF_Service.AddRequest_Name();
		ESAF_Service.AddRequest_Deactivate();
		ESAF_Service.AddRequest_Reset();
		ESAF_Service.AddRequest_RevokePan();
		ESAF_Service.AddRequest_Terminate();

		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.ServiceRequest_Report();
		
	}
	
	@Test(priority = 2)                                      //// Testcase 2 :- Aggregator  create agent Activate request ///////////////
	public void  Aggregator_Login_Agent_Activate_Request() throws InterruptedException, IOException 
	{
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AgentServiceRequest_active();
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 3)                                      //// Testcase 3 :- Aggregator  create agent Activate request ///////////////
	public void  Aggregator_Login_Agent_Deactivate_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AgentServiceRequest_Deactive();
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 4)                                      //// Testcase 4 :- Aggregator  create agent Terminate request ///////////////
	public void  Aggregator_Login_Agent_Terminate_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AgentServiceRequest_Terminate();;
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 5)                                      //// Testcase 5 :- Aggregator  create agent RevokePan request ///////////////
	public void  Aggregator_Login_Agent_RevokePan_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AgentServiceRequest_RevokePan();;
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}

	@Test(priority = 6)                                      //// Testcase 6 :- Aggregator  create Aggregator Active request ///////////////
	public void  Aggregator_Login_Aggregator_Active_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AggregatorServiceRequest_active();;
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 7)                                      //// Testcase 7 :- Aggregator  create Aggregator Deactive request ///////////////
	public void  Aggregator_Login_Aggregator_Deactive_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AggregatorServiceRequest_Deactive();;
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 8)                                      //// Testcase 8 :- Aggregator  create Aggregator Terminate request ///////////////
	public void  Aggregator_Login_Aggregator_Terminate_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AggregatorServiceRequest_Terminate();;
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 9)                                      //// Testcase 9 :- Aggregator  create Aggregator Reset request ///////////////
	public void  Aggregator_Login_Aggregator_Reset_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AggregatorServiceRequest_Reset();;
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	@Test(priority = 10)                                      //// Testcase 10 :- Aggregator  create Aggregator Reset request ///////////////
	public void  Aggregator_Login_Aggregator_All_Request() throws InterruptedException, IOException 
	{
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(5).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(5).getCell(3)));// Password
		
		ESAF_Service.Aggregator_AddRequest_All();
		ESAF_Service.ServiceRequest_Verification1();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(6).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(6).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification2();
		ESAF_Service.Logout();
		
		login_page.Check_Valid_Credentials(getCellValueAsString(sheet.getRow(4).getCell(1)) //UserName 
				  ,getCellValueAsString(sheet.getRow(4).getCell(3)));// Password
		ESAF_Service.ServiceRequest_Verification3();
		ESAF_Service.ServiceRequest_Verification4();
		ESAF_Service.Logout();
	}
	
	
	/*
	 * @AfterClass public void tearDown() throws IOException { if (driver != null) {
	 * driver.quit(); System.out.println("WebDriver Closed"); //
	 * TextFileLogger.closeLogger(); } }
	 */
	
}
