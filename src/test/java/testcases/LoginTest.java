package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reports.ExtentManager;

public class LoginTest {
	ExtentTest test;
	WebDriver driver;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		reports =ExtentManager.getReports();
		test = reports.createTest("LoginTest");
	}
	
	
	@AfterMethod
	public void quit() {
	driver.close();
	reports.flush();
		
	}
	
	@Test
	public void login() throws IOException {
		System.out.println(System.getProperty("user.dir"));
		
		test.log(Status.INFO, "Starting test case Login");
		test.log(Status.FAIL, "404 error");
		// selenium takes screenshot and puts in screesnhot folder
		test.addScreenCaptureFromPath("C:\\Extent\\Temp.png", "404 Error");
		Assert.fail("404 error");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Logging In");
		test.log(Status.PASS, "Test Passed");
		
		
	}
	@Test()
	public void logintochrome() throws IOException {
		System.out.println(System.getProperty("usr.dir")+//ExtentReportGeneration//drivers//chromedriver.exe));
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\u6064016\\OneDrive - Thomson Reuters Incorporated\\Pictures\\ExtentReportGeneration\\drivers\\chromedriver.exe" ));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().wait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		
		
	}
}
