package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_CellClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/indices");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//*[@id=\"dataTable\"]"));
         //All Rows in List//
		List<WebElement> tableRow = table.findElements(By.tagName("tr"));

		for (int i = 1; i <= tableRow.size()-1; i++) {

			List<WebElement> tblCoulmn = tableRow.get(i).findElements(By.tagName("td"));

			for (int j = 1; j <= tblCoulmn.size(); j++) {

				WebElement d = tableRow.get(i).findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[" + i + "]/td[" + j + "]"));

				System.out.print(" "+d.getText());
				
				if(d.getText().equals("S&P BSE MidCap")) {
					Thread.sleep(100);
					d.click();
					break;
				}

			}
			Thread.sleep(100);
			System.out.println();
			// td number 3
			// String classification =
			// alertsTableRowsList.get(i).findElement(By.xpath("//td[@data-title-text =
			// 'Classification']")).getText(); //td number 4
			// Relative Locator :

			// *[@id="dataTable"]/tbody/tr[1]/td/a[contains(text(),'BSE Sensex')]

		}

	}
}
