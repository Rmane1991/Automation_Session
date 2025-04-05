package ESAF.Portal.Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import ESAF.Portal.Resorces.Utility;

public class ESAF_ServiceRequest_Page extends Utility {
	WebDriver driver;

	public ESAF_ServiceRequest_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	///////////////////////////////////// Agent Service Request
	///////////////////////////////////// Element////////////////////////////////////

	@FindBy(xpath = "//a[@id='hrefsubpg39']")
	WebElement Click_ServiceRequest;

	@FindBy(xpath = "//a[@id='lbtn39-2316']")
	WebElement Click_AgentServiceRequest;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement select_CorporateBC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Enter_CorporateBC;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlFranchise-container']")
	WebElement select_Aggregator;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Enter_Aggregator;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlAgent-container']")
	WebElement select_Agent;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Enter_Agent;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlRequest-container']")
	WebElement Click_SelectDropdown;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Entertext;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-aovj-0']")
	WebElement Select;

	@FindBy(xpath = "//li[@id='sselect2-cpbdCarde_ddlRequest-result-axpg-1']")
	WebElement All;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-qswx-2']")
	WebElement Contact;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtContact']")
	WebElement Enter_ContactNumber;

	@FindBy(xpath = "	//input[@id='cpbdCarde_flgUplodContactProof']")
	WebElement upload_ContactDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-du2j-3']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtEMAIL']")
	WebElement Enter_Email;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodEmailProof']")
	WebElement Upload_EmailDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-lkkg-4']")
	WebElement Account;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtACCOUNT']")
	WebElement Enter_AccountNumber;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtIFsccode']")
	WebElement Enter_IFSCCode;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtAccountName']")
	WebElement Enter_AccountName;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodAccountProof']")
	WebElement Upload_AccountDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-77jp-5']")
	WebElement Address;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_txtADDRESS']")
	WebElement Enter_Address;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodAddressProof']")
	WebElement Upload_AddressDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-g52f-6']")
	WebElement Terminate;

	@FindBy(xpath = "//li[@id='//input[@id='cpbdCarde_btnTerminate']")
	WebElement Click_Terminate;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodTerminateProof']")
	WebElement Upload_TerminateDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-j5ot-7']")
	WebElement Deactivate;

	@FindBy(xpath = "//li[@id='//input[@id='cpbdCarde_btnDEACTIVATE']")
	WebElement Click_Deactivate;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodDeactivateProof']")
	WebElement Upload_DeactivateDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-dnok-9']")
	WebElement FathermotherspouseName;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtspousename']")
	WebElement Enter_FathermotherspouseName;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodSpouseProof']")
	WebElement Upload_FathermotherspouseNameDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-s6cm-10']")
	WebElement Educational_Qualification;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlHighestEducationQualification']")
	WebElement Select_Educational_Qualification;

	@FindBy(xpath = "//Input[@id='cpbdCarde_flgUplodEducationProof']")
	WebElement Upload_Educational_Qualification;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-ch4v-11']")
	WebElement Reset;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnReset']")
	WebElement Click_Reset;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-r3v9-16']")
	WebElement Name;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtname']")
	WebElement Enter_Name;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodnameProof']")
	WebElement Upload_NameDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-lkkg-4']")
	WebElement Revoke_PanConsent;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnpan']")
	WebElement Click_RevokePanConsent;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement Click_update;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnCancel']")
	WebElement Click_Cancel;

	////////////////////////// verification page 1 Element /////////////////////////

	@FindBy(xpath = "//a[@id='lbtn39-2305']")
	WebElement REQUEST_VERIFICATIONLEVEL1;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlAggregatorCode-container']")
	WebElement select_Aggregatorfrom_verification;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Click_Searchbutton;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnClear']")
	WebElement Click_Clearbutton;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnExportExcel']")
	WebElement Click_Exportbutton;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnExportCSV']")
	WebElement Click_CSVbutton;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvBusinessCorrespondents_lbtnEdit_0']")
	WebElement Click_EditRequest;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvBusinessCorrespondents_btnView_0']")
	WebElement Click_downloaddoucment;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvBusinessCorrespondents_LnkId1_0']")
	WebElement Click_ViewDocument;

	@FindBy(xpath = "//input[@id='cpbdCarde_rdbtnApproveDecline_0']")
	WebElement Click_ApprovedToggle;

	@FindBy(xpath = "//input[@id='cpbdCarde_rdbtnApproveDecline_1']")
	WebElement Click_DeclinedToggle;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtFinalRemarks']")
	WebElement Enter_Remark;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement Click_RequestSubmitbutton;

	@FindBy(xpath = "//input[@id='cpbdCarde_button']")
	WebElement Click_RequestClosedbutton;

	/////////////////////// Verifivation Levele 2

	@FindBy(xpath = "//a[@id='lbtn39-2306']")
	WebElement REQUEST_VERIFICATIONLEVEL2;

	/////////////////////// Verifivation Levele 3 Element

	@FindBy(xpath = "//a[@id='lbtn39-2307']")
	WebElement REQUEST_VERIFICATIONLEVEL3;

	/////////////////////// Verifivation Levele 4 Element
	/////////////////////// //////////////////////////////

	@FindBy(xpath = "//a[@id='lbtn39-2308']")
	WebElement REQUEST_VERIFICATIONLEVEL4;

	/////////////////////// Service Request Report //////////////////////////////

	@FindBy(xpath = "//a[@id='lbtn39-2309']")
	WebElement REQUEST_Report;

	@FindBy(xpath = "//a[@id='cpbdCarde_panelGrid']")
	WebElement scroll_Grid;

	@FindBy(xpath = "//a[@id='lbtn39-2317']")
	WebElement click_Bank_Service_Request;

	////////////////////// Agent Service Request Method ///////////////////

	public void Add_Agent() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		Thread.sleep(1000);
		moveToElement(click_Bank_Service_Request);
		Thread.sleep(1000);
		moveToElementAndClick(Click_AgentServiceRequest);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");// patil
		Thread.sleep(2000);
		selectFromDropdown(select_Aggregator, Enter_Aggregator, "AG18000002");// - jjaya jklbhjkkj khjkhjk
		Thread.sleep(2000);
		selectFromDropdown(select_Agent, Enter_Agent, "EA18000091");// - mayuri sharmila kiran khodade
		// moveToElementAndClick(Click_SelectDropdown);
	}

	public void AddRequest_All() throws InterruptedException, IOException {

		selectFromDropdown(Click_SelectDropdown, Entertext, "All");
		// (Click_SelectDropdown,Enter_CorporateBC,"All");
		Enter_Name.sendKeys("sharmila");
		Upload_NameDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_ContactNumber.sendKeys("7057489540");
		upload_ContactDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_Email.sendKeys("Sharmilashelke26@gmail.com");
		Upload_EmailDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_AccountNumber.sendKeys("885577447858");
		Enter_IFSCCode.sendKeys("HDFC000001");
		Enter_AccountName.sendKeys("Sharmila Shelke");
		Upload_AccountDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_Address.sendKeys("702/12 Jeevan Liefstyle Badlapur west");
		Upload_AddressDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_FathermotherspouseName.sendKeys("Kiran Khodade");
		Upload_FathermotherspouseNameDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Upload_Educational_Qualification.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();

	}
	
	@FindBy(xpath=("//div[@class='toast-message']"))
	WebElement tostMessage;
	
	SoftAssert softAssert=new SoftAssert();

	public void AddRequest_Contact() throws InterruptedException, IOException 
	{
		selectFromDropdown(Click_SelectDropdown, Entertext, "Contact");
		Enter_ContactNumber.sendKeys("7057489540");
		upload_ContactDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
		

		if(tostMessage.getText().contains("Passs."))
		{
			softAssert.assertTrue(true);
			System.out.println("Pass");
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		softAssert.assertAll();
		
	}

	public void AddRequest_Email() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Email");
		Enter_Email.sendKeys("Sharmilashelke26@gmail.com");
		Upload_EmailDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
	}

	public void AddRequest_Account() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Account");
		Enter_AccountNumber.sendKeys("885577447858");
		Enter_IFSCCode.sendKeys("HDFC000001");
		Enter_AccountName.sendKeys("Sharmila Shelke");
		Upload_AccountDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
	}

	public void AddRequest_Address() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Address");
		Enter_Address.sendKeys("702/12 Jeevan Liefstyle Badlapur west");
		Upload_AddressDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
	}

	public void AddRequest_Terminate() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Terminate");
		Upload_TerminateDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_Terminate.click();
		Click_update.click();
	}

	public void AddRequest_Deactivate() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Deactivate");
		Upload_DeactivateDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_Deactivate.click();
		Click_update.click();
	}

	public void AddRequest_FathermotherspouseName() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Father-mother-spouseName");
		Enter_FathermotherspouseName.sendKeys("Kiran");
		Upload_FathermotherspouseNameDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
	}

	public void AddRequest_EducationalQualification() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Educational");
		// Educational_Qualification.sendKeys("10th");
		Upload_Educational_Qualification.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
	}

	public void AddRequest_Reset() throws InterruptedException, IOException {
		selectFromDropdown(Click_SelectDropdown, Entertext, "Reset");
		Click_Reset.click();
	}

	public void AddRequest_Name() throws InterruptedException, IOException 
	{
		selectFromDropdown_Exact_Name(Click_SelectDropdown, Entertext, "Name");
		System.out.println("Name Selected");

		/*
		 * Select select = new
		 * Select(driver.findElement(By.id("select2-cpbdCarde_ddlRequest-container")));
		 * 
		 * //For loop for (WebElement option : select.getOptions()) { String optionText
		 * = option.getText();
		 * 
		 * //Text validation if (optionText.equals("Name")) {
		 * select.selectByVisibleText(optionText); break; // Exit loop once the matching
		 * option is selected } }
		 */

		Enter_Name.sendKeys("Mayuri");
		Upload_NameDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();
	}

	public void AddRequest_RevokePan() throws InterruptedException, IOException 
	{
		selectFromDropdown(Click_SelectDropdown, Entertext, "RevokePanConsent");
		Click_RevokePanConsent.click();

	}

	////////////////////////// verification 1 page method////////////////////

	public void ServiceRequest_Verification1() throws InterruptedException, IOException {
		// moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(REQUEST_VERIFICATIONLEVEL1);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		// selectFromDropdown(select_Aggregator,select_Aggregatorfrom_verification,"AG18000002");
		// Thread.sleep(2000);
		Click_Searchbutton.click();
		Click_EditRequest.click();
		Click_ApprovedToggle.click();
		Enter_Remark.sendKeys("Done");
		Click_RequestSubmitbutton.click();
		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
		}

		Thread.sleep(2000);
	}

	////////////////////////// verification 2 page
	////////////////////////// method/////////////////////////////////

	public void ServiceRequest_Verification2() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(REQUEST_VERIFICATIONLEVEL2);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		// selectFromDropdown(select_Aggregator,select_Aggregatorfrom_verification,"AG18000002");
		// Thread.sleep(2000);
		Click_Searchbutton.click();
		Click_EditRequest.click();
		Click_ApprovedToggle.click();
		Enter_Remark.sendKeys("Done");
		Click_RequestSubmitbutton.click();

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
		}

		Thread.sleep(2000);

	}

	///////////////////////// verification 3 page
	///////////////////////// method////////////////////////////////////////

	public void ServiceRequest_Verification3() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(REQUEST_VERIFICATIONLEVEL3);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		// selectFromDropdown(select_Aggregator,select_Aggregatorfrom_verification,"AG18000002");
		// Thread.sleep(2000);
		Click_Searchbutton.click();
		Click_EditRequest.click();
		Click_ApprovedToggle.click();
		Enter_Remark.sendKeys("Done");
		Click_RequestSubmitbutton.click();

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
		}

		Thread.sleep(2000);

	}

/////////////////////////verification 4 page method////////////////////////////////////////

	public void ServiceRequest_Verification4() throws InterruptedException, IOException {
		// moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(REQUEST_VERIFICATIONLEVEL4);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		// selectFromDropdown(select_Aggregator,select_Aggregatorfrom_verification,"AG18000002");
		// Thread.sleep(2000);
		Click_Searchbutton.click();
		Click_EditRequest.click();
		Click_ApprovedToggle.click();
		Enter_Remark.sendKeys("Done");
		Click_RequestSubmitbutton.click();

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
		}

		Thread.sleep(2000);

	}

	public void ServiceRequest_Report() throws InterruptedException, IOException {
		// moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(REQUEST_Report);

	}

	///////////////////////////// Aggregator Service Request
	///////////////////////////// Element//////////////////////

	@FindBy(xpath = "//a[@id='lbtn39-2314']")
	WebElement Click_AggregatorServiceRequest;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlRole']")
	WebElement Clickdropdown_Usertype;

	@FindBy(xpath = "//option[@value='4']")
	WebElement SelectAgentfromdropdown;

	@FindBy(xpath = "//option[@value='3']")
	WebElement SelectAggregatorfromdropdown;

	@FindBy(xpath = "//option[@value='5']")
	WebElement SelectUsersfromdropdown;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlAgentname-container']")
	WebElement ClickAgentFilter;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement EnterAgentinFilter;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlRequest-container']")
	WebElement ClickRequestType_Filter;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement EnterRequestType;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnACTIVATE']")
	WebElement ClickActive_Button;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodACTIVATProof']")
	WebElement UploadAgentActiveDocument;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnDEACTIVATE']")
	WebElement clickDeactivate_button;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodDeactivateProof']")
	WebElement UploadAgentDeActiveDocument;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnTerminate']")
	WebElement clickTerminate_button;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodTerminateProof']")
	WebElement UploadAgentTerminateDocument;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnpan']")
	WebElement clickRevokePanElement_button;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-apj4-0']")
	WebElement AggregatorRequest_Select;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-91i9-1']")
	WebElement AggregatorRequest_All;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-0atc-2']")
	WebElement AggregatorRequest_Contact;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtContact']")
	WebElement AggregatorRequest_Enter_ContactNumber;

	@FindBy(xpath = "	//input[@id='cpbdCarde_flgUplodContactProof']")
	WebElement AggregatorRequest_upload_ContactDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-du2j-3']")
	WebElement AggregatorRequest_Email;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtEMAIL']")
	WebElement AggregatorRequest_Enter_Email;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodEmailProof']")
	WebElement AggregatorRequest_Upload_EmailDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-lkkg-4']")
	WebElement AggregatorRequest_Account;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtACCOUNT']")
	WebElement AggregatorRequest_Enter_AccountNumber;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtIFsccode']")
	WebElement AggregatorRequest_Enter_IFSCCode;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtAccountName']")
	WebElement AggregatorRequest_Enter_AccountName;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodAccountProof']")
	WebElement AggregatorRequest_Upload_AccountDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-77jp-5']")
	WebElement AggregatorRequest_Address;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_txtADDRESS']")
	WebElement AggregatorRequest_Enter_Address;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodAddressProof']")
	WebElement AggregatorRequest_Upload_AddressDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-g52f-6']")
	WebElement AggregatorRequest_Terminate;

	@FindBy(xpath = "//li[@id='//input[@id='cpbdCarde_btnTerminate']")
	WebElement AggregatorRequest_Click_Terminate;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodTerminateProof']")
	WebElement AggregatorRequest_Upload_TerminateDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-j5ot-7']")
	WebElement AggregatorRequest_Deactivate;

	@FindBy(xpath = "//li[@id='//input[@id='cpbdCarde_btnDEACTIVATE']")
	WebElement AggregatorRequest_Click_Deactivate;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodDeactivateProof']")
	WebElement AggregatorRequest_Upload_DeactivateDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-dnok-9']")
	WebElement AggregatorRequest_FathermotherspouseName;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtspousename']")
	WebElement AggregatorRequest_Enter_FathermotherspouseName;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodSpouseProof']")
	WebElement AggregatorRequest_Upload_FathermotherspouseNameDetails;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-s6cm-10']")
	WebElement AggregatorRequest_Educational_Qualification;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlHighestEducationQualification']")
	WebElement AggregatorRequest_Select_Educational_Qualification;

	@FindBy(xpath = "//Input[@id='cpbdCarde_flgUplodEducationProof']")
	WebElement AggregatorRequest_Upload_Educational_Qualification;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-ch4v-11']")
	WebElement AggregatorRequest_Reset;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnReset']")
	WebElement AggregatorRequest_Click_Reset;

	@FindBy(xpath = "//li[@id='select2-cpbdCarde_ddlRequest-result-r3v9-16']")
	WebElement AggregatorRequest_Name;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtname']")
	WebElement AggregatorRequest_Enter_Name;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodnameProof']")
	WebElement AggregatorRequest_Upload_NameDetails;

	public void Aggregator_AgentServiceRequest_active() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAgentfromdropdown.click();
		selectFromDropdown(ClickAgentFilter, EnterAgentinFilter, "EA18000091");
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "active");
		UploadAgentActiveDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		ClickActive_Button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AgentServiceRequest_Deactive() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAgentfromdropdown.click();
		selectFromDropdown(ClickAgentFilter, EnterAgentinFilter, "EA18000091");
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "Deactivate");
		UploadAgentActiveDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		ClickActive_Button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AgentServiceRequest_Terminate() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAgentfromdropdown.click();
		selectFromDropdown(ClickAgentFilter, EnterAgentinFilter, "EA18000091");
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "Terminate");
		UploadAgentActiveDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		ClickActive_Button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AgentServiceRequest_RevokePan() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		selectFromDropdown(select_CorporateBC, Enter_CorporateBC, "jayesh");
		Thread.sleep(2000);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAgentfromdropdown.click();
		selectFromDropdown(ClickAgentFilter, EnterAgentinFilter, "EA18000091");
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "Revoke");
		UploadAgentActiveDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		ClickActive_Button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AggregatorServiceRequest_active() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAggregatorfromdropdown.click();
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "active");
		UploadAgentActiveDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		ClickActive_Button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AggregatorServiceRequest_Deactive() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAggregatorfromdropdown.click();
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "Deactive");
		UploadAgentDeActiveDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		clickDeactivate_button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AggregatorServiceRequest_Terminate() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAggregatorfromdropdown.click();
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "Terminate");
		UploadAgentTerminateDocument.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Thread.sleep(200);
		clickTerminate_button.click();
		Thread.sleep(200);
	}

	public void Aggregator_AggregatorServiceRequest_Reset() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAggregatorfromdropdown.click();
		selectFromDropdown(ClickRequestType_Filter, EnterRequestType, "Reset");
		Thread.sleep(200);
		Click_Reset.click();
		Thread.sleep(200);
	}

	public void Aggregator_AddRequest_All() throws InterruptedException, IOException {
		moveToElementAndClick(Click_ServiceRequest);
		moveToElementAndClick(Click_AggregatorServiceRequest);
		moveToElementAndClick(Clickdropdown_Usertype);
		SelectAggregatorfromdropdown.click();
		selectFromDropdown(Click_SelectDropdown, Entertext, "All");
		// (Click_SelectDropdown,Enter_CorporateBC,"All");
		Enter_Name.sendKeys("sharmila");
		Upload_NameDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_ContactNumber.sendKeys("7057489540");
		upload_ContactDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_Email.sendKeys("Sharmilashelke26@gmail.com");
		Upload_EmailDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_AccountNumber.sendKeys("885577447858");
		Enter_IFSCCode.sendKeys("HDFC000001");
		Enter_AccountName.sendKeys("Sharmila Shelke");
		Upload_AccountDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_Address.sendKeys("702/12 Jeevan Liefstyle Badlapur west");
		Upload_AddressDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Enter_FathermotherspouseName.sendKeys("Kiran Khodade");
		Upload_FathermotherspouseNameDetails.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");

		Upload_Educational_Qualification.sendKeys("D:\\sharmila\\Document_Auto\\AgentPolicy.pdf");
		Click_update.click();

	}

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement click_AgentProfile;

	@FindBy(xpath = "//a[@id='LbLoginStatus']")
	WebElement click_Logoutbutton;

	public void Logout() throws InterruptedException, IOException {
		moveToElementAndClick(click_AgentProfile);
		moveToElementAndClick(click_Logoutbutton);

	}

}
