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
	}
	
	
	
}
