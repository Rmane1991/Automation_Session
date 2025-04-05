package ESAF.Portal.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ESAF.Portal.Pages.ESAF_Aggregator_Registration_Page;

public class ESAF_Aggregator_Registration_TestCase extends Base 
{
	ESAF_Aggregator_Registration_Page Agrtpage;

	@BeforeClass
	public void Initalization() throws Exception 
	{
		Agrtpage = new ESAF_Aggregator_Registration_Page(driver);
	}

	@Test(priority = 1)
	public void Registration() throws InterruptedException, IOException 
	{
		
		Agrtpage.Registration();
	}
	
	@Test(priority = 2,dependsOnMethods = "Registration")
	public void Document_Upload() throws InterruptedException, IOException 
	{
		ReadExcel();
		Agrtpage.Document_UP(getCellValueAsString(sheet.getRow(11).getCell(1)));
	}
	
	@Test(priority = 3,dependsOnMethods = "Document_Upload") //
	public void Verification() throws InterruptedException, IOException 
	{
		ReadExcel();
		Agrtpage.Verification(getCellValueAsString(sheet.getRow(11).getCell(1)));
	}
	
	@Test(priority = 4,dependsOnMethods = "Verification")//
	public void Active_Aggregator() throws InterruptedException, IOException 
	{
		ReadExcel();
		Agrtpage.Active_Aggregator(getCellValueAsString(sheet.getRow(11).getCell(1)));
	}
	
	//@Test(priority = 5)//,dependsOnMethods = "Active_Aggregator"
	public void Declined_Aggregator() throws InterruptedException, IOException 
	{
		
		Agrtpage.Declined_Aggregator(getCellValueAsString(sheet.getRow(11).getCell(1)));
	}
	
	@Test(priority = 6,dependsOnMethods = "Active_Aggregator")//
	public void Deactivated_Aggregator() throws InterruptedException, IOException
	{
		ReadExcel();
		Agrtpage.Deactivated_Aggregator(getCellValueAsString(sheet.getRow(11).getCell(1)));
	}
	
}