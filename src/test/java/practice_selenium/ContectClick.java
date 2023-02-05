package practice_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContectClick {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		driver = new  ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickSpan= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		Actions act  = new Actions(driver);
		
		//act.moveToElement(rightClickSpan).contextClick().build().perform();
		
		act.contextClick(rightClickSpan).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul//li[1]")).click();
		
		//Alert example fro Selenium dev//
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.findElement(By.linkText("See an example alert"));
		//Always Check Alert is Present OR not //
		
		//Handling windows 
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		String elm =driver.switchTo().alert().getText();
		
		driver.switchTo().defaultContent();
		
		if(elm.equalsIgnoreCase("")) {
			
		}
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
		}
		
		
		catch(NoAlertPresentException nae) {
			
			nae.getMessage();
			
		}
		
		catch(WebDriverException wde) {
			
			wde.getMessage();
		}
		
		catch(Exception ex) {
			
			ex.getMessage();
		}
		
		
		
		//WebDriver.TargetLocator
		
		
		
		
		
		
		

	}

}
