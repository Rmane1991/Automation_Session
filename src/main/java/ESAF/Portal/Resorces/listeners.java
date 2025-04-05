package ESAF.Portal.Resorces;

import java.io.PrintStream;
import java.lang.reflect.Field;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class listeners implements ITestListener {
	String destinationfile;
	ExtentTest test;
	ExtentReportNG ex_Report = new ExtentReportNG();
	ExtentReports reports = ex_Report.getReportObject();

	// To capture console logs
	ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
	PrintStream consoleStream = new PrintStream(consoleOutput);

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case start = " + result.getMethod().getMethodName());
		test = reports.createTest(result.getMethod().getMethodName());

		// Redirect console output
		System.setOut(consoleStream);
		System.setErr(consoleStream);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, "Test Case PASS");

		// Capture console logs
		@SuppressWarnings("deprecation")
		String consoleLogs = consoleOutput.toString();
		test.log(Status.PASS, "Test Case PASS");
		test.log(Status.INFO, "Console Logs:\n" + consoleLogs);

		// Reset the console output
		resetConsole();
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{

		try {
			// Get test class instance
	        Object testClassInstance = result.getInstance();

	        // Get declared 'driver' field from Base class
	        Field driverField = testClassInstance.getClass().getSuperclass().getDeclaredField("driver");
	        driverField.setAccessible(true); // Make it accessible

	        // Get driver instance
	        WebDriver driver = (WebDriver) driverField.get(testClassInstance);

	        // Capture screenshot
	        String screenshotPath = GetscreenShot.takescreenshots(driver, result.getMethod().getMethodName());
	        test.addScreenCaptureFromPath(screenshotPath);
	        test.log(Status.FAIL, "Test Case Failed");
	        
	        // Capture console logs
            @SuppressWarnings("deprecation")
			String consoleLogs = consoleOutput.toString();
            test.log(Status.INFO, "Console Logs:\n" + consoleLogs);
            
            // Capture Stack Trace (Exception Logs)
            String exceptionLog = getRelevantStackTrace(result.getThrowable());
            test.log(Status.INFO, "Exception Log:\n" + exceptionLog);

	        
		} catch (Exception e) 
		
		{
			e.printStackTrace();
		}
		
		System.out.println("Test Case Fail = " + result.getName());


		// Reset the console output
        resetConsole();
	
		
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Case Skipped = " + result.getName());
		test.log(Status.SKIP, "Test Case Skipped");

		@SuppressWarnings("deprecation")
		String consoleLogs = consoleOutput.toString();
		test.log(Status.INFO, "Console Logs:\n" + consoleLogs);

		if (result.getThrowable() != null) {
			String exceptionLog = getRelevantStackTrace(result.getThrowable());
			test.log(Status.INFO, "Skip Reason:\n" + exceptionLog);
		}

		resetConsole();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

	private void resetConsole() {
		consoleOutput.reset(); // Clear captured logs
		System.setOut(System.out);
		System.setErr(System.err);
	}
	
	private String getRelevantStackTrace(Throwable throwable) {
        StringBuilder relevantLogs = new StringBuilder();

        // Capture the error message
        relevantLogs.append(throwable.getClass().getName()).append(": ").append(throwable.getMessage()).append("\n");

        for (StackTraceElement element : throwable.getStackTrace()) {
            String traceLine = element.toString();

            // Extract only the relevant classes & methods
            if (traceLine.contains("SOR_Pages") || traceLine.contains("SOR_testcases")) {
                relevantLogs.append("\tat ").append(traceLine).append("\n");
            }
        }
        return relevantLogs.toString();
    }

}