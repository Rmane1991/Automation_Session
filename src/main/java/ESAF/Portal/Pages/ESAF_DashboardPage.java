package ESAF.Portal.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ESAF.Portal.Resorces.Utility;

public class ESAF_DashboardPage extends Utility
{
	WebDriver driver;

	public ESAF_DashboardPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@FindBy(xpath = "")
	WebElement txt_username;
	
	public void page() 
	{
		txt_username.clear();
		txt_username.sendKeys("qwer");
		txt_username.click();
	}

}
