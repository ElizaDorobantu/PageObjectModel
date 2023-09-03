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
	
	
	public By countrydropdown = By.cssSelector("span[class*='select2-dropdown']");
	//ul[class='select2-results__options']
	
	public void navigateToShippingAdressePage() {
		driver.get("https://keybooks.ro/account/edit-address/shipping/");
	}
	
	public void selectByIndex(int index) {
		WebElement dropdown = driver.findElement(countrydropdown);
		
		Select select = new Select(dropdown);
		select.selectByIndex(index);	
	}
	
	public void selectByValue(String value) {
	
		WebElement dropdown = driver.findElement(countrydropdown);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
}
