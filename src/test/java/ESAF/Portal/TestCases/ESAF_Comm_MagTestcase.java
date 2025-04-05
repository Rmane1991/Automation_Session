package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_Comm_MagPage;

public class ESAF_Comm_MagTestcase extends Base 
{
	ESAF_Comm_MagPage commpage;

	@BeforeClass
	public void Initalization() throws Exception 
	{
		commpage = new ESAF_Comm_MagPage(driver);
	}

	@Test(priority = 1)
	public void BC_Commision() throws InterruptedException, IOException 
	{
		commpage.Commission_Page();
	}

	@Test(priority = 2, dependsOnMethods = "BC_Commision")
	public void AgentCommission_Page() throws InterruptedException, IOException 
	{
		commpage.AgentCommission_Page();
	}

	@Test(priority = 3,dependsOnMethods = "AgentCommission_Page")
	public void CommissionVerification_Page() throws InterruptedException, IOException 
	{
		ReadExcel();
		commpage.CommissionVerification_Page(getCellValueAsString(sheet.getRow(17).getCell(1)), getCellValueAsString(sheet.getRow(18).getCell(1)));
	}

	@Test(priority = 4,dependsOnMethods = "CommissionVerification_Page")
	public void Commision_Status() throws InterruptedException, IOException 
	{
		commpage.Commision_Status(getCellValueAsString(sheet.getRow(17).getCell(1)), getCellValueAsString(sheet.getRow(18).getCell(1)));
	}

	//@Test(priority = 5)
	public void BBPS_Commission_Status() throws InterruptedException, IOException

	{
		commpage.BBPS_Commission_Status();
	}

}