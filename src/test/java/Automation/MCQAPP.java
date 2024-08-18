package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class MCQAPP {
	   
    
    public static RemoteWebDriver driver;

    @BeforeTest
    public void setUp() {
 
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();  
        driver.manage().window().maximize();
        
        driver.get("http://dev.techtrioz.xyz:8013/");
        
  }
    
    
    /*public class Login{
    	
    	//LogIn Failed
    	@Test(priority=1)
    	public void LoginFailed() {
 			
    		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
    		Email.sendKeys("admin@gmai.com");//Wrong Email 
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		
    		WebElement Password=driver.findElement(By.xpath("//*[@id=\"outlined-adornment-password\"]"));
    		Password.sendKeys("P@12345678");
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		
    		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/form/button")).click();
    		 try {
    			 Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    		 
    		  
    		 try {
    		        // Wait for the error message to be visible using its XPath
    		        WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]"));
    		        
    		        // If the error message element is found and visible, it means the login failed
    		        if (errorMessageElement.isDisplayed()) {
    		            System.out.println("Login failed: Error message found."); 
    		          
    		        }
    		    } catch (Exception e) {
    		        // If no error message is found, assume login succeeded
    		        System.out.println("Login succeeded, no error message found.");
    		    }
    		  
    		 //Refresh the page
    		 driver.navigate().refresh();
    		}
    	



		//LogIn Failed
    	@Test(priority=2)
    	public void LoginFailed2() {
 			
    		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
    		Email.sendKeys("admin@gmail.com"); 
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		
    		WebElement Password=driver.findElement(By.xpath("//*[@id=\"outlined-adornment-password\"]"));
    		Password.sendKeys("P@1234567");//Wrong Password
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		
    		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/form/button")).click();
    		 try {
    			 Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    		 
    		 try {
 		        // Wait for the error message to be visible using its XPath
 		        WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]"));
 		        
 		        // If the error message element is found and visible, it means the login failed
 		        if (errorMessageElement.isDisplayed()) {
 		            System.out.println("Login failed: Error message found."); 
 		          
 		        }
 		    } catch (Exception e) {
 		        // If no error message is found, assume login succeeded
 		        System.out.println("Login succeeded, no error message found.");
 		    }
    		 
    		//Refresh the page
    	      driver.navigate().refresh();
    			
    		}*/
    	


		//LogIn Successful
    	@Test(priority=3)
    	public void SuccessfulLogin() {
    		
    		
    		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
    		Email.sendKeys("admin@gmail.com");
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		
    		WebElement Password=driver.findElement(By.xpath("//*[@id=\"outlined-adornment-password\"]"));
    		Password.sendKeys("P@12345678");
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		
    		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/form/button")).click();
    		 try {
    			 Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    		 
    		//driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/button")).click();
    		 try {
    			 Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    	
    	 try {
		        // Wait for the sucess message to be visible using its XPath
		        WebElement sucessMessageElement = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]"));
		        
		        // If the sucess message element is found and visible
		        if (sucessMessageElement.isDisplayed()) {
		            System.out.println("Login sucess: Success message found."); 
		          
		        }
		    } catch (Exception e) {
		        // If no sucess message is found, assume login succeeded
		        System.out.println("Login Failed, no sucess message found.");
		    }
    		 
 		
    		 //driver.findElement(By.xpath("//*[@id=\"basic-menu\"]/div[3]/ul/li")).click();
    	}
    	
    	
 	
  
    
  //Create Batch
	@Test(priority=4)
	public void Batch() {
		
		//Go to the Batch Creation Page
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/ul/li[2]")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
		//Create Batch
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div/div[1]/button")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Assignee
		/*driver.findElement(By.xpath("//*[@id=\"assignee\"]")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Select Assignee
		driver.findElement(By.xpath("//*[@id=\":r1:\"]/li[1]")).click();
		
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
		
	
		
		//Approver
		driver.findElement(By.xpath("//*[@id=\"approver\"]")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Select Approver
		driver.findElement(By.xpath("//*[@id=\":rc:\"]/li")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	
	}
    
    @AfterTest
    public void closeTest()
    {
    	driver.close();
    }
}
    
   
