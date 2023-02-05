package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebTableThroughSpecifRow {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver();
		// driver.get(“http://elvery.net/demo/responsive-tables”);
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//*[@class=\"dataTable\"]"));
		List<WebElement> rowsList = table.findElements(By.tagName("tr"));
		System.out.println(rowsList.size());

		List<WebElement> columnsList = null;

		for (WebElement row : rowsList) {
			System.out.println();
			columnsList = row.findElements(By.tagName("td"));
              System.out.println("Iterating Row");
			for (WebElement column : columnsList) {
				if(column.getText().equalsIgnoreCase("Bharat Gears:")) {
					System.out.println("Specific Row Found");
					System.out.print(column.getText() + " ");
				}
				//System.out.print(column.getText() + ",");
			}
              
		}
		
	}
}
