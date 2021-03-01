package configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Single_Menu_Item_Varification  {

	
	
public void sinleMenuVerify() throws InterruptedException {
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
}
}
