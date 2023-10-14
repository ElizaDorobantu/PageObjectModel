package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs28 extends BaseTest{
	
//	@Test(priority=2)
//	public void redirectFacebook1() throws InterruptedException {
//		app.click(app.menu.homeLink);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement facebookLink = driver.findElement(app.menu.facebookLink);
//		js.executeScript("arguments[0].click()", facebookLink);
//		
//		List <String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(browserTabs.get(1));
//		driver.findElement(By.xpath(" //div[ @tabindex='0'] //span[text()='Allow all cookies']")).click();
//		assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/keytraining.ro");
//		app.tearDown();
//	}
//
//	@Test(priority=3)
//	public void redirectTwitter() throws InterruptedException {
//		app.setup("https://keybooks.ro/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement twitterLink = driver.findElement(app.menu.twitterLink);
//		js.executeScript("arguments[0].click()", twitterLink);
//		List <String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(browserTabs.get(1));
//		assertEquals(driver.getCurrentUrl(), "https://twitter.com/");
//		app.tearDown();
//	}
//	
//	@Test(priority=4)
//	public void redirectInstagram() throws InterruptedException {
//		app.setup("https://keybooks.ro/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement instagramLink = driver.findElement(app.menu.instagramLink);
//		js.executeScript("arguments[0].click()", instagramLink);
//		List <String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(browserTabs.get(1));
//		assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/");
//		app.tearDown();
//	}
//	
	@Test(priority=1)
    public void redirectFacebook() throws InterruptedException {
          app.click(app.menu.homeLink);
          WebElement facebookLink = driver.findElement(app.menu.facebookLink);
          WebElement twitterLink = driver.findElement(app.menu.twitterLink);
          WebElement instagramLink = driver.findElement(app.menu.instagramLink);  
          WebElement[] socials =  {facebookLink, twitterLink, instagramLink};
          String[] expectedURLs = {"https://www.facebook.com/keytraining.ro", 
        		  "https://twitter.com/", "https://www.instagram.com/" };
          for(int i=0; i<socials.length; i++) {
               socials[i].click();
               List <String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
               driver.switchTo().window(browserTabs.get(1));
               assertEquals(driver.getCurrentUrl(), expectedURLs[i]);
               driver.close();
               driver.switchTo().window(browserTabs.get(0));
          }
    }
}


