package ESAF.Portal.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ESAF.Portal.Resorces.Utility;

public class ESAF_Agent_ManagementPage_OLD extends Utility {
	WebDriver driver;

	public ESAF_Agent_ManagementPage_OLD(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@FindBy(xpath = "//a[@id='hrefsubpg18']")
	WebElement Click_Agent_Management;

	@FindBy(xpath = "//a[@id='lbtn18-60']")
	WebElement Click_Manual_KYC;

	@FindBy(xpath = "//div[@id='divAction']//button[@type='button']")
	WebElement btn_Add_New;

	// WebElement for personal details

	// Corporate BC dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlclient")
	private WebElement corporateBCDropdown;

	// Aggregator dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlFranchise")
	private WebElement aggregatorDropdown;

	// Services Offered checkboxes
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_chkAEPS")
	private WebElement aepsCheckbox;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_chkbbps")
	private WebElement bbpsCheckbox;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_chkdmt")
	private WebElement dmtCheckbox;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_chkMATM")
	private WebElement microAtmCheckbox;

	// First Name input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtFirstName")
	private WebElement firstNameInput;

	// Middle Name input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtMiddleName")
	private WebElement middleNameInput;

	// Last Name input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLastName")
	private WebElement lastNameInput;

	// Father/Mother/Spouse Name input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtMotherName")
	private WebElement parentNameInput;

	// Email ID input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtEmailID")
	private WebElement emailInput;

	// Gender dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlGender")
	private WebElement genderDropdown;

	// ID Card Type dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlIDcardtype")
	private WebElement idCardTypeDropdown;

	// PAN No. input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtPANNo")
	private WebElement panNumberInput;

	// GST Registered checkbox
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_IschkGstChecked")
	private WebElement gstCheckbox;

	// GST No. input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtGSTNo")
	private WebElement gstNumberInput;

	// Date of Birth input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtDob")
	private WebElement dobInput;

	// Educational Qualification dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlHighestEducationQualification")
	private WebElement educationQualificationDropdown;

	// Course dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlCourse")
	private WebElement courseDropdown;

	// Institute Name input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtInstituteName")
	private WebElement instituteNameInput;

	// Date of Passing input field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtDateofPassing")
	private WebElement dateOfPassingInput;

	// Alternate Occupation Type Dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlAlternateOccupationType")
	private WebElement alternateOccupationTypeDropdown;

	// Alternate Occupation Description Field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtAlternateOccupationDescription")
	private WebElement alternateOccupationDescriptionField;

	// Aadhaar Card Number Field
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtaadharno")
	private WebElement aadhaarCardNumberField;

	// Shop Opens At Dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlShopOpensat")
	private WebElement shopOpensAtDropdown;

	// Shop Closes At Dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlShopClosesAt")
	private WebElement shopClosesAtDropdown;

	// Webelement for Add account details

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtAccountNumber")
	private WebElement accountNumberInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtIFsccode")
	private WebElement ifscCodeInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtNoOfTransactions")
	private WebElement noOfTransactionsInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txttransferAmountPerday")
	private WebElement transferAmountInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlAgentWalletTransfer")
	private WebElement agentWalletTransferDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtAgentAccountName")
	private WebElement agentAccountNameInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlIsUPIPartner")
	private WebElement isUPIPartnerDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlwalletLoadingWithdrawl")
	private WebElement walletLoadingWithdrawalDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlBcAgenttype")
	private WebElement bcAgentTypeDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlParentFlag")
	private WebElement parentFlagDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtAgentParentID")
	private WebElement parentAgentIDInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlRegistrationType")
	private WebElement registrationTypeDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlTypeOfCommission")
	private WebElement typeOfCommissionDropdown;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtThresholdAmt")
	private WebElement thresholdAmountInput;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_chkEmail")
	private WebElement alertEmailCheckbox;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_chkSMS")
	private WebElement alertSMSCheckbox;

	@FindBy(id = "RadioConfigCategory_0")
	private WebElement configCategoryUnlimitedRadio;

	@FindBy(id = "RadioConfigCategory_1")
	private WebElement configCategoryLimitedRadio;

	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtAlerrtStartFrom")
	private WebElement alertStartFromInput;

	// Webelement for Communication Details

	// Registered Address
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtRegisteredAddress")
	private WebElement registeredAddress;

	// Area
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtArea")
	private WebElement area;

	// Country Dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlCountry")
	private WebElement countryDropdown;

	// State Dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlState")
	private WebElement stateDropdown;

	// District Input
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtDistrict")
	private WebElement district;

	// City Dropdown
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlCity")
	private WebElement cityDropdown;

	// Pincode Input
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtPinCode")
	private WebElement pinCode;

	// Contact Number
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtContactNo")
	private WebElement contactNumber;

	// Landline Number
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLandlineNo")
	private WebElement landlineNumber;

	// Alternate Number
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtAlterNateNo")
	private WebElement alternateNumber;

	// Longitude
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtlongitude")
	private WebElement longitude;

	// Latitude
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtlatitude")
	private WebElement latitude;
	
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_CheckBoxAddress")
	WebElement chkSameasRegisterAdd;

	// Local Address
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLocalAddress")
	private WebElement localAddressTextarea;

	// Local Area
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLocalArea")
	private WebElement localAreaInput;

	// Local Country
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlLocalcountry")
	private WebElement localCountryDropdown;

	// Local State
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlLocalState")
	private WebElement localStateDropdown;

	// Local District
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtlocaldistrict")
	private WebElement localDistrictInput;

	// Local City
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlLocalcity")
	private WebElement localCityDropdown;

	// Local Pincode
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLocalPincode")
	private WebElement localPincodeInput;

	// Shop Address
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtShopAddress")
	private WebElement shopAddressTextarea;

	// Shop Area
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtShopArea")
	private WebElement shopAreaInput;

	// Shop Country
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlShopCountry")
	private WebElement shopCountryDropdown;

	// Shop State
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlShopState")
	private WebElement shopStateDropdown;

	// Shop District
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtShopDistrict")
	private WebElement shopDistrictInput;

	// Shop City
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlShopCity")
	private WebElement shopCityDropdown;

	// Shop Pincode
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtShopPincode")
	private WebElement shopPincodeInput;
	
	//Webelement For Agent Mapping Module
	
	@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtBankcode")
    private WebElement bankBranchCodeField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtBankbrName")
    private WebElement bankBranchNameField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtBccode")
    private WebElement bcBranchCodeField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtBcname")
    private WebElement bcBranchNameField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLeadrefempid")
    private WebElement leadReferredByEmpIdField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLeadempname")
    private WebElement leadReferredByEmpNameField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLeadsource")
    private WebElement leadSourcingEntityField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtreportempid")
    private WebElement reportingOfficerEmpIdField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtofficername")
    private WebElement reportingOfficerEmpNameField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtLeadEmpid")
    private WebElement leadSourcedByEmpIdField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtsourceempname")
    private WebElement leadSourcedByEmpNameField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlDeviceType")
    private WebElement deviceTypeDropdown;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_ddlLocation")
    private WebElement agentLocationCategoryDropdown;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtbcdeviceid")
    private WebElement deviceIdField;

    @FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_txtdeviceimei")
    private WebElement deviceImeiField;

    @FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_btnSubmitDetails']")
    WebElement btn_Submit;
    
    @FindBy(xpath = "//input[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_btnCancel']")
    WebElement btn_cancle;

    public void Add_Agent() throws InterruptedException 
    {
    	Click_Agent_Management.click();
    	Thread.sleep(5000);
    	Click_Manual_KYC.click();
    	Thread.sleep(5000);
    	btn_Add_New.click();
    	Thread.sleep(5000);
    	firstNameInput.sendKeys("Rajendra");
    	parentNameInput.sendKeys("Abc");
    	emailInput.sendKeys("r@r.com");
    	panNumberInput.sendKeys("ACOPC0014E");
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement dobField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpbdCarde_TabContRegistration_TabPanelSearPages_txtDob")));

         // JavaScript to set the value in the readonly field
         String dateToSet = "12/12/1990"; // Example date in MM/dd/yyyy format
         
         ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1]);", dobField, dateToSet);
    	
    	
    	//dobInput.sendKeys("25/11/2024");
    	aadhaarCardNumberField.sendKeys("903160488146");
    	
    	moveToElement(registeredAddress);
    	
    	accountNumberInput.sendKeys("5555555555555555");
    	ifscCodeInput.sendKeys("HDFC0000001");
    	noOfTransactionsInput.sendKeys("1000");
    	transferAmountInput.sendKeys("50000");
    	agentAccountNameInput.sendKeys("Rajendra");
    	Dropdownbyindex(typeOfCommissionDropdown, 1);
    	thresholdAmountInput.sendKeys("1000");
    	registeredAddress.sendKeys("Thane");
    	area.sendKeys("Thane");
    	Dropdownbytxt(stateDropdown, "Maharashtra");
    	district.sendKeys("Satara");
    	moveToElement(pinCode);
    	Dropdownbytxt(cityDropdown, "Satara");
    	pinCode.sendKeys("415512");
    	contactNumber.sendKeys("8527419630");
    	moveToElementAndClick(chkSameasRegisterAdd);
    	moveToElementAndClick(btn_Submit);
		
	}
}
