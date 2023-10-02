package tests;

import static org.testng.Assert.assertEquals;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class DropdownTest extends BaseTest{

	@Test(priority=1, groups = "ProductFunctionality")
	public void selectByValueTest() throws InterruptedException{
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByValue("price-desc");
		//Thread.sleep(3000);
		assertEquals(shop.getSelectedOption(), "Sort by price: high to low");
	}
	
	@Test(priority=2, groups = "ProductFunctionality")
	public void selectByVisibleTextTest() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByVisibleText("Sort by popularity");
		//Thread.sleep(3000);
		assertEquals(shop.getSelectedOption(), "Sort by popularity");

	}
	
	@Test(priority=3, groups = "ProductFunctionality")
	public void selectByIndexTest() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByIndex(3);
		//Thread.sleep(3000);
		assertEquals(shop.getSelectedOption(), "Sort by latest");

	}
	
	@Test(priority=4, groups = "ProductFunctionality")
	public void examplaStaleElementException() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		//identific webelement cu nume dropdown pe current browser Edge cu session id xx
		WebElement dropdown = driver.findElement(By.name("orderby"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);//merge fara probleme
		//refresh
		//dupa refresh selenium isi ia alt session id
		//foloseste element dar selenium nu il poate asocia cu noul session id
		//el asociaza elementul cu vechiul session id
		//si arunca exceptie StaleElement
		dropdown = driver.findElement(By.name("orderby"));
		select = new Select(dropdown);

		select.selectByVisibleText("Sort by latest");
	}
	
	
}
