package practice_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	
		WebElement supplierName_radioBtn = driver.findElement(By.xpath("//*[@id=\"ORDER_SUPPLIER_NAME\"  and @type ='radio']"));
		//Explicit wait //
		wait.until(ExpectedConditions.elementToBeClickable(supplierName_radioBtn));
		
		supplierName_radioBtn.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		//Select the Currency Dropdown : 
		
		//Aler popUp // Scroll uo and Down the Page : Inside the Appkication and Windows Scroll
		
		//Keys.CONTROL.
		
		
		Actions act = new Actions(driver);///Find the reason why we cannot give referenec to Action Interface//
		
		act.moveToElement(supplierName_radioBtn).build().perform();
		
		
		act.contextClick(supplierName_radioBtn).keyDown("Open Link IN new Window").build().perform();
		
		//Keys.CONTROL.
		
		//https://www.youtube.com/watch?v=StehOKBOzbI
		
		//https://www.youtube.com/watch?v=SDUnyzMiunQ&t=4s
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		//Wait<WebDriver>wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(3)).pollingEvery(Duration.ofMillis(100)).ignoring(StaleElementReferenceException.class, null);

	}

}
