package testing;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Menu_Items_Verification {

	@Test
	public void praticeTestCases() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.daraz.pk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        Actions act = new Actions(driver);
		
		WebElement main_menu_hover = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")); 
		act.moveToElement(main_menu_hover).perform();
		Thread.sleep(5000);
		WebElement sec_menu_hover = driver.findElement(By.xpath("//li[@class='lzd-site-menu-sub-item' and @data-cate='cate_1_1']")); 
		act.moveToElement(sec_menu_hover).perform();
		Thread.sleep(5000);
		WebElement thrd_menu_hover = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhones')]")); 
		thrd_menu_hover.click();
		Thread.sleep(5000);
		
		String expectedURL = "https://www.daraz.pk/smartphones/apple/?spm=a2a0e.home.cate_1_1.1";
		String actucalURL = driver.getCurrentUrl();
		Assert.assertTrue(actucalURL.contains(expectedURL),"Expected URL does not match.");
		
		List<WebElement> list_of_products = driver.findElementsByXPath("//div[@class='c16H9d']");
		List<WebElement> prices_of_products = driver.findElementsByXPath("//span[@class='c13VH6']");
		System.out.println(list_of_products);
	
		String product_names;
		String product_prices;
		int int_product_prices;
		HashMap <Integer, String> final_list_of_products= new HashMap <Integer, String>();
		for(int i=0; i<list_of_products.size(); i++) {
			product_names = list_of_products.get(i).getText();
			product_prices = prices_of_products.get(i).getText();
			product_prices = product_prices.replaceAll("[^0-9]", " ");
			int_product_prices = Integer.parseInt(product_prices);
			final_list_of_products.put(int_product_prices, product_names);
					
			
}
		
		
			
		
		driver.quit();
	}

}
