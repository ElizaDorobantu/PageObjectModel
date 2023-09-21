package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.SingleAuthorPage;
import utils.BaseTest;

public class SingleAuthorTest extends BaseTest{
	
	//@Test
	public void checkSkills() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthourLink);
		
		SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
		
		assertTrue(singleAuthor.getFieldValue(singleAuthor.drama,"95%"));
		assertTrue(singleAuthor.getFieldValue(singleAuthor.biography,"75%"));
		assertTrue(singleAuthor.getFieldValue(singleAuthor.cookbooks,"82%"));
		
		//WebDriverWait wait = WebDriverWait(driver.Duration.ofSeconds(10));
		//assertEquals(app.getElementText(singleAuthor.drama));
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(singleAuthor.drama,"95%");
	}
	
	@Test
	public void checkSkills2() throws InterruptedException {
		//app.menu.navigateTo(app.menu.singleAuthourLink);
		app.click(app.menu.singleAuthourLink);
		
		WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		/*assertTrue(app.singleAuthor.getFieldValue(app.singleAuthor.drama,"95%"));
		assertTrue(app.singleAuthor.getFieldValue(app.singleAuthor.biography,"75%"));
		assertTrue(app.singleAuthor.getFieldValue(app.singleAuthor.cookbooks,"82%"));*/
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(app.singleAuthor.drama,"95%"));
		assertEquals(app.getElementText(app.singleAuthor.drama),"95%");
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(app.singleAuthor.biography,"75%"));
		assertEquals(app.getElementText(app.singleAuthor.biography),"75%");
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(app.singleAuthor.cookbooks,"82%"));
		assertEquals(app.getElementText(app.singleAuthor.cookbooks),"82%");
		
	}

}
