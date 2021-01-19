package com.automationpractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AuthPage;
import pages.Form;
import pages.HomePage;
import sun.rmi.runtime.NewThreadAction;

public class signUp {
	
	WebDriver driver;
	pages.HomePage homePage;
	pages.AuthPage authPage;
	pages.Form formPage;
	
	@BeforeClass
	public void startUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		homePage = new HomePage(driver);
		authPage = new AuthPage(driver);
		formPage = new Form(driver);
		
		homePage.clickOnSignin();
		authPage.typeInEmail("xxxxx@xxxx.com");
	}

	
	@Test
	public void formValidation() {
		Assert.assertEquals(formPage.validationText(), "YOUR PERSONAL INFORMATION");
	}

	
@Test
	public void happyScenario() {
		formPage.clickOnMr();
		formPage.insertInfo1("Laila", "Mansour", "123456");
		formPage.Checkboxed();
		formPage.insertInfo2("Laila","Mansour","NewCairo","Vodafone","Katamya");
		formPage.insertAddressDetails("Cairo", "11355", "01122122121", "NewCairo2","01155555555");
		formPage.DropDownList();
		formPage.ClickRegister();
}

@Test
	public void ValidatAddressName(){
		String FirstName1 = "Laila";
	formPage.insertInfo1(FirstName1, "Mansour", "123456");
	Assert.assertEquals(formPage.ValidateAddressName(),FirstName1);

}

}

