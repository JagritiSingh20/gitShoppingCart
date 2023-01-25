package Com.Framework.Selenium.V1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static org.openqa.selenium.support.PageFactory

public class AddToCart {

	WebDriver driver;

	public AddToCart(WebDriver driver) { // constructor name should be
		// same as class name
		// initialisatin driver
		this.driver = driver;
		PageFactory.initElements(driver, this); // since initelement is static so we have}
	}

	WebElement Logintopage;
	@FindBy(xpath = "//*[text()='Shop']")
	WebElement ShopProduct;
	@FindBy(xpath = "//img[@src='https://practice.automationtesting.in/wp-content/uploads/2017/01/HTML5-Web-Application-Development-Beginners-guide-300x300.jpg']")
	WebElement selectproduct;
	@FindBy(xpath = "//*[text()='Add to basket']")
	WebElement additem;
	@FindBy(xpath = "//a[contains(@href,'basket')]")
	WebElement viewbasket;

	/*
	 * @FindBy(xpath = "//*[@id=\"product-182\"]/div[2]/form/div/input") WebElement
	 * quatity;
	 */

	public void Shop() {

		ShopProduct.click();
	}

	public void addtoBasket() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectproduct.click();
		// quatity.click();
		// additemcount.click();

	}

	public void additemcount() {
		int a = 0;
		while (a < 3) {
			a++;
			additem.click();
			viewbasket.click();
		}
	}

	public static Object get_All_Products() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public void viewbasket() { additem.click(); viewbasket.click(); }
	 */

}
