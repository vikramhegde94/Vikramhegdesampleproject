package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class RegTest {

	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		reports =ExtentManager.getReports();
		
		test = reports.createTest("RegisterTest");
	}
	@AfterMethod
	public void quit() {
		reports.flush();
	}
	
	@Test
	public void doRegister() {
		test.log(Status.INFO, "RegisterTest started");
		test.log(Status.PASS, "RegisterTest ended");
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