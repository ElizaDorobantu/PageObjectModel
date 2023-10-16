package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavascriptExecutorTemaCurs31 extends BaseTest{

	@Test
	public void navigareBlog() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String javascriptHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obiect);";
		jse.executeScript(javascriptHover,app.returnElement(app.menu.blogLink));
		
		jse.executeScript("arguments[0].click()",driver.findElement(app.menu.postFormats));
			
		//scroll to element with JS Executor
		jse.executeScript("arguments[0].scrollIntoView();",app.returnElement(app.postFormat.galleryFormat));
		jse.executeScript("window.scrollBy(0,-100)");
		
		jse.executeScript("arguments[0].click()",driver.findElement(app.postFormat.galleryFormat));
		
		jse.executeScript("arguments[0].scrollIntoView();",app.returnElement(app.galleryFormatPage.addComment));
		jse.executeScript("window.scrollBy(0,-100)");
		
		//alternativa sendKeys()
		
		WebElement comment = driver.findElement(app.galleryFormatPage.comment);
		jse.executeScript("arguments[0].click()",comment);
		jse.executeScript("arguments[0].value='comentariul meu'",comment);
		
    	WebElement name = driver.findElement(app.galleryFormatPage.name);
		jse.executeScript("arguments[0].click()",name);
		jse.executeScript("arguments[0].value='numele meu'",name);
		
		WebElement email = driver.findElement(app.galleryFormatPage.email);
		jse.executeScript("arguments[0].click()",email);
		jse.executeScript("arguments[0].value='adresa@mea.com'",email);
		
		WebElement postCommentButton = driver.findElement(app.galleryFormatPage.postCommentButton);
		jse.executeScript("arguments[0].click()",postCommentButton);
		Thread.sleep(3000);
		
		//alternativa pentru isDisplayed()
		String exempluIsDisplayed = jse.executeScript("return document.getElementsByClassName('comment_not_approved')[0].checkVisibility();").toString();
		System.out.println("isDisplayed : " + exempluIsDisplayed);
		
		//assertEquals(app.returnElement(app.galleryFormatPage.commentText).getText(), "Your comment is awaiting moderation.");
 	}
}
