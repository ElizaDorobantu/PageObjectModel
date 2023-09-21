package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleAuthorPage {
	
	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/*public By drama = By.xpath("//div[@data-stop='95']");
	public By biography = By.xpath("//div[@data-stop='75']");	
	public By cookbooks = By.xpath("//div[@data-stop='82']");*/
	
	
	public By drama = By.xpath("(//div[@class = 'sc_skills_total'])[1]");
	public By biography = By.xpath("(//div[@class = 'sc_skills_total'])[2]");
	public By cookbooks = By.xpath("(//div[@class = 'sc_skills_total'])[3]");
	
	public boolean getFieldValue(By locator, String percentage) {

	     WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, percentage));
	     return driver.findElement(locator).isDisplayed();
	     }
}
