package stringBuilderPro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcExample {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://einstein2.us/VMSQAAutomation/Account/Login");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='MainContent_Email']"))));
		
		WebElement loginId=driver.findElement(By.xpath("//input[@id='MainContent_Email']"));
		
		loginId.sendKeys("agency@yopmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Password']"))));
	
		 WebElement passwd=driver.findElement(By.xpath("//input[@id='Password']"));
		 
		
		 WebElement signIn=driver.findElement(By.xpath("//*[@id=\"MainContent_btnlogin\"]"));
		 
		 System.out.println(passwd.getAttribute("value"));
		 
		 passwd.sendKeys("Hallmark@123");
		 
		 signIn.click();
		 
		 wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id=\"MainContent_uProg\"]/div/img"))));
		 
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='rmLink rmRootLink']"))));
		 Actions act= new Actions(driver);
		 act.moveToElement( driver.findElement(By.xpath("//*[@id=\"ctl00_MenuUserCntrl1_RadMenu1\"]/ul/li[4]/a")));
		 driver.findElement(By.xpath("//*[@id=\"ctl00_MenuUserCntrl1_RadMenu1\"]/ul/li[4]/a")).click();
		 List<WebElement>liVal=driver.findElements(By.xpath("//*[@id=\"ctl00_MenuUserCntrl1_RadMenu1\"]/ul/li[4]//ul//li"));
		
		 
		if( liVal.size()>=2) {
			
		   act.moveToElement(liVal.get(1));
			
			liVal.get(1).click();
		}
		 
	
		 
		//*[@id="ctl00_MenuUserCntrl1_RadMenu1"]/ul/li[4]//ul//li
		 
		//*[@id="tblTimesheet"]//*[@id="tBodyContent"]/tr[3]/td[3]

	}

}
