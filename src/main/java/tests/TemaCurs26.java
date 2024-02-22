package tests;

import pages.MenuPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
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
	
	//@Test
	public void verificare2() {
		app.click(app.menu.shopLink);
		app.click(app.shop.cookbooksCategory);	
		List<WebElement> cartiAfisate = driver.findElements(By.xpath("//a[@class='hover_icon hover_icon_link']"));
		cartiAfisate.size();
		List<WebElement> cartiLaReducere = driver.findElements(By.xpath("//span[text()='Sale!']"));
		//for (WebElement element : cartiAfisate) {
		if(cartiAfisate.size()== cartiLaReducere.size()) {
			System.out.println("Toate cartile sunt la reducere!");
		}
		else {
			System.out.println("Nu toate cartile sunt la reducere!");
		}
		
	}
	
	 @Test
     public void verificare2_1() {
	    app.click(app.menu.shopLink);
	    app.click(app.shop.cookbooksCategory);
	    List<WebElement> cartiAfisate = driver.findElements(By.xpath("//a[@class='hover_icon hover_icon_link']"));
	    for(int i = 1; i <= cartiAfisate.size(); i++) {
	       WebElement saleImage = driver.findElement(By.xpath("(//a[@class='hover_icon hover_icon_link']/span)["+i+"]"));
	       assertTrue(saleImage.isDisplayed());
	    }
	}
	

}
