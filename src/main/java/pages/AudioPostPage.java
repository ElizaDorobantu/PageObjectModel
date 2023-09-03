package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AudioPostPage {

	public WebDriver driver ;
	
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By playButton = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
	public By sliderMusic = By.xpath("//span[@class='mejs-time-total mejs-time-slider']");
	public By volumeSlider = By.xpath("//a[@class='mejs-horizontal-volume-slider']");
	
	public void dragAndDropSlider(By locator, int x,int y) {
		WebElement element = driver.findElement(locator);
		element.click();
		Actions actiune = new Actions(driver);
		actiune.moveToElement(element).clickAndHold(element).moveByOffset(x,y).release().perform();
		
	}
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
}
