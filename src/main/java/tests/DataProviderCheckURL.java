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

		app.click(By.xpath("//a[text()='"+numeCarte+"']"));

        assertEquals(driver.getCurrentUrl(), URLCarte);

        app.click(app.menu.homeLink);
		
		
	}

}
