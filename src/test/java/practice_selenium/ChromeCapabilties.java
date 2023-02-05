package practice_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeCapabilties {

	
	static WebDriver driver = null;
	//static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver =new ChromeDriver(options);
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[1]/button")).click();
		
		
		
		
		

	}

}
