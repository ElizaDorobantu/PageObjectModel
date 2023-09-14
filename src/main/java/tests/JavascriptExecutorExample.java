package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutorExample extends BaseTest{
	
	@Test
	public void example1() {
		//navigate to URL
		//selenium
		//driver.get("<URL");
		//echivalent cu 
		//driver.navigate().to("URL");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location='http://emag.ro'");
		
		//driver.navigate().back();
		//echivalent cu
		jse.executeScript("window.history.go(-1)");
		
		
		//driver.navigate().forward();
				//echivalent cu
		jse.executeScript("window.history.forward()");
		
		//1
		driver.navigate().refresh();
		//2
		jse.executeScript("window.history.go(0)");
		//3
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		//4
		driver.get(driver.getCurrentUrl());
	}
	
	@Test
	public void example2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		
		//alternativa click()
		jse.executeScript("arguments[0].click()",searchIcon);
		WebElement searchInput = driver.findElement(app.menu.searchInput);
		
		//alternativa sendKeys()
		jse.executeScript("arguments[0].value='cooking'",searchInput);
		jse.executeScript("arguments[0].click()",searchIcon);
		
//		jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
//		jse.executeScript("arguments[0].value='cooking'", app.returnElement(app.menu.searchInput));
//		jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
	}
}
				
			
