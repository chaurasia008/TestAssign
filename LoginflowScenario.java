package TestNG_Loginflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginflowScenario {
	 WebDriver driver;
  @Test(description= "launch webpage")
  public void Launchpage() {
	 	
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		//opening URL
		        driver.get("https://opensource-demo.orangehrmlive.com");
	 }
  
  @Test(description="Enters valid login data")
  public void LoginAdmin() {
	  
	//login page submit 
      
      //enter a valid login user name
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    //enter a valid login password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  
  }

  @Test(description="Submit login credentials")
  public void loginsubmit()  {
	  
	  driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	//click on login button
		driver.findElement(By.id("btnLogin")).click();
	  
  }
  @Test(description="Log out")
  public void logout() {
	 //get log out element using xpath 
	 driver.findElement(By.id("welcome")).click();
	 WebDriverWait wait1 = new WebDriverWait(driver, 50000);
	 driver.findElement(By.xpath("//a[@href='/index.php/auth/logout\']")).click();
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"welcome\\\"]/ul/li[2]/a"))).click();
	 
  }

  
}
