package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{

	@Parameters({"user","pass"})
	@Test(priority=1, groups = "LoginFunctionality")
	public void validLoginTest(String username, String password) {
		MenuPage menu = new MenuPage(driver) ;
		//menu.navigateTo(menu.contactLink);
		//menu.navigateTo(menu.homeLink);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username, password);
		//assertTrue(driver.findElement(login.successLoginPopup).isDisplayed());
		assertTrue(login.checkLoginMessageIsDisplayed(login.successLoginPopup));
		login.logoutFromApp();
	}
	
	@Parameters({"invUser","invPass"})
	@Test(priority=2, groups = "LoginFunctionality")
	public void invalidLoginTest(String invalidUser, String invalidPass) {
		MenuPage menu = new MenuPage(driver) ;
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(invalidUser, invalidPass);
		assertTrue(login.checkLoginMessageIsDisplayed(login.errorLoginPopup));
		
	}
	
	
	
	
}
