package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Form {

	//Constructor
	public Form(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Variables
    private WebDriver driver;
	
	//Elements
	    private By personalInfoText = By.xpath("//h3[text()='Your personal information']");
	
		//Gender
		private By male = By.id("id_gender1");
	    private By female = By.id("id_gender2");
		
		//Input Data
		private By personalfirstName = By.id("customer_firstname");
	    private By personallastName = By.id("customer_lastname");
	    private By personalEmail = By.id("email");
	    private By personalPassword = By.id("passwd");
		
		//Date of Birth
		private By day = By.id("days");
	   private By month = By.id("months");
	   private By year = By.id("years");
		
		//checkboxes
		private By newsletter = By.id("newsletter");
	   private By specialOffers = By.id("optin");
	
	//Your Address
	private By addressFirstName = By.id("firstname");
	private By addressLastName = By.id("lastname");
	private By addressCompany = By.id("company");
	private	By addressAddress1 = By.id("address1");
	private	By addressAddress2 = By.id("address2");
	private	By addressCity = By.id("city");
		
		//State
		private	By addressState = By.xpath("//*[@id=\"id_state\"]");

		/*
		Select stateValue = new Select(driver.findElement(addressState));
		stateValue.selectByVisibleText("Alabama");*/


	private By addressPostalCode = By.id("postcode");
	private By addressCountry = By.id("id_country");
	private	By additionalinfo = By.id("other");
	private	By phone1 = By.id("phone");
	private	By phone2 = By.id("phone_mobile");
	private	By addressAlias = By.id("alias");

	private By submitBtn = By.id("submitAccount");
	
	//Actions
	public void clickOnMr() {
		driver.findElement(female).click();
	}
	
	public void insertInfo1(String firstName, String lastName, String password ) {
		driver.findElement(personalfirstName).sendKeys(firstName);
		driver.findElement(personallastName).sendKeys(lastName);
		driver.findElement(personalPassword).sendKeys(password);

	}

	public void Checkboxed(){
		driver.findElement(newsletter).click();
		driver.findElement(specialOffers).click();
	}
	
	public void insertInfo2(String firstName2, String lastName2, String Address1 , String Company1 , String Address2 ) {
		//driver.findElement(addressFirstName).sendKeys(firstName2);
		//driver.findElement(addressLastName).sendKeys(lastName2);
		driver.findElement(addressAddress1).sendKeys(Address1);
		driver.findElement(addressCompany).sendKeys(Company1);
		driver.findElement(addressAddress2).sendKeys(Address2);
		}
	
	public void insertAddressDetails(String city, String postalCode, String phoneNumber, String Alias, String phoneNumber2 ) {
		driver.findElement(addressCity).sendKeys(city);
		driver.findElement(addressPostalCode).sendKeys(postalCode);
		driver.findElement(phone2).sendKeys(phoneNumber);
		driver.findElement(addressAlias).clear();
		driver.findElement(addressAlias).sendKeys(Alias);
		driver.findElement(additionalinfo).sendKeys("Additional Notes");
		driver.findElement(phone1).sendKeys(phoneNumber2);
	}
	public void  DropDownList() {

		Select State = new Select(driver.findElement(addressState));
		State.selectByValue("3");
		Select Country = new Select(driver.findElement(addressCountry));
		Country.selectByValue("21");
		//Date of Birth
		Select DateDays = new Select(driver.findElement(day));
		DateDays.selectByValue("9");
		Select DateMonths = new Select(driver.findElement(month));
		DateMonths.selectByValue("6");
		Select DateYears = new Select(driver.findElement(year));
		DateYears.selectByValue("1993");



	}
	
	public String validationText() {
		return driver.findElement(personalInfoText).getText();
	}
	public void ClickRegister (){ driver.findElement(submitBtn).click(); }
	public String ValidateAddressName(){
		return driver.findElement(addressFirstName).getText();
	}
	public String ValidateAddressName2(){ return driver.findElement(addressLastName).getText(); }

}
