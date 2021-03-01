package configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Verification extends Base_Class {

	
@Test 
public void titleBoforeLoginVerify() { 
String expectedTitle =driver.getTitle(); 
System.out.println(expectedTitle); 
 }
	 	
@Test	
public void login() { 
	
	driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
	driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("sadiaslam2011@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Please enter your password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement element = driver.findElement(By.xpath("//span[contains( text(), \"sadia ranjha's account\")]"));
	String expectedText = element.getText();
	String actualText = "SADIA RANJHA'S ACCOUNT";
	Assert.assertEquals(actualText, expectedText);
	
}

}
