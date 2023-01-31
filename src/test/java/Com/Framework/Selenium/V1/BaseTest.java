package Com.Framework.Selenium.V1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	/*
	 * @AfterMethod public void quitdriver() { driver.close(); }
	 */
}
