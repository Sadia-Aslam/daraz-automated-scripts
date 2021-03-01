package configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Class {
	 static WebDriver driver;
	 static String baseURL = "https://www.daraz.pk/";
@BeforeTest
public void setup() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
    driver = new ChromeDriver(options);
	driver.get(baseURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterTest
public void teardown() {
	driver.close();
	
}
}
