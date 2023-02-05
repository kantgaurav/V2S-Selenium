package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// Relative Locator :
		driver.findElement(By.xpath("")).click();
		
		/// static : --> // 
		
		// instant variable ..static varibale //

	}

	public void clickWebElement(WebElement elm) {

		try {

			elm.click();

		}

		catch (StaleElementReferenceException e) {

		}

	}

}
