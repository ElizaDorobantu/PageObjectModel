package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;

public class WhyIWontStopBuyingBooksPage extends BaseTest{

	public WebDriver driver;
	public WhyIWontStopBuyingBooksPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By clickToPage = By.xpath("(//a[text()='Why I won’t stop buying books'])[1]");
	public By categoryClassic = By.xpath("//span//a[text()='Classic']");
	public By categoryNews = By.xpath("//span//a[text()='News']");
	public By categoryRecommend = By.xpath("//span//a[text()='Recommend']");
	
	
	
}
