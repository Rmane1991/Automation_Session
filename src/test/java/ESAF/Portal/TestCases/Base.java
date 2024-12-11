package ESAF.Portal.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.apache.poi.ooxml.POIXMLException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	Sheet sheet;
	public WebDriver driver;

	
	public void ReadExcel() throws IOException 
	{
		FileInputStream fis = new FileInputStream((System.getProperty("user.dir") + "\\src\\main\\java\\ESAF\\Portal\\Resorces\\Test_Data.xlsx"));
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("ESAF");
	}

	
	public WebDriver launchBrowser() throws Exception 
	{

		ReadExcel();
		
		if (sheet.getRow(3).getCell(7).getStringCellValue().equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", System.getProperty("user.dir") + "\\downloadFiles\\");
			profile.setPreference("browser.download.manager.closeWhenDone", true);
			options.setProfile(profile);

			driver = new FirefoxDriver(options);

		} else if (sheet.getRow(3).getCell(7).getStringCellValue().equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", System.getProperty("user.dir") + "\\downloadFiles\\");
			prefs.put("browser.download.manager.closeWhenDone", true);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-features=InsecureDownloadWarnings");
			driver = new ChromeDriver(options);

		} else if (sheet.getRow(3).getCell(7).getStringCellValue().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(sheet.getRow(3).getCell(5).getStringCellValue());
		
		return driver;
	}

	
	public String getCellValueAsString(Cell cell) 
	{
	    if (cell == null) 
	    {
	        return ""; 
	    }
	    
	    switch (cell.getCellType()) 
	    {
	        case STRING:
	            return cell.getStringCellValue();
	        case NUMERIC:
	            if (DateUtil.isCellDateFormatted(cell)) 
	            {
	                return cell.getDateCellValue().toString(); 
	            } else {
	                
	                return String.valueOf((long) cell.getNumericCellValue());
	            }
	        case BOOLEAN:
	            return String.valueOf(cell.getBooleanCellValue());
	        case FORMULA:
	            return cell.getCellFormula(); 
	        default:
	            return ""; 
	    }
	
	}
	 
	
	public void writeToExcel(String filePath, String sheetName, Object[] headers, Object[] data) throws IOException {
	    Workbook workbook;
	    Sheet sheet;
	    File file = new File(filePath);

	    // Create or open workbook
	    if (file.exists()) {
	        try (FileInputStream fis = new FileInputStream(file)) {
	            workbook = WorkbookFactory.create(fis);
	        } catch (IOException | POIXMLException e) 
	        {
	            System.err.println("Error reading file. Creating a new workbook: " + e.getMessage());
	            workbook = new XSSFWorkbook(); // Create new workbook if file is invalid
	        }
	    } else {
	        workbook = new XSSFWorkbook();
	    }

	    // Get or create sheet
	    sheet = workbook.getSheet(sheetName);
	    if (sheet == null) {
	        sheet = workbook.createSheet(sheetName);
	        Row headerRow = sheet.createRow(0);
	        for (int i = 0; i < headers.length; i++) {
	            headerRow.createCell(i).setCellValue(headers[i].toString());
	        }
	    }

	    // Write data to next empty row
	    int rowCount = sheet.getLastRowNum() + 1;
	    Row dataRow = sheet.createRow(rowCount);
	    for (int i = 0; i < data.length; i++) {
	        dataRow.createCell(i).setCellValue(data[i].toString());
	    }

	    // Write workbook to file
	    try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
	        workbook.write(fileOut);
	    } finally {
	        workbook.close();
	    }

	
	}

}