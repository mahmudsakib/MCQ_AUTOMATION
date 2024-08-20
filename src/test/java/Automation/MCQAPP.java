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
 			
 			//Wrong Email 
    		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
    		Email.sendKeys("admin@gmai.com");
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		//Right Password
    		WebElement Password=driver.findElement(By.xpath("//*[@id=\"outlined-adornment-password\"]"));
    		Password.sendKeys("P@12345678");
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		//Click login button
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
    	
 			//Right Email
    		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
    		Email.sendKeys("admin@gmail.com"); 
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		//Wrong Password
    		WebElement Password=driver.findElement(By.xpath("//*[@id=\"outlined-adornment-password\"]"));
    		Password.sendKeys("P@1234567");//Wrong Password
    		try {
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		//Click Login Button
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
    		
    		//Right Email
    		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
    		Email.sendKeys("admin@gmail.com");
    		try {
                Thread.sleep(1000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		//Right Password
    		WebElement Password=driver.findElement(By.xpath("//*[@id=\"outlined-adornment-password\"]"));
    		Password.sendKeys("P@12345678");
    		try {
                Thread.sleep(1000);  // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		
    		//Click Login Button
    		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/form/button")).click();
    		 try {
    			 Thread.sleep(1000);  // 2000 milliseconds = 2 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    		 
    		//driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/button")).click();
    		 try {
    			 Thread.sleep(1000);  // 2000 milliseconds = 2 seconds
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
		driver.findElement(By.xpath("//*[@id=\"assignee\"]")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Select Assignee
		driver.findElement(By.xpath("(//li[normalize-space()='MR Admin'])[1]")).click();
		
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	
		
		//Approver
		driver.findElement(By.xpath("//*[@id=\"approver\"]")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Select Approver
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		
		
		//Books
		driver.findElement(By.xpath("//*[@id=\"book\"]")).click();
		try {
		     Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		 } catch (InterruptedException e) {
		            e.printStackTrace();
		      }
				
	     //Select Books
		driver.findElement(By.xpath("(//li[contains(text(),'BCSa')])[1]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		
				
				
				//Batch Type
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				//Select Batch Type
				driver.findElement(By.xpath("(//li[normalize-space()='TEXT'])[1]")).click();
				
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		
				
				
				//From Page
				driver.findElement(By.xpath("//*[@id=\"fromPage\"]")).sendKeys("1");;
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				
				//To Page
				driver.findElement(By.xpath("//*[@id=\"toPage\"]")).sendKeys("2");;
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				
				
				//Subject
				driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				//Select Subject
				// Locate the <li> element using XPath
				WebElement listItem = driver.findElement(By.xpath("//li[@data-value='6']\r\n"+ ""));

				// Perform actions on the element
				listItem.click();

				
				
				//Topic
				driver.findElement(By.xpath("//*[@id=\"topic\"]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				
				//Select Topic
				driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
				
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				
				//Sub-Topic
				driver.findElement(By.xpath("//*[@id=\"subtopic\"]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				
				//Select Sub-Topic
				driver.findElement(By.xpath("(//li[normalize-space()='Run'])[1]")).click();
				
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				
				//No Of Question
				driver.findElement(By.xpath("//*[@id=\"noOfQuestions\"]")).sendKeys("2");;
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		
		//Submit Button
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		try {
            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
			
		
	}
	
	
	//New Entry
		@Test(priority=5)
		public void Entry() {
			
			//Go to Dashboard
			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/ul/li[1]/a")).click();
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//New Entry
			driver.findElement(By.xpath("(//*[name()='path'])[3]")).click();
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Question Entry 1
			driver.findElement(By.xpath("(//textarea[@name='questions.0.data'])[1]")).sendKeys("What is your name");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

			//Answer Entry 1
			driver.findElement(By.xpath("(//textarea[@name='options.option1.option.0.data'])[1]")).sendKeys("Shakib");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Answer Entry 2
			driver.findElement(By.xpath("(//textarea[@name='options.option2.option.0.data'])[1]")).sendKeys("Sakib");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Correct Answer
            driver.findElement(By.xpath("(//button[contains(text(),'Is Answer')])[2]")).click();
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Answer Entry 3
			driver.findElement(By.xpath("(//textarea[@name='options.option3.option.0.data'])[1]")).sendKeys("Sakibe");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Answer Entry 4
			driver.findElement(By.xpath("(//textarea[@name='options.option4.option.0.data'])[1]")).sendKeys("Shakive");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			
			//Explanations Entry 
			driver.findElement(By.xpath("(//textarea[@name='explanations.0.data'])[1]")).sendKeys("Shakive");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Click Next
			driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			
			
			
			//Question Entry 2
			driver.findElement(By.xpath("(//textarea[@name='questions.0.data'])[1]")).sendKeys("How old are you");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

			//Answer Entry 1
			driver.findElement(By.xpath("(//textarea[@name='options.option1.option.0.data'])[1]")).sendKeys("20");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Answer Entry 2
			driver.findElement(By.xpath("(//textarea[@name='options.option2.option.0.data'])[1]")).sendKeys("21");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			

			
			//Answer Entry 3
			driver.findElement(By.xpath("(//textarea[@name='options.option3.option.0.data'])[1]")).sendKeys("22");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Answer Entry 4
			driver.findElement(By.xpath("(//textarea[@name='options.option4.option.0.data'])[1]")).sendKeys("23");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Correct Answer
            driver.findElement(By.xpath("(//button[contains(text(),'Is Answer')])[4]")).click();
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			
			//Explanations Entry 
			driver.findElement(By.xpath("(//textarea[@name='explanations.0.data'])[1]")).sendKeys("Birth date 2000");
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			//Submit Question
			driver.findElement(By.xpath("(//button[normalize-space()='Submit Question'])[1]")).click();
			
			try {
	            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			
		}
    
		
		
		//Assign Revisison
				@Test(priority=6)
				public void AssignRevision() {
					
					//Go to Revision page
					driver.findElement(By.xpath("(//a[normalize-space()='Revision'])[1]")).click();
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					//Update Pending Reviews
					driver.findElement(By.xpath("(//button[normalize-space()='Update Pending Reviews'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					//Select Batch
					driver.findElement(By.xpath("(//div[@id='batch'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					//Confirmed Batch
					driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					
					//Assignee
					driver.findElement(By.xpath("(//div[@id='assignee'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					//Select Assignee
					driver.findElement(By.xpath("(//li[normalize-space()='MR Admin'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					
					//Approver
					driver.findElement(By.xpath("(//div[@id='approver'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					//Select Approver
					driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					//Submit
					driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					
				}
				
				@Test(priority=7)
				public void Review() {
					//Go to Dashboard
					driver.findElement(By.xpath("(//a[normalize-space()='Dashboard'])[1]")).click();
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					//New Review
					driver.findElement(By.xpath("(//*[name()='svg'][contains(@class,'MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06')])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					//Review Question Entry 1
					WebElement inputField=driver.findElement(By.xpath("(//textarea[@name='questions.0.data'])[1]"));
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }

					// Clear the existing text in the input field
					inputField.clear();
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					// Enter new data into the input field
					inputField.sendKeys("What is your name?");
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					
					//Review Question Entry 2
					WebElement correct=driver.findElement(By.xpath("(//textarea[@name='options.option2.option.0.data'])[1]"));
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }

					// Clear the existing text in the input field
					correct.clear();
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					// Enter new data into the input field
					correct.sendKeys("Sakib Mahmud");
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					//Click Next
					driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					
					//Review Answer Entry 3
					WebElement year=driver.findElement(By.xpath("(//textarea[@name='options.option3.option.0.data'])[1]"));
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					
					// Clear the existing text in the input field
					year.clear();
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					// Enter new data into the input field
					year.sendKeys("24");
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
					//Correct Answer
		            driver.findElement(By.xpath("(//button[contains(text(),'Is Answer')])[3]")).click();
					
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				
					
					//Submit Question
					driver.findElement(By.xpath("(//button[normalize-space()='Submit Review'])[1]")).click();
					try {
			            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					
				}
				
			@Test(priority=8)	
			public void ApproveBatch() {
				//Go to revision page
				driver.findElement(By.xpath("//a[normalize-space()='Revision']")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				//Click Approve Batch
				driver.findElement(By.xpath("(//button[normalize-space()='Approve Batch'])[1]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				//Select Approve Batch
				driver.findElement(By.xpath("(//div[@id='batch'])[1]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				//Confirmed Approve Batch
				driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
				try {
		            Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				//Click Submit Button
				driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
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
    
   
