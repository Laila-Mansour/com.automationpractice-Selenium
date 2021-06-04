package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {


	//Variables
	WebDriver driver;


	//Constructor
	public AccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Elements

	private By WomenCategory = By.xpath("//a[@title='Women']");

	
	//Actions
	public void clickOnWomenCategory() {
		driver.findElement(WomenCategory).click();
	}

	

}
