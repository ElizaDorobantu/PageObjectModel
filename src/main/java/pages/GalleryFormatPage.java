package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;

public class GalleryFormatPage extends BaseTest{

public WebDriver driver ;
	
	public GalleryFormatPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By addComment = By.xpath("//h2[text()='Add Comment']");
	public By comment = By.cssSelector("textarea[id='comment']");
	public By name = By.cssSelector("input[id='author']");
	public By email = By.cssSelector("input[id='email']");
	public By postCommentButton = By.xpath("//input[@value='Post Comment']");
}
