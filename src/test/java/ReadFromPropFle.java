import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropFle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fip = new FileInputStream(
				"D:\\workspace\\practice_selenium\\src\\test\\resources\\properties\\testData.properties");

		Properties prop = new Properties();

		prop.load(fip);

		String brow = prop.getProperty("Browser");

		String url = prop.getProperty("url");

		System.out.println(url);
		//Wrting on Properties File // 
		
		FileOutputStream fos = new FileOutputStream("D:\\workspace\\practice_selenium\\src\\test\\resources\\properties\\testData.properties");
		
		
		prop.setProperty("UserName", "Admin");
		prop.setProperty("Password", "Admin123");
		prop.store(fos, "Entet User Password");

	}

}
