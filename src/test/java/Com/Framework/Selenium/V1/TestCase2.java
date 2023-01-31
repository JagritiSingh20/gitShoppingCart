package Com.Framework.Selenium.V1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {

	// WebDriver driver;
	LoginToApp logintoapp;
	AddToCart addtocart;

	@Test
	public void logintoapplication() {
		LoginToApp logintoapp = new LoginToApp(driver);
		logintoapp.Login("jagriti.spmit@gmail.com", "7200$inNH");
		AddToCart addtocart = new AddToCart(driver);
		addtocart.Shop();
		addtocart.addtoBasket();
		addtocart.additemcount();
		/*
		 * WebElement Totalquantityamount = driver.findElement(By.xpath(
		 * "//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[6]/span")); String
		 * amount = Totalquantityamount.getText();
		 * System.out.println("Total cart amount is : " + amount); // verify error
		 * message with Assertion equals(amount);
		 */
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
