package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCLASS {
	public static Properties prop= new Properties();
	public static WebDriver driver;
	public BaseCLASS() {
		try {FileInputStream file= new FileInputStream("C:\\Users\\anujg\\eclipse-workspace\\TDDamazon\\configration\\config.properties");
		prop.load(file);
		}
		catch (FileNotFoundException a) {
			a.printStackTrace();}
		
	catch(IOException b) {b.printStackTrace();}
	}

public static void initiate() {
	
	String browsername=prop.getProperty("browser");
	if (browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","chromedriver-win64/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
}
public static void quitBrowser() {
	if(driver!=null) {
		driver.quit();
	} 
	
	}
}

