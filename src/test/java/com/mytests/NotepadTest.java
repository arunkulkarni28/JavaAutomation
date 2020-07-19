package com.mytests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class NotepadTest {
	
	
	//public static WindowsDriver driver = null; 
	@SuppressWarnings("rawtypes")
	private static WindowsDriver driver = null;
	
		
	@SuppressWarnings("rawtypes")
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = new DesiredCapabilities ();
		Thread.sleep(3000);
		cap.setCapability("app","C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("devicename", "WindowsPC");
		Thread.sleep(3000);
			
		
		
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
						
		} catch (MalformedURLException e) {
						e.printStackTrace();
		}
		
	//	driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void cleanUp() throws MalformedURLException, Exception{
//		driver.quit();
//		setUp();
	}
	
	
	@AfterSuite
	public void tearDown(){
//		driver.quit();
	}
	
	
	@Test
	public void checkHelpAboutNowTest(){
		DesiredCapabilities cap = new DesiredCapabilities ();
		
		cap.setCapability("app","C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("devicename", "WindowsPC");
		
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
						
		} catch (MalformedURLException e) {
						e.printStackTrace();
		}
		
	//	driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		
	//driver.findElement(By.name("Help").click();
	driver.findElementByName("Help").click();
	
		
		
		
//	//driver.findElementByName("Help").click();
		driver.findElementByName("About Notepad").click();
		driver.findElementByName("OK").click();
		
	}
	
	
	
}
