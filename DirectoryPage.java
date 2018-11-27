package Default;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DirectoryPage {
  @Test
  public void Directory() {
	  
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
				
				WebElement mnuElement;
				
				mnuElement = driver.findElement(By.cssSelector("#menu_directory_viewDirectory"));
				//WebElement submnuElement;
				//submnuElement = driver.findElement(By.cssSelector("insert selector here"));

				Actions builder = new Actions(driver);
				// Move cursor to the Main Menu Element
				builder.moveToElement(mnuElement).perform();
				// Pause 25 Seconds for submenu to be displayed
				driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				
				// Clicking on the Hidden submnuElement
				//submnuElement.click();
				mnuElement.click();
				
				// Search by name by entering value in text box
				WebElement element = driver.findElement(By.name("searchDirectory[emp_name][empName]"));
				driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				//enter value in name box
				driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys("test");
		         //element.sendKeys("test");
		         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		         //click and submit on search
		         element.submit();
		         //for reset search value and clear search text fields
		         driver.findElement(By.id("resetBtn")).click();
	  
	  
	  
  }
}
