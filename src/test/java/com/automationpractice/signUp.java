package com.automationpractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AuthPage;
import pages.Form;
import pages.HomePage;


public class signUp {
	
	WebDriver driver;
	pages.HomePage homePage;
	pages.AuthPage authPage;
	pages.Form formPage;
	
	@BeforeMethod
	public void startUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1024, 768));
		homePage = new HomePage(driver);
		authPage = new AuthPage(driver);
		formPage = new Form(driver);
		driver.navigate().to("http://automationpractice.com/index.php");
		homePage.clickOnSignin();
	}

    @AfterClass
	public void Endsession() {
		driver.quit();
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}

	
	@Test
	public void formValidation() {
		authPage.typeInEmail("kkLLLLxx@xxxxx.com");
		Assert.assertEquals(formPage.validationText(), "YOUR PERSONAL INFORMATION");

	}


@Test
	public void happyScenario() {
	    authPage.typeInEmail("lllllkxxxjhkg@xxxxx.com");
		formPage.clickOnMr();
		formPage.insertInfo1("Laila", "Mansour", "123456");
		formPage.Checkboxed();
		formPage.insertInfo2("Laila","Mansour","NewCairo","Vodafone","Katamya");
		formPage.insertAddressDetails("Cairo", "11355", "01122122121", "NewCairo2","01155555555");
		formPage.DropDownList();
		formPage.ClickRegister();
}

   //@Test
	public void InvalidMail(){
	authPage.typeInEmail("xxxxxx");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Assert.assertEquals(authPage.validationAlert(),"Invalid email address.");


}

}

