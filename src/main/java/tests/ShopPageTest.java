package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ElementsOnAnyBookPage;
import pages.MenuPage;
import utils.BaseTest;

public class ShopPageTest extends BaseTest{
	
	@Test
	public void checkElements() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
//		WebElement itsAReallyStrangeStoryBook = driver.findElement(
//				By.xpath("//a[text()='It’s a really strange story']"));
		WebElement itsAReallyStrangeStoryBook = driver.findElement(
				By.xpath("//a[text()='New galaxy']"));
		
		itsAReallyStrangeStoryBook.click();
		
		ElementsOnAnyBookPage book = new ElementsOnAnyBookPage(driver);
		
		book.elementIsDisplayed(book.search);
		book.elementIsDisplayed(book.title);
		book.elementIsDisplayed(book.price);		
		book.elementIsDisplayed(book.description);
		book.elementIsDisplayed(book.quantity);
		book.elementIsDisplayed(book.addToCart);
		book.elementIsDisplayed(book.textBellowAddToCart);
		

		book.elementIsDisplayed(book.stars);
		
		
	}

}
