package practice_selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class CredentialType {
	String URL = "https://einstein2.us/VMSQAAutomation/Account/Login.aspx";
	String username = "agency@yopmail.com";
	String password = "SGFsbG1hcmtAMTIz";
	SoftAssert softAssert = new SoftAssert();
	public String decode(String pwd) {
		// Get bytes from string
		byte[] byteArray = Base64.getDecoder().decode(password.getBytes());
		String decodedString = new String(byteArray);
		return decodedString;

	}

	@Test
	public void valCredTypeDropDownValues() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement edtEmail = driver.findElement(By.xpath("//input[@id='MainContent_Email']"));
		WebElement edtPwd = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='MainContent_btnlogin']"));

		assertEquals(edtEmail.isDisplayed(), true);
		// softAssert.assertEquals(edtEmail.isDisplayed(), true);
		System.out.println("Current title is : " + driver.getTitle());
		edtEmail.sendKeys(username);
		edtPwd.sendKeys(decode(password));
		btnLogin.click();

		WebElement lnkAgency = driver.findElement(By.xpath("//a[text()='Agency']"));
		assertEquals(lnkAgency.isDisplayed(), true);
		System.out.println("Current title is : " + driver.getTitle());
		lnkAgency.click();
		List<WebElement> lstAgency = driver.findElements(By.xpath("//a[text()='Agency']/parent::li//div//li/a"));
		for (int i = 0; i < lstAgency.size(); i++) {
			if (lstAgency.get(i).getText().contains("New Candidate Profile")) {
				lstAgency.get(i).click();
				break;
			}
		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebElement txtCredType = driver.findElement(By.xpath("//span[text()='Credential Type']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", txtCredType);
		assertEquals(txtCredType.isDisplayed(), true);
		System.out.println(
				"Current title is : " + driver.getTitle() + " Navigation to new Candidate Profile tab successful.");

		WebElement drpdwncredType = driver
				.findElement(By.xpath("//span[@id='ctl00_MainContent_RadCredentialTypes_Arrow']/parent::button"));
		drpdwncredType.click();

		WebElement diselectCheckAllCheckbox = driver.findElement(
				By.xpath("//div[@id='ctl00_MainContent_RadCredentialTypes_DropDown']//*[text()='Check All']//input"));
		diselectCheckAllCheckbox.click();

		// selecting Licence and fetching its list
		WebElement chkBoxLicense = driver.findElement(
				By.xpath("//div[@id='ctl00_MainContent_RadCredentialTypes_DropDown']//*[text()='License']//input"));
		chkBoxLicense.click();
		String selectedDrpDwnVal = driver
				.findElement(By.xpath("//input[@id='ctl00_MainContent_RadCredentialTypes_Input']"))
				.getAttribute("value");

		WebElement btnGetDetails = driver.findElement(By.xpath("//button[@id='ctl00_MainContent_RadGetDetails']"));
		btnGetDetails.click();
		Thread.sleep(4000);

		ArrayList<String> License = getdropdownValues(
				driver.findElements(By.xpath("//table[@id='MainContent_RadGrdCredentialDetails']/tbody[2]/tr[@id]")),
				driver);
		Map<String, List<String>> tableVal = new HashMap<String, List<String>>();
		tableVal.put(selectedDrpDwnVal, License);


		// deselect Licence
		driver.findElement(By.xpath("//span[@id='ctl00_MainContent_RadCredentialTypes_Arrow']/parent::button")).click();
		driver.findElement(
				By.xpath("//div[@id='ctl00_MainContent_RadCredentialTypes_DropDown']//*[text()='License']//input"))
				.click();

		// select certifcication and fetch its list
		WebElement chkBoxCert = driver.findElement(By
				.xpath("//div[@id='ctl00_MainContent_RadCredentialTypes_DropDown']//*[text()='Certification']//input"));
		chkBoxCert.click();
		selectedDrpDwnVal = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_RadCredentialTypes_Input']"))
				.getAttribute("value");
		driver.findElement(By.xpath("//button[@id='ctl00_MainContent_RadGetDetails']")).click();
		Thread.sleep(4000);

		ArrayList<String> cert = getdropdownValues(
				driver.findElements(By.xpath("//table[@id='MainContent_RadGrdCredentialDetails']/tbody[2]/tr[@id]")),
				driver);
		tableVal.put(selectedDrpDwnVal, cert);

		tableVal.forEach((key, value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
	}

	public ArrayList<String> getdropdownValues(List<WebElement> ele, WebDriver driver) {
		int bodyrowcount = ele.size();

		System.out.println(bodyrowcount);
		ArrayList<String> lstCredentials = new ArrayList<String>();
		for (int i = 0; i < bodyrowcount; i++) {
			String str = driver
					.findElement(By.xpath("//span[@id='MainContent_RadGrdCredentialDetails_lblCredentials_" + i + "']"))
					.getText();
			// System.out.println(str);
			lstCredentials.add(str);
			// }
		}
		// System.out.println("lstCredentials =" + lstCredentials);
		return lstCredentials;
	}

}
