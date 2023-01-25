package Com.Framework.Selenium.V1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {

	// WebDriver driver;
	LoginToApp logintoapp;
	AddToCart addtocart;

	@Test(groups = { "Registration" })
	public void Registration() throws InterruptedException {

		logintoapp = new LoginToApp(driver);
		logintoapp.Register("j123@gmail.com", "7200$inNH");
		// String message =
		// driver.findElement(By.xpath("//*[@id=\\\"customer_login\\\"]/div[2]/form/p[2]/div]")).getText();
		// Assert.assertTrue(message.equals("Medium"));
	}

	@Test
	public void logintoapplication() {
		LoginToApp logintoapp = new LoginToApp(driver);
		logintoapp.Login("jagriti.spmit@gmail.com", "7200$inNH");

	}

	@Test
	public void shopping() {
		AddToCart addtocart = new AddToCart(driver);
		addtocart.Shop();
		addtocart.addtoBasket();
		addtocart.additemcount();

	}
	// addtocart.AddtoBasket();
	/*
	 * }
	 */

	@Test
	public void Addtocart() {
		AddToCart addtocart = new AddToCart(driver);
		addtocart.addtoBasket();
	}

	/*
	 * @Test public void addItem() { AddToCart addtocart = new AddToCart(driver);
	 * addtocart.additemcount(); // addtocart.additemcount();
	 */

	/*
	 * @SuppressWarnings("unused") public String getScreenshot(String testCaseName)
	 * throws IOException { TakesScreenshot ts = (TakesScreenshot) driver; File
	 * source = ts.getScreenshotAs(OutputType.FILE); File file = new
	 * File("Local Path"); FileUtils.copyFile(source, new
	 * File("C:\\Users\\JagritiS\\OneDrive - CitiusTech\\Documents\\Self Study\\Reports/Screenshot.png"
	 * )); return System.getProperty(
	 * "C:\\Users\\JagritiS\\OneDrive - CitiusTech\\Documents\\Self Study\\Reports/Screenshot.png"
	 * );
	 */
}/* } */
