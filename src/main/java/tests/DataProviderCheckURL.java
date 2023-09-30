package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.DataProviderClass;

public class DataProviderCheckURL extends BaseTest{
	
	@Test(dataProviderClass = DataProviderClass.class,dataProvider="booksURLDataProvider")
	public void checkURL(String numeCarte, String URLCarte) throws InterruptedException {

		
		////div[@aria-hidden='false'] //a[text()='Storm']

		WebElement element = driver.findElement(
				By.xpath("//div[@aria-hidden='false'] //a[text()='"+numeCarte+"']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		System.out.println(driver.getCurrentUrl());
		assertEquals(driver.getCurrentUrl(), URLCarte);
		WebElement initialPage = driver.findElement(By.xpath("//img[@class='logo_fixed']"));
		initialPage.click();
		
		
	}

}
