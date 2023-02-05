package stringBuilderPro;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExcp_Program {
	
	static WebDriver driver = null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		
	}
	public void completeSession() {
	    By completeButtonByXpath = By.xpath("*//button[text()='Complete']");
	    WebElement completeButton = driver.findElement(completeButtonByXpath);
	    int attempts = 0;
	    while(attempts < 5) {
	        try {
	            completeButton.click();
	            break;
	        }
	        catch(StaleElementReferenceException staleException) {
	            staleException.printStackTrace();
	        }
	        attempts++;
	    }
	}
}
