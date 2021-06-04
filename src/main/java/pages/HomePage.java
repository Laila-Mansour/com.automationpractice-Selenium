package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//Variables
	private	WebDriver driver;
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Elements
	private By signinBtn = By.linkText("Sign in");
	private By CartBtn = By.className("shopping_cart");
	
	//Actions
	public void clickOnSignin() {
		driver.findElement(signinBtn).click();
	}
	public void clickOnCartBtn() {
		driver.findElement(CartBtn).click();
	}
	

}
