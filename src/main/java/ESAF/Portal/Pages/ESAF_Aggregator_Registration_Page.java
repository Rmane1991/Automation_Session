package ESAF.Portal.Pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class ESAF_Aggregator_Registration_Page extends Utility {

	WebDriver driver;
	WebDriverWait wait;

	public ESAF_Aggregator_Registration_Page(WebDriver driver) 
	{

		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul//li//a[@id='hrefsubpg25']")
	WebElement Agg_Menu;

	@FindBy(xpath = "//ul//li//a[@id='lbtn25-123']")
	WebElement Reg;

	@FindBy(xpath = "(//div//button[@class='btn-CommonCss'])[1]")
	WebElement Btn_Add;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlclient']") //
	WebElement DD_Corp_BC;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtFirstName']")
	WebElement txt_Reg_FirstName;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtLastName']")
	WebElement txt_Reg_LastName;

	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	WebElement txt_Reg_FatherName;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtCompanyName']")
	WebElement txt_Reg_CompanyName;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtEmailID']")
	WebElement txt_Reg_email;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlIDcardtype']")
	WebElement dd_Reg_selectID;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtPANNo']")
	WebElement txt_Reg_PAN_No;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtDob']")
	WebElement Reg_Select_DOB;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlGender']")
	WebElement dd_Reg_Select_Gen;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlCategory']")
	WebElement dd_Reg_Select_Cat;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlPhysicallyHandicapped']")
	WebElement dd_Reg_Select_PhyHan;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlHighestEducationQualification']")
	WebElement dd_Reg_Select_HighEduc;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlCourse']")
	WebElement dd_Reg_Select_Course;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtaadharno']")
	WebElement txt_Reg_adharNo;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtAccountNumber']")
	WebElement txt_Reg_AccNo;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtIFsccode']")
	WebElement txt_Reg_IFSC_Code;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtNoOfTransactions']")
	WebElement txt_Reg_No_TXN;

	@FindBy(xpath = "//input[@id='cpbdCarde_txttransferAmountPerday']")
	WebElement txt_Reg_Trf_Amount;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlFranchiseWalletTransfer']")
	WebElement dd_Reg_Wallet_Trf;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtFranchiseAccountName']")
	WebElement txt_Reg_Agg_Name;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlTypeOfCommission']")
	WebElement dd_Reg_Type_commision;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtThresholdAmt']")
	WebElement txt_Reg_txtThresholdAmt;

	@FindBy(xpath = "//span//input[@id='cpbdCarde_chkEmail']")
	WebElement chk_Reg_Email;

	@FindBy(xpath = "//input[@id='RadioConfigCategory_0']")
	WebElement Reg_BtnRadio_UL;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_txtRegisteredAddress']")
	WebElement txt_Reg_Address;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtArea']")
	WebElement txt_Reg_Area;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlCountry']")
	WebElement dd_Reg_Country;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlState']")
	WebElement dd_Reg_State;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtDistrict']")
	WebElement txt_Reg_District;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlCity']")
	WebElement dd_Reg_City;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtPinCode']")
	WebElement txt_Reg_pinCode;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtBusinessEmailID']")
	WebElement txt_Reg_BS_Email;

	@FindBy(xpath = "//input[@id='cpbdCarde_txtContactNo']")
	WebElement txt_Reg_ContactNo;

	@FindBy(xpath = "//input[@id='cpbdCarde_CheckBoxAddress']")
	WebElement Checkbox_Reg;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement btn_Reg_Submit;

	@FindBy(xpath = ("//div[@class='toast-message']"))
	WebElement tostMessage;

	// .................... Document upload........................//

	@FindBy(xpath = "//ul//li//a[@id='hrefsubpg25']")
	WebElement Agg_Menu1;

	@FindBy(xpath = "//a[@id='lbtn25-131']")
	WebElement Doc_Up_Menu;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlclient']")
	WebElement DP_DD_Corp_BC;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlFranchise']")
	WebElement DD_ID;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlIdentityProof']")
	WebElement DD_ID_Proof;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyIdProof']")
	WebElement Upload_ID_Proof;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlAddressProof']")
	WebElement DD_ADD_Proof;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMyAddressProof']")
	WebElement Upload_ADD_Proof;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlSignature']")
	WebElement DD_Sign_Proof;

	@FindBy(xpath = "//input[@id='cpbdCarde_flgUplodMySignatureProof']")
	WebElement Upload_Sign_Proof;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSubmitDetails']")
	WebElement Btn_Submit;

	@FindBy(xpath = ("//div[@class='toast-message']"))
	WebElement tostMessage1;

	// .............................Verification...............................//

	@FindBy(xpath = "//ul//li//a[@id='hrefsubpg25']")
	WebElement Agg_Menu2;

	@FindBy(xpath = "//a[@id='lbtn25-135']")
	WebElement Verification_Menu;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClientCode-container']")
	WebElement DD_CR_BC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search_Box;

	@FindBy(xpath = "//li[contains(text(), 'ABCD Company')]")
	WebElement option;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Btn_search;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvBusinessCorrespondents_chBoxSelectRow_0']")
	WebElement Chk_Box;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnApprove']")
	WebElement Btn_Approve;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement Msg_Confirm;

	@FindBy(xpath = "//div//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement txt_Remarks;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSaveAction']")
	WebElement Btn_Save;

	@FindBy(xpath = ("//div[@class='toast-message']"))
	WebElement tostMessage2;

	// ...............Active Aggregator....................//

	@FindBy(xpath = "//a[@id='lbtn25-132']")
	WebElement Active_Agg_Menu;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClientCode-container']")
	WebElement Act_DD_CR_BC;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Act_SearchTxt;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Act_Btn_search;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvActiveFranchise_chBoxSelectRow_0']")
	WebElement Act_Chk_Box;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnDeactivate']")
	WebElement Act_Btn_Deactive;

	@FindBy(xpath = "//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement Act_Txt_Remark;

	@FindBy(xpath = "//input[@id='cpbdCarde_btnSaveAction']")
	WebElement Act_Btn_Save;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement Act_Msg_Confirm;

	// ..................................Declined Aggregator.....................//

	@FindBy(xpath = "//a[@id='lbtn25-137']")
	WebElement DC_AG_Menu;

	@FindBy(xpath = "//span[@id='select2-cpbdCarde_ddlClientCode-container']")
	WebElement DD_CR_BC2;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TXT_Search;

	@FindBy(xpath = "//button[@id='cpbdCarde_btnSearch']")
	WebElement Btn_Search;

	@FindBy(xpath = "//td[text()='AG01000006']")
	WebElement Agg_ID;

	// ---------------------------- Deactivated_Aggregator-----------------------------------------//

	@FindBy(xpath = "//div//ul//li//a[@id='lbtn25-130']")
	WebElement Decative_Menu;

	@FindBy(xpath = "//select[@id='cpbdCarde_ddlClientCode']")
	WebElement DD_BC;

	@FindBy(xpath = "//div//button[@id='cpbdCarde_btnSearch']")
	WebElement DACT_Btn_Search;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvBlockFranchise_chBoxSelectRow_1']")
	WebElement DACT__Chkbox2;

	@FindBy(xpath = "//div//button[@id='cpbdCarde_btnActivate']")
	WebElement DACT__Btn_Activate;

	@FindBy(xpath = "//div//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement DACT__Txtbox_Activate;

	@FindBy(xpath = "//div//input[@id='cpbdCarde_btnSaveAction']")
	WebElement DACT__Btn_Save;

	@FindBy(xpath = "//input[@id='cpbdCarde_gvBlockFranchise_chBoxSelectRow_0']")
	WebElement DACT_ChkBox;

	@FindBy(xpath = "//div//button[@id='cpbdCarde_btnTerminate']")
	WebElement DACT_Btn_Terminate;

	@FindBy(xpath = "//div//textarea[@id='cpbdCarde_TxtRemarks']")
	WebElement DACT_Txtbox;

	@FindBy(xpath = "//div//input[@id='cpbdCarde_btnSaveAction']")
	WebElement DACT_Btn_Save;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement tostMessage4;

	// .........Methods........................//

	public void Registration() throws InterruptedException, IOException 
	{

		Agg_Menu.click();
		Reg.click();
		Btn_Add.click();
		DD_Corp_BC.click();
		Dropdownbytxt(DD_Corp_BC, "ESAF");
		String FN = getAlphaNumericString();
		System.out.println(FN);
		txt_Reg_FirstName.sendKeys(FN);
		//writeNameToExcel(4, 0, FN);
		txt_Reg_LastName.sendKeys("ABC");
		txt_Reg_FatherName.sendKeys("XYZ");
		txt_Reg_CompanyName.sendKeys("Maximus");
		txt_Reg_email.sendKeys(generateRandomEmail());
		Dropdownbytxt(dd_Reg_selectID, "Pancard");
		txt_Reg_PAN_No.sendKeys(generateRandomPAN1());
		WebElement dobField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cpbdCarde_txtDob']")));
		String dateToSet = "29/08/1999";
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1]);", dobField,dateToSet);
		dd_Reg_Select_Gen.click();
		Dropdownbytxt(dd_Reg_Select_Gen, "Male");
		//dd_Reg_Select_Cat.click();
		Dropdownbytxt(dd_Reg_Select_Cat, "General");
		//dd_Reg_Select_PhyHan.click();
		Dropdownbytxt(dd_Reg_Select_PhyHan, "No");
		//dd_Reg_Select_HighEduc.click();
		Dropdownbytxt(dd_Reg_Select_HighEduc, "Graduate");
		//dd_Reg_Select_Course.click();
		Dropdownbytxt(dd_Reg_Select_Course, "IIBF Basic");
		txt_Reg_adharNo.sendKeys(generateRandomAadhar());
		moveToElement(txt_Reg_Address);
		txt_Reg_AccNo.sendKeys("HDFC123123123");
		txt_Reg_IFSC_Code.sendKeys("HDFC0011");
		txt_Reg_No_TXN.sendKeys("10");
		txt_Reg_Trf_Amount.sendKeys("10000");

		moveToElementAndClick(dd_Reg_Wallet_Trf);
		Dropdownbytxt(dd_Reg_Wallet_Trf, "Dis-Allowed");
		String Agg_Name = getAlphaNumericString();
		txt_Reg_Agg_Name.sendKeys(Agg_Name);
		moveToElementAndClick(dd_Reg_Type_commision);
		Dropdownbytxt(dd_Reg_Type_commision, "Manual");
		moveToElementAndClick(txt_Reg_txtThresholdAmt);
		txt_Reg_txtThresholdAmt.sendKeys("8000");
		moveToElementAndClick(Reg_BtnRadio_UL);
		txt_Reg_Address.sendKeys("Surat");
		chk_Reg_Email.click();
		txt_Reg_Area.sendKeys("Surat");
		moveToElement(dd_Reg_Country);
		//selectFromDropdown_Exact_Name(dd_Reg_Country,,"India");
		Dropdownbytxt(dd_Reg_Country, "India");
		//dd_Reg_State.click();
		Thread.sleep(8000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Maharashtra']")));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class,'select2-results__options')]/li")));
		Dropdownbytxt(dd_Reg_State, "Gujarat");
		Thread.sleep(1000);
		txt_Reg_District.sendKeys("Surat");
		//dd_Reg_City.click();
		Thread.sleep(2000);
		Dropdownbytxt(dd_Reg_City, "Ahmedabad");
		txt_Reg_District.clear();
		txt_Reg_District.click();
		txt_Reg_District.sendKeys("Surat");
		txt_Reg_pinCode.sendKeys("400708");
		txt_Reg_BS_Email.sendKeys(generateRandomEmail());
		txt_Reg_ContactNo.sendKeys(generateRandomMobileNumber());
		Thread.sleep(1000);
		Checkbox_Reg.click();
		Thread.sleep(1000);
		btn_Reg_Submit.click();
		
		if(isAlertPresent()==true && driver.switchTo().alert().getText().contains("Provided PAN No is not valid! Please enter PAN No start with 'eg.ABCDE1234K'."))
		{
			driver.switchTo().alert().accept();
			moveToElement(txt_Reg_PAN_No);
			txt_Reg_PAN_No.click();
			txt_Reg_PAN_No.clear();
			txt_Reg_PAN_No.sendKeys(generateRandomPAN());
			scrollToElementAndClick(btn_Reg_Submit);
		}
		
		Thread.sleep(2000);
			if (tostMessage.getText().contains("Aggregator Details has been registered successfully.Please Upload KYC Documents.")) 
			{
				Assert.assertTrue(true, "Aggegator Register Sucesfully and forward to upload document");
				writeNameToExcel(11, 1, FN);
			} else 
			{
				Assert.fail("No Data Found - Expected message not displayed.");
			}

	}

	String filePath = "D:\\New_Project\\ESAF_Portal_Automation\\src\\main\\java\\Resources\\TestData.xlsx";
	
	public static String readOptionFromExcel(String filePath) 
	{
        String selectedOption = null;
        try (FileInputStream file = new FileInputStream(filePath)) {
        	XSSFWorkbook workbook = new XSSFWorkbook(file);  // Open the Excel file
            XSSFSheet sheet = workbook.getSheetAt(0);  // Get the first sheet
            Row row = sheet.getRow(1);  // Assuming the option is in the second row (index 1)
            selectedOption = row.getCell(0).getStringCellValue();  // Read the option from the first column
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return selectedOption;
    }
	
	
	
	public static void selectDropdownOption(WebElement dropdownElement, String optionToSelect) {
        Select dropdown = new Select(dropdownElement);  // Create a Select object to interact with the dropdown
        List<WebElement> options = dropdown.getOptions();  // Get all options in the dropdown
        
        for (WebElement option : options) {
            if (option.getText().equals(optionToSelect)) {  // If the option matches the desired one
                dropdown.selectByVisibleText(optionToSelect);  // Select it
                System.out.println("Option selected: " + optionToSelect);
                break;
            }
        }
    }
	
	
	 public static void writeDropdownOptionsToExcel(String filePath, List<String> options) throws IOException {
	  
		 XSSFWorkbook workbook = new XSSFWorkbook(filePath);  // Open the Excel file
         // sheet = workbook.getSheetAt(0);  // Get the first sheet
          XSSFSheet sheet = workbook.createSheet("Dropdown Options");  // Create a sheet

	     // Loop through the options and write them to the sheet
	     for (int i = 0; i < options.size(); i++) {
	         Row row = sheet.createRow(i);  // Create a row for each option
	         Cell cell = row.createCell(0);  // Create a cell in the row
	         cell.setCellValue(options.get(i));  // Set the cell value to the option text
	     }

	     // Write the workbook to the file
	     FileOutputStream fileOut = new FileOutputStream(filePath);
	     workbook.write(fileOut);
	     fileOut.close();
	     workbook.close();
	 }
	
	
	public void Document_UP(String Agg_name) throws InterruptedException, IOException 
	{

		
		Dropdownbytxt(DP_DD_Corp_BC, "ESAF");
		Dropdownbytxt_String(DD_ID,Agg_name);
		Dropdownbytxt(DD_ID_Proof, "Pancard");
		Upload_ID_Proof.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\Str.JPG");
		DD_ADD_Proof.click();
		Dropdownbytxt(DD_ADD_Proof, "Passport");
		Upload_ADD_Proof.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\Str.JPG");
		DD_Sign_Proof.click();
		Dropdownbytxt(DD_Sign_Proof, "VoterId");
		Upload_Sign_Proof.sendKeys("C:\\Users\\rajendra.mane\\Downloads\\Str.JPG");
		
		Btn_Submit.click();

		if (tostMessage.isDisplayed()) 
		{
			String toastText = tostMessage.getText();
			System.out.println("Toast message: " + toastText);

			if (toastText.contains("Document uploaded successfully.")) 
			{
				Assert.assertTrue(true, "Aggegator Document uploaded successfully.");
				Thread.sleep(2000);
			}
			
			else
			{
				Assert.fail(toastText);
			}
		} 
		
		else 
		{
			System.out.println("No Data Uploaded.");
		}

	}
	
	
	public void selectCheckboxByName(String name) 
	{
		try 
		{
            
			String xpath = "//td[contains(text(),'" + name + "')]/preceding-sibling::td/input[@type='checkbox']";
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            checkbox.click();
            System.out.println("Checkbox clicked for: " + name);
        } catch (Exception e) 
		{
            System.out.println("Checkbox not found for: " + name);
        }
	
	}
	
	@FindBy(id = "select2-cpbdCarde_ddlFranchiseCode-container")
	WebElement click_agg;

	public void Verification(String Agg_Name) throws InterruptedException, IOException 
	{
		if(Verification_Menu.isDisplayed()==false)
		{
			Agg_Menu.click();
		}
		Verification_Menu.click();
		DD_CR_BC.click();
		Search_Box.sendKeys("ESAF", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		click_agg.click();
		Search_Box.sendKeys(Agg_Name, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Btn_search.click();
		Thread.sleep(1000);
		selectCheckboxByName(Agg_Name);
		Thread.sleep(2000);
		//Chk_Box.click();
		Btn_Approve.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//textarea[@id='cpbdCarde_TxtRemarks']")));
		
		txt_Remarks.sendKeys("Approved By Automation");
		Btn_Save.click();
		Thread.sleep(1000);

		if (tostMessage2.isDisplayed()) 
		{
			String toastText = tostMessage2.getText();
			System.out.println("Toast message: " + toastText);

			if (toastText.contains("Successful : 1") && toastText.contains("Unsuccessful : 0")) 
			{
			    Assert.assertTrue(true, "Aggregator Approved Successfully");
			    System.out.println("Approved");
			} 
			
			else
			{
				Assert.fail(toastText);
			}
			

		}
		
		else 
		{
			System.out.println("Not Approved.");
		}

	}

	public void Active_Aggregator(String Agg_Name) throws InterruptedException 
	{

		
		if(Active_Agg_Menu.isDisplayed()==false)
		{
			Agg_Menu.click();
		}
		
		Active_Agg_Menu.click();
		Act_DD_CR_BC.click();
		Thread.sleep(1000);
		Act_SearchTxt.sendKeys("ESAF", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		click_agg.click();
		Search_Box.sendKeys(Agg_Name, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Act_Btn_search.click();
		selectCheckboxByName(Agg_Name);
		Thread.sleep(1000);
		Act_Btn_Deactive.click();
		Thread.sleep(500);
		Act_Txt_Remark.sendKeys("Deactivate");
		
		Act_Btn_Save.click();
		Thread.sleep(500);

		if (tostMessage.isDisplayed()) 
		{
			String toastText = tostMessage.getText();
			System.out.println("Toast message: " + toastText);
			
			if (toastText.contains("Successful : 1") && toastText.contains("Unsuccessful : 0")) 
			{
			    Assert.assertTrue(true, "Aggregator Approved Successfully");
			    System.out.println("Approved");
			} 
			
			else
			{
				Assert.fail(toastText);
			}
			
		}

	}

	public void Declined_Aggregator(String Agg_Name) throws InterruptedException 
	{
		if(DC_AG_Menu.isDisplayed()==false)
		{
			Agg_Menu.click();
		}

		DC_AG_Menu.click();
		Thread.sleep(1000);

		DD_CR_BC2.click();
		Thread.sleep(1000);

		TXT_Search.sendKeys("ESAF", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		
		click_agg.click();
		Search_Box.sendKeys(Agg_Name, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Act_Btn_search.click();
		

		if (Agg_ID.isDisplayed()) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='AG01000006']")));

			System.out.println("User Declined");
		}

		else {
			System.out.println("Not Declined");

		}
	}

	
	SoftAssert softAssert=new SoftAssert();
	
	@FindBy(xpath = "//a[@id='lbtn25-139']")
	WebElement click_Terminate;
	
	
	public boolean isAggNamePresent_Terminate_Table(String corporateName) throws InterruptedException 
	{
	    String xpath = "//table[@id='cpbdCarde_gvTerminateFranchise']//td[contains(text(),'" + corporateName + "')]";
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
	
	public void Deactivated_Aggregator(String Agg_Name) throws InterruptedException 
	{

		//		Agg_Menu.click();
		if(Decative_Menu.isDisplayed()==false)
		{
			Agg_Menu.click();
		}
		Thread.sleep(1000);

		Decative_Menu.click();
		Thread.sleep(500);
		DD_CR_BC2.click();
		TXT_Search.sendKeys("ESAF", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		click_agg.click();
		Search_Box.sendKeys(Agg_Name, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Act_Btn_search.click();
		Thread.sleep(1000);
		selectCheckboxByName(Agg_Name);
		Thread.sleep(1000);
		DACT__Btn_Activate.click();
		Thread.sleep(1000);

		DACT__Txtbox_Activate.sendKeys("User Activate");
		Thread.sleep(1000);

		DACT__Btn_Save.click();
		Thread.sleep(1000);

		if (tostMessage4.isDisplayed()) 
		{
			String toastText = tostMessage4.getText();
			System.out.println("Toast message: " + toastText);

			if (toastText.contains("Total Record Processed for Activate") 
				    && toastText.contains("Successful : 1") 
				    && toastText.contains("Unsuccessful : 0")) 
			{
				System.out.println("1");
				softAssert.assertTrue(true, "Aggregator Activated Successfully");
			}
			else 
			{
				softAssert.assertTrue(false);
			}

		} 

		
		Active_Agg_Menu.click();
		Act_DD_CR_BC.click();
		Thread.sleep(1000);
		Act_SearchTxt.sendKeys("ESAF", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		click_agg.click();
		Search_Box.sendKeys(Agg_Name, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Act_Btn_search.click();
		selectCheckboxByName(Agg_Name);
		Thread.sleep(1000);
		DACT_Btn_Terminate.click();
		Thread.sleep(500);
		Act_Txt_Remark.sendKeys("Terminate");
		Thread.sleep(500);
		Act_Btn_Save.click();
		Thread.sleep(500);

		if (tostMessage.isDisplayed()) 
		{
			String toastText = tostMessage.getText();
			System.out.println("Toast message: " + toastText);

			if (toastText.contains("Total Record Processed for Terminate") 
				    && toastText.contains("Successful : 1") 
				    && toastText.contains("Unsuccessful : 0")) 
			{
				 System.out.println("2");
				 softAssert.assertTrue(true, "Aggregator Approved Successfully");
			}
				    
			 else
			{
			  softAssert.fail("Unexpected Toast Message:\n" + toastText);
			}

			
		}
		
		
		//Verify Into terminated 
		click_Terminate.click();
		Act_DD_CR_BC.click();
		Thread.sleep(1000);
		Act_SearchTxt.sendKeys("ESAF", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		click_agg.click();
		Search_Box.sendKeys(Agg_Name, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Act_Btn_search.click();
		
		Thread.sleep(1000);
		if(isAggNamePresent_Terminate_Table(Agg_Name)==true)
		{
			System.out.println("3");
			softAssert.assertTrue(true);
			
		}
		
		else 
		{
			softAssert.assertTrue(false);
		}
		
		softAssert.assertAll();
		

	}
}
