package utils;

import pages.AudioPostPage;
import pages.ContactsPage;
import pages.ElementsOnAnyBookPage;
import pages.EventsPage;
import pages.GalleryFormatPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.PostFormatsPage;
import pages.ShippingAddressPage;
import pages.ShopPage;
import pages.SingleAuthorPage;
import pages.SingleEventPage;

public class BasePage extends SeleniumWrappers{

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public AudioPostPage audioPost = new AudioPostPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	public ElementsOnAnyBookPage elementsBook = new ElementsOnAnyBookPage(driver);
	public PostFormatsPage postFormat = new PostFormatsPage(driver);
	public ShippingAddressPage shippingAddress = new ShippingAddressPage(driver);
	public SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
	public EventsPage events = new EventsPage(driver);
	public SingleEventPage singleEvent = new SingleEventPage(driver);
	public HomePage homepage = new HomePage(driver);
	public GalleryFormatPage galleryFormatPage = new GalleryFormatPage(driver);
	
}
