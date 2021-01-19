package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class AuthPage {
		
		//Variables
		WebDriver driver;
		
		//Elements
		By emailField = By.id("email_create");
		By SubmitBtn = By.id("SubmitCreate");

		
		//Constructor
		public AuthPage(WebDriver driver) {
			this.driver = driver;
		}
		
		//Actions
		public void typeInEmail(String email) {
			driver.findElement(emailField).sendKeys(email + Keys.ENTER);
		}

		
	}
