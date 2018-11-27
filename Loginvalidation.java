package TestNG_Loginflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginvalidation {
	
	public static void main(String args[]) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		
		//opening URL
		        driver.get("https://opensource-demo.orangehrmlive.com");
				
				
				//login page submit 
		        
		        //enter a valid login user name
			    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			    //enter a valid login password
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				//click on login button
				driver.findElement(By.id("btnLogin")).click();
				
		
		
	}
	
	
	
}