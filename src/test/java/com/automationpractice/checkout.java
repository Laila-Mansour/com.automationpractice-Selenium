package com.automationpractice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;
//import sun.rmi.runtime.NewThreadAction;

public class checkout {
	
	WebDriver driver;
	HomePage homePage;
	AuthPage authPage;
	Form formPage;
	AccountPage accountPage;
	CategoriesPage categoriesPage;
	CheckoutPage checkoutPage;
	
	@BeforeMethod
	public void startUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1024, 768));
		homePage = new HomePage(driver);
		authPage = new AuthPage(driver);
		formPage = new Form(driver);
		accountPage = new AccountPage(driver);
		categoriesPage = new CategoriesPage(driver);
		checkoutPage = new CheckoutPage(driver);
		driver.navigate().to("http://automationpractice.com/index.php");
		homePage.clickOnSignin();
		authPage.typeSignin("xxxjhg@xxxxx.com","123456");

	}

    @AfterMethod
	public void EndSession() {
		driver.quit();

	}

	
	@Test
	public void selectBlousesSubcategoryandAddProductToTheCart() {
		accountPage.clickOnWomenCategory();
		categoriesPage.clickOnTopsCategory();
		categoriesPage.clickOnBlousesCategory();
		categoriesPage.clickOnBlousesProduct();
		categoriesPage.clickOnAddToCartButton();
	}
   @Test(dependsOnMethods = {"selectBlousesSubcategoryandAddProductToTheCart"})
   public void followCheckoutProcedure() {
	   driver.navigate().to("http://automationpractice.com/index.php");
	   homePage.clickOnCartBtn();
	   checkoutPage.clickOnSummaryProceedToCheckoutBtn();
	   checkoutPage.clickOnAddressProceedToCheckoutBtn2();
	   checkoutPage.clickOnAgreeCheckbox();
	   checkoutPage.clickOnShippingProceedToCheckoutBtn3();
	   checkoutPage.clickOnPayByBankWire();
	   checkoutPage.clickOnConfirmOrderBtn();
   }
    @Test
	public void ValidateOrderAasPlaced() {
		driver.navigate().to("http://automationpractice.com/index.php?controller=history");
		 By OrderDetails = By.xpath("//*[@class='first_item ']");
		 String FirstItemDetails = driver.findElement(OrderDetails).getText();
		 System.out.println(FirstItemDetails);
		 Assert.assertNotEquals(FirstItemDetails,"");


	}





}

