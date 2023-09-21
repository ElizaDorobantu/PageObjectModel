package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	
	public WebDriver driver;
	
	public ShippingAddressPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public By countrydropdown = By.id("shipping_country");
	public By provincedropdown = By.id("shipping_state");
	
	public void navigateToShippingAdressePage() {
		driver.get("https://keybooks.ro/account/edit-address/shipping/");
	}
	
	public void selectByIndex(int index, By locator) {
		WebElement dropdown = driver.findElement(locator);
		
		Select select = new Select(dropdown);
		select.selectByIndex(index);	
	}
	
	public void selectByValue(String value, By locator) {
	
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public String getSelectedOption(By locator) {
		WebElement dropdown =driver.findElement(locator);
		Select select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
}
