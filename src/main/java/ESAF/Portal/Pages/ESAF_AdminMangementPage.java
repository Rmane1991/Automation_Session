package ESAF.Portal.Pages;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import ESAF.Portal.Resorces.Utility;

public class ESAF_AdminMangementPage extends Utility
{
		
		ESAF_LoginPage loginPage;
	    WebDriverWait wait;
		WebDriver driver;
		
		SoftAssert softAssert = new SoftAssert();
		
		public ESAF_AdminMangementPage(WebDriver driver) 
		{
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			loginPage =new ESAF_LoginPage(driver);
		}

		//***********************************************Create Role Pages*******************************************************//
		
		@FindBy(xpath = "//a[@id='hrefsubpg16']")
		WebElement Menu_AdminMng;
		
		@FindBy(id = "lbtn16-182")
		WebElement SubMenu_CreateRoles;
		
		@FindBy(id = "__tab_cpbdCarde_TabContRegistration_TabPanelSearPages")
		WebElement btn_AddRoles;
		
		@FindBy(xpath ="//a[@id='__tab_cpbdCarde_TabContRegistration_TabPanel2']")
		WebElement btn_MapRoles;
		
		@FindBy(id = "select2-cpbdCarde_TabContRegistration_TabPanelSearPages_ddlRoleID-container")
		WebElement dropdown_AddRoles;
		
		@FindBy(xpath = "//input[@class='select2-search__field']")
		WebElement txt_sercharea;
		
		@FindBy(className = "select2-search__field")
		WebElement searchfield_Roles;
		
		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_btnExportCSV")
		WebElement btn_ExportCSV;
		
		@FindBy(id = "select2-cpbdCarde_TabContRegistration_TabPanelSearPages_ddlRoleID-container")
		WebElement btn_ExportXLS;
		
		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_lbtnAddRole")
		WebElement lbtnAddRole;
		
		@FindBy(id = "cpbdCarde_txtRolename")
		WebElement txtRolename;
		
		@FindBy(id = "cpbdCarde_lbtnNewRole")
		WebElement btn_Submit;
		
		@FindBy(id = "cpbdCarde_btnclose")
		WebElement btn_Cancel;
		
		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanelSearPages_lbtnAddRole")
		WebElement lbtnAddRole1;
		
		@FindBy(id = "cpbdCarde_txtRolename")
		WebElement txtRolename2;
		
		@FindBy(id = "cpbdCarde_lbtnNewRole")
		WebElement btn_Submit3;
		
		@FindBy(xpath = "//ul[@id='select2-cpbdCarde_TabContRegistration_TabPanelSearPages_ddlRoleID-results']")
		WebElement dropdown_scroll_AddRole;
		
		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanel2_ddlClient")
		WebElement dropdown_CorporateBC;

		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanel2_ddluserRoleGroup")
		WebElement dropdown_userRoleGroup;
		
		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanel2_btnEditRole")
		WebElement btn_SubmitRole;
		
		@FindBy(id = "cpbdCarde_TabContRegistration_TabPanel2_btnEditRole")
		WebElement Actual_RoleCreate_Message;
		
		
		
		@FindBy(xpath = "//div[@class='toast-message']")
		WebElement Success_Message;
		
		@FindBy(xpath = "//div[@id='toast-container']")
		WebElement MapRole_Addition1;
		
		@FindBy(xpath = "//div[@id='sidebar-nav']")
		WebElement List_Menu; 
		
		public void Selec_Value_FromDropDownm(WebElement dd_element, WebElement txt_Area, String Name) throws InterruptedException 
		{
			dd_element.click();
			Thread.sleep(1000);
			txt_Area.sendKeys(Name);
			Thread.sleep(1000);
			txt_Area.sendKeys(Keys.ENTER);
		}
		
		
		public void clickSliderByMenuName(String menuName) 
		{
		    String xpath = "//span[text()='" + menuName + "']/parent::td/preceding-sibling::td//input[@type='checkbox']";
		    
		    WebElement slider = driver.findElement(By.xpath(xpath));
		    
		    if (!slider.isSelected()) 
		    { 
		        slider.click();
		    }
		    
		}
		
		
		@FindBy(xpath = "//table[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_gvRoleDetails']/tbody/tr")
		private List<WebElement> tableRows;

		public boolean isRolePresent(String roleName) 
		{
		    String xpath = "//td[text()='" + roleName + "']";
		    try {
		        return driver.findElements(By.xpath(xpath)).size() > 0;
		    } catch (Exception e) {
		        return false;
		    }
		}

		
		public void Add_Role_Verify_Role() throws InterruptedException 
		{
			Menu_AdminMng.click();
			SubMenu_CreateRoles.click();
			lbtnAddRole.click();
			Thread.sleep(500);
			String RoleName = generateRandomRoleName();
			if(isDisaplyedW(txtRolename, 5)==true)
			{
				System.out.println("txtRolename Displayed");
			}
			txtRolename.sendKeys(RoleName);
			btn_Submit.click();
			
			if (Success_Message.getText().contains("Role added successfully.")) 
			{
				softAssert.assertTrue(true, "Success message displayed correctly.");
			    writeNameToExcel(9, 1, RoleName);
			} else 
			{
				softAssert.fail("Expected success message not found! Actual message: " + Success_Message.getText());
			}
			
			SubMenu_CreateRoles.click();
			Thread.sleep(500);
			Selec_Value_FromDropDownm(dropdown_AddRoles,txt_sercharea,RoleName);
			Thread.sleep(500);
			if(isRolePresent(RoleName)==true)
			{
				softAssert.assertTrue(true);
			}
			
			else
			{
				softAssert.fail();
				System.out.println("This role not added");
			}
			
			softAssert.assertAll();
			
		}
		
		
		Random random = new Random();

	    // List of available permissions
	    private static final List<String> PERMISSIONS = Arrays.asList(
	            "Dashboard", "Admin Management", "Corporate BC", "Aggregator Management", "Agent Management",
	            "Commission Management", "Limit Management", "Wallet Management", "Transaction Report",
	            "Commission Report", "Downloads", "Complaint Management", "Reports", "Alert Management",
	            "BBPS Transactions", "Service Request"
	    );

	    // Store assigned permissions for later verification
	    private Set<String> assignedPermissions = new HashSet<>();

	    public void assignRandomPermissions(int numberOfPermissions) throws InterruptedException 
	    {
	        List<String> selectedPermissions = getRandomPermissions(numberOfPermissions);

	        if (!selectedPermissions.contains("Dashboard")) 
	        {
	            selectedPermissions.add(0, "Dashboard"); // Add "Dashboard" at the beginning
	        }
	        
	        if (!selectedPermissions.contains("Home")) {
	            selectedPermissions.add(1, "Home");
	        }

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        for (String permission : selectedPermissions) {
	            try 
	            {
	                String xpath = "//span[text()='" + permission + "']/parent::td/preceding-sibling::td//span[contains(@class, 'slider')]";
	                WebElement slider = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	               
	                moveToElementAndClick(slider);
	                Thread.sleep(1000);
	                //slider.click();
	                assignedPermissions.add(permission);
	                Thread.sleep(1000);
	                System.out.println("Assigned permission: " + permission);
	            } catch (NoSuchElementException e) 
	            
	            {
	                System.out.println("Permission not found: " + permission);
	            }
	        }
	    
	    }
		
		public boolean verifyAssignedPermissions() {
	        for (String permission : assignedPermissions) {
	            WebElement checkbox = driver.findElement(By.xpath("//span[text()='" + permission + "']/parent::td/preceding-sibling::td//input[@type='checkbox']"));
	            if (!checkbox.isSelected()) {
	                return false; 
	            }
	        }
	        return true; 
	    }

	    private List<String> getRandomPermissions(int count) {
	        List<String> shuffled = new ArrayList<>(PERMISSIONS);
	        Collections.shuffle(shuffled); 
	        return shuffled.subList(0, Math.min(count, PERMISSIONS.size())); 
	    }
		
		
		
		public void Map_Roles(String ROleNAme) throws InterruptedException 
		{
			btn_MapRoles.click();
			Thread.sleep(500);
			Dropdownbytxt(dropdown_CorporateBC, "Maximus");
			Thread.sleep(500);
			Dropdownbytxt(dropdown_userRoleGroup,ROleNAme);
			assignRandomPermissions(5);
			Thread.sleep(500);
			scrollToElementAndClick(btn_SubmitRole);
			Thread.sleep(500);
		   
			if (Success_Message.getText().contains("Role added successfully.")) 
			{
				softAssert.assertTrue(true, "Success message displayed correctly.");
			} else 
			{
				softAssert.fail("Expected success message not found! Actual message: " + Success_Message.getText());
			}
			softAssert.assertAll();
		}
		
	
	////********************************Create User*********************************************////	
		@FindBy(id = "lbtn16-125")
		WebElement SubMenu_UserCreate;
		
		@FindBy(id = "cpbdCarde_txtUserName")
		WebElement txtUserID;
		
		@FindBy(id = "cpbdCarde_txtname")
		WebElement txtUserName;
		
		@FindBy(id = "cpbdCarde_txtPassword")
		WebElement txtPassword;
		
		@FindBy(id = "cpbdCarde_txtConfirmPassword")
		WebElement txtConfirmPassword;
		
		@FindBy(id = "cpbdCarde_txtEmail")
		WebElement txtEmail;
		
		@FindBy(id = "cpbdCarde_txtMobile")
		WebElement txtMobile;
		
		@FindBy(xpath = "//Select[@id='cpbdCarde_ddlClient']")
		WebElement ddlClient;
		
		@FindBy(id = "cpbdCarde_ddlRole")
		WebElement ddlRole;
		
		@FindBy(xpath = "//select[@id='cpbdCarde_ddlUsers']")
		WebElement ddlUsers;
		
		@FindBy(xpath = "//select[@id='cpbdCarde_ddlUserRoleGroup']")
		WebElement ddlUserRoleGroup;
		
		@FindBy(id = "cpbdCarde_btnSave")
		WebElement btnSave;
		
		@FindBy(id = "cpbdCarde_btnClear")
		WebElement btnClear;

		public void CreateUser(String RoleName) throws InterruptedException 
		{
			//Menu_AdminMng.click();
			SubMenu_UserCreate.click();
			Thread.sleep(500);
			txtUserID.clear();
			txtUserID.click();
			Thread.sleep(500);
			String UserName = getAlphaNumericString();
			txtUserID.sendKeys(UserName);
			txtUserName.clear();
			txtUserName.click();
			Thread.sleep(1000);
			txtUserName.sendKeys(UserName);
			Thread.sleep(500);
			txtPassword.clear();
			Thread.sleep(500);
			txtPassword.click();
			Thread.sleep(500);
			txtPassword.sendKeys("Admin@12345");
			txtConfirmPassword.clear();
			txtConfirmPassword.click();
			Thread.sleep(500);
			txtConfirmPassword.sendKeys("Admin@12345");
			txtEmail.clear();
			txtEmail.click();
			Thread.sleep(500);
			txtEmail.sendKeys(generateRandomEmail());
			txtMobile.clear();
			txtMobile.click();
			Thread.sleep(1000);
			txtMobile.sendKeys(generateRandomMobileNumber());
			Thread.sleep(1000);
			Dropdownbytxt(ddlClient,"Omkar");
			Thread.sleep(2000);
			Dropdownbyindex(ddlRole,2);
			Thread.sleep(2000);
			Dropdownbytxt(ddlUsers,"Omkar");
			Thread.sleep(2000);
			Dropdownbytxt(ddlUserRoleGroup,RoleName);
			Thread.sleep(2000);
			btnSave.click();
			Thread.sleep(1000);
			if (Success_Message.getText().contains("User created successfully.")) 
			{
				softAssert.assertTrue(true, "Success message displayed correctly.");
				System.out.println(UserName);
				writeNameToExcel(12, 1, UserName);
			} else 
			{
				softAssert.fail("Expected success message not found! Actual message: " + Success_Message.getText());
			}
			softAssert.assertAll();
		}
		
		
		//---------------------Verify Permission--------------
		
		@FindBy(xpath = "//*[@id='navbar-menu']/ul[2]/li[2]/a/i[2]")
		WebElement clcik_Dropdown_Logput;
		
		@FindBy(xpath = "//a[@id='LbLoginStatus']/span")
		WebElement btn_LogOut;
		
		@FindBy(xpath = "//input[@id='txtUserName']")
		WebElement txt_Username;

		@FindBy(xpath = "//input[@id='txtPassword']")
		WebElement txt_Password;

		@FindBy(xpath = "//input[@id='btnLogin']")
		WebElement btn_Submit_Login;
		
		@FindBy(xpath = "//input[@id='txtold']")
		WebElement txt_Old_Pwd;
		
		@FindBy(xpath = "//input[@id='txtnew']")
		WebElement txt_New_Pwd;
		
		@FindBy(xpath = "//input[@id='txtconfirm']")
		WebElement txt_Confirm_New_Pwd;
		
		@FindBy(xpath = "//input[@id='chkConfimartion']")
		WebElement chk_Aggree;
		
		@FindBy(xpath = "//input[@id='btnChangePwd']")
		WebElement btn_Change_Password;
		
		@FindBy(xpath = "//a[@id='lblWelcome']")
		WebElement lblUsername;
		
		public void Verify_Permission(String Username) throws InterruptedException, IOException 
		{
			 System.out.println("Verify");
			 clcik_Dropdown_Logput.click();
			 btn_LogOut.click();
			 if(isDisaplyedW(txt_Username, 20)==true)
			 {
				 loginPage.Check_Valid_Credentials_Permission_Checking(Username, "Admin@12345");
			 }	
			 txt_Old_Pwd.sendKeys("Admin@12345");
			 txt_New_Pwd.sendKeys("Admin@123456");
			 txt_Confirm_New_Pwd.sendKeys("Admin@123456");
			 chk_Aggree.click();
			 btn_Change_Password.click();
			 
			 if(isAlertPresent()==true)
			 {
				 if(driver.switchTo().alert().getText().contains("Password has been changed successfully."))
				 
				 driver.switchTo().alert().accept();
			 }
			 
			 
			 loginPage.Check_Valid_Credentials_Permission_Checking(Username, "Admin@123456");
			 
			 if(lblUsername.getText().contains(Username))
			 {
				 System.out.println(Username+":- This User Login sucessfully");
				 
				 List<WebElement> menuItems = driver.findElements(By.xpath("//*[@id='navMenus']/li/a"));
				 List<String> displayedPermissions = new ArrayList<>();

				 for (WebElement item : menuItems) {
				     displayedPermissions.add(item.getText().trim());
				 }

				 // Convert both to Set for order-independent comparison
				 Set<String> displayedPermissionsSet = new HashSet<>(displayedPermissions);

				 System.out.println("Selected Permissions: " + assignedPermissions);
				 System.out.println("Displayed Permissions: " + displayedPermissions);

				 // Compare as sets (ignores order)
				 if (!assignedPermissions.equals(displayedPermissionsSet)) {
				     System.out.println("Mismatch Found!");
				     System.out.println("Expected: " + assignedPermissions);
				     System.out.println("Actual: " + displayedPermissionsSet);
				     Assert.fail("Selected permissions do not match the displayed permissions.");
				 } else {
				     System.out.println("✅ Test Case Passed: Selected permissions match displayed permissions!");
				 }

				 
					/*
					 * List<WebElement> menuItems =
					 * driver.findElements(By.xpath("//*[@id='navMenus']/li/a")); List<String>
					 * displayedPermissions = new ArrayList<>();
					 * 
					 * 
					 * 
					 * for (WebElement item : menuItems) {
					 * displayedPermissions.add(item.getText().trim()); }
					 * 
					 * Set<String> displayedPermissionsSet = new HashSet<>(displayedPermissions);
					 * System.out.println("Selected Permissions: " + assignedPermissions);
					 * System.out.println("Displayed Permissions: " + displayedPermissions);
					 * System.out.println("Displayed Permissions: " + displayedPermissionsSet);
					 * 
					 * 
					 * if (!assignedPermissions.equals(displayedPermissionsSet)) {
					 * System.out.println("Mismatch Found!"); System.out.println("Expected: " +
					 * assignedPermissions); System.out.println("Actual: " +
					 * displayedPermissionsSet);
					 * Assert.fail("Selected permissions do not match the displayed permissions.");
					 * }
					 */
			 
			 }
			 
		}
		
		
		////////////*********************** Manage Permission ************************/////////////////////////////////////
		
		@FindBy(id = "lbtn16-127")
		WebElement SubMenu_ManagePermission;
		
		
		//Manage Permission
		
		@FindBy(xpath = "//a[@id='lbtn16-127']")
		WebElement Click_Manage_Permiaaion;
		
		@FindBy(xpath = "//select[@id='cpbdCarde_ddlClient']")
		WebElement dd_ClicentName;
		
		@FindBy (xpath = "//button[@id='cpbdCarde_btnEditRole']")
		WebElement btn_Update_Manage_Permission;
		
		public void clickEditRoleByRoleName(String roleName) {
			String xpath = "//td[text()='" + roleName + "']/following-sibling::td[last()]//input[@title='Edit role']";

			int attempts = 0;
			while (attempts < 3) {
				try {
					WebElement editButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
							editButton);
					Thread.sleep(500);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();", editButton);

					System.out.println("Clicked 'Edit role' for: " + roleName);
					return;
				} catch (StaleElementReferenceException e) {
					System.out.println("Retrying due to stale element... Attempt " + (attempts + 1));
				} catch (Exception e) {
					System.out.println("Error clicking edit button: " + e.getMessage());
					break;
				}
				attempts++;
			}
		}

		
		public void Manage_Permission (String RoleName) throws InterruptedException
		
		{
			Click_Manage_Permiaaion.click();
			clickEditRoleByRoleName(RoleName);
			Thread.sleep(1000);
			Dropdownbytxt(dd_ClicentName, "Omkar");
			assignRandomPermissions(6);
			Thread.sleep(5000);
			btn_Update_Manage_Permission.click();
			Thread.sleep(500);
			if (Success_Message.getText().contains("SUCCESS")) 
			{
				softAssert.assertTrue(true, "Success message displayed correctly.");
			} else 
			{
				softAssert.fail("Expected success message not found! Actual message: " + Success_Message.getText());
			}
			softAssert.assertAll();
		}
			
			
		
}