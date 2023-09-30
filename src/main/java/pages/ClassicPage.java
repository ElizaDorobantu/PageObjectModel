package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;


public class ClassicPage extends BaseTest{
	
	public WebDriver driver;
	
	public ClassicPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By searchField= By.xpath("//aside[@id='search-2']//input[@class='search_field']");
	public By searchButton = By.xpath("//button[@class='search_button icon-search']");
}
