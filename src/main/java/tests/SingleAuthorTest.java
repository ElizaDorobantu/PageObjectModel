package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.MenuPage;
import pages.SingleAuthorPage;
import utils.BaseTest;

public class SingleAuthorTest extends BaseTest{
	
	@Test
	public void checkSkills() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthourLink);
		
		SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
		Thread.sleep(2000);
		assertEquals(singleAuthor.getFieldValue(singleAuthor.drama),"95%");
		assertEquals(singleAuthor.getFieldValue(singleAuthor.biography),"75%");
		assertEquals(singleAuthor.getFieldValue(singleAuthor.cookbooks),"82%");
	}

}
