package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs33 extends BaseTest{

	@Test
	public void theWickedKing() {
		app.click(app.menu.searchIcon);
		app.sendKeys(app.menu.searchInput, "King");
		WebElement king = driver.findElement(By.xpath("(//a[contains(@href, 'the-wicked-king')])[1]"));
		king.click();
		assertEquals(app.returnElement(app.bookTemplate.categories).getText(), "New releases");
		assertEquals(app.returnElement(app.bookTemplate.productId).getText(), "1709");
		
		WebElement kingPicture1 = driver.findElement(By.xpath("//a[contains(@href,'TheWickedKing1.png')]"));
		WebElement kingPicture2 = driver.findElement(By.xpath("//a[contains(@href,'TheWickedKing2.png')]"));
		WebElement kingPicture3 = driver.findElement(By.xpath("//a[contains(@href,'TheWickedKing3.png')]"));
		WebElement kingPicture4 = driver.findElement(By.xpath("//a[contains(@href,'TheWickedKing4.png')]"));
		
		kingPicture1.isDisplayed();
		kingPicture2.isDisplayed();
		kingPicture3.isDisplayed();
		kingPicture4.isDisplayed();
		
	}
	
	
	
}
