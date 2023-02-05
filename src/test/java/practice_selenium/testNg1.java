package practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNg1 {
	
	//Test priority set , 	alwaysRun, enabled,dependsOnMethods
	//Without priorryv: Alpabhbetically 
	WebDriver driver = new ChromeDriver();
	
	@Test (priority = 1)
	public void testMethodA() {
		
		driver.get("google.om");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Gogles");
		
		System.out.println("Tewst");
		
		
		
		
	}
	@Test(priority =2, dependsOnMethods ="testMethodA" )
	public void testB() {
		
		System.out.println("Tewst2");
		
	}

}
