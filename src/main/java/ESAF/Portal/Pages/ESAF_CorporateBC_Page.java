package ESAF.Portal.Pages;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import ESAF.Portal.Resorces.Utility;

public class ESAF_CorporateBC_Page extends Utility
{
	WebDriver driver;
	Sheet sheet;
	
	public ESAF_CorporateBC_Page(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath = "//li/a[@id='hrefsubpg28']")
	WebElement Click_CorporateBcDrpdown;
	
	@FindBy(xpath = "//a[@id='lbtn28-141']")
	WebElement Click_Registration;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtClientName']")
	WebElement txt_ClientName;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtCompanyName']")
	WebElement txt_CompanyName;
	
	@FindBy(xpath = "//div[@id='cpbdCarde_Div_Chk']")
	WebElement Chk_ServicesOffer;
	
	@FindBy(xpath ="//input[@id='cpbdCarde_chkAEPS']")
	WebElement chk_AEPS ;
	

	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtPANNo']")
	WebElement txt_PANNo;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtaadharno']")
	WebElement txt_aadharno;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtGSTNo']")
	WebElement txt_GSTNo;
	
	@FindBy(xpath ="//input[@id='cpbdCarde_txtBankName']")
	WebElement txt_BankName;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtAgentAccountName']")
	WebElement txt_AccountName;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtAccountNumber']")
	WebElement txt_AccountNumber;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtIFsccode']")
	WebElement txt_IFsccode;
	
	@FindBy(xpath = "//div/select[@id='cpbdCarde_ddlypeCommssion']")
	WebElement ddlypeCommssion;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtThresholdAmt']")
	WebElement txt_ThresholdAmt;
	
	//@FindBy(xpath = "//label[@for='lblchkemail']")
	//WebElement checkbox_email;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_chkSMS']")
	WebElement Chk_SMS;
	
	@FindBy(xpath = "//td/input[@id='cpbdCarde_RadioConfigCategory_0']")
	WebElement RDbtn_Configuration;
	
	@FindBy(xpath = "//div/textarea[@id='cpbdCarde_txtRegisteredAddress']")
	WebElement txt_RegisteredAddress;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtPinCode']")
	WebElement txt_PinCode;
	
	//select2-cpbdCarde_ddlCountry-result-hxw3-101
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlCountry-container']")
	WebElement DD_Country;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement DD_search;
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlState-container']")
	WebElement DD_State;
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlCity-container']")
	WebElement DD_City;
	
	@FindBy(xpath ="//span[@class='select2-search select2-search--dropdown']")
	WebElement dD_CitySearch;


	@FindBy(xpath = "//input[@id='cpbdCarde_txtDistrict']")
	WebElement txt_District;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtBusinessEmailID']")
	WebElement txt_EmailID;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtContactNo']")
	WebElement txt_ContactNo;
	
	//@FindBy(xpath="//table[@id='cpbdCarde_RadioButtonListKYC']" )
	//WebElement Rb_ListKYC;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_RadioButtonListKYC_1']")
    WebElement Rd_Btn;
	
	@FindBy(xpath="//input[@id='cpbdCarde_txtLandlineNo']")
	WebElement  txt_LandlineNo;
	
	@FindBy(xpath="//input[@id='cpbdCarde_txtAlterNateNo']")
	WebElement txt_AlterNateNo;
	
	//@FindBy(xpath ="//input[@id='cpbdCarde_btnSubmitDetails']")
	//WebElement btn_Rsubmit;
	
	@FindBy(xpath = "//div/input[@id='cpbdCarde_btnCancel']")
	WebElement btn_Cancel;
	
	@FindBy(xpath ="//input[@id='cpbdCarde_txtBusinessEmailID']")
	WebElement Linttxt;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlypeCommssion']/option[@value='93']")
	WebElement ID_DD;
	
	//---Document Upload Webelement ----//
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlClientName']")
	WebElement DD_CorporateBC;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlIdentityProof']")
	WebElement DD_IdentityProof;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyIdProof']")
	WebElement Btn_flgUplod;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlAddressProof']")
	WebElement DD_AddressProof;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyAddressProof']")
	WebElement Btn_MyAddressProof;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlSignature']")
	WebElement DD_Signature;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMySignatureProof']")
	WebElement Btn_SignatureProof;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement btn_Submit;
	
	
	//------------------------  Verification WebElement  ------------------------  //
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement DD_ClientSearch;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement Txt_ClientSearch;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Btn_Search;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnClear']")
	WebElement Btn_Clear;
	
	@FindBy(xpath=("//div[@class='toast-message']"))
	WebElement tostMessage;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_gvBusinessCorrespondents_CheckBoxAll']")
	WebElement Chk_CheckBoxAll;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnApprove']")
	WebElement Btn_Approve;
	
	@FindBy(xpath = "//textarea[@id='cpbdCarde_TxtRemarks']") //Text remarks for approve comment.
	WebElement txt_Remarks;
	
	@FindBy(xpath = "//div[@class='modal-content']//span[@id='cpbdCarde_lblconfirm']")
	WebElement Win_Approve;
	
	@FindBy(xpath="//input[@id='cpbdCarde_btnSaveAction']") // Text remark save button.
	WebElement Btn_Save;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnDecline']")
	WebElement Btn_Decline;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_gvBusinessCorrespondents_btnViewnew_0']")
	WebElement Btn_Viewnew;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_rdbtnApproveDecline_0']")
	WebElement Rdbtn_Approve;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_rdbtnApproveDecline_1']")
	WebElement Rdbtn_Decline;
	
	@FindBy (xpath ="//textarea[@id='cpbdCarde_txtFinalRemarks']")
	WebElement Rdbtn_Remarks;
	
	@FindBy (xpath ="//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement btn_btnSubmit;
	
	@FindBy(xpath="//input[@id='cpbdCarde_btnCancel']")
	WebElement btn_btnCancel;
	
	//------------------------  Activate Corporate BC WebElement  ------------------------  //
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClient-container']")
	WebElement ddl_Client;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Txt_searchfield;
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlContactNo-container']")
	WebElement ddl_ContactNo;
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlState-container']")
	WebElement ddl_State;	
	
	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlCity-container']")
	WebElement ddl_City;	
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Btn_CA_Search;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnClear']")
	WebElement Btn_CA_Clear;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_gvActiveFranchise_CheckBoxAll']")
	WebElement Chk_CA_CheckBoxAll;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnDeactivate']")
	WebElement Btn_CA_Deactivate;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnTerminate']")
	WebElement Btn_CA_Terminate;
	
	@FindBy(xpath = "//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement Txt_CA_Remarks;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_btnSaveAction']")
	WebElement btn_CA_SaveAction;
	
	
	//Element by Dikshit
	

	@FindBy(xpath = "//a[@id='hrefsubpg28']")
	WebElement Menu_Btn_Corporate_BC;

	@FindBy(xpath = "//a[@id='lbtn28-141']")
	WebElement Menu_Btn_Registration;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtClientName']")
	WebElement TxtClient_Name;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtCompanyName']")
	WebElement TxtCompany_Name;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtPANNo']")
	WebElement TxtPan_No;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtaadharno']")
	WebElement TxtAdhar_No;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtGSTNo']")
	WebElement TxtGst_No;

	@FindBy(xpath = "//input[@id='cpbdCarde_chkAEPS']")
	WebElement Ch_Aeps;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtGSTNo']")
	WebElement Ch_DMT;

	@FindBy(xpath = "//input[@id='cpbdCarde_chkmamt']")
	WebElement Ch_Matm;

	@FindBy(id = "cpbdCarde_txtBankName")
	WebElement Txt_BankName;

	@FindBy(id = "cpbdCarde_txtAgentAccountName")
	WebElement Txt_AgentName;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtAccountNumber']")
	WebElement Txt_Account_Number;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtIFsccode']")
	WebElement Txt_Ifsc_Code;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtThresholdAmt']")
	WebElement Txt_ThresholdAmt;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlypeCommssion']")
	WebElement Dd_TypeCommssion;

	@FindBy(xpath = "//input[@id='cpbdCarde_chkEmail']")
	WebElement Chk_Email;

	@FindBy(xpath = "//input[@id='cpbdCarde_RadioConfigCategory_1']")
	WebElement Rb_Category;

	// webelement of communication_address
	@FindBy(xpath = "//textarea[@id='cpbdCarde_txtRegisteredAddress']")
	WebElement Txt_Address;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtPinCode']")
	WebElement Txt_Pincode;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtDistrict']")
	WebElement Txt_District;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtBusinessEmailID']")
	WebElement Txt_Email_Id;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtContactNo']")
	WebElement Txt_Contact_No;

	// Selecting the Country element
	@FindBy(id = "select2-cpbdCarde_ddlCountry-container")
	WebElement Dd_ddlCountry;

	@FindBy(xpath = "//input[@type='search']")
	WebElement Txt_serach;

	// Selecting the state element
	@FindBy(id = "select2-cpbdCarde_ddlState-container")
	WebElement Dd_DdlState;
	//
	@FindBy(xpath = "//input[@type='search']")
	WebElement Dd_State;

	// Selecting the City element
	@FindBy(id = "select2-cpbdCarde_ddlCity-container")
	WebElement Dd_DdlCity;

	@FindBy(xpath = "//input[@type='search']")
	WebElement Dd_City;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtLandlineNo']")
	WebElement Txt_Land_Line_No;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtAlterNateNo']")
	WebElement Txt_Alternative_No;

	@FindBy(xpath = "//input[@id='cpbdCarde_RadioButtonListKYC_0']")
	WebElement Rb_ListKYC;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement btn_Rsubmit;

	// Document upload page webelemnts
	@FindBy(id = "lbtn28-142")
	WebElement Document_menu_btn;

	@FindBy(id = "cpbdCarde_ddlClientName")
	WebElement dd_Client_Name;
	String name;

	@FindBy(id = "cpbdCarde_UploadForm")
	WebElement btn_upload_formElement;

	@FindBy(id = "cpbdCarde_ddlIdentityProof")
	WebElement dd_IdentityProof;

	@FindBy(id = "cpbdCarde_flgUplodMyIdProof")
	WebElement btn_upload_myidproof;

	@FindBy(id = "cpbdCarde_ddlAddressProof")
	WebElement dd_AddressProof;

	@FindBy(id = "cpbdCarde_flgUplodMyAddressProof")
	WebElement btn_upload_addressproof;

	@FindBy(id = "cpbdCarde_ddlSignature")
	WebElement dd_lSignature;

	@FindBy(id = "cpbdCarde_flgUplodMySignatureProof")
	WebElement btn_upload_MySignatureProof;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement btn_file_submit;
	
	// bc verification
	
	@FindBy(id = "lbtn28-143")
	WebElement verfication_menu_btn;
	
	@FindBy(id = "select2-cpbdCarde_ddlClient-container")
	WebElement dd_Bc_Client;

	@FindBy(id = "select2-cpbdCarde_ddlContactNo-container")
	WebElement dd_BC_Contactnumber;
	
	String contactnumber;

	@FindBy(id = "select2-cpbdCarde_ddlState-container")
	WebElement dd_BC_State;

	@FindBy(id = "select2-cpbdCarde_ddlCity-container")
	WebElement dd_Bc_City;

	@FindBy(id = "cpbdCarde_btnSearch")
	WebElement btn_bc_search;

	@FindBy(id = "cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0")
	WebElement click_check_Select_BC;

	@FindBy(id = "cpbdCarde_btnApprove")
	WebElement btn_Approve_BC;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement txt_approve_remark;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSaveAction']")
	WebElement btn_approve_submit;
	// BC Activation
	@FindBy(id = "lbtn28-144")
	WebElement BC_Ativation_menu_btn;
	
	@FindBy(id = "cpbdCarde_gvActiveFranchise_chBoxSelectRow_0")
	WebElement Check_Select_Activate_BC;

	@FindBy(id = "cpbdCarde_btnDeactivate")
	WebElement btn_deactive_Bc;
	
	// BC Declined
	@FindBy(id = "lbtn28-145")
	WebElement bc_Declined_menu_btn;

	// BC Deactivation
	@FindBy(id = "lbtn28-146")
	WebElement bc_Deactivation_menu_btn;

	@FindBy(id = "cpbdCarde_btnTerminate")
	WebElement btn_terminate_bc;
	
	@FindBy(id="cpbdCarde_gvBlockFranchise_chBoxSelectRow_0")
	WebElement check_select_deactivate_bc;

	// bc termiate
	@FindBy(id = "lbtn28-147")
	WebElement bc_terminate_menu_btn;
	
	//bc edit
	@FindBy(id="lbtn28-155")
	WebElement bc_edit_menu_btn;

	@FindBy(id="select2-cpbdCarde_ddlClientCode-container")
	WebElement dd_bc_edit;
	
	@FindBy(id="cpbdCarde_btnSubmitDetails")
	WebElement btn_update_bc;
	
	//bc Status
	@FindBy(id="lbtn28-161")
	WebElement bc_status_menu_btn;
	
	@FindBy(id="select2-cpbdCarde_ddlStatusType-container")
	WebElement dd_bc_status;
	String status="Verification Pending";
	
	
	
	
	 public String AccountNo()
	    {
	    	int Length=15;
	    	Random random = new Random();
	    	StringBuilder AccNo = new StringBuilder();
	    	for (int i=0;i<Length;i++)
	    	{
	    		AccNo.append((random.nextInt(12)));
	    	}
	    	
	    	return (AccNo.toString());
	    	
	    }
	 
	 public String randomName()
	    {
	    	String nameString="ABCDEFGHIGKLMNOPQRSTUVWXYZ";
	    	Random random = new Random();
	    	StringBuilder ClientName = new StringBuilder();
	    	for (int i=0;i<5;i++)
	    	{
	    		ClientName.append(nameString.charAt(random.nextInt(nameString.length())));
	    	}
	    	
	    	return (ClientName.toString());
	    	
	    }
	 
	 
	 public  String RandomEmail() {
	    	String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    	String DIGITS = "0123456789";
	    	
	    	Random random = new Random();
	        // Generate first 3 random uppercase letters
	        StringBuilder email = new StringBuilder();
	        for (int i = 0; i < 5; i++) {
	        	email.append(ALPHABETS.charAt(random.nextInt(ALPHABETS.length())));
	        }

	        // Generate next 4 random digits
	        for (int i = 0; i < 4; i++) {
	        	email.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
	        }

	        email.append("@gmail.com");

	        return email.toString();
	    }
	 
	
	 public String RandomMobileNumber()
	    {
		        Random random = new Random();

		        int firstDigit = random.nextInt(3) + 7;  // Generates 7, 8, or 9
		        StringBuilder mobileNumber = new StringBuilder();
		        mobileNumber.append(firstDigit); // Add the first digit
		        for (int i = 0; i < 9; i++) {
		            mobileNumber.append(random.nextInt(10)); // Generates a digit between 0 and 9
		        }
		        return mobileNumber.toString();
	    }

	 public void Chkbtn ()
	 {	 
		 if (Chk_ServicesOffer.isDisplayed())
		 {
			 chk_AEPS.click();
		 }
	 }
	 
	 public void ServiceofferRadioBtn(String option1,String option2,String option3,String option4)	
		{
	           if (option1 =="AEPS")
	           {
	        	   
	        	   WebElement RdBtn1 = driver.findElement(By.xpath("//input[@id='cpbdCarde_chkAEPS']"));
	        	   RdBtn1.click();
	        	   if (option2=="BBPS")
	               {
	            	   
	            	   WebElement RdBtn2 = driver.findElement(By.xpath("//input[@id='cpbdCarde_chkbbps']"));
	            	   RdBtn2.click();
	            	  if (option3=="DMT")
	                   {
	                	   
	                	   WebElement RdBtn3 = driver.findElement(By.xpath("//input[@id='cpbdCarde_chkdmt']"));
	                	   RdBtn3.click();
	                	   
	                	   if (option4=="MATM")
	                       {
	                    	   
	                    	   WebElement RdBtn4 = driver.findElement(By.xpath("//input[@id='cpbdCarde_chkmamt']"));
	                    	   RdBtn4.click();
	            		                
	            		   }
	        		                
	        		   }
	    		                
	    		   }
			                
			   }
	      	      }
	 
	 
	SoftAssert softAssert=new SoftAssert();
	 
	public void Registration() throws InterruptedException, IOException, InvalidFormatException
	{
		Click_CorporateBcDrpdown.click();
		Click_Registration.click();
		String txt=randomName();
		txt_ClientName.sendKeys(txt);
		txt_CompanyName.sendKeys("Maximus");	
		//Chkbtn();  // method is used for clicked the check box
		ServiceofferRadioBtn("AEPS","BBPS","DMT","MATM");
		String PAN=generateRandomPAN1();
		txt_PANNo.sendKeys(PAN);
		txt_aadharno.sendKeys(Adharno());
		txt_GSTNo.sendKeys(generateGSTFromPAN(PAN));
		txt_BankName.sendKeys("HDFC Bank");
		txt_AccountName.clear();
		txt_AccountName.sendKeys("Arvind");
		txt_AccountNumber.sendKeys(AccountNo());
		txt_IFsccode.sendKeys("SCBL0036068");
		ddlypeCommssion.click();
		Dropdownbytxt(ddlypeCommssion,"Auto");
		txt_ThresholdAmt.sendKeys("10000");
		Chk_Email.click();
		Chk_SMS.click();
		RDbtn_Configuration.click();
		scrollToElement(btn_btnSubmit);
		txt_RegisteredAddress.sendKeys("Thane");
		txt_PinCode.sendKeys("400603");
		selectFromDropdown_Exact_Name(DD_Country,DD_search,"India");
		selectFromDropdown_Exact_Name(DD_State,DD_search,"Maharashtra");
		Thread.sleep(2000);
		selectFromDropdown_Exact_Name(DD_City,DD_search,"Thane");
		txt_District.sendKeys("Thane");
		txt_EmailID.sendKeys(RandomEmail());
		txt_ContactNo.sendKeys(RandomMobileNumber());
		txt_LandlineNo.sendKeys(RandomMobileNumber());
		txt_AlterNateNo.sendKeys(RandomMobileNumber());
		moveToElement(Rb_ListKYC);
		Rd_Btn.click();
		
		//writeResultToExcel(txt,2,1);
		scrollToElementAndClick(btn_btnSubmit);
		
		
		if(tostMessage.getText().contains("Client Details has been registered successfully.Please Upload KYC Documents."))
		{
			softAssert.assertTrue(true);
			writeNameToExcel(10,1,txt);
			System.out.println(txt+":- This BC Registered Sucessfully");
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		softAssert.assertAll();
		
	}
	
	//------------------------  Document Upload Page      ------------------------  //
	
	public void DocsUpload(String CorporateBc) throws InterruptedException
	{
		Thread.sleep(1000);
		DD_CorporateBC.click();
		Dropdownbytxt(DD_CorporateBC,CorporateBc);
		Thread.sleep(1000);
		Dropdownbytxt(DD_IdentityProof,"Pancard");
		Thread.sleep(1000);
		Btn_flgUplod.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		Dropdownbytxt(DD_AddressProof,"Pancard");
		Thread.sleep(1000);
		Btn_MyAddressProof.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		Thread.sleep(1000);
		Dropdownbytxt(DD_Signature,"Pancard");
		Thread.sleep(1000);
		Btn_SignatureProof.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\NSDL1.png");
		
		btn_Submit.click();
		
		if(tostMessage.getText().contains("Document uploaded successfully"))
		{
			softAssert.assertTrue(true);
			System.out.println(CorporateBc+":- This BC Document uploaded successfully");
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		softAssert.assertAll();
		
		
		
	}
	
	
	//------------------------  Verification Page      ------------------------  //
	
	
	public void clickCheckboxByName(String name) throws InterruptedException 
	{
	    String xpath = "//td[contains(text(),'" + name + "')]/preceding-sibling::td/input[@type='checkbox']";
	    WebElement checkbox = driver.findElement(By.xpath(xpath));
	    Thread.sleep(2000);
	    if (!checkbox.isSelected()) 
	    {
	        checkbox.click();
	    }
	}
	
	
	
	public void CorporateBcVerification(String CorporateBc) throws InterruptedException
	{
		
		if(verfication_menu_btn.isDisplayed()==false)
		{
		  Click_CorporateBcDrpdown.click();
		}
		
		verfication_menu_btn.click();
		Thread.sleep(1000);
		selectFromDropdown(DD_ClientSearch,Txt_ClientSearch,CorporateBc);
		Thread.sleep(2000);
		Btn_Search.click();
		clickCheckboxByName(CorporateBc);
		Thread.sleep(1000);
		Btn_Approve.click();
		Thread.sleep(1000);
		txt_Remarks.sendKeys("Done By automation");
		Btn_Save.click();
			
		String actualMessage = tostMessage.getText().replaceAll("\\s+", " ").trim();
		if (actualMessage.contains("Total Record Processed for Approve Client(s) : 1 Successful : 1 Unsuccessful : 0")) 
		{
			softAssert.assertTrue(true, "Test Case Passed: Expected message found.");
			System.out.println("Test Case Passed: Expected message found.");
		} 
		else 
		{
			softAssert.assertTrue(false, "Test Case Failed: Expected message not found.");
			System.out.println("Test Case Failed: Expected message not found. Actual Message: " + actualMessage);
		}
	
		softAssert.assertAll();
	}
	
	
	//------------------------  Activate Corporate BC Page  ------------------------  //
	

	public boolean isCorporateNamePresent(String corporateName) 
	{
	    String xpath = "//table[@id='cpbdCarde_gvActiveFranchise']//td[contains(text(),'" + corporateName + "')]";
	    List<WebElement> elements = driver.findElements(By.xpath(xpath));
	    
	    if (!elements.isEmpty()) {
	        System.out.println("Corporate BC Name '" + corporateName + "' is present in the grid.");
	        return true;
	    } else {
	        System.out.println("Corporate BC Name '" + corporateName + "' is NOT present in the grid.");
	        return false;
	    }
	}
	
	
	public void clickCheckboxByCorporateName(String corporateName) 
	{
	    String xpath = "//td[contains(text(),'" + corporateName + "')]/preceding-sibling::td/input[@type='checkbox']";
	    WebElement checkbox = driver.findElement(By.xpath(xpath));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	        System.out.println("Checkbox clicked for Corporate BC Name: " + corporateName);
	    } else {
	        System.out.println("Checkbox is already selected for Corporate BC Name: " + corporateName);
	    }
	}
	
	public void ActivateCorporate(String CorporateBc) throws InterruptedException 
	{
		Thread.sleep(2000);
		if(verfication_menu_btn.isDisplayed()==false)
		{
		  Click_CorporateBcDrpdown.click();
		}
		
		BC_Ativation_menu_btn.click();
		
		Thread.sleep(2000);
		selectFromDropdown(ddl_Client,Txt_searchfield,CorporateBc);
		Thread.sleep(2000);
		Btn_CA_Search.click();
		
		if (isCorporateNamePresent(CorporateBc) == true) 
		{
			Thread.sleep(500);
			softAssert.assertTrue(true);
			clickCheckboxByCorporateName(CorporateBc);
			Thread.sleep(1000);
			Btn_CA_Deactivate.click();
			Thread.sleep(2000);
			txt_Remarks.sendKeys("Done By automation");
			Btn_Save.click();
			
			String actualMessage = tostMessage.getText().replaceAll("\\s+", " ").trim();
			
			 if (actualMessage.contains("Total Record Processed for Deactivate Client(s) : 1 Successful : 1 Unsuccessful : 0")) {
			        softAssert.assertTrue(true, "Test Case Passed: Expected message found.");
			        System.out.println("Test Case Passed: Expected message found.");
			    } else {
			        softAssert.assertTrue(false, "Test Case Failed: Expected message not found.");
			        System.out.println("Test Case Failed: Expected message not found. Actual Message: " + actualMessage);
			    }
			
		}
	softAssert.assertAll();
	}
	
	
	
	/*
	 * public void Bc_Activation(String BCName) throws InterruptedException {
	 * 
	 * BC_Ativation_menu_btn.click(); Click_Drop_Down(dd_Bc_Client, Txt_serach,
	 * BCName); Click_Drop_Down(dd_BC_Contactnumber, Txt_serach, contactnumber);
	 * Click_Drop_Down(dd_BC_State, Txt_serach, "Maharashtra"); Thread.sleep(1000);
	 * Click_Drop_Down(dd_Bc_City, Txt_serach, "Thane"); btn_bc_search.click();
	 * Thread.sleep(1000); Check_Select_Activate_BC.click();
	 * btn_deactive_Bc.click(); Thread.sleep(1000);
	 * txt_approve_remark.sendKeys("Deactivate"); btn_approve_submit.click(); }
	 */

	
	/*
	 * public void Bc_Declined_List() throws InterruptedException {
	 * 
	 * bc_Declined_menu_btn.click(); Click_Drop_Down(dd_Bc_Client, Txt_serach,
	 * name); Click_Drop_Down(dd_BC_Contactnumber, Txt_serach, contactnumber);
	 * Click_Drop_Down(dd_BC_State, Txt_serach, "Maharashtra"); Thread.sleep(1000);
	 * Click_Drop_Down(dd_Bc_City, Txt_serach, "Thane"); btn_bc_search.click(); }
	 */

	//BC Deactivate status
	
	public boolean isCorporateNamePresent_Dectivate_Table(String corporateName) throws InterruptedException 
	{
	    String xpath = "//table[@id='cpbdCarde_gvBlockFranchise']//td[contains(text(),'" + corporateName + "')]";
	    List<WebElement> elements = driver.findElements(By.xpath(xpath));
	    Thread.sleep(1000);
	    if (!elements.isEmpty()) 
	    {
	        System.out.println("Corporate BC Name '" + corporateName + "' is present in the grid.");
	        return true;
	    } else 
	    
	    {
	        System.out.println("Corporate BC Name '" + corporateName + "' is NOT present in the grid.");
	        return false;
	    }
	}
	
	
	
	public boolean isCorporateNamePresent_Terminate_Table(String corporateName) throws InterruptedException 
	{
	    String xpath = "//table[@id='cpbdCarde_gvBusinessCorrespondents']//td[contains(text(),'" + corporateName + "')]";
	    List<WebElement> elements = driver.findElements(By.xpath(xpath));
	    Thread.sleep(1000);
	    if (!elements.isEmpty()) 
	    {
	        System.out.println("Corporate BC Name '" + corporateName + "' is present in the grid.");
	        return true;
	    } else 
	    
	    {
	        System.out.println("Corporate BC Name '" + corporateName + "' is NOT present in the grid.");
	        return false;
	    }
	}
	
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnActivate']")
	WebElement btn_Active;
	
	public void Bc_DeActivation(String BCName) throws InterruptedException 
	{

		bc_Deactivation_menu_btn.click();
		Click_Drop_Down(dd_Bc_Client, Txt_serach, BCName);
		Thread.sleep(1000);
		btn_bc_search.click();
		Thread.sleep(1000);
		
		if(isCorporateNamePresent_Dectivate_Table(BCName)==true)
		{
			softAssert.assertTrue(true);
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		
		
		Thread.sleep(500);
		softAssert.assertTrue(true);
		clickCheckboxByCorporateName(BCName);
		Thread.sleep(1000);
		btn_Active.click();
		Thread.sleep(2000);
		txt_Remarks.sendKeys("Done By automation");
		Btn_Save.click();
		Thread.sleep(1000);
		String actualMessage = tostMessage.getText().replaceAll("\\s+", " ").trim();
		
		 if (actualMessage.contains("Total Record Processed for Activate Client(s) : 1 Successful : 1 Unsuccessful : 0")) 
		 {
		        softAssert.assertTrue(true, "Test Case Passed: Expected message found.");
		        System.out.println("Test Case Passed: Expected message found.");
		        
		        //Verify Into Active table
		        
		        BC_Ativation_menu_btn.click();
				
				Thread.sleep(2000);
				selectFromDropdown(ddl_Client,Txt_searchfield,BCName);
				Thread.sleep(2000);
				Btn_CA_Search.click();
				
				if (isCorporateNamePresent(BCName) == true) 
				{
					Thread.sleep(500);
					softAssert.assertTrue(true);
					clickCheckboxByCorporateName(BCName);
					Thread.sleep(1000);
					
					//Terminate BC And verify 
					Btn_CA_Terminate.click();
					
					Thread.sleep(2000);
					txt_Remarks.sendKeys("Done By automation");
					Btn_Save.click();
					
					Thread.sleep(1000);
					String actualMessage_ter = tostMessage.getText().replaceAll("\\s+", " ").trim();
					
					 if (actualMessage_ter.contains("Total Record Processed for Terminate Client(s) : 1 Successful : 1 Unsuccessful : 0")) {
					        softAssert.assertTrue(true, "Test Case Passed: Expected message found.");
					        System.out.println("Test Case Passed: Expected message found.");
					    } else {
					        softAssert.assertTrue(false, "Test Case Failed: Expected message not found.");
					        System.out.println("Test Case Failed: Expected message not found. Actual Message: " + actualMessage_ter);
					    }
				}
		 } 
		 
		 
		 else {
		        softAssert.assertTrue(false, "Test Case Failed: Expected message not found.");
		        System.out.println("Test Case Failed: Expected message not found. Actual Message: " + actualMessage);
		    }
		 
		 softAssert.assertAll();
		
	}

	public void Bc_TERMINATED_List(String BCName) throws InterruptedException 
	{

		bc_terminate_menu_btn.click();
		Click_Drop_Down(dd_Bc_Client, Txt_serach, BCName);
		btn_bc_search.click();
		Thread.sleep(1000);
		if(isCorporateNamePresent_Terminate_Table(BCName)==true)
		{
			softAssert.assertTrue(true);
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		softAssert.assertAll();
	}
    
	
	public String getStatusByCorporateName(String corporateName) 
	{
	    String xpath = "//td[contains(text(),'" + corporateName + "')]/following-sibling::td[6]";  
	    WebElement statusElement = driver.findElement(By.xpath(xpath));
	   // System.out.println(statusElement);
	    return statusElement.getText().trim();
	}

	public void Bc_Status(String BCName) throws InterruptedException 
	
	{
		bc_status_menu_btn.click();
		Click_Drop_Down(dd_Bc_Client, Txt_serach,BCName);
		Thread.sleep(1000);
		btn_bc_search.click();
		Thread.sleep(1000);
		
	if(getStatusByCorporateName(BCName).contains("Terminated"))
	{
		softAssert.assertTrue(true);
	}
	
	else 
	{
		softAssert.assertTrue(false);
	}
	
	softAssert.assertAll();
	
	}
	
}
