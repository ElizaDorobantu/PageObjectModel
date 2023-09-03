package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.tethering.model.Accepted;
import org.openqa.selenium.interactions.Actions;

public class PostFormatsPage {

	public WebDriver driver;
	
	public PostFormatsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By audioPost = By.xpath("//h4[@class='post_title']//a[text()='Audio post']");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	
}
