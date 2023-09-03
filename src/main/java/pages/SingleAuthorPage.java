package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleAuthorPage {
	
	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By drama = By.cssSelector("div[class='sc_skills_total'][data-duration='1900']");
	public By biography = By.cssSelector("div[class='sc_skills_total'][data-duration='2175']");
	public By cookbooks = By.xpath("div[class='sc_skills_total'][data-duration='3280']");
	
	public String getFieldValue(By locator) {
		return driver.findElement(locator).getText();
	}
}
