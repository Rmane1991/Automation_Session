package ESAF.Portal.Resorces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

public class Utility {

	WebDriver driver;
	Actions act;

	public Utility(WebDriver driver) 
	{
		super();
		this.driver = driver;
		act = new Actions(driver);
	}

	
	
	@SuppressWarnings("deprecation")
	public void checkListLineTextForSpellingMistakes() {
	    try {
	        // Find all <a> elements that contain <i class='fa fa-arrow-right'>
	        List<WebElement> listTextElements = driver.findElements(
	            By.xpath("//a[i[@class='fa fa-arrow-right']]")
	        );

	        // Setup LanguageTool
	        JLanguageTool langTool = new JLanguageTool(new AmericanEnglish());

	        if (listTextElements.isEmpty()) {
	            System.out.println("⚠️ No matching <a> elements found containing the right icon.");
	            return;
	        }

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        for (int i = 0; i < listTextElements.size(); i++) {
	            WebElement element = listTextElements.get(i);

	            // Get text from the <a> tag
	            String text = (String) js.executeScript("return arguments[0].textContent;", element);
	            text = text != null ? text.trim() : "";

	            if (text.isEmpty()) {
	                System.out.println("⚠️ Element " + (i + 1) + " is empty. Skipping...");
	                System.out.println("🔍 Outer HTML: " + element.getAttribute("outerHTML")); // Debug info
	                continue;
	            }

	            // Run spell check
	            List<RuleMatch> matches = langTool.check(text);

	            if (!matches.isEmpty()) {
	                System.out.println("📄 Text " + (i + 1) + ": " + text);
	                System.out.println("─────────────────────────────────────");

	                System.out.println("❌ Spelling mistakes found:");
	                for (RuleMatch match : matches) {
	                    String wrong = text.substring(match.getFromPos(), match.getToPos());
	                    List<String> suggestions = match.getSuggestedReplacements();

	                    System.out.println("🔴 Word: " + wrong);
	                    if (!suggestions.isEmpty()) {
	                        System.out.println("💡 Suggestion: " + suggestions.get(0));
	                    }
	                    System.out.println("-------------------------");
	                }

	                System.out.println("\n============================\n");
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	public static String generateRandomRoleName() 
	{
        String[] roles = {"Admin", "User", "Manager", "Developer", "Tester", "Analyst", "Designer"};
        
        Random random = new Random();
        int index = random.nextInt(roles.length);
        
        int randomNumber = 1000 + random.nextInt(9000); // Generates a number between 1000 and 9999
        
        return roles[index] + "" + randomNumber;
    }
	
	public void CorporateBcdropdownchk(String option)	
	{
		List<WebElement> Dropdown  = driver.findElements (By.xpath("//div[@id='subPages28']"));
		
		if (Dropdown.isEmpty()) 
		{
		    System.out.println("Element not found!");
		    
		} 
		
		else
		{
			
		for (WebElement element : Dropdown)
		{
			String optionText = element.getText();
			System.out.println(optionText);
			
           if (optionText.contains(option))
           {
        	   
        	   WebElement DrpDwn = driver.findElement(By.linkText(option));
				 //System.out.println(element.getText());
        	      DrpDwn.click();
        	        System.out.println("Clicked: " + option);
		                
		     }
           else {
        	   System.out.println("No data found");
           }
	      }
	   }	
	}	
	
	
	
	
	  public void selectFromDropdown(WebElement dropdownContainerElement,
	  WebElement txtsercharea, String searchTerm) throws InterruptedException 
	  {
	  dropdownContainerElement.click(); 
	  Thread.sleep(1000); 
	  if(isDisaplyedW(txtsercharea, 10) == true) 
	  { 
		  txtsercharea.clear();
		  txtsercharea.sendKeys(searchTerm); 
		  Thread.sleep(1000);
		  txtsercharea.sendKeys(Keys.ENTER); 
		  Thread.sleep(1000); 
	  }
	  
	  else 
	  { 
		  System.out.println("Serch Area Element not displayed"); }
	  }
	 
	
	
	public void selectFromDropdown_Exact_Name(WebElement dropdownContainerElement, WebElement txtSearchArea, String searchTerm) throws InterruptedException 
	{
	    dropdownContainerElement.click();
	    Thread.sleep(1000); // Allow dropdown to appear

	    if (isDisaplyedW(txtSearchArea, 5)) 
	    {
	        txtSearchArea.clear();
	        txtSearchArea.sendKeys(searchTerm);
	        Thread.sleep(500); // Wait for filtered results

	        // Get all matching options
	        List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,'select2-results__option')]"));

	        for (WebElement option : options) {
	            if (option.getText().trim().equalsIgnoreCase(searchTerm)) {  // Exact Match
	                option.click();
	                return; // Exit after selecting the correct option
	            }
	        }

	        System.out.println("Exact match not found for: " + searchTerm);
	    } else {
	        System.out.println("Search Area Element not displayed");
	    }
	}

	
	
	 public static String generateGST(String pan) {
	        if (pan == null || pan.length() != 10) {
	            throw new IllegalArgumentException("Invalid PAN number. Must be 10 characters long.");
	        }

	        String stateCode = "27"; // Maharashtra State Code
	        Random random = new Random();
	        
	        int entityCode = random.nextInt(9) + 1; // Entity Code (1-9)
	        char checkSum = 'Z'; // Placeholder for checksum (actual calculation requires GST algorithm)

	        return stateCode + pan + entityCode + checkSum;
	    }
	 
	 
	 
	 public static String generateRandomPAN1() 
	 {
	        Random random = new Random();
	        String fixedPrefix = "AASFD";
	        StringBuilder digits = new StringBuilder();
	        for (int i = 0; i < 4; i++) 
	        {
	            digits.append(random.nextInt(10));
	        }
	        String fixedSuffix = "C";
	        return fixedPrefix + digits + fixedSuffix;
	    }
	 
	 
		/*
		 * public static String generateRandomPAN1() { String letters =
		 * "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; String digits = "0123456789";
		 * 
		 * Random rand = new Random(); StringBuilder pan = new StringBuilder();
		 * 
		 * // Generate first 3 random uppercase letters for (int i = 0; i < 3; i++) {
		 * pan.append(letters.charAt(rand.nextInt(letters.length()))); }
		 * 
		 * // 4th character must be an entity type ('P' for individual, 'C' for company,
		 * etc.) String entityTypes = "PCFHLA"; // Common entity types in PAN
		 * pan.append(entityTypes.charAt(rand.nextInt(entityTypes.length())));
		 * 
		 * // 5th character (random letter, usually surname initial for individuals)
		 * pan.append(letters.charAt(rand.nextInt(letters.length())));
		 * 
		 * // Generate 4 random digits for (int i = 0; i < 4; i++) {
		 * pan.append(digits.charAt(rand.nextInt(digits.length()))); }
		 * 
		 * // Last character should be an uppercase letter
		 * pan.append(letters.charAt(rand.nextInt(letters.length())));
		 * 
		 * return pan.toString(); }
		 */

	 
	 
	 public static String generateGSTFromPAN(String pan) {
	        if (pan == null || pan.length() != 10) {
	            throw new IllegalArgumentException("Invalid PAN number. It should be exactly 10 characters.");
	        }

	        String stateCode = "27"; // Maharashtra (Change as needed)
	        char randomChar = (char) ('A' + new Random().nextInt(26)); // Random uppercase letter
	        String checkCode = "Z" + randomChar; // Fixed 'Z' + random character

	        return stateCode + pan + "1" + checkCode;
	    }
	 


    public static boolean isValidPAN(String pan) {
        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"); // PAN format validation
    }

  
	
	public String getAlphaNumericString() 
	{

		int n = 8;
	    // choose a Character random from this String
	    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
	    // create StringBuffer size of AlphaNumericString

	    StringBuilder sb = new StringBuilder(n);
	    for (int i = 0; i < n; i++) {

	      // generate a random number between

	      // 0 to AlphaNumericString variable length

	      int index = (int) (AlphaNumericString.length() * Math.random());
	      // add Character one by one in end of sb

	      sb.append(AlphaNumericString.charAt(index));

	    }
	    return sb.toString();

	    // Get and display the alphanumeric string

	  }
	
	public void pressEnter() {
		act.sendKeys(Keys.ENTER).build().perform();
	}

	public void pressUpKeys() {
		act.sendKeys(Keys.UP).build().perform();
	}

	public void moveToElementAndClick(WebElement ele)

	{
		act.moveToElement(ele).click().build().perform();
	}

	public void keypress(String a) {
		act.sendKeys(a).build().perform();
	}

	public void doubleClick() {
		act.doubleClick().build().perform();
	}

	public void moveToElementAndDoubleClick(WebElement ele) {
		act.moveToElement(ele).doubleClick().build().perform();
	}

	public void moveToElementAndContextClick(WebElement ele) {
		act.moveToElement(ele).contextClick().build().perform();
	}

	public void doubleClick(WebElement ele) {
		act.doubleClick(ele).build().perform();
	}

	public void contextClick(WebElement ele) {
		act.contextClick(ele).build().perform();
	}

	public void moveToElement(WebElement ele) {
		act.moveToElement(ele).build().perform();
	}

	public void Dropdown(By drp_Ele, String visible) {
		Select dropdown = new Select((WebElement) drp_Ele);
		dropdown.selectByVisibleText(visible);

	}

	public void Dropdownbytxt(WebElement cat, String visible) {
		Select dropdown = new Select(cat);
		dropdown.selectByVisibleText(visible);
	}

	
	
	public void Dropdownbytxt_String(WebElement cat, String visible) {
	    Select dropdown = new Select(cat);
	    boolean found = false;

	    for (WebElement option : dropdown.getOptions()) {
	        String optionText = option.getText().trim(); // Trim spaces
	        if (optionText.equalsIgnoreCase(visible) || optionText.contains(visible)) { 
	            dropdown.selectByVisibleText(optionText);
	            System.out.println("Selected: " + optionText);
	            found = true;
	            break; 
	        }
	    }

	    if (!found) {
	        System.out.println("No matching option found for: " + visible);
	    }
	}
	
	
	
	public void Dropdownbyindex(WebElement cat, int visible) 
	{
		Select dropdown = new Select(cat);
		dropdown.selectByIndex(visible);

	}

	public boolean isInvisible(WebElement Element, long tm) 
	{
		boolean isDisplayed = false;

		try 
		{
		    WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(tm));
		    wt.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(Element)));
		    isDisplayed = true;
		} catch (Exception e) 
		{
		    // e.printStackTrace();
		}

		return isDisplayed;
	}
	
	public void Click_Drop_Down(WebElement ele, WebElement Txt_serach, String value) {
		ele.click();
		Txt_serach.sendKeys(value);
		Txt_serach.sendKeys(Keys.ENTER);
	}

	 public  String Adharno()
	    {
	    	int Length=12;
	    	Random random = new Random();
	    	StringBuilder Adhar = new StringBuilder();
	    	for (int i=0;i<Length;i++)
	    	{
	    		Adhar.append((random.nextInt(12)));
	    	}
	    	
			return Adhar.toString();
	    	
	    }
	    

	// For write message to excel with color like if (Pass-green) (Fail-red) 
	public void writeResultToExcel(String result, int rowNumber, int columnNumber) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\ESAF\\Portal\\Resorces\\Test_Data.xlsx";
		// String filePath = "File path";

		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(4);

		Row row = sheet.getRow(rowNumber);
		if (row == null) {
			row = sheet.createRow(rowNumber);
		}

		Cell cell = row.getCell(columnNumber);
		if (cell == null) {
			cell = row.createCell(columnNumber);
		}

		cell.setCellValue(result);

		CellStyle style = workbook.createCellStyle();
		if ("Pass".equalsIgnoreCase(result)) 
		{
			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		} 
		else if ("Fail".equalsIgnoreCase(result))
		{
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
		} 
		else if ("In-Process".equalsIgnoreCase(result))
		{
			style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		}
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);

		fis.close();
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
		workbook.close();
	}

	public boolean isDisaplyed(By Locator, WebDriver wd, long tm) {
		boolean isDisplayed = false;

		try {
			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			isDisplayed = true;
		} catch (Exception e)

		{
			// e.printStackTrace();
		}

		return isDisplayed;
	}

	/*
	// Print Message
	public static void print(WebElement Print, String cat, Integer no) 
	{
		String text = Print.getText();
		System.out.println(no + " : " + cat + " " + text);
	}

	// URL Checking

	@SuppressWarnings("deprecation")
	public void checkUrl() {
	    String url = "";
	    HttpURLConnection huc = null;
	    int respCode;

	    try {
	        // Disable SSL validation
	        disableSSLValidation();

	        // Locate all links
	        List<WebElement> links = driver.findElements(By.xpath("//div[@id='sidebar-nav']//a[@href]"));

	        for (WebElement link : links) {
	            url = link.getAttribute("href");

	            if (url != null && url.endsWith(".aspx")) {
	                try {
	                    // Open HTTP connection
	                    huc = (HttpURLConnection) (new URL(url).openConnection());
	                    
	                    // Increase timeout settings
	                    huc.setConnectTimeout(10000); // 10 seconds for connection
	                    huc.setReadTimeout(15000);   // 15 seconds for reading data
	                    
	                    // Use GET request instead of HEAD
	                    huc.setRequestMethod("GET");
	                    
	                    huc.connect();

	                    // Get response code
	                    respCode = huc.getResponseCode();

	                    if (respCode >= 400) {
	                        System.out.println(url + " :- is a broken link with response code: " + respCode);
	                    } else {
	                        System.out.println(url + " :- is a valid link with response code: " + respCode);
	                    }
	                } catch (IOException e) {
	                    System.out.println("IOException while checking URL: " + url + " - " + e.getMessage());
	                } finally {
	                    if (huc != null) {
	                        huc.disconnect();
	                    }
	                }
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception during URL validation: " + e.getMessage());
	    }
	}

	private void disableSSLValidation() throws Exception {
	    TrustManager[] trustAllCerts = new TrustManager[]{
	        new X509TrustManager() {
	            public X509Certificate[] getAcceptedIssuers() {
	                return null;
	            }

	            public void checkClientTrusted(X509Certificate[] certs, String authType) {
	            }

	            public void checkServerTrusted(X509Certificate[] certs, String authType) {
	            }
	        }
	    };

	    SSLContext sc = SSLContext.getInstance("TLS");
	    sc.init(null, trustAllCerts, new java.security.SecureRandom());
	    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	    HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
	}

	
	
	
	
	*/
	
	 // URL Checking method
    @SuppressWarnings("deprecation")
    public void checkUrl() {
        String url = "";
        HttpURLConnection huc = null;
        int respCode;

        try {
            // Disable SSL validation (for self-signed certificates, etc.)
            disableSSLValidation();

            // Locate all links on the sidebar
            List<WebElement> links = driver.findElements(By.xpath("//div[@id='sidebar-nav']//a[@href]"));

            for (WebElement link : links) {
                url = link.getAttribute("href");

                if (url != null && url.endsWith(".aspx")) {
                    try {
                        // Open HTTP connection
                        huc = (HttpURLConnection) (new URL(url).openConnection());

                        // Set timeouts for connection and reading
                        huc.setConnectTimeout(10000); // 10 seconds for connection
                        huc.setReadTimeout(15000);   // 15 seconds for reading data

                        // Use GET request
                        huc.setRequestMethod("GET");

                        // Connect to the URL
                        huc.connect();

                        // Get response code
                        respCode = huc.getResponseCode();

                        // Check the response code and log accordingly
                        if (respCode >= 400) {
                            System.out.println(url + " :- is a broken link with response code: " + respCode);
                        } else {
                            System.out.println(url + " :- is a valid link with response code: " + respCode);
                        }
                    } catch (IOException e) {
                        // Log the exception and proceed with the next URL
                        System.out.println("IOException while checking URL: " + url + " - " + e.getMessage());
                    } finally {
                        if (huc != null) {
                            huc.disconnect();
                        }
                    }
                }
            }
        } catch (Exception e) {
            // Log any other exceptions during the URL validation process
            System.out.println("Exception during URL validation: " + e.getMessage());
        }
    }

    // Method to disable SSL validation (for testing purposes with self-signed certificates)
    private void disableSSLValidation() throws Exception {
        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null; // No accepted issuers
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
        };

        // Set SSLContext to accept all certificates
        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true); // Accept all hostnames
    }

	
	
	
	/*
	@SuppressWarnings("deprecation")
	public void checkUrl(WebDriver wd) {

		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		List<WebElement> links = wd.findElements((By.xpath("//ul[@class='nav navbar-nav pull-right']//a")));
		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			if (url != null && url.endsWith(".aspx")) {
				System.out.println(url);

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " is a broken link");
					} else {
						System.out.println(url + " :-( Is a valid link)");
					}

				} catch (MalformedURLException e) {
					// e.printStackTrace();
				} catch (IOException e) {
					// e.printStackTrace();
				}
			}
			continue;
		}

	}
*/
	public boolean isVisible(WebElement WebElement, long tm) {
		boolean isVisible = false;

		try {

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOf(WebElement));
			isVisible = true;
		} catch (Exception e)

		{
		}

		return isVisible;
	}

	public String getScreenshot(String testCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}

	public boolean isDisaplyedW(WebElement Ele, long tm) {
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOf(Ele));
			isDisplayed = true;
		} catch (Exception e)

		{

		}
		return isDisplayed;
	 }

	public boolean isClickable(WebElement WebElement, long tm) {

		boolean isClickable = false;

		try {

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
			wt.until(ExpectedConditions.elementToBeClickable(WebElement));
			isClickable = true;
		} catch (Exception e) {
		}
		return isClickable;
	}

	public boolean isClicked(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String currentTime() {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		return timestamp;
	}

	public int ifFileAvailable() throws InterruptedException {
		File downloadedFilePath = new File(System.getProperty("user.dir") + "\\downloadFiles\\");

		File allFiles[] = downloadedFilePath.listFiles();
		int len1 = allFiles.length;
		return len1;
	}
	
	public static class ConsoleColor {
	    // ANSI escape codes
	    public static final String RESET = "\033[0m"; // Text Reset

	    // Regular Colors
	    public static final String BLACK = "\033[0;30m"; // BLACK
	    public static final String RED = "\033[0;31m"; // RED
	    public static final String GREEN = "\033[0;32m"; // GREEN
	    public static final String YELLOW = "\033[0;33m"; // YELLOW
	    public static final String BLUE = "\033[0;34m"; // BLUE
	    public static final String PURPLE = "\033[0;35m"; // PURPLE
	    public static final String CYAN = "\033[0;36m"; // CYAN
	    public static final String WHITE = "\033[0;37m"; // WHITE

	    // ANSI escape codes for text styling
	    public static final String BOLD = "\033[1m"; // Bold text
	    public static final String ITALIC = "\033[3m"; // Italic text

	    // Method to print colored text with bold and italic formatting
	    public static void printColored(String message, String color) {
	        // Applying color, bold, and italic
	        System.out.println(color + BOLD + ITALIC + message + RESET);
	        System.out.println(color + BOLD + ITALIC + "-->>" + RESET);
	    }
	}

	
	 //For generate randam data
	static Random random = new Random();
	
	public  String generateRandomMobileNumber() 
	{
        
        int firstDigit = 6 + random.nextInt(4); 
        StringBuilder mobileNumber = new StringBuilder(String.valueOf(firstDigit));
        for (int i = 0; i < 9; i++) 
        {
            mobileNumber.append(random.nextInt(10)); 
        }
        return mobileNumber.toString();
    }

	
	public String generateRandomAccountNo() 
	{

		StringBuilder accountNo = new StringBuilder();

        // Ensure the first digit is non-zero
        accountNo.append(random.nextInt(9) + 1);

        // Generate the remaining 18 digits
        for (int i = 0; i < 18; i++) {
            accountNo.append(random.nextInt(10)); // Random digit between 0-9
        }

        return accountNo.toString();
    }
	
	
    // Method to generate a random name
    public String generateRandomName() 
    {
        String[] names = {"Admin", "User", "Agent", "Maximus", "Bank","Rapipay","Sarvatra"};
        //Random random = new Random();
        return names[random.nextInt(names.length)]+ "" + names[random.nextInt(names.length)];
    }

    // Method to generate a random PAN number (format: ABCDE1234F)
    public static String generateRandomPAN() 
    {
        String panPrefix = "ABC"; // First three letters fixed
        Random random = new Random();

        // Generate one random letter (A-Z)
        char fourthChar = (char) ('A' + random.nextInt(26));

        // Generate one random letter (A-Z) (PAN format requires 5th letter as an alphabet)
        char fifthChar = (char) ('A' + random.nextInt(26));

        // Generate four random digits (0-9)
        String fourDigits = String.format("%04d", random.nextInt(10000));

        // Generate one random alphabet (A-Z) as the last character
        char lastChar = (char) ('A' + random.nextInt(26));

        // Construct PAN number
        return panPrefix + fourthChar + fifthChar + fourDigits + lastChar;
    }
    
    
    
	public  String generateRandomPAN_Third_P() 
	{
        //Random random = new Random();
        StringBuilder pan = new StringBuilder();

        // Start with 'A' as the first character
        pan.append('A');

        // Generate the second and third random uppercase letters
        for (int i = 0; i < 2; i++) {
            pan.append((char) ('A' + random.nextInt(26)));
        }

        // Append 'P' as the fourth character
        pan.append('P');

        // Generate the fifth random uppercase letter
        pan.append((char) ('A' + random.nextInt(26)));

        // Generate the next four random digits
        for (int i = 0; i < 4; i++) {
            pan.append(random.nextInt(10));
        }

        // Append the final random uppercase letter
        pan.append((char) ('A' + random.nextInt(26)));

        return pan.toString();
    }


    // Method to generate a random Aadhar number (12 digits)
    public static String generateRandomAadhar() {
       // Random random = new Random();
        StringBuilder aadhar = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            aadhar.append(random.nextInt(10)); 
        }
        return aadhar.toString();
    }

 // Method to generate a random email ID based on the name
    public  String generateRandomEmail() {
        String[] domains = {"example.com", "test.com", "demo.com"};
        String randomName = generateRandomName(); // Generate random name
       // Random random = new Random();
        return randomName.toLowerCase().replace(" ", ".") + random.nextInt(100) + "@" + domains[random.nextInt(domains.length)];
    }
    
 
 // Write the random name to a specific cell in an existing Excel file
    public void writeNameToExcel(int rowNum, int cellNum, String name) 
    {
    	String filePath = "D:\\New folder\\Automation_Session\\src\\main\\java\\ESAF\\Portal\\Resorces\\Test_Data.xlsx";
    	
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) 
        {

            Sheet sheet = workbook.getSheet("ESAF");
            if (sheet == null) {
                System.out.println("Sheet not found.");
                return;
            }

            Row row = sheet.getRow(rowNum);
            if (row == null) {
                row = sheet.createRow(rowNum); // Create a new row if it doesn't exist
            }

            Cell cell = row.createCell(cellNum);
            cell.setCellValue(name); // Write the random name to the specified cell

            // Write the changes to the Excel file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
                System.out.println("Random name written to cell (" + rowNum + ", " + cellNum + "): " + name);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    // Method to generate alphanumeric codes that start with a letter and are 4 characters long
        public  String generateCode() {
            String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Define uppercase letters
            String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Define letters and digits

           // Random random = new Random();
            
            // First character should be a letter
            char firstChar = letters.charAt(random.nextInt(letters.length()));
            
            // Generate the remaining 3 characters (letters or digits)
            StringBuilder code = new StringBuilder();
            code.append(firstChar); // Append the first character (letter)
            for (int i = 0; i < 3; i++) 
            {
                code.append(alphanumeric.charAt(random.nextInt(alphanumeric.length())));
            }

            return code.toString(); // Return the final 4-character code
        }
        
        // Define fixed values for population groups
            private  final String[] POPULATION_GROUPS = {"Rural", "Urban", "Semi-Urban", "Metropolitan"};

            // Method to randomly select a population group
            public  String getRandomPopulationGroup() {
               // Random random = new Random();
                
                // Select a random index between 0 and the length of the POPULATION_GROUPS array
                int randomIndex = random.nextInt(POPULATION_GROUPS.length);
                
                // Return the population group at the random index
                return POPULATION_GROUPS[randomIndex];
            }
            
            
            public void scrollToElementAndClick(WebElement element)
        	{
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                element.click();
            }
            
            
            public void scrollToElement(WebElement element)
        	{
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
               // element.click();
            }
            
            
            public static class TextFileLogger 
            {


                private static XWPFDocument document;
                private static FileOutputStream out;

                // Initialize the Word document
                public static void initializeLogger(String testCaseName) throws IOException 
                {
                	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
                    String dateTime = dtf.format(LocalDateTime.now());
                	String filePath=System.getProperty("user.dir")+"//Logs//" + testCaseName +"_"+ dateTime + ".docx";
                    document = new XWPFDocument();
                    out = new FileOutputStream(filePath);
                }

                // Log a message to the Word document
                public static void logMessage(String message) 
                {
                    XWPFParagraph paragraph = document.createParagraph();
                    XWPFRun run = paragraph.createRun();

                    // Add timestamp and log message
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    run.setText("[" + dtf.format(now) + "] " + message);
                }

                // Save and close the Word document
                public static void closeLogger() throws IOException {
                    document.write(out);
                    out.close();
                    document.close();
                    }
                }
            
    
            public void testCasename(ITestResult result) 
            {
				String r=result.getMethod().getMethodName();
				System.out.println(r);
			}
}
