package ESAF.Portal.Pages;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import ESAF.Portal.Resorces.Utility;

public class ESAF_Comm_MagPage extends Utility 
{

	WebDriver driver;
	WebDriverWait wait;
	SoftAssert softAssert = new SoftAssert();

	public ESAF_Comm_MagPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	// CORPORATES BC COMMISSION REQUEST Elements

	@FindBy(xpath = ("//div[@class='toast-message']"))
	WebElement tostMessage;

	@FindBy(xpath = "//a[@id='hrefsubpg9']")
	WebElement CM_Menu;

	@FindBy(xpath = "//a[@id='lbtn9-152']")
	WebElement CBCR_Menu;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement DD_CB;

	@FindBy(xpath = "//input[@type='search']")
	WebElement Search_Box;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlChanneltype-container']")
	WebElement DC_CC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box1;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlCommisionType-container']")
	WebElement CT_CC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box2;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnAdd']")
	WebElement ADD_Btn;

	@FindBy(xpath = "//input[@name='ctl00$cpbdCarde$gvTransactionLimit$ctl02$txtMaxAmount']")
	WebElement Txn_Amt;

	@FindBy(xpath = "//input[@name='ctl00$cpbdCarde$gvTransactionLimit$ctl02$txtCommissionPercent']")
	WebElement Comm_Per;

	@FindBy(xpath = "//input[@name='ctl00$cpbdCarde$btnSave']")
	WebElement Save_Btn;

	@FindBy(xpath = "//input[@name='ctl00$cpbdCarde$btnCancel']")
	WebElement Cancel_Btn;

	// AGENT COMMISSION REQUEST elements

	@FindBy(xpath = "//a[@id='lbtn9-16']")
	WebElement Menu_AgentCommreqElement;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement Corpo_BC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box5;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlChanneltype-container']")
	WebElement Channal_type1;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box6;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlCommisionType-container']")
	WebElement Comm_type1;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Btn7;

	@FindBy(xpath = "//input[@name='ctl00$cpbdCarde$btnAddSlam']")
	WebElement Add_Slab1;

	@FindBy(xpath = "//input[@name='ctl00$cpbdCarde$gvTransactionLimit$ctl02$txtMaxAmount']")
	WebElement Max_Txn_Amt1;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvTransactionLimit_txtCommissionPercent_0']")
	WebElement commision_per1;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSave']")
	WebElement Save_Btn1;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnCancel']")
	WebElement Cancle_Btn1;

	// COMMISSION Verification elements

	@FindBy(xpath = "//a[@id='lbtn9-177']")
	WebElement AC_Menu;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement Corp_BC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box3;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlUserType-container']")
	WebElement User_Type;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box4;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlChannelType']")
	WebElement Channal_click;
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlChanneltype-container']")
	WebElement Click_CHannel_ConfirmationPage;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Search_btn;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnActivate']")
	WebElement Btn_Approve_Comm;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnExportExcel']")
	WebElement Excel_btn;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnTerminate']")
	WebElement decline_btn;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement txt_decline_Reason;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSaveAction']")
	WebElement Save_btn;

	// BBPS COMMISSION Status Elements

	@FindBy(xpath = "//a[@id='lbtn9-2320']")
	WebElement BBPS_Comm_Status;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement Corp_BC2;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box7;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlUserType-container']")
	WebElement User_Type1;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_box8;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlStatusType-container']")
	WebElement Status1;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_box9;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlBillerCategory-container']")
	WebElement Service1;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_box10;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement SearchButton1;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnReset']")
	WebElement clearbtn1;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvTransactionLimit_txtMinAmount_0']")
	WebElement txt_Existing_MinimumLimit;

	public void Commission_Page() throws InterruptedException // CORPORATES BC COMMISSION REQUEST Action

	{
		if (AC_Menu.isDisplayed() == true) 
		{
			System.out.println("This element is displayed");
		}

		else 
		{
			CM_Menu.click();
			Thread.sleep(1000);
		}

		CBCR_Menu.click();
		DD_CB.click();
		Search_Box.sendKeys("ola", Keys.ENTER);
		DC_CC.click();
		Search_Box1.sendKeys("AEPS", Keys.ENTER);
		CT_CC.click();
		Search_Box2.sendKeys("Percentage", Keys.ENTER);
		ADD_Btn.click();

		String value = txt_Existing_MinimumLimit.getDomProperty("value");
		int newValue = Integer.parseInt(value) + 500;
		System.out.println("Existing Minimum Limit :- " + value);
		Txn_Amt.sendKeys(String.valueOf(newValue));
		Comm_Per.sendKeys("20");

		Save_Btn.click();

		if (tostMessage.getText().contains("Commission Slab added and forwarded for approval.")) 
		{
			Assert.assertTrue(true);
			String stringValue = String.valueOf(newValue);
			writeNameToExcel(17, 1, stringValue);
		}

		else {
			Assert.fail(tostMessage.getText());
		}

	}

	public void AgentCommission_Page() throws InterruptedException // Agent COMMISSION Action
	{

		if (AC_Menu.isDisplayed() == true) {
			System.out.println("This element is displayed");
		}

		else {
			CM_Menu.click();
			Thread.sleep(1000);
		}

		Menu_AgentCommreqElement.click();
		Corpo_BC.click();
		Search_Box5.click();
		Search_Box5.sendKeys("dfgcg", Keys.ENTER);
		Channal_type1.click();
		Search_Box6.click();
		Thread.sleep(1000);
		Search_Box6.sendKeys("AEPS", Keys.ENTER);
		Thread.sleep(1000);
		Comm_type1.click();
		Search_Btn7.click();
		Search_Btn7.sendKeys("Percentage", Keys.ENTER);
		Thread.sleep(2000);
		Add_Slab1.click();
		Thread.sleep(1000);

		String value = txt_Existing_MinimumLimit.getDomProperty("value");
		int newValue = Integer.parseInt(value) + 100;
		System.out.println("Existing Minimum Limit :- " + value);
		Txn_Amt.sendKeys(String.valueOf(newValue));
		Comm_Per.sendKeys("20");
		Thread.sleep(1000);
		Save_Btn.click();
		Thread.sleep(200);
		if (tostMessage.getText().contains("Commission Slab added and forwarded for approval.")) {
			Assert.assertTrue(true);
			String stringValue = String.valueOf(newValue);
			writeNameToExcel(18, 1, stringValue);
		}

		else {
			Assert.fail(tostMessage.getText());
		}

	}
	
	
	public boolean verifyLatestRow(String userMaxAmount, String userCommissionType, String userCommissionPercent,
			String userChannelType, String userEffectiveDate) 
	{

		WebElement latestRow = driver.findElement(By.xpath("//table[@id='cpbdCarde_gvCommssionRequest']/tbody/tr[2]"));
		WebElement maxAmountCell = latestRow.findElement(By.xpath("td[5]"));
		WebElement commissionTypeCell = latestRow.findElement(By.xpath("td[2]"));
		WebElement commissionPercentCell = latestRow.findElement(By.xpath("td[7]"));
		WebElement channelTypeCell = latestRow.findElement(By.xpath("td[11]"));
		WebElement effectiveDateCell = latestRow.findElement(By.xpath("td[12]"));

		String tableMaxAmount = maxAmountCell.getText().trim();
		String tableCommissionType = commissionTypeCell.getText().trim();
		String tableCommissionPercent = commissionPercentCell.getText().trim();
		String tableChannelType = channelTypeCell.getText().trim();
		String tableEffectiveDate = effectiveDateCell.getText().trim();

		// Print user-entered values
		System.out.println("User Entered Values:");
		System.out.println("Max Amount: " + userMaxAmount);
		System.out.println("Commission Type: " + userCommissionType);
		System.out.println("Commission Percent: " + userCommissionPercent);
		System.out.println("Channel Type: " + userChannelType);
		System.out.println("Effective Date: " + userEffectiveDate);

		// Print table values
		System.out.println("Table Values:");
		System.out.println("Max Amount: " + tableMaxAmount);
		System.out.println("Commission Type: " + tableCommissionType);
		System.out.println("Commission Percent: " + tableCommissionPercent);
		System.out.println("Channel Type: " + tableChannelType);
		System.out.println("Effective Date: " + tableEffectiveDate);

		boolean isMatch = tableMaxAmount.equals(userMaxAmount) && tableCommissionType.equals(userCommissionType)
				&& tableCommissionPercent.equals(userCommissionPercent) && tableChannelType.equals(userChannelType)
				&& tableEffectiveDate.equals(userEffectiveDate);

		if (isMatch) 
		{
			softAssert.assertTrue(true, "Commission Verify Sucessfully");
			System.out.println("✅ Verification Successful: Latest row matches user data.");
		} else 
		{
			softAssert.assertTrue(false);
			System.out.println("❌ Verification Failed: Latest row does not match user data.");
		}

		softAssert.assertAll();
		return isMatch;
	}

	public void CommissionVerification_Page(String BC_Comm,String Agent_Comm) throws InterruptedException // COMMISSION Verification Action
	{

		if (AC_Menu.isDisplayed() == true) 
		{
			System.out.println("This element is displayed");
		}

		else {
			CM_Menu.click();
			Thread.sleep(1000);
		}
		AC_Menu.click();
		Thread.sleep(1000);
		Corp_BC.click();
		Thread.sleep(1000);
		Search_Box3.click();
		Thread.sleep(1000);
		Search_Box3.sendKeys("ola", Keys.ENTER);
		Thread.sleep(1000);
		User_Type.click();
		Thread.sleep(1000);
		Search_Box4.click();
		Thread.sleep(1000);
		Search_Box4.sendKeys("Corporate BC", Keys.ENTER);
		Thread.sleep(1000);
		Channal_click.click();
		Thread.sleep(1000);
		Channal_click.sendKeys("AEPS", Keys.ENTER);
		Thread.sleep(1000);
		Search_btn.click();
		Thread.sleep(2000);
		String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		if(verifyLatestRow(BC_Comm,"Percentage","20.00","AEPS",todayDate)==true)
		{
			System.out.println("Done");
			//softAssert.assertTrue(true, "BC Commission Verify Sucessfully");
			Thread.sleep(500);
		}
			Btn_Approve_Comm.click();
			wait.until(ExpectedConditions.visibilityOf(txt_decline_Reason));
			txt_decline_Reason.sendKeys("Done by Automation");
			Save_btn.click();
			
			if (tostMessage.getText().contains("Request(s) : 1\nSuccessful : 1\nUnsuccessful : 0")) 
			{
				System.out.println("Test Case PASSED: Toast message is correct.");
				softAssert.assertTrue(true, "BC Commission Verify Sucessfully");
			}
	
		
		//For Agent Verification
		
		Corp_BC.click();
		Thread.sleep(1000);
		Search_Box3.click();
		Thread.sleep(1000);
		Search_Box3.sendKeys("dfgcg", Keys.ENTER);
		Thread.sleep(1000);
		User_Type.click();
		Thread.sleep(1000);
		Search_Box4.click();
		Thread.sleep(1000);
		Search_Box4.sendKeys("Agent", Keys.ENTER);
		Thread.sleep(1000);
		Channal_click.click();
		Thread.sleep(1000);
		Channal_click.sendKeys("AEPS", Keys.ENTER);
		Thread.sleep(1000);
		Search_btn.click();
		Thread.sleep(2000);
		
		if(verifyLatestRow(Agent_Comm,"Percentage","20.00","AEPS",todayDate)==true)
		{
			System.out.println("Done");
			//softAssert.assertTrue(true, "Agent Commission Verify Sucessfully");
		}
			Btn_Approve_Comm.click();
			wait.until(ExpectedConditions.visibilityOf(txt_decline_Reason));
			txt_decline_Reason.sendKeys("Done by Automation");
			Save_btn.click();
			
			if (tostMessage.getText().contains("Request(s) : 1\nSuccessful : 1\nUnsuccessful : 0")) 
			{
				System.out.println("Test Case PASSED: Toast message is correct.");
			}
		
		softAssert.assertAll();
	}

	
	
	public boolean verifyLatestTransaction(String userCommissionType, String userChannelType, String userMaxAmount,
			String userCommissionPercent) 
	{
		// Locate the latest row (Assuming first data row is latest)
		WebElement latestRow = driver.findElement(By.xpath("//table[@id='cpbdCarde_gvTransactions']/tbody/tr[2]"));

		// Locate required cells
		WebElement commissionTypeCell = latestRow.findElement(By.xpath("td[3]"));
		WebElement channelTypeCell = latestRow.findElement(By.xpath("td[4]"));
		WebElement maxAmountCell = latestRow.findElement(By.xpath("td[6]"));
		WebElement commissionPercentCell = latestRow.findElement(By.xpath("td[8]"));
		WebElement statusCell = latestRow.findElement(By.xpath("td[20]"));

		// Get text values
		String tableCommissionType = commissionTypeCell.getText().trim();
		String tableChannelType = channelTypeCell.getText().trim();
		String tableMaxAmount = maxAmountCell.getText().trim();
		String tableCommissionPercent = commissionPercentCell.getText().trim();
		String tableStatus = statusCell.getText().trim();

		// Print entered and table values
		System.out.println("User Entered: [Commission Type: " + userCommissionType + ", Channel Type: " + userChannelType
						+ ", Max Amount: " + userMaxAmount + ", Commission Percent: " + userCommissionPercent + "]");

		System.out.println("Table Data: [Commission Type: " + tableCommissionType + ", Channel Type: "
				+ tableChannelType + ", Max Amount: " + tableMaxAmount + ", Commission Percent: "
				+ tableCommissionPercent + ", Status: " + tableStatus + "]");

		// Verification logic
		boolean isMatch = tableCommissionType.equals(userCommissionType) && tableChannelType.equals(userChannelType)
				&& tableMaxAmount.equals(userMaxAmount) && tableCommissionPercent.equals(userCommissionPercent)
				&& tableStatus.equalsIgnoreCase("Approved");

		if (isMatch) {
			System.out.println("Test Case PASSED: Data matches and status is Approved.");
		} else {
			System.out.println("Test Case FAILED: Data mismatch or status is not Approved.");
		}

		return isMatch;
	}
	
	
	@FindBy(xpath = "//a[@id='lbtn9-185']")
	WebElement Click_Comm_Mgmt;
	
	public void Commision_Status(String userMaxAmount_BC,String userMaxAmount_Agent) throws InterruptedException 
	{
		//For BC Purpose
		Click_Comm_Mgmt.click();
		Corp_BC.click();
		Thread.sleep(1000);
		Search_Box3.click();
		Thread.sleep(1000);
		Search_Box3.sendKeys("ola", Keys.ENTER);
		Thread.sleep(1000);
		User_Type.click();
		Thread.sleep(1000);
		Search_Box4.click();
		Thread.sleep(1000);
		Search_Box4.sendKeys("Corporate BC", Keys.ENTER);
		Thread.sleep(1000);
		Click_CHannel_ConfirmationPage.click();
		Search_Box4.click();
		Thread.sleep(1000);
		Search_Box4.sendKeys("AEPS", Keys.ENTER);
		Thread.sleep(1000);
		Search_btn.click();
		Thread.sleep(2000);
		
		if(verifyLatestTransaction("Percentage","AEPS",userMaxAmount_BC,"20.00")==true)
		{
			softAssert.assertTrue(true);
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		
		//For Agent Purpose
		Thread.sleep(3000);
		Corp_BC.click();
		Thread.sleep(1000);
		Search_Box3.click();
		Thread.sleep(1000);
		Search_Box3.sendKeys("dfgcg", Keys.ENTER);
		Thread.sleep(1000);
		User_Type.click();
		Thread.sleep(1000);
		Search_Box4.click();
		Thread.sleep(1000);
		Search_Box4.sendKeys("Agent", Keys.ENTER);
		Thread.sleep(1000);
		Click_CHannel_ConfirmationPage.click();
		Search_Box4.click();
		Thread.sleep(1000);
		Search_Box4.sendKeys("AEPS", Keys.ENTER);
		Thread.sleep(1000);
		Search_btn.click();
		Thread.sleep(2000);
		
		if(verifyLatestTransaction("Percentage","AEPS",userMaxAmount_Agent,"20.00")==true)
		{
			softAssert.assertTrue(true);
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		
		softAssert.assertAll();
	}
	
	
	
	public void BBPS_Commission_Status() throws InterruptedException // BBPS COMMISSION Status Action
	{
		if (AC_Menu.isDisplayed() == true) {
			System.out.println("This element is displayed");
		}

		else {
			CM_Menu.click();
			Thread.sleep(1000);
		}

		// AC_Menu.click();
		// Thread.sleep(1000);

		BBPS_Comm_Status.click();
		Thread.sleep(1000);

		Corp_BC2.click();
		Thread.sleep(1000);

		Search_Box7.click();
		Thread.sleep(1000);

		Search_Box7.sendKeys("jayesh patil", Keys.ENTER);
		Thread.sleep(1000);

		User_Type1.click();
		Thread.sleep(1000);

		Search_box8.click();
		Thread.sleep(1000);

		Search_box8.sendKeys("Agent", Keys.ENTER);
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(1000);

		Search_box9.sendKeys("Approved", Keys.ENTER);
		Thread.sleep(1000);

		Service1.click();
		Thread.sleep(null);

		Search_box10.click();
		Thread.sleep(1000);

		Search_box10.sendKeys("DTH", Keys.ENTER);
		Thread.sleep(1000);

		SearchButton1.click();
		Thread.sleep(1000);

		clearbtn1.click();
		Thread.sleep(1000);
	}

}
