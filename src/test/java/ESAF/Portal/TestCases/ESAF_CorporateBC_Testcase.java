package ESAF.Portal.TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_CorporateBC_Page;

public class ESAF_CorporateBC_Testcase extends Base {

	ESAF_CorporateBC_Page Cbc;

	@BeforeClass
	public void test() throws Exception 
	{
		Cbc = new ESAF_CorporateBC_Page(driver);
	}

	@Test(priority = 1)
	public void Cbc_Registration() throws InterruptedException, IOException, InvalidFormatException 
	{
		Cbc.Registration();
	}

	@Test(priority = 2, dependsOnMethods = "Cbc_Registration")
	public void Cbc_DocsUpload() throws InterruptedException, IOException, InvalidFormatException 
	{
		ReadExcel();
		Cbc.DocsUpload(getCellValueAsString(sheet.getRow(10).getCell(1)));
	}

	@Test(priority = 3, dependsOnMethods = "Cbc_DocsUpload") 
	public void Cbc_Verification() throws InterruptedException, IOException, InvalidFormatException 
	{
		ReadExcel();
		Cbc.CorporateBcVerification(getCellValueAsString(sheet.getRow(10).getCell(1)));
	}

	@Test(priority = 4, dependsOnMethods = "Cbc_Verification")
	public void Cbc_ActiveCorporateBc() throws InterruptedException, IOException, InvalidFormatException 
	{
		ReadExcel();
		Cbc.ActivateCorporate(getCellValueAsString(sheet.getRow(10).getCell(1)));
	}

	@Test(priority = 5)
	public void Bc_DeActivationTest() throws InterruptedException, IOException 
	{
		ReadExcel();
		Cbc.Bc_DeActivation(getCellValueAsString(sheet.getRow(10).getCell(1)));
	}

	@Test(priority = 6)
	public void Bc_TERMINATED_ListTest() throws InterruptedException, IOException 
	{
		ReadExcel();
		Cbc.Bc_TERMINATED_List(getCellValueAsString(sheet.getRow(10).getCell(1)));
	}

	@Test(priority = 7)
	public void Bc_Status_Test() throws InterruptedException, IOException 
	{
		ReadExcel();
		Cbc.Bc_Status(getCellValueAsString(sheet.getRow(10).getCell(1)));
	}
	
	/*
	 * @Test(priority = 9) public void Bc_Edit_Test() throws InterruptedException,
	 * IOException { Cbc.Bc_Edit(); }
	 */

	/*
	 * @Test(priority = 5 ,dependsOnMethods = "Cbc_ActiveCorporateBc") public void
	 * bcActivationPageTest() throws InterruptedException, IOException {
	 * Cbc.Bc_Activation(getCellValueAsString(sheet.getRow(10).getCell(1))); }
	 */
	/*
	 * @Test(priority = 6) public void Declined_ListTest() throws
	 * InterruptedException, IOException { Cbc.Bc_Declined_List(); }
	 */

}
