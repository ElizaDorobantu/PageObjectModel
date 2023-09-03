package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsOnAnyBookPage{
	
	public WebDriver driver;
	
	public ElementsOnAnyBookPage(WebDriver driver) {
		this.driver = driver;
	}

	public By search = By.xpath("//a[@class='woocommerce-product-gallery__trigger']");
	public By title = By.xpath("//h1[@class='product_title entry-title']");
	public By price = By.xpath("//p[@class='price']//span[@class='woocommerce-Price-currencySymbol']");
	public By description = By.xpath("//div[@class='woocommerce-product-details__short-description']");
	public By quantity = By.xpath("//input[@class='input-text qty text']");
	public By addToCart = By.xpath("//button[@name='add-to-cart']");
	public By textBellowAddToCart = By.xpath("//span[@class='posted_in']");
	public By stars = By.xpath("//div[@class='woocommerce-product-rating']");

	public void elementIsDisplayed(By locator) {
		assertTrue(driver.findElement(locator).isDisplayed());
	}
}
