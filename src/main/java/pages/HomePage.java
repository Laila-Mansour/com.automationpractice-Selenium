package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//Variables
	WebDriver driver;
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Elements
	By signinBtn = By.linkText("Sign in");
	
	//Actions
	public void clickOnSignin() {
		driver.findElement(signinBtn).click();
	}
	

}
