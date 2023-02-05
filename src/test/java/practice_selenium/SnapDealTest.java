package practice_selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.asynchttpclient.netty.channel.ChannelManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDealTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		///WebElement elm = null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement searchBox = driver.findElement(By.id("inputValEnter"));
		searchBox.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> sugestionList = driver.findElements(By.xpath("//*[@class='suggestionList_menu']/li"));
		System.out.println(sugestionList.size());
		try {
			
			for (WebElement elm: sugestionList) {
				System.out.println(elm.getText());
				if (elm.getText().contains("Sport Shoes")) {
					System.out.println("clicked");
					elm.click();
				}
			}
		} catch (Exception e) {
			
			//elm  = driver.
		//System.out.println("StaleException");	
			System.out.println(e.getClass());
		}


		//Drop down for low to high
		driver.findElement(By.xpath("//*[@class='sd-icon sd-icon-expand-arrow sort-arrow']"))
				.click();
		List<WebElement> sortByList = driver.findElements(By.xpath("//*[@class=\"sort-value\"]/li"));
		System.out.println(sortByList.size());
		for (WebElement webElement : sortByList) {
			System.out.println(webElement.getText());
			if (webElement.getText().contains("Price Low To High")) {
				webElement.click();
				break;
			}
		}
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,350)", "");
		WebElement checkBox = driver.findElement(By.xpath("//div[@data-name=\"Size_s\"]//label[@for='Size_s-11']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkBox));
		checkBox.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(null));
		driver.findElement(By.id("5764608168892448349")).click();
		Actions action = new Actions(driver);

		// Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		driver.findElement(By.xpath("//*[@id='attribute-select-1']//div[text()='7']")).click();
		driver.findElement(By.id("add-cart-button-id")).click();
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		
//		driver.findElement(By.id("username")).sendKeys("7506839876");
//		driver.findElement(By.id("login-continue"))act.click();
		
		
		
		
	}

}
