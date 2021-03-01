package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PraticeTestCases {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  String URL="https://www.pakrail.gov.pk";
		  driver.get(URL);
		  for (String winhandle: driver.getWindowHandles()) {
			    driver.switchTo().window(winhandle);
			    System.out.println("Window Switch");        
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//button[contains(text(),'×')]")).click();
			}
		  driver.findElement(By.id("TopControl1_ancSignUp")).click();
		  
		 String URL1 = driver.getCurrentUrl();
		 String actualCurrentUrl = "https://www.pakrail.gov.pk/Membership/Register.aspx";
				 if (URL1.equalsIgnoreCase(actualCurrentUrl)) {
					 System.out.println("User is redirected to the Registeration form successfully."); 
				 }
		  
		  driver.findElement(By.name("txtName")).sendKeys("Sadia Aslam");
		  driver.findElement(By.id("txtMobile")).sendKeys("923039514223");
		  Thread.sleep(5000);
			/*
			 * Actions actions = new Actions(driver); WebElement elementLocator =
			 * driver.findElement(By.
			 * cssSelector("div.container.bg-white.main-container:nth-child(8) div.col-md-12:nth-child(7) div.row div.col-md-9:nth-child(13) div.row div.col-md-12 div.row div.col-md-12 div.form-horizontal div.form-group:nth-child(2) div.col-md-2 div.btn-group.bootstrap-select.form-control button.btn.dropdown-toggle.btn-default > span.filter-option.pull-left"
			 * )); actions.contextClick(elementLocator).perform();
			 */
		  WebElement elementLocator = driver.findElement(By.cssSelector("div.container.bg-white.main-container:nth-child(8) div.col-md-12:nth-child(7) div.row div.col-md-9:nth-child(13) div.row div.col-md-12 div.row div.col-md-12 div.form-horizontal div.form-group:nth-child(2) div.col-md-2 div.btn-group.bootstrap-select.form-control button.btn.dropdown-toggle.btn-default > span.filter-option.pull-left"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(elementLocator).click().build().perform();
		  Thread.sleep(5000);
		  WebElement dropdown = driver.findElement(By.cssSelector("div.container.bg-white.main-container:nth-child(8) div.col-md-12:nth-child(7) div.row div.col-md-9:nth-child(13) div.row div.col-md-12 div.row div.col-md-12 div.form-horizontal div.form-group:nth-child(2) div.col-md-2 div.btn-group.bootstrap-select.form-control.open div.dropdown-menu.open ul.dropdown-menu.inner > li:nth-child(3)"));
		  Actions actions1 = new Actions(driver);
		  actions1.moveToElement(dropdown).click().build().perform();
		  Thread.sleep(5000);
		  
		  
		 // Select dropdown = new Select(driver.findElement(By.cssSelector("div.container.bg-white.main-container:nth-child(8) div.col-md-12:nth-child(7) div.row div.col-md-9:nth-child(13) div.row div.col-md-12 div.row div.col-md-12 div.form-horizontal div.form-group:nth-child(2) div.col-md-2 div.btn-group.bootstrap-select.form-control.open div.dropdown-menu.open > ul.dropdown-menu.inner")));
		  
		 
		  
		  //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		  //driver.findElement(By.id("txtEmail")).sendKeys("sadiaslam2011@gmail.com");
		  
		  
		  
		  driver.quit();
	}
	}


