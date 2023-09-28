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
}
