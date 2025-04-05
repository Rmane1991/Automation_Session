package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_Admin_ManagementPage_OLD;

public class ESAF_Admin_ManagementTestCase_OLD extends Base
{

	//ESAF_LoginPage login_page;
	ESAF_Admin_ManagementPage_OLD Admin_MGMT;
	
	@BeforeClass
	public void Initalization() throws Exception 
	{
		Admin_MGMT = new ESAF_Admin_ManagementPage_OLD(driver); 
	}
	
	
	@Test(priority = 1)
	public void create_Role() 
	{
		Admin_MGMT.create_Role();
	}
	
	
	@Test(priority = 2,dependsOnGroups = "create_Role")
	public void Manage_Permission() throws IOException 
	{
		ReadExcel();
		Admin_MGMT.Manage_Permission(getCellValueAsString(sheet.getRow(5).getCell(1)));
		
	}
	
	
	@Test(priority = 3,dependsOnGroups = "Manage_Permission")
	public void Create_User() throws IOException 
	{
		ReadExcel();
		Admin_MGMT.Create_User(getCellValueAsString(sheet.getRow(5).getCell(1)));
		
	}
	
	
}
