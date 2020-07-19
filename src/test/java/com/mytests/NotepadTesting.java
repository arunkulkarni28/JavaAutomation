package com.mytests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class NotepadTesting {
	
	@SuppressWarnings("rawtypes")
	private static WindowsDriver driver = null;

	@Test
	public void openNotepadApp(){
		DesiredCapabilities cap = new DesiredCapabilities ();
		
		cap.setCapability("app","C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("devicename", "WindowsPC");
		
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
						
		} catch (MalformedURLException e) {
						e.printStackTrace();
		}	

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByName("Help").click();
		
	}
}
