package practice_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	static WebDriver driver = null;

	static WebElement elm = null;
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver.get("https://www.makemytrip.com/");
		
	
		///WebElement elm = driver.findElement(By.xpath(""));
		
		
	
		WebElement fromLabel = driver.findElement(By.xpath(
				"//*[@id=\"root\"]//label[@for= \"fromCity\"]//*[@class=\"lbl_input latoBold  appendBottom5\"]"));
		fromLabel.click();
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		driver.navigate().refresh();
		//StaleElementException //
		///good idea is Reaload the WebElement after anyaction : Refresh or PageLoad//
		
		fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		///WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(fromCity));
		
		fromCity.sendKeys("MUMBAI");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='toCity']")));
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}
  public static boolean checkPresenceofWebElement(String locator) {
	  
	  List<WebElement> elm =driver.findElements(By.xpath(locator));
	  
	  if(elm.size()>0) {
		  
		  
		return true;  
	  }
	return false;
	  
	  
  }
}
