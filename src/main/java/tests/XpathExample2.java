package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest{
	
	@Test
	public void xpathExample() {
		
		//parent
		//-->//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
				
		WebElement loginMenu = driver.findElement(
				By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", loginMenu);
		loginMenu.click();
		
		//descendent & child
		//-->//ul[@id='menu_user']//div[contains(@class, 'login_field')]/input[@id='log']
		
		// daca pun element/element => e direct child
		// daca pun element//element => e child dar nu direct(e descentdent)
		
		//-->//ul[@id='menu_user']//input[@id='log']
		//-->//ul[@id='menu_user']/descendant::form[contains(@class,'login_form')]/child::div[contains(@class, 'login_field')]/child::input
		//liniile 2 de mai sus sunt echivalente
		
		//-->//ul//input[@id='log']
		//echivelente cu linia de mai sus care e cea mai optimizata
		
		//descendant e folosit cand vreau sa sar mai multi copii
		//child cand vreau sa folosesc direc child
		
		WebElement usernameField = driver.findElement(
				By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class,'login_form')]/child::div[contains(@class, 'login_field')]/child::input"));
		usernameField.sendKeys("TestUser");
		
		//descendant
		WebElement passwordField =  driver.findElement(By.xpath("//ul/descendant::input[@id='password']"));
		passwordField.sendKeys("12345@67890");
		
		//following-sibling = frati pe ierarhie gen pe divuri pt a cobori pe urmatorul frate
		//preceding-sibling = frati pe ierarhie gen pe divuri pt a urca pe urmatorul frate
		
		WebElement rememberMe =driver.findElement(
				By.xpath("//ul//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/input"));
		rememberMe.click();
		
		//--> //ul//div[contains(@class, 'remember_field')]/preceding-sibling::div[contains(@class, 'login_field')]
		
		//-->//div[@class='top_panel_middle']/preceding::input[@class='submit_button']
		//preceding -> urca in dom fara a avea nevoie de o relatie de rudenie
		
		//following ->coboara in dom fara a avea nevoie de o relatie de rudenie
		
		WebElement submitButton= driver.findElement(By.xpath("//div[@class='top_panel_middle']/preceding::input[@class='submit_button']"));
		submitButton.click();
		
	}

}
