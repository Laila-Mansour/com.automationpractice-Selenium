package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {


	//Variables
	WebDriver driver;


	//Constructor
	public CategoriesPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Elements


	private By topsCategory = By.linkText("Tops");
	private By blousesCategory = By.linkText("Blouses");
	private By blouseProduct = By.xpath("//img[@alt='Blouse']");
	private By AddToCartButton = By.name("Submit");


	
	//Actions
	public void clickOnTopsCategory() {
		driver.findElement(topsCategory).click();
	}
	public void clickOnBlousesCategory() {
		driver.findElement(blousesCategory).click();
	}
	public void clickOnBlousesProduct() {
		driver.findElement(blouseProduct).click();
	}
	public void clickOnAddToCartButton() {
		driver.findElement(AddToCartButton).click();
	}


	

}
