package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="booksNamesDataProvider")
	public Object[][] booksNamesDataProvider(){
		Object[][] data = new Object[5][2];
		
		data[0][0] = "The forest"; //numele cartii
		data[0][1] = "book2.jpg"; //numele pozei
		
		data[1][0] = "Life in the garden"; //numele cartii
		data[1][1] = "book4.jpg"; //numele pozei
		
		data[2][0] = "The long road to the deep Silence"; //numele cartii
		data[2][1] = "book5.jpg"; //numele pozei
		
		data[3][0] = "It’s a really strange story"; //numele cartii
		data[3][1] = "book12.jpg"; //numele pozei
		
		data[4][0] = "Storm"; //numele cartii
		data[4][1] = "books7.jpg"; //numele pozei
		
		return data;
	}
	
	@DataProvider(name="booksURLDataProvider")
	public Object[][] booksURLDataProvider(){
		Object [][] data = new Object[6][2];
		
		data[0][0]= "The forest";
		data[0][1]= "https://keybooks.ro/shop/the-forest/";
		
		data[1][0]= "The son";
		data[1][1]= "https://keybooks.ro/shop/the-son/";
		
		data[2][0]= "Life in the garden";
		data[2][1]= "https://keybooks.ro/shop/life-in-the-garden/";
		
		data[3][0]= "The long road to the deep Silence";
		data[3][1]= "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
		
		data[4][0]= "It’s a really strange story";
		data[4][1]= "https://keybooks.ro/shop/its-a-really-strange-story/";
		
		data[5][0]= "Storm";
		data[5][1]= "https://keybooks.ro/shop/storm/";
		
		return data;
	}
}
