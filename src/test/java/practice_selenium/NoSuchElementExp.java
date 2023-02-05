package practice_selenium;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementExp {

	public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
		// TODO Auto-generated method stub
    
		//WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		WebElement elm = null;

		try {

			 elm = driver.findElement(By.xpath(""));

			int x = 5;

			int z = x / 5;
		}
		
		catch(NoSuchElementException nse) {
			
			 elm = driver.findElement(By.xpath(""));
			 
			 elm.click();

			
			
		}
		
	catch(StaleElementReferenceException ex) {
			
			System.out.println("GUI element is Missing ");
			
		}

	
	

	}

}
