package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver_parametru) {
		this.driver=driver_parametru;
		
	}
	
	//clasa poate sa contina locatori sau webelements
	//WebElement buton = driver.findElement(By.ceva(""));
	public By homeLink = By.linkText("HOME");//obiect de tip care imi tine locatorul. Echivalent cu linia17
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By shopLink = By.linkText("BOOKS");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By singleAuthourLink = By.linkText("SINGLE AUTHOR");
	
	public By postFormats = By.xpath("//li[@id='menu-item-232']//a");
	
	//metode specifice cu locatorii sau elementele de mai sus
	//metode specifice=functionalitate a paginii in care ma aflu
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void hoverElement(By locator) {
		
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
}
