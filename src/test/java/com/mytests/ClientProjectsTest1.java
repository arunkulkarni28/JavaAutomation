package com.mytests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;  

public class ClientProjectsTest1 {
	//@SuppressWarnings("rawtypes")
	private static WebDriver driver = null;
	private static DesktopOptions option = null;
	private static Robot robot = null;
	public static String testtype= "Browser";
	public static WiniumDriverService service = null;
	public static DesktopOptions options = null;
	
		
	/*	@BeforeTest	
	public void LaunchDriver() throws MalformedURLException, AWTException, InterruptedException{
		String testtype= "Desktop"; 
			// testtype= "Browser"; 
			option = new DesktopOptions();
			option.setApplicationPath("C:\\Program Files (x86)\\Ensemble\\Lecture Capture\\Ensemble.exe");
			 
/*			// System. setProperty("webdriver.chrome.driver", "F:\\MyEclipseWorkspace2\\WinAppDriverSample\\chrome\\chromedriver.exe");
			 
			// Instantiate a ChromeDriver class.     
     			WebDriver driver=new ChromeDriver();  
		          
		           // Launch Website  
  driver.navigate().to("https://test01.ensemblevideo.com/app/default.aspx");  
		          
		         //Maximize the browser  
       driver.manage().window().maximize(); 
		     
		     System.out.println("Enter User name ............");         
			 driver.findElement(By.id("ctl00_pageContent_LoginControl_userNameInput")).sendKeys("Westwood");
		 Thread.sleep(1000);
			 System.out.println("Enter the password ............"); 
			 driver.findElement(By.id("ctl00_pageContent_LoginControl_passwordInput")).sendKeys("demo");
			 
			 System.out.println(" Click on Sign in button ............");
		 driver.findElement(By.xpath("/html/body/form/div[3]/section/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/a/div[2]")).click();
		 Thread.sleep(1000);
		 
		 System.out.println(" Click on Record button in site ............");
	 driver.findElement(By.id("recordScreenButton")).click();
			 
			 Thread.sleep(1000);
								
				Robot robot= new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER); 
			
				
				 System.out.println("In before ");
				 Thread.sleep(3000);
				 driver = new WiniumDriver(new URL ("http://localhost:9999"), option);
			} */
		
		
	
		
		
		@BeforeTest	
		public void LaunchDriver() throws AWTException, IOException{
			//String testtype= "Desktop"; 
				// testtype= "Browser"; 
				option = new DesktopOptions();
				//------------This is LC ------------------
				//option.setApplicationPath("C:\\Program Files (x86)\\Ensemble\\Lecture Capture\\Ensemble.exe");
					//------------This is PC ------------------
					 option.setApplicationPath("C:\\Users\\Collaaj\\AppData\\Local\\Ensemble\\Ensemble\\Ensemble.exe");	
					 System.out.println("In before ");
					 
									
					driver = new WiniumDriver(new URL ("http://localhost:9999"), option);
				}
			
	/*
	//@Before
		public void startDriver()  throws AWTException {
			driver= new WiniumDriver(service, options);	//Start a Winium Driver
		} */
		
			//@AfterTest
			public void Cleanup() throws InterruptedException{
				Thread.sleep(3000);
				//Thread.sleep();
				try{
					Runtime.getRuntime().exec("C:\\Program Files (x86)\\Ensemble\\Lecture Capture\\Ensemble.exe");
					Thread.sleep(3000);
				driver.quit();
				}
				
					catch(IOException ioe){
						ioe.printStackTrace();
				}
			}
			
		
	@Test(priority=2)
	
	
	public void Test1_Openpreview() throws AWTException {

			System.out.println("Successfully Created ............");
			try {
				Thread.sleep(10000);
			
				//driver.findElement(By.name("Ensemble Anthem")).click();
							
				Thread.sleep(5000);
				System.out.println("Successfully able to enter Ensemble Anthem ............");
				Thread.sleep(10000);
				//WebElement element = driver.findElement(By.name("Ensemble Anthem "));
				
			//WebElement element = driver.findElement(By.name("recordRadioButton"));
				//element.click();
				
			//	WebElement element = driver.findElement(By.id("recordRadioButton"));
			//	element.click();
				
				WebElement element = driver.findElement(By.name("RECORD"));
				element.click();
				
				//driver.findElement(By.id("recordRadioButton")).click();
				Thread.sleep(10000);
				
				driver.findElement(By.id("librayRadioButton")).click();
				Thread.sleep(10000);
				//driver.findElement(By.id("LIBRARY")).click();
				System.out.println("Clicked on Library ............");
				Thread.sleep(10000);
				driver.findElement(By.name("Edit Media")).click();
				Thread.sleep(10000);
				System.out.println("Clicked on Edit media ............");			
				Thread.sleep(10000);
						
				Robot robot= new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
							
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				

				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			
				System.out.println("Clicked on Preview button ............");
				Thread.sleep(10000);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
							
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("Clicked on Done button ............");		
				System.out.println("execute method 2");	
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
				
		}
	
	
	@Test(priority=1)
	public void Test2_Openpreview() throws AWTException {

			System.out.println("Successfully Created ............");
			try {
				Thread.sleep(10000);
			
				//driver.findElement(By.name("Ensemble Anthem")).click();
							
				//Thread.sleep(5000);
				System.out.println("Successfully able to enter Ensemble Anthem ............");
				Thread.sleep(10000);
				//WebElement element = driver.findElement(By.name("Ensemble Anthem "));
				
			WebElement element = driver.findElement(By.id("recordRadioButton"));
			element.click();
				
				//driver.findElement(By.id("recordRadioButton")).click();
				Thread.sleep(10000);
				
				driver.findElement(By.id("librayRadioButton")).click();
				//driver.findElement(By.id("LIBRARY")).click();
				Thread.sleep(5000);
				System.out.println("Clicked on Library ............");
				Thread.sleep(10000);
				driver.findElement(By.name("Edit Media")).click();
				Thread.sleep(5000);
				System.out.println("Clicked on Edit media ............");			
				Thread.sleep(10000);
						
				Robot robot= new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
							
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				

				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			
				System.out.println("Clicked on Preview button ............");
				Thread.sleep(10000);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
							
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("Clicked on Done button ............");		
				System.out.println("execute method 1");	
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
	}
	
	
		

	//@Test
	public void Test3_Checkthescreenrecording() throws InterruptedException, AWTException{
		
		try {
			Thread.sleep(5000);
			Robot robot1= new Robot();
			//robot1.keyPress(KeyEvent.VK_ENTER);
			//robot1.keyRelease(KeyEvent.VK_ENTER);
			
			System.out.println("Home > > Click on Screen>> Full screen and click record button  ............");
			Thread.sleep(5000);
			driver.findElement(By.name("RECORD")).click();
			System.out.println("Clicked on Record ............");
			Thread.sleep(5000);
		
			//driver.findElement(By.name("Screen")).click();
			driver.quit();
			//System.out.println("Clicked on screen ............");
			
			//driver.findElement(By.name("RECORD")).click();
//			
//			robot1.keyPress(KeyEvent.VK_TAB);
//			robot1.keyRelease(KeyEvent.VK_TAB);
//			
//			robot1.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			
//			
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
				
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
		
		
		
	}

		
	}
