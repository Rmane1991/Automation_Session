package ESAF.Portal.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ESAF.Portal.Resorces.Utility;

public class ESAF_transaction_ReportPage extends Utility {

	WebDriver driver;

	// Constructor
	public ESAF_transaction_ReportPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@FindBy(xpath = "//a[@id='hrefsubpg20']")
	WebElement Click_Transaction_Report;
	
	@FindBy(xpath = "//a[@id='lbtn20-3']")
	WebElement Click_All_Transaction;
	
	

}
