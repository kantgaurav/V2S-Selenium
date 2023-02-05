package practice_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("selenium");
	Thread.sleep(200);
	//search.sendKeys(Keys.);
	
	List<WebElement>lst=driver.findElements(By.xpath("//*[@class='mkHrUc']//ul//li//span"));

	System.out.println(lst.size());
	
	
	
	
	
	
	
	

	}

}
