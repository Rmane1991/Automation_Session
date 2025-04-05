package ESAF.Portal.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ESAF.Portal.Resorces.Utility;

public class ESAF_Admin_ManagementPage_OLD extends Utility
{
	WebDriver driver;
	
	//Constructor
	public ESAF_Admin_ManagementPage_OLD(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	//Webelement
	@FindBy(xpath = "//a[@id='hrefsubpg16']")
	WebElement Click_Admin_Management;
	
	@FindBy(xpath = "//a[@id='lbtn16-182']")
	WebElement Click_Create_Role;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_TabContRegistration_TabPanelSearPages_lbtnAddRole']")
	WebElement Btn_Add_New_Role;
	
	@FindBy(xpath = "//div[@id='cpbdCarde_Panel_EditRole']")
	WebElement Win_Add_Role;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtRolename']")
	WebElement txt_Role_Name;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_lbtnNewRole']")
	WebElement btn_Submit_Role;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnclose']")
	WebElement btn_Cancle_Role;
	
	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement Alert_Toast_Msg; // Insert Successful
	
	@FindBy(xpath = "//a[@id='lbtn16-127']")
	WebElement Click_Manage_Permission;
	
	
	public void clickEditButtonForRole(String roleName) 
	{
	    WebElement editButton = driver.findElement(By.xpath("//td[text()='" + roleName + "']/parent::tr//input[@title='Edit role']"));
	    editButton.click(); 
	}
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlClient']")
	WebElement dd_Corporate_BC;
	
	public void clickSliderByName(String menuName) 
	{
	    try 
	    {
	        WebElement slider = driver.findElement(By.xpath("//tr[td[span[text()='" + menuName + "']]]//label[@class='switch']/span[@class='slider round']"));
	        slider.click();
	    } catch (NoSuchElementException e) 
	    {
	        System.out.println("Slider for menu '" + menuName + "' not found.");
	    }
	}
	
	//Enable and disable UserPermission
	
	public void clickSliderByMenuName(String menuName) 
	{
		By menuLabel = By.xpath("//span[contains(text(),'" + menuName + "')]");

		By sliderCheckbox = By.xpath("//span[contains(text(),'" + menuName + "')]/ancestor::tr//label[@class='switch']/input");

		WebElement menuLabelElement = driver.findElement(menuLabel);
		menuLabelElement.click();
		
		WebElement sliderElement = driver.findElement(sliderCheckbox);
		sliderElement.click();
	}
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnEditRole']")
	WebElement btn_update_Permission;
	
	@FindBy(xpath = "//button[@id='cpbdCarde_btnEditClose']")
	WebElement btn_cancle_Permission;
	
	
	//WebElement For Create User
	
	@FindBy(xpath = "//a[@id='lbtn16-125']")
	WebElement Click_Create_User;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtUserName']")
	WebElement txt_User_ID;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtname']")
	WebElement txt_User_Name;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtPassword']")
	WebElement txt_Password;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtConfirmPassword']")
	WebElement txt_Confirm_Password;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtEmail']")
	WebElement txt_EmailID;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_txtMobile']")
	WebElement txt_Mobile_No;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlRole']")
	WebElement dd_Select_Role;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlUsers']")
	WebElement dd_select_Users;
	
	@FindBy(xpath = "//select[@id='cpbdCarde_ddlUserRoleGroup']")
	WebElement dd_Select_Role_Group;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_btnSave']")
	WebElement btn_Save_User;
	
	@FindBy(xpath = "//input[@id='cpbdCarde_btnClear']")
	WebElement btn_Cancle_User;
	
	
	//Create Role
	public void create_Role() 
	{
		Click_Admin_Management.click();
		Click_Create_Role.click();
		Btn_Add_New_Role.click();
		String Role_Name=generateRandomName();
		writeNameToExcel(5,1,Role_Name);
		txt_Role_Name.sendKeys(Role_Name);
		
		btn_Submit_Role.click();
		
		if(Alert_Toast_Msg.getText().contains("Role is already exist."))
		{
			System.out.println("This role Name all ready Present");
			txt_Role_Name.clear();
			String Role_Name_New=generateRandomName();
			writeNameToExcel(5,1,Role_Name_New);
			txt_Role_Name.sendKeys(Role_Name_New);
			btn_Submit_Role.click();
		}
		
		if(Alert_Toast_Msg.getText().contains("Role added successfully."))
		{
			System.out.println("This role generated");
			
		}
		
		else 
		{
			System.out.println(Alert_Toast_Msg.getText());
		}
		
	}
	
	//Create Manage Permission
	public void Manage_Permission(String Role_Name_Excel) 
	{
		
		Click_Manage_Permission.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		clickEditButtonForRole(Role_Name_Excel);
		
		Dropdownbyindex(dd_Corporate_BC, 1);
	
		clickSliderByName("Home");
		clickSliderByName("Dashboard");
		clickSliderByName("Reports");
		btn_update_Permission.click();
	}
	
	//Create User
	public void Create_User(String Role_Name_Excel)
	{
		//For click user 
		Click_Create_User.click();
		String username=generateRandomName();
		writeNameToExcel(7,1,username);
		txt_User_ID.sendKeys(username);
		txt_User_Name.sendKeys(username);
		txt_Password.sendKeys("admin@1234");
		txt_Confirm_Password.sendKeys("admin@1234");
		txt_EmailID.sendKeys("rmane258@gmail.com");
		txt_Mobile_No.sendKeys("8529637410");
		Dropdownbyindex(dd_Corporate_BC, 0);
		Dropdownbyindex(dd_Select_Role, 1);
		Dropdownbyindex(dd_select_Users, 0);
		Dropdownbytxt(dd_Select_Role_Group, Role_Name_Excel);
		btn_Save_User.click();
		
		if(Alert_Toast_Msg.getText().contains("Record with the same UserId already exist."))
		{
			String username_New=generateRandomName();
			writeNameToExcel(7,1,username_New);
			txt_User_ID.clear();
			txt_User_ID.sendKeys(username_New);
			txt_User_Name.clear();
			txt_User_Name.sendKeys(username_New);
		}
		
		
	}
	
	
}
