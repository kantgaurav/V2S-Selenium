package practice_selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	
	@Test(dataProvider = "LoginData", dataProviderClass =Email.class)
	public void loginTest(String email, String pass) {
		
		System.out.println(email);
		System.out.println(pass);
	}

	@DataProvider(name ="LoginData")
	public Object [][] getData() {
		
	Object data[][]= {{"vig@gmail.com", "123"}, {"sha@gmail.com","723"}};
	return data;
		
	}
}
