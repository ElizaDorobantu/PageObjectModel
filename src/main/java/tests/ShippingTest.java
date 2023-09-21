package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import pages.ShippingAddressPage;
import utils.BaseTest;

public class ShippingTest extends BaseTest{
	
	@Test
	public void selectBy() throws InterruptedException {
		app.click(app.menu.loginLink);
		app.login.loginInApp("TestUser", "12345@67890");
		
		/*MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(app.login.logoutButton));
		//Thread.sleep(10);
		
		//assertTrue(app.login.checkLoginMessageIsDisplayed(app.login.successLoginPopup));
		
		app.shippingAddress.navigateToShippingAdressePage();
		
		/*ShippingAddressPage shippingAddresse = new ShippingAddressPage(driver);
		shippingAddresse.navigateToShippingAdressePage();*/
		
		app.shippingAddress.selectByIndex(41,app.shippingAddress.countrydropdown);
		assertEquals(app.shippingAddress.getSelectedOption(app.shippingAddress.countrydropdown), "Canada");
		
		app.shippingAddress.selectByValue("NL", app.shippingAddress.provincedropdown);
		assertEquals(app.shippingAddress.getSelectedOption(app.shippingAddress.provincedropdown), "Newfoundland and Labrador");
		
		
	}

}
