package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;
import pages.MenuPage;

public class XpathExample3 extends BaseTest{
	
	@Test
	public void xpathExample() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		MenuPage menu =new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		//-->//bdi[contains(text(), '20.55')]
		//-->//span[@class='price']/span[bdi='$14.99']
		
		//scroll down 1200
		jse.executeScript("window.scrollBy(0,1200)");
		
		WebElement price14_99 = driver.findElement(
				By.xpath("//span[@class='price']/span[bdi='$14.99']"));
		
		//scroll to element
		//jse.executeScript("arguments[0].scrollIntoView", price14_99);
		
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", price14_99);
		
		
		//bdi[contains(text(), '10.35')]/../../../del/child::*/bdi
		//caut in tagul bdi ce contine 10.35, urc 3 parinti apoi cobor pe del si de la del caut
		//orice copil cu tagul bdi, nu neaparat primul copil, dar primul copil de tag bdi 
		//  .. merge inapoi un nivel(urca pe parinte)
		
		WebElement price11_50 = driver.findElement(
				By.xpath("bdi[contains(text(), '10.35')]/../../../del/child::*/bdi"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", price11_50);
		
		//(//span[@class='price']/span[bdi='$10.20'])[2]/../../div
		// 1. plec de la elementul --> //span[@class='price']
		// 2. cobor pe copilul lui <span> --> //span[@class='price']/span
		// 3. de la span fac o referinta catre copilul lui span <bdi> si valoarea
		// acestui copil --> //span[@class='price']/span[bdi='$10.20']
		// 4. pentru ca acum gasesc 5 elemente si vreau specific elementul 2
		// aleg sa folosesc index --> (//span[@class='price']/span[bdi='$10.20'])[2]
		// 5. dupa ce m-am oprit pe elementul 2 cu index, urc cu .. doua niveluri mai sus
		// adica pe doi parinti --> //(//span[@class='price']/span[bdi='$10.20'])[2]/../..
		// 6. de la ultimul parinte cobor pe copilul <div> -->(//span[@class='price']/span[bdi='$10.20'])[2]/../../div
		// -->(//span[@class='price']/span[bdi='$10.20'])[2]/../preceding-sibling::div[@class='star-rating']
		
		
		//(//span[@class='price']/span[bdi='$10.20'])[2]/../preceding-sibling::div[@class='star-rating']
		// 1. plec de la elementul --> //span[@class='price']
		// 2. cobor pe copilul lui <span> --> //span[@class='price']/span
		// 3. de la span fac o referinta catre copilul lui span <bdi> si valoarea
		// acestui copil --> //span[@class='price']/span[bdi='$10.20']
		// 4. pentru ca acum gasesc 5 elemente si vreau specific elementul 2
		// aleg sa folosesc index --> (//span[@class='price']/span[bdi='$10.20'])[2]
		// 5. urc cu .. un nivel mai sus unde gasesc o relatie de rudenie de tip siblings
		// -->(//span[@class='price']/span[bdi='$10.20'])[2]/..
		// 6. pentru ca vreau sa iau fratele/sora de deasupra elementului unde ma aflu,
		// aleg sa urc cu preceding-sibling pe element
		// -->(//span[@class='price']/span[bdi='$10.20'])[2]/../preceding-sibling::div[@class='star-rating']
		
		//in shop paginile de jos de sub carti 1-2
		
		//xpath --> //ul/li[*>1]
		//gaseste toate paginile care au valoarea mai mare ca 1 ([*>1]) indiferent de tag name ul lor
		//*[text=2
		
		//echivalent cu
		//-->//*[contains(@class, 'page-numbers') and not(contains(text(), '1'))]
		
		//--> //*[self::span or self::a][contains(@class, 'page-numbers') and not(contains(text(), '1') or contains(text(), '→'))]
		
	}

}
