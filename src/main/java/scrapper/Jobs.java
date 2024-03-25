package scrapper;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;




public class Jobs{


	
	public static void main(String[] args) {
             
    	 WebDriver driver = null;
         try {
             // Initialize ChromeDriver,path set in Enviroment variable   	
             driver = new ChromeDriver();
             
             // Setting ChromeDriver path using system property(not required if env var is set)
            //  System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            
           //implicitly wait to load the elements
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                
            
            driver.get("https://in.linkedin.com/");
//            driver.manage().window().maximize();
            Thread.sleep(2000); 
         
            
            WebElement inputName = driver.findElement(By.id("session_key"));
            WebElement inputpass = driver.findElement(By.id("session_password"));
            
            inputName.sendKeys("lovequinnn8@gmail.com");
            inputpass.sendKeys("qwertyuiopasdfghjklzxcvbnm");
            Thread.sleep(10000); 
            
            WebElement signIn=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/button"));
        
         
            
            signIn.click();
            
            
            WebElement job=driver.findElement(By.xpath("/html/body/div[5]/header/div/nav/ul/li[3]/a"));
            
            job.click();
            
            WebElement searchJob=driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div/div[2]/div[2]/div/div/input[1]"));
            searchJob.sendKeys("SDET,REMOTE");
            searchJob.sendKeys(Keys.ENTER);
            Thread.sleep(10000);
            
          
            
            //then itertaing that via for loop and clicking them
            
           
        	   
        	   String str="/html/body/div[5]/div[3]/div[4]/div/div/main/div/div[2]/div[1]/div/ul/li[6]/div/div/div/div[2]/div[1]";
            
            	WebElement currentPage=driver.findElement(By.xpath(str));
            	currentPage.click();
            	
            
            //after that for each for loop button there will be another for loop to scrap the job data
            
         // Test Passed 
            Thread.sleep(6000); 
            System.out.println("Test Passed: Task done");
            
            

            
            } catch (InterruptedException e) {
        	 
             // Test Failed 
            	System.out.println("Test Failed: Exceptional error occurred");
            	e.printStackTrace();
           
            } finally {
            // Close the browser
            	
            if (driver != null) {
                driver.quit();           
            }
        }
    }

   
}
