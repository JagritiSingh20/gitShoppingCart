package Com.Framework.Selenium.V1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeTest
	public void setupDriver() {
		driver = new ChromeDriver();
		//PagefactoryMethod page = new PagefactoryMethod(driver);
		//page.goTO();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();

		// driver.get("https://redoc-integration.nhsinc.com/#/patientsPayments");
		// pagefactorymethod.goTO();
		// PagefactoryMethod pagefactorymethod = new PagefactoryMethod(driver);
	}
	  @AfterMethod 
	  public void screenShot(ITestResult result)
 {
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		  if(ITestResult.FAILURE==result.getStatus()){
		  try{
		  // To create reference of TakesScreenshot
		  TakesScreenshot screenshot=(TakesScreenshot)driver;
		  // Call method to capture screenshot
		  File src=screenshot.getScreenshotAs(OutputType.FILE);
		  // Copy files to specific location
		  // result.getName() will return name of test case so that screenshot name will be same as test case name
		  FileUtils.copyFile(src, new File("./Screenshots/"+result.getName()+".png"));
		  System.out.println("Successfully captured a screenshot");
		  }catch (Exception e){
		  System.out.println("Exception while taking screenshot "+e.getMessage());
		  }
		  driver.close(); }
	 
		  }}
