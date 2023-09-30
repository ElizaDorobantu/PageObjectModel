package tests;

import pages.MenuPage;
import utils.BaseTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TemaCurs26 extends BaseTest{
	
	//@Test
	public void verificare1() {
		app.menu.hoverElement(app.menu.blogLink);
		app.click(app.menu.blogClassic);
		app.sendKeys(app.classicPage.searchField, "Why I won't stop buying books");
		app.click(app.classicPage.searchButton);
		app.click(app.whyIWontStopBuyingBooksPage.clickToPage);
		assertTrue(driver.findElement(app.whyIWontStopBuyingBooksPage.categoryClassic).isDisplayed());
		assertTrue(driver.findElement(app.whyIWontStopBuyingBooksPage.categoryNews).isDisplayed());
		assertTrue(driver.findElement(app.whyIWontStopBuyingBooksPage.categoryRecommend).isDisplayed());
	}
	
	@Test
	public void verificare2() {
		app.click(app.menu.shopLink);
		app.click(app.shop.cookbooksCategory);	
		////span[text()='Sale!']
	}
	
	

}
