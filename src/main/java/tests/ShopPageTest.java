package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.MenuPage;
import utils.BaseTest;

public class ShopPageTest extends BaseTest{
	
	@Test
	public void checkElements() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		WebElement itsAReallyStrangeStoryBook = driver.findElement(
				By.xpath("//a[text()='It’s a really strange story']"));
		itsAReallyStrangeStoryBook.click();
		
		WebElement search = driver.findElement(
				By.xpath("//a[@class='woocommerce-product-gallery__trigger']"));
		assertTrue(search.isDisplayed());
		
		WebElement title = driver.findElement(By.xpath("//h1[@class='product_title entry-title']"));
		assertTrue(title.isDisplayed());
		
		WebElement price = driver.findElement(By.xpath("//p[@class='price']//bdi[text()='20.55']"));
		assertTrue(price.isDisplayed());
		
		WebElement description = driver.findElement(
				By.xpath("//div[@class='woocommerce-product-details__short-description']"));
		assertTrue(description.isDisplayed());
		
		WebElement quantity = driver.findElement(By.xpath("//input[@class='input-text qty text']"));
		assertTrue(quantity.isDisplayed());
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
		assertTrue(addToCart.isDisplayed());
		
		WebElement textBellowAddToCart = driver.findElement(By.xpath("//span[@class='posted_in']"));
		assertTrue(textBellowAddToCart.isDisplayed());
		
		//WebElement stars = driver.findElement(By.xpath("//div[@class='woocommerce-product-rating']"));
		//assertTrue(stars.isDisplayed());
		
		//am comentat deoarece cartea aleasa nu are stele afisate 
		
	}

}
