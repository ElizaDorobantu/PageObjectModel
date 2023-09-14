package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;
import java.util.ArrayList;
import java.util.List;

public class WindowHandleTest extends BaseTest{
	
	@Test
	public void windowHandleTest() {
//		app.menu.navigateTo(app.menu.eventsLink);
//		app.events.clickOnEvent(app.events.timeForBookLink);
		
		app.click(app.menu.eventsLink);
		app.click(app.events.timeForBookLink);
		
		System.out.println("Current window: "+driver.getWindowHandle());
		app.scrollByPixels(0, 800);
		app.singleEvent.clickMap();
	
		System.out.println("Current window after tab is opened: "+driver.getWindowHandle());
		List <String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("Get all active sessions: "+browserTabs);
		driver.switchTo().window(browserTabs.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Accept all'])[1]")).click();
		driver.close();
	}

}
