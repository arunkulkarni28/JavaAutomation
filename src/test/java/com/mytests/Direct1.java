package com.mytests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.appium.java_client.windows.WindowsDriver;

public class Direct1 {
	Properties pro = null;
	
	@SuppressWarnings("rawtypes")
	private static WindowsDriver driver = null;
	static DesiredCapabilities cap = new DesiredCapabilities();
	public static Process proc = null; 
	public static Runtime run=null; 
	//int n = Integer.parseInt(pro.getProperty("number"));
	static int  n;
	static int timing;
	
	@BeforeTest
	public void openApp() throws InterruptedException, IOException {
		//----------Configuration for desktop application
			
		File src = new File("./Configuration/config.properties");

		try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("Username"));
	//	System.out.println(pro.getProperty("Username"));
		System.out.println(pro.getProperty("number"));
		n = Integer.parseInt (pro.getProperty("number"));
		
		} catch (Exception e) {
		System.out.println("Exception is " + e.getMessage());
		}
		
		cap.setCapability("app", pro.getProperty("path"));	
	//	cap.setCapability("app", "C:\\Users\\Collaaj\\AppData\\Local\\Ensemble\\Ensemble\\Ensemble.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("devicename", "WindowsPC");
		
		//String command= "C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe";
		//run = Runtime.getRuntime(); 
		//proc	= run.exec(command); 
		 
		//-------------To launch desktop application port------------//
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
	}
	
/*	//@Test
	public void Test1_Openpreview(){
		try
		{
			setUp();
			performOperations();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			driver.close();
		}
	}
	
	public static void setUp() throws MalformedURLException
	{
		cap.setCapability("app", "C:\\Users\\Collaaj\\AppData\\Local\\Ensemble\\Ensemble\\Ensemble.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("devicename", "WindowsPC");
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
	}
	
	public static void performOperations() throws AWTException
	{
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		System.out.println("Entered Perform Operations");
		//Properties pro;
		try {
		//for (int i = 1; i <= pro.getProperty("n"); i++) {
			
			System.out.println(n);
			for (int i = 1; i <= n; i++) {
				
			//for (int i = 0; i <= 2; i++) {
			Thread.sleep(10000);
			driver.findElement(By.name("LIBRARY")).click();
			System.out.println("Clicked on Library ............");
			Thread.sleep(5000);
			//String image = driver.findElement(By.name("button")).getAttribute("Name")
			
			
			WebElement image = driver.findElement(By.name("Audio - 2020 Jul 10 05:58:25"));
			action.moveToElement(image).perform();
			
			//WebElement image = driver.findElement(By.name("Audio - 2020 Jul 10 05:58:25"));
			//action.moveToElement(image).perform();
			driver.findElement(By.name("Edit Media")).click();
			System.out.println("Clicked on Edit media ............");
			Thread.sleep(3000);
			
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
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("Clicked on Done button ............");
			Thread.sleep(5000);
			System.out.println("======================");
		}
		
	} catch (InterruptedException e) {

		e.printStackTrace();
	} 
	}*/
	
	
	@Test
		public void Test2_Recordfor2min(){
			try
			{
				setUp1();
				performOperations1();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				driver.close();
			}
		}
		
		public static void setUp1() throws MalformedURLException
		{
			cap.setCapability("app", "C:\\Users\\Collaaj\\AppData\\Local\\Ensemble\\Ensemble\\Ensemble.exe");
			cap.setCapability("platformName", "Windows");
			cap.setCapability("devicename", "WindowsPC");
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
		}
		
		public static void performOperations1() throws AWTException
		{
			Actions action = new Actions(driver);
			Robot robot1 = new Robot();
			System.out.println("Entered Perform Operations");	
			//Properties pro;
			try {
			//for (int i = 1; i <= pro.getProperty("n"); i++) {
				
				System.out.println(n);
				for (int i = 1; i <= n; i++) {
					
				//for (int i = 0; i <= 2; i++) {
					
				System.out.println("==========================================================");
				Thread.sleep(5000);
				driver.findElement(By.name("RECORD")).click();
				System.out.println("Clicked on Record ............");
				Thread.sleep(5000);
				//------------------------//
				driver.findElement(By.name("Voice")).sendKeys(Keys.ENTER); 
				System.out.println("Clicked on Voice ............");
				
				Thread.sleep(5000);
				
			//	System.out.println("recording for 1 min ............");
			//	Thread.sleep(66000);
				//------------------------//
				
				driver.findElement(By.name("DONE")).sendKeys(Keys.ENTER); 
				System.out.println("Clicked on Done while recording voice  ............");
				Thread.sleep(5000);
				//------------------------//
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
				System.out.println("Clicked on DONE button in preview screenn ............");
				//------------------------//
				Thread.sleep(5000);
				robot1.keyPress(KeyEvent.VK_TAB);
				robot1.keyRelease(KeyEvent.VK_TAB);
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
				System.out.println("Clicked on SAVE  button  ............");
				Thread.sleep(5000);
				
				System.out.println("===================================================");
				//------------------------//
			}
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		} 
		}

}

	
	


	