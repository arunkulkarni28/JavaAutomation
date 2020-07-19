package com.mytests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.sun.corba.se.spi.orbutil.fsm.Action;

import io.appium.java_client.windows.WindowsDriver;

public class Winium {
	
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
public void LaunchDriver() throws AWTException, IOException
{
	//String testtype= "Desktop"; 
		// testtype= "Browser"; 
		option = new DesktopOptions();
			//-----------This is LC --------------------
			//option.setApplicationPath("C:\\Program Files (x86)\\Ensemble\\Lecture Capture\\Ensemble.exe");
			//------------This is PC ------------------
			option.setApplicationPath("C:\\Users\\Collaaj\\AppData\\Local\\Ensemble\\Ensemble\\Ensemble.exe");
			 System.out.println("In before ");
		 String command= "F:\\WINIUM\\WiniumDriver.exe";
		 run = Runtime.getRuntime(); 
		 proc	= run.exec(command); 
			 driver = new WiniumDriver(new URL ("http://localhost:9999"), option);
			
						
		}



//@AfterTest()
public void Cleanup() throws InterruptedException, IOException{
	
	System.out.println("Enter into After test - App quit ");
	//Runtime.getRuntime().exec("C:\\Program Files (x86)\\Ensemble\\Lecture Capture\\Ensemble.exe");
	Thread.sleep(3000);
	
	 Runtime.getRuntime().exec("taskkill /F /IM Ensemble.exe");
	 System.out.println("closed ensemble");
	 Runtime.getRuntime().exec("taskkill /F /IM WiniumDriver.exe");
	 System.out.println("closed winium");
	
	
	//driver.findElement(By.name("Exit Application")).click();
	//driver.quit();
	// Runtime.getRuntime().exec("taskkill /F /IM Ensemble.exe");
	 //System.out.println("closed ensemble");
	 //Runtime.getRuntime().exec("taskkill /F /IM WiniumDriver.exe");
	 //System.out.println("closed winium");
	//proc.destroy();
	//System.out.println("Click on Exit button  ..................");
	//Thread.sleep(3000);
	//driver.findElement(By.name("OK")).click();
	//System.out.println("Click Ok button .................."); 
	

	
}
static int i = 0;
@Test (invocationCount=2)	
public void Test1_Openpreview() throws AWTException, InterruptedException, IOException {
	++i;
	System.out.println("-----------------------");
	System.out.println("Successfully Created ............i"+i);
	
		try {
		
			
			//driver.findElement(By.name("Ensemble Anthem Pro")).click();
			
			System.out.println("Successfully able to Focus Ensemble Pro App ............");
						
			Thread.sleep(5000);
	//	WebElement element = driver.findElement(By.name("Ensemble Anthem Pro"));
		//	element.click();
			//System.out.println(driver.findElement(By.id("librayRadioButton")).isDisplayed());
			Thread.sleep(5000);
			
			WebElement element = driver.findElement(By.id("recordRadioButton"));
			
			Thread.sleep(5000);
			driver.findElement(By.id("librayRadioButton")).click();
			/*Actions actions = new Actions(driver);
			WebElement elementLocator = driver.findElement(By.id("librayRadioButton"));
			actions.moveToElement(elementLocator).perform();*/
			Actions actions = new Actions(driver);
		if(i == 2)
		{
			System.out.println("i"+i);
			WebElement elementLocator = driver.findElement(By.id("settingsRadioButton"));
			actions.moveToElement(elementLocator).perform();
		//	elementLocator.sendKeys(Keys.TAB);
			
			
			
			WebElement elementLocator1 = driver.findElement(By.id("librayRadioButton"));
			actions.moveToElement(elementLocator1).perform();
			
		//	driver.findElement(By.name("Ensemble Anthem Pro")).click();
			
			//actions.moveToElement(elementLocator).perform();
		}
		System.out.println("Clicked on Library ............");
			Thread.sleep(5000);
			driver.findElement(By.name("Edit Media")).click();
			System.out.println("Clicked on Edit media ............");			
			//driver.findElementByName("Edit Media").click();
			Thread.sleep(3000);
					
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
			//driver.findElement(By.className("UploadMetadataUserControl")).findElement(By.name("PREVIEW")).click();
				//driver.findElement(By.xpath("//*[@LocalizedControlType='button'and @Name='PREVIEW']"));
			System.out.println("Clicked on Preview button ............");
			Thread.sleep(3000);
			//driver.findElement(By.name("DONE")).click();
			//driver.findElement(By.xpath("//*[@LocalizedControlType='button' and @name='DONE']"));
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			System.out.println("Clicked on Done button ............");		
				
			Thread.sleep(3000);
			
			 System.out.println("-----------------");
			//}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//Thread.sleep(3000);
		//driver.quit();
			
	}




//@Test (invocationCount=2)	
public void Test2_Openpreview() throws AWTException, InterruptedException, IOException {
	System.out.println("-----------------------");
	System.out.println("Successfully Created ............");
	
		try {
		
	//driver.findElement(By.name("Ensemble Anthem Pro")).click();
			
			System.out.println("Successfully able to Focus Ensemble Pro App ............");
						
			
		//	System.out.println("Enter into recording  ............");
			Thread.sleep(5000);
		//	System.out.println("Clicked on set in Home page ............");
	//		driver.findElement(By.id("settingsRadioButton")).click();
			
			
			
			Thread.sleep(5000);
WebElement element = driver.findElement(By.name("Ensemble Anthem Pro"));
element.click();
		System.out.println(driver.findElement(By.id("librayRadioButton")).isDisplayed());
			Thread.sleep(5000);
			
			driver.findElement(By.id("librayRadioButton")).click();
	    	System.out.println("Clicked on Library ............");
			Thread.sleep(5000);
			driver.findElement(By.name("Edit Media")).click();
			System.out.println("Clicked on Edit media ............");			
			//driver.findElementByName("Edit Media").click();
			Thread.sleep(3000);
					
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
			//driver.findElement(By.className("UploadMetadataUserControl")).findElement(By.name("PREVIEW")).click();
				//driver.findElement(By.xpath("//*[@LocalizedControlType='button'and @Name='PREVIEW']"));
			System.out.println("Clicked on Preview button ............");
			Thread.sleep(3000);
			//driver.findElement(By.name("DONE")).click();
			//driver.findElement(By.xpath("//*[@LocalizedControlType='button' and @name='DONE']"));
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			System.out.println("Clicked on Done button ............");		
				
			Thread.sleep(3000);
			
			 System.out.println("-----------------");
			//}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Thread.sleep(10000);
		//driver.quit();
			
	}



//@Test
public void Test3_Checkthescreenrecording() throws InterruptedException, AWTException{
	
	try {
		Thread.sleep(5000);
		Robot robot= new Robot();
		//robot1.keyPress(KeyEvent.VK_ENTER);
		//robot1.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Enter into recording  ............");
		Thread.sleep(5000);
		System.out.println("Clicked on RECORD in Home page ............");
		driver.findElement(By.name("RECORD")).click();
		
		Thread.sleep(5000);
	
		WebElement element = driver.findElement(By.name("Screen & Webcam"));
		element.click();
		
		System.out.println("Clicked on screen ............");
		//driver.findElement(By.name("Screen")).click();
		Thread.sleep(5000);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
			
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("DONE")).click();
	//	driver.quit();
		
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}

	
	//@BeforeSuite
	
		public void MaximizeWindow() {	

	try {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		} catch (Exception e) {
		e.printStackTrace();
		}
	
	}

	
}
