package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BookTemplate extends SeleniumWrappers{

	public WebDriver driver;
	
	public BookTemplate(WebDriver driver) {
		this.driver = driver;
	}
	
	public By categories = By.cssSelector("span[class='posted_in']>a");
	public By productId = By.cssSelector("span[class='product_id']>span");
}
