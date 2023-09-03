package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import pages.ShippingAddressPage;
import utils.BaseTest;

public class ShippingTest extends BaseTest{
	
	@Test
	public void selectBy() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		
		Thread.sleep(10);
		assertTrue(login.checkLoginMessageIsDisplayed(login.successLoginPopup));
		
		ShippingAddressPage shippingAddresse = new ShippingAddressPage(driver);
		shippingAddresse.navigateToShippingAdressePage();
		driver.findElement(By.cssSelector("span[class*='select2-selection']")).click();
		shippingAddresse.selectByIndex(40);
		Thread.sleep(10);
	}

}
