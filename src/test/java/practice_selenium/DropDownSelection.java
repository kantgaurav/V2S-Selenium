package practice_selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelection {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stu.b

		try {
			driver = new ChromeDriver();

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/"); 
			driver.manage().window().maximize();
			

			driver.findElement(By.id("justAnInputBox")).click();
			
			selectChoiceValue(driver, "choice 3");
			//selectChoiceValue(driver, "all");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void selectChoiceValue(WebDriver driver, String... value) throws InterruptedException {

		List<WebElement> choiceList = driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));
		


		if (!value[0].equalsIgnoreCase("all")) {

			for (WebElement e : choiceList) {

				String text = e.getText();

				for (String val : value) {
					if (text.equals(val)) {
						
						e.click();
						
						break;

					}

				}

			}

		}
		
		else {
			
			for(WebElement e: choiceList) {
				Thread.sleep(200);
				e.click();
				
			}
		}

	}

}
