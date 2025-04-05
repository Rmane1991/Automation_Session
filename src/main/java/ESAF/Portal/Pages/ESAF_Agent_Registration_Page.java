
package ESAF.Portal.Pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import ESAF.Portal.Resorces.Utility;

public class ESAF_Agent_Registration_Page extends Utility {

	WebDriver driver;
	String firstNameValue;
	String middleNameValue;
	String lastNameValue;
	String fullName;
	String agentId = "EA18000154";
	SoftAssert softAssert=new SoftAssert();

//XSSFSheet sheet;

// Constructor to initialize the WebDriver and PageFactory elements
	public ESAF_Agent_Registration_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@FindBy(id = "hrefsubpg18")
	WebElement mouseover;

	@FindBy(id = "lbtn18-60")
	WebElement manulKycClick;

	@FindBy(xpath = "//button[normalize-space()='Add New +']")
	WebElement clickAddBtn;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlclient']")
	WebElement corpBcClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlFranchise']")
	WebElement AggreBcClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtFirstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtMiddleName']")
	WebElement middleName;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtLastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtMotherName']")
	WebElement fatherName;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtEmailID']")
	WebElement emailId;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlGender']")
	WebElement genderClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtPANNo']")
	WebElement panId;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtspousename']")
	WebElement txt_SpouseName;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtDob']")
	WebElement dateOfBirth;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlCategory']")
	WebElement catogoryClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlPhysicallyHandicapped']")
	WebElement phyHandClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlHighestEducationQualification']")
	WebElement eduQulyClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlCourse']")
	WebElement CourseClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlAlternateOccupationType']")
	WebElement altOccuTypeClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtaadharno']")
	WebElement aadharCardId;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtCIF']")
	WebElement txt_CIF;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtAccountNumber']")
	WebElement accountType;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtIFsccode']")
	WebElement ifscCode;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtNoOfTransactions']")
	WebElement noOfTransactions;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txttransferAmountPerday']")
	WebElement transferPerDay;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlAgentWalletTransfer']")
	WebElement agentWalltetTransClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlAgentWalletTransfer']/option[2]")
	WebElement agentWalltetTransSubClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtAgentAccountName']")
	WebElement agentAccName;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlTypeOfCommission']")
	WebElement typeFCommClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlTypeOfCommission']/option[2]")
	WebElement typeFCommSubClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtThresholdAmt']")
	WebElement thresAmount;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_chkEmail']")
	WebElement checkBoxAltertEmail;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_chkSMS']")
	WebElement checkBoxAltertSms;

	@FindBy(xpath = "//input[@id='RadioConfigCategory_1']")
	WebElement congCatRadioBtn;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtAlerrtStartFrom']")
	WebElement txt_AlertStFrom;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtRegisteredAddress']")
	WebElement regAddrs;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtLocalAddress']")
	WebElement txtLocalAdd;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtArea']")
	WebElement area;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlState']")
	WebElement stateClick;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlState']/option[23]")
	WebElement stateSubClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtDistrict']")
	WebElement district;

	@FindBy(xpath = "//select[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_ddlCity']")
	WebElement cityClick;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtPinCode']")
	WebElement pincode;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtContactNo']")
	WebElement contactNo;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_txtlatitude']")
	WebElement latitude;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_CheckBoxAddress']")
	WebElement localShopAddSameChkBox;

	@FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_btnSubmitDetails']")
	WebElement submitBtn;

//Document Upload Elements

	@FindBy(id = "lbtn18-77")
	WebElement ClickDocuUpload;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlclient']")
	WebElement ClickCorBc;

	@FindBy(xpath = "//select	[@id='cpbdCarde_ddlFranchise']")
	WebElement ClickAggregator;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlAgent']")
	WebElement ClickAgent;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyIdProof']")
	WebElement click_PanCardFilePath;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyAddressProof']")
	WebElement click_AadharFilePath;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMySignatureProof']")
	WebElement click_AddresFilePath;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyDocProof1']")
	WebElement click_EducationCerFilePath;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyDocProof2']")
	WebElement click_ShopphotoCerFilePath;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyDocProof3']")
	WebElement click_BankDocPath;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement btn_DocUpload;

//Webelement Verification level 1

	@FindBy(id = "lbtn18-61")
	WebElement click_level1_BCVertification;

	@FindBy(id = "select2-cpbdCarde_ddlClient-container")
	WebElement click_Level1_BC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Txt_search__field;

//@FindBy(xpath="//input[@class='select2-selection__rendered']")	
//WebElement Txt_search__field;

	@FindBy(id = "select2-cpbdCarde_ddlAggregatorCode-container")
	WebElement click_Level1_Agg;

	@FindBy(id = "select2-cpbdCarde_ddlAgent-container")
	WebElement click_Level1_Agent;

	@FindBy(id = "select2-cpbdCarde_ddlState-container")
	WebElement click_Level1_State;

	@FindBy(id = "cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0")
	WebElement click_Level1_ChkBox;

	@FindBy(id = "cpbdCarde_btnApprove")
	WebElement click_Level1_ApprovBtn;

	@FindBy(xpath = "//input[@id='cpbdCarde_TxtRemarks']")
	WebElement txt_Approve_Agent_Level1;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSaveAction']")
	WebElement click_Save__Btn_Level1;

//Webelement Verification level 2

	@FindBy(id = "lbtn18-2286")
	WebElement click_Lvl2BCVerification;

	@FindBy(id = "select2-cpbdCarde_ddlClient-container")
	WebElement clickLvl2CorBc;

	@FindBy(id = "select2-cpbdCarde_ddlAggregatorCode-container")
	WebElement clickLvl2AggregatorBc;

	@FindBy(id = "select2-cpbdCarde_ddlAgent-container")
	WebElement clickLvl2AgentBCorBc;

	@FindBy(id = "select2-cpbdCarde_ddlState-container")
	WebElement clickLvl2StateBc;

	@FindBy(id = "cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0")
	WebElement click_Lvl2_AppChkBox;

	@FindBy(id = "cpbdCarde_btnApprove")
	WebElement btn_Lvl2_Appove;

//Webelement Verification level 3

	@FindBy(id = "lbtn18-2287")
	WebElement click_Lvl3BCVerification;

	@FindBy(id = "select2-cpbdCarde_ddlClient-container")
	WebElement clickLvl3CorBc;

	@FindBy(id = "select2-cpbdCarde_ddlAggregatorCode-container")
	WebElement clickLvl3AggregatorBc;

	@FindBy(id = "select2-cpbdCarde_ddlAgent-container")
	WebElement clickLvl3AgentBCorBc;

	@FindBy(id = "select2-cpbdCarde_ddlState-container")
	WebElement clickLvl3StateBc;

	@FindBy(id = "cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0")
	WebElement click_Lvl3_AppChkBox;

	@FindBy(id = "cpbdCarde_btnApprove")
	WebElement btn_Lvl3_Appove;

//Webelement Verification level 4

	@FindBy(id = "lbtn18-2288")
	WebElement click_Lvl4BCVerification;

	@FindBy(id = "select2-cpbdCarde_ddlClient-container")
	WebElement clickLvl4CorBc;

	@FindBy(id = "select2-cpbdCarde_ddlAggregatorCode-container")
	WebElement clickLvl4AggregatorBc;

	@FindBy(id = "select2-cpbdCarde_ddlAgent-container")
	WebElement clickLvl4AgentBCorBc;

	@FindBy(id = "select2-cpbdCarde_ddlState-container")
	WebElement clickLvl4StateBc;

	@FindBy(id = "cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0")
	WebElement click_Lvl4_AppChkBox;

	@FindBy(id = "cpbdCarde_btnApprove")
	WebElement btn_Lvl4_Appove;

//Webelement Onboarded agent 

	@FindBy(id = "lbtn18-62")
	WebElement click_OnbrdAgent;

	@FindBy(id = "cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0")
	WebElement click_AgentOnbrd_Checkbox;

	@FindBy(id = "cpbdCarde_btnDeactivate")
	WebElement btn_Agent_Deactive;

	@FindBy(id = "cpbdCarde_btnTerminate")
	WebElement btn_Agent_Terminalte;

	public void mouseOverElement() {
		mouseover.click();

	}

// Method to click the New Task tab (implementation pending)

	public void manualKycClick() {
		manulKycClick.click();

	}

	public void clickAddBtn() {
		clickAddBtn.click();
	}

	/*
	 * public void selectFromDropdown(WebElement dropdownContainerElement,
	 * WebElement txtsercharea, String searchTerm) throws InterruptedException {
	 * dropdownContainerElement.click(); Thread.sleep(3000);
	 * 
	 * txtsercharea.clear(); txtsercharea.sendKeys(searchTerm); Thread.sleep(1000);
	 * txtsercharea.sendKeys(Keys.ENTER); Thread.sleep(1000);
	 * 
	 * }
	 */

	public void selectByVisibleTxt(WebElement click, String visible) {
		Select dropDown = new Select(click);
		dropDown.selectByVisibleText(visible);
	}

	public void MouseScroll() {
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(0,150)", "");
	}

	static Random random = new Random();

	public static String getRandomFirstName() 
	{
		String[] firstNames = { "John", "Jane", "David", "Emma", "Alice", "Bob" };
		return firstNames[random.nextInt(firstNames.length)];
	}

	public static String getRandomMiddleName() 
	{
		String[] middleNames = { "Doe", "Smith", "Johnson", "Brown", "Taylor" };
		return middleNames[random.nextInt(middleNames.length)];
	}

// Generate a random last name
	public static String getRandomLastName() 
	{
		String[] lastNames = { "Doe", "Smith", "Johnson", "Brown", "Taylor" };
		return lastNames[random.nextInt(lastNames.length)];
	}

	public WebElement Click_CheckboxBy_AgentName(String agentName) 
	{
		return driver.findElement(By.xpath("//td[text()='" + agentName + "']/preceding-sibling::td/input[@type='checkbox']"));
	}
	
	@FindBy(xpath = ("//div[@class='toast-message']"))
	WebElement tostMessage;
	
	public void corporateBcClick() throws InterruptedException 
	{
		mouseover.click();

		manulKycClick.click();
		clickAddBtn.click();
		Dropdownbytxt(corpBcClick, "jayesh patil");
		Thread.sleep(3000);
		Dropdownbytxt(AggreBcClick, "AG18000001 - jayu dhefjur patil");
		String firstNameValue = getRandomFirstName();
		String middleNameValue = getRandomMiddleName();
		String lastNameValue = getRandomLastName();
		fullName = firstNameValue + " " + middleNameValue + " " + lastNameValue;
		System.out.println(fullName);
		firstName.sendKeys(firstNameValue);
		Thread.sleep(3000);
		middleName.sendKeys(middleNameValue);
		Thread.sleep(3000);
		lastName.sendKeys(lastNameValue);
		fatherName.sendKeys("Chetu");
		emailId.sendKeys(generateRandomEmail());
		Dropdownbytxt(genderClick, "Female");
		Thread.sleep(3000);
		// panId.sendKeys("AXOPP5696D");
		Thread.sleep(3000);
		MouseScroll();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dobField = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("cpbdCarde_TabContRegistration_TabPanelSearPages_txtDob")));
		// JavaScript to set the value in the readonly field
		String dateToSet = "09-01-1988"; // Example date in MM/dd/yyyy format
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1]);", dobField,
				dateToSet);
		Dropdownbytxt(catogoryClick, "SC");
		Dropdownbytxt(phyHandClick, "Yes");
		Dropdownbytxt(eduQulyClick, "12th");
		Dropdownbytxt(CourseClick, "IIBF Basic");
		Dropdownbytxt(altOccuTypeClick, "Private");
		aadharCardId.sendKeys("123456789123");
		MouseScroll();
		accountType.sendKeys(generateRandomAccountNo());
		ifscCode.sendKeys("HDFC0000240");
		noOfTransactions.sendKeys("999");
		transferPerDay.sendKeys("99999");
		agentWalltetTransClick.click();
		agentWalltetTransSubClick.click();
		agentAccName.sendKeys("Shailesh");
		typeFCommClick.click();
		typeFCommSubClick.click();
		thresAmount.sendKeys("999999");
		checkBoxAltertEmail.click();
		checkBoxAltertSms.click();
		congCatRadioBtn.click();
		moveToElement(txtLocalAdd);
		MouseScroll();
		localShopAddSameChkBox.click();
		regAddrs.sendKeys("Narayan Sheety Chawl");
		area.sendKeys("Kapurbawdi");
		Thread.sleep(500);
		Dropdownbytxt(stateClick, "Maharashtra");
		Thread.sleep(3000);
		district.sendKeys("Thane");
		Thread.sleep(3000);
		Dropdownbytxt(cityClick, "Mumbai");
		pincode.sendKeys("400610");
		contactNo.sendKeys(generateRandomMobileNumber());
		latitude.sendKeys("41.40338, 2.17403");
		Thread.sleep(3000);
		MouseScroll();
		moveToElement(panId);
		Thread.sleep(500);
		panId.click();
		panId.clear();
		panId.sendKeys("AXOPP5696D");
		Thread.sleep(500);
		moveToElement(submitBtn);
		MouseScroll();
		submitBtn.click();
		Thread.sleep(500);
		if (isAlertPresent() == true) 
		{
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		
		if (tostMessage.getText().contains("Details has been registered successfully.")) 
		{
		    System.out.println(tostMessage.getText());
		    Assert.assertTrue(true, "Validation message displayed correctly.");
		} 
		
		else 
		{
		    Assert.fail("Expected validation message not found.");
		}
		
	}

	public void documentUpload() throws InterruptedException

	{

		moveToElementAndClick(ClickDocuUpload);

		Dropdownbytxt(ClickCorBc, "jayesh patil");
		Dropdownbytxt(ClickAggregator, "AG18000001 - jayu dhefjur patil");
		Select select = new Select(driver.findElement(By.id("cpbdCarde_ddlAgent")));

		for (WebElement option : select.getOptions()) 
		{
			String optionText = option.getText();

			if (optionText.contains(fullName)) 
			{
				select.selectByVisibleText(optionText);
				break;
			}
		}
		
		click_PanCardFilePath.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		click_AadharFilePath.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		click_AddresFilePath.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		click_EducationCerFilePath.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		MouseScroll();
		click_ShopphotoCerFilePath.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		click_BankDocPath.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);

		moveToElementAndClick(btn_DocUpload);
		Thread.sleep(1000);
		if (tostMessage.getText().contains("Document uploaded successfully.")) 
		{
		    System.out.println(tostMessage.getText());
		    Assert.assertTrue(true, "Document uploaded successfully.");
		} 
		
		else 
		{
		    Assert.fail(tostMessage.getText());
		}
	}

	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement btn_Serch;
	
	@FindBy(id = "select2-cpbdCarde_ddlAgent-container")
	WebElement clickAgnet;
	
	@FindBy(css = "input.select2-search__field")
	WebElement txt_SerchBar;
	
	
	public void clickOnMatchOption(String fullName) 
	{
	    String dynamicXPath = "//li[contains(@class,'select2-results__option') and contains(text(),'" + fullName + "')]";
	    WebElement matchOption = driver.findElement(By.xpath(dynamicXPath));
	    matchOption.click();
	}

	
	
	
	public void level1OneVerification() throws InterruptedException

	{
		moveToElementAndClick(click_level1_BCVertification);
		Thread.sleep(2000);
		selectFromDropdown(click_Level1_BC, Txt_search__field, "jayesh patil");
		selectFromDropdown(click_Level1_Agg, Txt_search__field, "AG18000001 - jayu dhefjur patil");
		selectFromDropdown(clickAgnet, txt_SerchBar,fullName);
		btn_Serch.click();
		Thread.sleep(1000);
		moveToElementAndClick(Click_CheckboxBy_AgentName(fullName));
		Thread.sleep(2000);
		moveToElementAndClick(click_Level1_ApprovBtn);
		Thread.sleep(2000);
		moveToElementAndClick(txt_Approve_Agent_Level1);
		txt_Approve_Agent_Level1.sendKeys("Approve");
		moveToElementAndClick(click_Save__Btn_Level1);
		
		// Validate key phrases only
		if (tostMessage.getText().contains("Total Record Processed for Approve Agent") 
		    && tostMessage.getText().contains("Successful : 1") 
		    && tostMessage.getText().contains("Unsuccessful : 0")) 
		{
		    
		    softAssert.assertTrue(true, "Agent Approved Successfully");
		} 
		
		else 
		{
		    softAssert.fail("Unexpected Toast Message:\n" + tostMessage.getText());
		}
		

	}

	public void level2Verification() throws InterruptedException 
	{
		moveToElementAndClick(click_Lvl2BCVerification);
		Thread.sleep(2000);
		selectFromDropdown(click_Level1_BC, Txt_search__field, "jayesh patil");
		selectFromDropdown(click_Level1_Agg, Txt_search__field, "AG18000001 - jayu dhefjur patil");
		selectFromDropdown(clickAgnet, txt_SerchBar,fullName);
		btn_Serch.click();
		Thread.sleep(1000);
		moveToElementAndClick(Click_CheckboxBy_AgentName(fullName));
		Thread.sleep(2000);
		moveToElementAndClick(click_Level1_ApprovBtn);
		Thread.sleep(3000);
		moveToElementAndClick(txt_Approve_Agent_Level1);
		txt_Approve_Agent_Level1.sendKeys("Approve");
		moveToElementAndClick(click_Save__Btn_Level1);
		
		// Validate key phrases only
		if (tostMessage.getText().contains("Total Record Processed for Approve Agent") 
		    && tostMessage.getText().contains("Successful : 1") 
		    && tostMessage.getText().contains("Unsuccessful : 0")) 
		{
		    
		    softAssert.assertTrue(true, "Agent Approved Successfully");
		} 
		
		else 
		{
		    softAssert.fail("Unexpected Toast Message:\n" + tostMessage.getText());
		}
		
		
		
		
	}

	public void level3Verification() throws InterruptedException 
	{
		moveToElementAndClick(click_Lvl3BCVerification);
		 Thread.sleep(2000);
			selectFromDropdown(click_Level1_BC, Txt_search__field, "jayesh patil");
			selectFromDropdown(click_Level1_Agg, Txt_search__field, "AG18000001 - jayu dhefjur patil");
			selectFromDropdown(clickAgnet, txt_SerchBar,fullName);
			btn_Serch.click();
			Thread.sleep(1000);
			moveToElementAndClick(Click_CheckboxBy_AgentName(fullName));
			Thread.sleep(2000);
			moveToElementAndClick(click_Level1_ApprovBtn);
			Thread.sleep(3000);
			moveToElementAndClick(txt_Approve_Agent_Level1);
			txt_Approve_Agent_Level1.sendKeys("Approve");
			moveToElementAndClick(click_Save__Btn_Level1);
			
			// Validate key phrases only
			if (tostMessage.getText().contains("Total Record Processed for Approve Agent") 
			    && tostMessage.getText().contains("Successful : 1") 
			    && tostMessage.getText().contains("Unsuccessful : 0")) 
			{
			    
			    softAssert.assertTrue(true, "Agent Approved Successfully");
			} 
			
			else 
			{
			    softAssert.fail("Unexpected Toast Message:\n" + tostMessage.getText());
			}

	}

	public void level4Verification() throws InterruptedException

	{
		moveToElementAndClick(click_Lvl4BCVerification);
		Thread.sleep(2000);
		selectFromDropdown(click_Level1_BC, Txt_search__field, "jayesh patil");
		selectFromDropdown(click_Level1_Agg, Txt_search__field, "AG18000001 - jayu dhefjur patil");
		selectFromDropdown(clickAgnet, txt_SerchBar,fullName);
		btn_Serch.click();
		Thread.sleep(1000);
		moveToElementAndClick(Click_CheckboxBy_AgentName(fullName));
		moveToElementAndClick(click_Level1_ApprovBtn);
		Thread.sleep(3000);
		moveToElementAndClick(txt_Approve_Agent_Level1);
		txt_Approve_Agent_Level1.sendKeys("Approve");
		moveToElementAndClick(click_Save__Btn_Level1);
		
		// Validate key phrases only
		if (tostMessage.getText().contains("Total Record Processed for Approve Agent") 
		    && tostMessage.getText().contains("Successful : 1") 
		    && tostMessage.getText().contains("Unsuccessful : 0")) 
		{
		    
		    softAssert.assertTrue(true, "Agent Approved Successfully");
		} 
		
		else 
		{
		    softAssert.fail("Unexpected Toast Message:\n" + tostMessage.getText());
		}
	}

}
