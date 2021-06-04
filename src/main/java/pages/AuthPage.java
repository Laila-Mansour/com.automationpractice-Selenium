package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthPage {
		
		//Variables
		private WebDriver driver;
		
		//Elements
		private By emailField = By.id("email_create");
	    private By SubmitBtn = By.id("SubmitCreate");
	    private By AlertMsg = By.id("create_account_error");
	    private By emailSignin = By.id("email");
	    private By passSignin = By.id("passwd");

		
		//Constructor
		public AuthPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		//Actions
		public void typeInEmail(String email) {
			driver.findElement(emailField).sendKeys(email + Keys.ENTER);
		}

	public void typeSignin(String email1 ,String pass) {
			driver.findElement(emailSignin).sendKeys(email1);
			driver.findElement(passSignin).sendKeys(pass+Keys.ENTER);
	}
	public String validationAlert() {
		return driver.findElement(AlertMsg).getText();
	}


		
	}
