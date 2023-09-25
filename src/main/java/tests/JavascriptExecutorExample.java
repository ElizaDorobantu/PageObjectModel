package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutorExample extends BaseTest{
	
	//@Test
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
	
	//@Test
	public void example2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		
		//alternativa click()
		//jse.executeScript("arguments[0].click()",searchIcon);
		//WebElement searchInput = driver.findElement(app.menu.searchInput);
		
		//alternativa sendKeys()
		//jse.executeScript("arguments[0].value='cooking'",searchInput);
		//jse.executeScript("arguments[0].click()",searchIcon);
		
//		jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
//		jse.executeScript("arguments[0].value='cooking'", app.returnElement(app.menu.searchInput));
//		jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
	
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		
		/*jse.executeScript("document.getElementsByClassName('icon-search')[0].click();" 
				+ "document.getElementsByClassName('search_field')[0].value='cooking';" 
				+ "document.getElementsByClassName('icon-search')[0].click()");
		o singura comanda pt liniile 62,63,64
				*/
		
		//alternativa pentru isDisplayed()
		String exempluIsDisplayed = jse.executeScript("return document.getElementsByClassName('post_title')[0].checkVisibility();").toString();
		System.out.println("isDisplayed : " + exempluIsDisplayed);
	
		//alternativa pentru getText()
		String exempluGetText = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText;").toString();
		System.out.println("getText : " + exempluGetText);
		
		//alternativa pentru getTitle()
		String exempluGetPageTitle = jse.executeScript("return document.title;").toString();
		System.out.println("getTitle : " + exempluGetPageTitle);
		
		//alternativa pentru getCurrentUrl()
		String exempluGetCurrentUrl = jse.executeScript("return document.URL;").toString();
		System.out.println("getCurrentUrl : " + exempluGetCurrentUrl);
		
		jse.executeScript("document.getElementsByClassName('popup_login_link')[0].click;");
		
		//alternativa pt IsSelected din Selenium
		String exempluIsSelected = jse.executeScript("return document.getElementsByName(\"rememberme\")[0].checked;").toString();
		System.out.println("is Selected: "+ exempluIsSelected);
		boolean value = Boolean.valueOf(exempluIsSelected);
		assertFalse(value);
		
		//alternativa pentru isEnabled()
		String exempluisEnabled = jse.executeScript("return document.getElementsByName('pwd')[0].disabled").toString();
		System.out.println("isEnabled: " + exempluisEnabled);
	}
	
	@Test
	public void example3() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println(driver.getTitle());
		
		jse.executeScript("window.schimbTitlulPaginii = function(){document.title = 'Alt titlu!'};"
				+"window.schimbTitlulPaginii.call();");
		System.out.println("Dupa functia JS: " + driver.getTitle());
		

	//alternativa pentru hover
		String javascriptHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obiect);";
		jse.executeScript(javascriptHover,app.returnElement(app.menu.blogLink));
		jse.executeScript(javascriptHover,app.returnElement(app.menu.aboutLink));
		
	}
}
				
			
