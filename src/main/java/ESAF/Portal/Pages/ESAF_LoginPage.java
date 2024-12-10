package ESAF.Portal.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ESAF.Portal.Resorces.Utility;

public class ESAF_LoginPage extends Utility {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='txtUserName']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txtPWd;

	// Alert Happned with OTP text OTP has been sent.

	@FindBy(xpath = "//input[@id='txtLoginValidation']")
	WebElement txtOTP;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement btnsubmit;

	@FindBy(id = "btnLoginValidation")
	WebElement btnvalidate_After_OTP;

	@FindBy(xpath = "//div[@id='sidebar-nav']")
	WebElement LeftMenu;

	@FindBy(xpath = "//span[@id='RequiredFieldValidator5']")
	WebElement lblblankUsername; // Please enter UserName

	@FindBy(xpath = "//span[@id='RequiredFieldValidator5']")
	WebElement lblblankPwd; // Login failed

	@FindBy(xpath = "//label[@id='lblErrorMsg']")
	WebElement Error_BLank_Pwd;

	public ESAF_LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String className = this.getClass().getSimpleName();

	public void Check_Valid_Credentials(String UserName, String Password) throws InterruptedException, IOException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		// TextFileLogger.logMessage("Check_Valid_Credentials TestCase Start");
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
		}
		
		Thread.sleep(2000);
		
		txtusername.clear();
		txtusername.sendKeys(UserName);
		txtPWd.clear();
		txtPWd.sendKeys(Password);
		btnsubmit.click();
		Thread.sleep(1000);
		if (isAlertPresent() == true) {
			if (driver.switchTo().alert().getText().contains("OTP has been sent.")) {
				driver.switchTo().alert().accept();
				txtOTP.sendKeys("123456");
				btnvalidate_After_OTP.click();
			}

			else if (driver.switchTo().alert().getText()
					.contains("User Already Active. Please Try After 10 Minutes!")) {
				driver.switchTo().alert().accept();

				if ((isAlertPresent() == true)
						&& driver.switchTo().alert().getText().contains("You Want To Logout From Other Device?")) {
					driver.switchTo().alert().accept();

					if (driver.switchTo().alert().getText().contains("OTP has been sent.")) {
						driver.switchTo().alert().accept();
						txtOTP.sendKeys("123456");
						btnvalidate_After_OTP.click();
					}

					// driver.switchTo().alert().accept();
				}

				else {
					System.err.println("User active Alert Not present");
				}
			}

			else {
				System.err.println("Alert Not present");
			}

		}

		boolean loginSuccess = false;
		try {
			loginSuccess = isDisaplyedW(LeftMenu, 2);
			Assert.assertTrue(loginSuccess, "Login failed: LeftMenu is not displayed");
			ConsoleColor.printColored("Login Successful With Username :- " + UserName, ConsoleColor.GREEN);
			checkUrl();
			
			if (className.contains("ESAF_LoginPage")) {
				// checkUrl();
			}

			else {
				System.out.println("URL All Ready check with Login Test Case");
			}
			// TextFileLogger.logMessage("Check_Valid_Credentials TestCase Pass");
			// ExtentReportNG.logMessage("Login Successful With Username :- " + UserName);
		} finally {
			if (loginSuccess) {
				writeResultToExcel("Pass", 2, 5);
			} else {
				ConsoleColor.printColored("Login Failed", ConsoleColor.RED);
				writeResultToExcel("Fail", 2, 5);

				if (isDisaplyedW(lblblankPwd, 5)) {
					writeResultToExcel(lblblankPwd.getText(), 2, 7);
				}
			}
		}
	}

	public void Blank_UserName(String Password) throws InterruptedException, IOException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		txtusername.clear();
		txtPWd.clear();
		txtPWd.sendKeys(Password);
		btnsubmit.click();
		Thread.sleep(2000);
		// System.out.println(lblblankUsername.getText());
		if ((lblblankPwd.getText()).contains("Please Enter Username")) {
			Assert.assertTrue(true);
			writeResultToExcel("Pass", 5, 5);
		} else

		{
			writeResultToExcel("Fail", 5, 5);
			Assert.assertFalse(false);
		}
	}

	public void Blank_Password(String UserName) throws InterruptedException, IOException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		txtusername.clear();
		txtusername.sendKeys(UserName);
		txtPWd.clear();
		btnsubmit.click();
		Thread.sleep(2000);
		// System.out.println(lblblankPwd.getText());
		if ((Error_BLank_Pwd.getText()).contains("Login failed")) {
			Assert.assertTrue(true);
			writeResultToExcel("Pass", 5, 5);
		} else

		{
			Assert.assertTrue(false);
			writeResultToExcel("Fail", 5, 5);
		}
	}

	public void Invalid_Password(String UserName, String password) throws InterruptedException, IOException {
		txtusername.clear();
		txtusername.sendKeys(UserName);
		txtPWd.clear();
		txtPWd.sendKeys(password + "1");
		btnsubmit.click();

		if (isAlertPresent() == true) {
			if (driver.switchTo().alert().getText().contains("User Already Active. Please Try After 10 Minutes!")) {
				Assert.assertTrue(true);
				driver.switchTo().alert().accept();
				if (isAlertPresent() == true) {
					driver.switchTo().alert().dismiss();
				}
			}
		}

		else {
			Thread.sleep(2000);
			if (Error_BLank_Pwd.getText().contains("Incorrect Username or Password")) {
				Assert.assertTrue(true);
				writeResultToExcel("Pass", 4, 5);
			} else

			{
				Assert.assertTrue(false);
			}
		}
	}

	public void Invalid_Username(String UserName, String password) throws InterruptedException, IOException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		txtusername.clear();
		txtusername.sendKeys(UserName + "1");
		txtPWd.clear();
		txtPWd.sendKeys(password);
		btnsubmit.click();
		Thread.sleep(2000);

		if (isAlertPresent() == true) {
			if (driver.switchTo().alert().getText().contains("Invalid UserName Or Password. Try again later")) {
				driver.switchTo().alert().accept();
				Assert.assertTrue(true);
				writeResultToExcel("Pass", 3, 5);

			}
		} else {
			Assert.assertTrue(false);
		}
	}

}
