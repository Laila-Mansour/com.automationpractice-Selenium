package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	//Variables
	WebDriver driver;
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	//Elements
	By signinBtn = By.linkText("Sign in");
	
	//Actions
	public void clickOnSignin() {
		driver.findElement(signinBtn).click();
	}
	

}
