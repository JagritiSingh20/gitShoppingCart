package Com.Framework.Selenium.V1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import static org.openqa.selenium.support.PageFactory

public class LoginToApp {

	WebDriver driver;

	public LoginToApp(WebDriver driver) { // constructor name should be
		// same as class name
		// initialisatin driver
		this.driver = driver;
		PageFactory.initElements(driver, this); // since initelement is static so we have}
	}

	@FindBy(id = "reg_email") // in place of id we can put different locator as also,xpath,class etc
	WebElement email;
	@FindBy(id = "reg_password")
	WebElement password;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")
	WebElement submit;
	@FindBy(id = "username")
	WebElement userLogin;
	@FindBy(id = "password")
	WebElement LoginPassword;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")
	WebElement Logintopage;
	@FindBy(xpath = "//a[text()= 'Sign out']")
	WebElement logout;

	public void Register(String Username, String Password) throws InterruptedException {
		email.sendKeys(Username);
		//password.sendKeys(Password);
		
		  for (String s : Password.split(""))
		  { Thread.sleep(1000);
		  password.sendKeys(s); }
		 
		Thread.sleep(10000);
		submit.click();

	}

	public void Login(String Username, String Password) {
		userLogin.sendKeys(Username);
		LoginPassword.sendKeys(Password);
		Logintopage.click();
	}

	public WebElement Enter(By by, String text) {
		WebElement element = driver.findElement(by);
		element.sendKeys(text);
		return element;
	}

	public WebElement click(By by) {
		WebElement element = driver.findElement(by);
		element.click();
		return element;

	}

	public String verifywelcometext() {
		String Accountholdername = TestCase1.Username.substring(0, TestCase1.Username.indexOf('@'));
		// TODO Auto-generated method stub
		return "Hello " + Accountholdername + " (not " + Accountholdername + "? Sign out)";
	}

	public void logoutfromapplication() {
		// WebElement element = driver.findElement(by);
		logout.click();

	}
}
