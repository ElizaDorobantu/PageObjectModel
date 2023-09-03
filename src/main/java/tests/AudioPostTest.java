package tests;

import java.awt.Menu;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AudioPostPage;
import pages.MenuPage;
import pages.PostFormatsPage;
import utils.BaseTest;

public class AudioPostTest extends BaseTest{
	
	@Test
	public void moveSlider() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		menu.navigateTo(menu.postFormats);
		
		PostFormatsPage postFormats = new PostFormatsPage(driver);
		postFormats.navigateTo(postFormats.audioPost);
		
		AudioPostPage audioPost = new AudioPostPage(driver);
		audioPost.navigateTo(audioPost.playButton);
		audioPost.dragAndDropSlider(audioPost.sliderMusic, 20,0);
		audioPost.dragAndDropSlider(audioPost.volumeSlider, 50, 0);
		
	}

}
