package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Main_Menu_Item {
	
	
@Test	
public void mainMenu() {
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.daraz.pk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  //Alert alert = driver.switchTo().alert();
	   // alert.dismiss(); 
	WebElement menu= driver.findElement(By.xpath("//ul[@class='lzd-site-menu-grand'][@data-spm='cate_1_1']"));
    System.out.println(menu.getText()); 
    
  
    
}
}