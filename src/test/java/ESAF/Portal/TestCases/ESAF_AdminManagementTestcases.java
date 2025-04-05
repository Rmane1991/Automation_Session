package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_AdminMangementPage;

public class ESAF_AdminManagementTestcases extends Base 
{
	ESAF_AdminMangementPage AMpage;

	@BeforeClass
	public void Initalization() throws Exception 
	{
		AMpage = new ESAF_AdminMangementPage(driver);
	}

	@Test(priority = 1) // ,groups = "smoke"
	public void Add_Role_Verify_Role() throws InterruptedException, IOException 
	{
		AMpage.Add_Role_Verify_Role();
	}

	//@Test(priority = 2,dependsOnMethods = "Add_Role_Verify_Role") // ,groups = "smoke"
	public void Map_Roles() throws InterruptedException, IOException 
	{
		ReadExcel();
		AMpage.Map_Roles(getCellValueAsString(sheet.getRow(9).getCell(1)));
	}
	

	@Test(priority = 3,dependsOnMethods = "Add_Role_Verify_Role") // ,groups = "smoke")
	public void Manage_Permissions() throws InterruptedException, IOException 
	{
		ReadExcel();
		AMpage.Manage_Permission(getCellValueAsString(sheet.getRow(9).getCell(1)));
	}

	@Test(priority = 4,dependsOnMethods = "Manage_Permissions") // ,groups = "smoke")
	public void CreateUser() throws InterruptedException, IOException 
	{
		AMpage.CreateUser(getCellValueAsString(sheet.getRow(9).getCell(1)));
	}

	
	@Test(priority = 4,dependsOnMethods = "CreateUser") // ,groups = "smoke")//,dependsOnMethods = "CreateUser"
	public void Verify_Permission() throws InterruptedException, IOException 
	{
		ReadExcel();
		AMpage.Verify_Permission(getCellValueAsString(sheet.getRow(12).getCell(1)));
	}

}
