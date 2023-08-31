package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{
	
	@Test(priority=1)
	public void hoverExample() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.aboutLink);
		menu.hoverElement(menu.blogLink);
		menu.hoverElement(menu.shopLink);
	}
	
	@Test(priority=2)
	public void dragAndDropExample() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1200)");
		ShopPage shop = new ShopPage(driver);
		shop.dragAndDropSlider(shop.priceSliderInitialPosition, 100, 0);
	}

}