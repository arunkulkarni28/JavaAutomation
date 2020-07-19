package Practise;

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
import org.openqa.selenium.interactions.Actions;  

public class NEWTESTPRACTISE1 {
	//@SuppressWarnings("rawtypes")
	private static WebDriver driver = null;
	private static DesktopOptions option = null;
	private static Robot robot = null;
	public static String testtype= "Browser";
	public static WiniumDriverService service = null;
	public static DesktopOptions options = null;
	public static Process proc = null; 
	public static Runtime run=null; 
	
		
		
		
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
					 String command= "F:\\WINIUM\\WiniumDriver.exe";
					 run = Runtime.getRuntime(); 
					 proc	= run.exec(command);
									
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
			
		
	@Test
	public void Test1_Openpreview() throws AWTException {

			System.out.println("Successfully Created ............");
			try {
				Thread.sleep(5000);
			
				//driver.findElement(By.name("Ensemble Anthem")).click();
							
				Thread.sleep(5000);
				System.out.println("Successfully able to enter Ensemble Anthem ............");
				Thread.sleep(5000);
				//WebElement element = driver.findElement(By.name("Ensemble Anthem "));
				
			//WebElement element = driver.findElement(By.name("recordRadioButton"));
				//element.click();
				
			//	WebElement element = driver.findElement(By.id("recordRadioButton"));
			//	element.click();
				
				//WebElement element = driver.findElement(By.name("RECORD"));
				//element.click();
				
				//driver.findElement(By.id("recordRadioButton")).click();
				//Thread.sleep(5000);
				
				driver.findElement(By.id("librayRadioButton")).click();
				Thread.sleep(5000);
				//driver.findElement(By.id("LIBRARY")).click();
				System.out.println("Clicked on Library ............");
				Thread.sleep(5000);
				driver.findElement(By.name("Edit Media")).click();
				Thread.sleep(10000);
				System.out.println("Clicked on Edit media ............");			
				Thread.sleep(5000);
						
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
				Thread.sleep(5000);
				
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
				
				
				//==============================================================//
				//driver.findElement(By.id("librayRadioButton")).click();
				Actions actions = new Actions(driver);
				WebElement webElement = driver.findElement(By.id("librayRadioButton")); 
				actions.doubleClick(webElement).perform(); 
				
				//driver.findElement(By.name("LIBRARY")).click();
				Thread.sleep(5000);
				//driver.findElement(By.id("LIBRARY")).click();
				System.out.println("Clicked on Library ............");
				Thread.sleep(5000);
				driver.findElement(By.name("Edit Media")).click();
				Thread.sleep(10000);
				System.out.println("Clicked on Edit media ............");			
				Thread.sleep(5000);
						
				Robot robot1= new Robot();
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
				
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
				
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
							
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
				

				robot1.keyPress(KeyEvent.VK_ENTER);
				robot1.keyRelease(KeyEvent.VK_ENTER);
			
				System.out.println("Clicked on Preview button ............");
				Thread.sleep(5000);
				
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
				
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
				
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
							
				robot1.keyPress(KeyEvent.VK_ENTER);
				robot1.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("Clicked on Done button ............");		
				System.out.println("execute method 1");	
				//===================================// 
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
				
		}
	
	
			
	}
