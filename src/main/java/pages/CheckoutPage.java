package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {


	//Variables
	WebDriver driver;


	//Constructor
	public CheckoutPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Elements

	private By SummaryProceedToCheckoutBtn = By.xpath("//*[@id=\"center_column\"]/p[@class='cart_navigation clearfix']/a[@class='button btn btn-default standard-checkout button-medium']");
	private By AddressProceedToCheckoutBtn2 = By.className("button btn btn-default button-medium");
	private By AgreeCheckbox = By.id("cgv");
	private By shippingProceedToCheckoutBtn3 = By.name("processCarrier");
	private By PayByBankWire = By.className("bankwire");
	private By ConfirmOrderBtn = By.className("button btn btn-default button-medium");

	
	//Actions
	public void clickOnSummaryProceedToCheckoutBtn() {
		driver.findElement(SummaryProceedToCheckoutBtn).click();
	}
	public void clickOnAddressProceedToCheckoutBtn2() {
		driver.findElement(AddressProceedToCheckoutBtn2).click();
	}
	public void clickOnAgreeCheckbox(){driver.findElement(AgreeCheckbox).click();}
	public void clickOnShippingProceedToCheckoutBtn3(){driver.findElement(shippingProceedToCheckoutBtn3).click();}
	public void clickOnPayByBankWire(){driver.findElement(PayByBankWire).click();}
	public void clickOnConfirmOrderBtn(){driver.findElement(ConfirmOrderBtn).click();}


	

}
