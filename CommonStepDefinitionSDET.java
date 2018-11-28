package StepDefinition_Login;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import org.openqa.selenium.Alert;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;
import com.sun.jna.platform.win32.WinDef.CHAR;

import java.awt.AWTException;     
import java.awt.Robot;     
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.support.ui.Select;
import java.util.regex.Pattern;
import java.io.BufferedReader;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.io.BufferedReader;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.net.PrintCommandListener;

public class CommonStepDefinitionSDET {
	
	public WebDriver driver;

    @Given("^I open my application$")
    public void Open_Firefox_start_application() throws Throwable {
           
    System.setProperty("webdriver.gecko.driver", "jars\\geckodriver.exe");

    driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
    
    File src= new File("./ConfigData.Properties");
    
    FileInputStream fis=new FileInputStream(src);
    
    Properties pro=new Properties();
    
       pro.load(fis);
       
       //get url from property file
    driver.get(pro.getProperty("url"));

      

    }
    

    @And( "^ I login with following credentials ([^\"]*) and ([^\"]*)$")
    
     
     public void enter_valid_username_password(String Username, String Password) throws Throwable {
           
            File src= new File("./ConfigData.Properties");
                  
                  FileInputStream fis=new FileInputStream(src);
                  
                  Properties pro=new Properties();
                  
                     pro.load(fis);
                    
            driver.findElement(By.id(pro.getProperty("EnterUsername"))).sendKeys(Username);
           //driver.findElement(By.id("user_login")).sendKeys(Username);
                  
                  //driver.findElement(By.id("user_pass")).sendKeys(Password);
                  driver.findElement(By.id(pro.getProperty("EnterPassword"))).sendKeys(Password);
           
                  
                  //driver.findElement(By.id("wp-submit")).click();
                  driver.findElement(By.id(pro.getProperty("loginbutton"))).click();
    }




    @And("^validate landing Page ([^\"]*)$")

    public void user_on_homepage(String PageTitle) throws Throwable {
           
           
           //Explicit Wait for landing page 
           
           WebDriverWait  wait = new WebDriverWait  (driver,45);
           
           File src= new File("./ConfigData.Properties");
           
           FileInputStream fis=new FileInputStream(src);
           
           Properties pro=new Properties();
           
              pro.load(fis);

           //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-users")));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(pro.getProperty("UserMenu"))));  
    
           String Getpagetitle = driver.getTitle();
           
           //Verify using assert(Actual title using getTitle method,Expected title passed in feature file);
           
           Assert.assertEquals(Getpagetitle,PageTitle);
           
           }
    
    
    @Given("^a list of numbers ([^\"]*) and ([^\"]*) and ([^\"]*)$")
    public void GivenNumbers(int a, int b, int c) throws Throwable {
           

    
    File src= new File("./ConfigData.Properties");
    
    FileInputStream fis=new FileInputStream(src);
    
    Properties pro=new Properties();
    
       pro.load(fis);
       
       
       //get url from property file

    driver.get(pro.getProperty("a"));
    driver.get(pro.getProperty("b"));
    driver.get(pro.getProperty("c")); 

    }

    @When("^I Multiply them ([^\"]*) and ([^\"]*) and ([^\"]*)$")
    public void MUL(int a, int b, int c) throws Throwable {
           
           File src= new File("./ConfigData.Properties");
           
           FileInputStream fis=new FileInputStream(src);
           
           Properties pro=new Properties();
           
              pro.load(fis);
              
              
              //get url from property file

           driver.get(pro.getProperty("a"));
           driver.get(pro.getProperty("b"));
           driver.get(pro.getProperty("c")); 
    int result = a*b*c;

    }

    @Then("^should I get ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$")
    public void ValidateResult(int a, int b, int c, int Verifyresult) throws Throwable {
    
  File src= new File("./ConfigData.Properties");
           
           FileInputStream fis=new FileInputStream(src);
           
           Properties pro=new Properties();
           
              pro.load(fis);
              
              
              //get url from property file

           driver.get(pro.getProperty("a"));
           driver.get(pro.getProperty("b"));
           driver.get(pro.getProperty("c")); 
         int result = a*b*c;
    
    Assert.assertEquals(result, Verifyresult);
           
    }
    
    
}


