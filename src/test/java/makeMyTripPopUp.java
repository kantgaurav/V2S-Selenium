import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.*;


public class makeMyTripPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		  WebDriver driver = new EdgeDriver();
		  
		  driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 
	System.out.println(driver.findElement(By.xpath("//header//img[@class='dt']")).isDisplayed()); 
	 
	 driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]/i")).click();
	 
	}

}
