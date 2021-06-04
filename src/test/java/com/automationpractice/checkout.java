package com.automationpractice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthPage;
import pages.Form;
import pages.HomePage;

import java.util.concurrent.TimeUnit;
//import sun.rmi.runtime.NewThreadAction;

public class checkout {
	
	WebDriver driver;
	HomePage homePage;
	AuthPage authPage;
	Form formPage;
	
	@BeforeClass
	public void startUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1024, 768));
		homePage = new HomePage(driver);
		authPage = new AuthPage(driver);
		formPage = new Form(driver);


	}

    @AfterMethod
	public void Endsession() {
		driver.quit();

	}
    @BeforeMethod
	public void Precondition() {
		driver.navigate().to("http://automationpractice.com/index.php");
		homePage.clickOnSignin();

	}
	
	@Test
	public void formValidation() {
		authPage.typeSignin("xxxjhg@xxxxx.com","123456");


	}


@Test
	public void happyScenario() {
	    authPage.typeInEmail("xxxjhg@xxxxx.com");
		formPage.clickOnMr();
		formPage.insertInfo1("Laila", "Mansour", "123456");
		formPage.Checkboxed();
		formPage.insertInfo2("Laila","Mansour","NewCairo","Vodafone","Katamya");
		formPage.insertAddressDetails("Cairo", "11355", "01122122121", "NewCairo2","01155555555");
		formPage.DropDownList();
		formPage.ClickRegister();
}



}

