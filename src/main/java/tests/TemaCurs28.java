package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs28 extends BaseTest{
	
	@Test
	public void redirectFacebook() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement facebookLink = driver.findElement(app.menu.facebookLink);
		js.executeScript("arguments[0].click()", facebookLink);
		
		List <String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		driver.findElement(By.xpath(" //div[ @tabindex='0'] //span[text()='Allow all cookies']")).click();
		driver.close();
	}

	@Test
	public void redirectTwitter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement twitterLink = driver.findElement(app.menu.twitterLink);
		js.executeScript("arguments[0].click()", twitterLink);
	}
}
