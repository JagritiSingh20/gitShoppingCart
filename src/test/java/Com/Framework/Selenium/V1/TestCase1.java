package Com.Framework.Selenium.V1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestCase1 extends BaseTest {

	public static String Username = "xytiut.spmit@gmail.com";
	public static String Password = "7200$inNH";
	// WebDriver driver;
	LoginToApp logintoapp;
	AddToCart addtocart;

	@Test(groups = { "Registration" })
	public void Registration() throws InterruptedException {

		logintoapp = new LoginToApp(driver);
		logintoapp.Register(Username, Password);
		// verify welcome message after clicking on registration
		try {

			String message = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
			assertEquals(message, logintoapp.verifywelcometext());
			System.out.println("Welcome message is: " + message);
			logintoapp.logoutfromapplication();
			logintoapp.Login(Username, Password);
		} catch (Exception e) {
			// verify error message if user try to register with existing ID
			String expectedmessage = "Error: An account is already registered with your email address. Please login.";
			// identify actual error message
			WebElement errormessage = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li"));
			String actualmessage = errormessage.getText();
			System.out.println("Error message is: " + actualmessage);
			// verify error message with Assertion
			assertEquals(expectedmessage, actualmessage);
		}

	}

	@Test
	public void logintoapplication() {
		LoginToApp logintoapp = new LoginToApp(driver);
		logintoapp.Login(Username, Password);
		String message = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
		assertEquals(message, logintoapp.verifywelcometext());
		logintoapp.logoutfromapplication();
		// logintoapp.logoutfromapplication();

	}

	/*
	 * @Test public void shopping() { AddToCart addtocart = new AddToCart(driver);
	 * addtocart.Shop(); addtocart.addtoBasket(); addtocart.additemcount();
	 * 
	 * } // addtocart.AddtoBasket();
	 * 
	 * }
	 * 
	 * 
	 * @Test public void Addtocart() { AddToCart addtocart = new AddToCart(driver);
	 * addtocart.addtoBasket(); }
	 * 
	 * public static Object indexOf(char c) { // TODO Auto-generated method stub
	 * return null; }
	 */
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
