package practice_selenium;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebDriverManager {
	static WebDriver driver = null;
	
	public static void main(String args[]) {
		//driver = new RemoteWebDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 try {
			driver=new  ChromeDriver();
			driver.manage().deleteAllCookies();	
			
			
			//driver.manage().window().fullscreen();
			//.driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(4));
		//Find the Row count in Table	
		 List<WebElement> tblRowCount= driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
		 
		 System.out.println("row Count is +"+tblRowCount.size());
		 
		//table[@class="dataTable"]/tbody/tr[1]/td
			
		 List<WebElement> tblCol = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td"));
			
			 System.out.println("row Count is +"+tblCol.size());
			///ExPLICIT wait .. : Flueent //
			 
			for (int row = 1; row<=tblRowCount.size(); row ++) {
				
				for (int col =1; col<=tblCol.size(); col++) {
					
					WebElement tdVal=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[+'row'+]/td[+col]"));
					
					System.out.println(tdVal.getText());
					
				}
				System.out.println();
			}
			 
			//wait.until(ExpectedConditions.visibilityOf(tblCol));
			
			
			WebElement select_button =driver.findElement(By.xpath(""));
			select_button.click();
			
			WebElement progressBar = driver.findElement(By.xpath("/id"));
			wait.until(ExpectedConditions.invisibilityOf(progressBar)); //5 sec 100o mic
			
			try {
			if(select_button.isSelected()) {
			select_button.click();
			}
			
			
			}catch(NoSuchElementException ex) {
				
				//after 10 microsec my enable . 
//				Thread.sleep(100);
//				WebElement elm1 = driver.findElement(By.xpath(""));
//				elm1.click();
				
				System.out.println("Pleae fill all manadate Field befioe clicking on Submit");
				
				
			}
			
			driver.switchTo().frame("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static boolean  isElementPresent(String locatorXpath) {
		
		
		driver.findElement(By.xpath(locatorXpath));
		
		
		
		
		
		return false;
	}
	
	// Assignment 
	
	

}
