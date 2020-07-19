package com.mytests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
//import java.util.properties;

//import com.sun.xml.fastinfoset.sax.Properties;

public class ReadPropertyFile {
	
	public static void main(String[] args) throws FileNotFoundException {
	       
		//Properties prop=new Properties();
		//FileInputStream ip= new FileInputStream(“F:/MyEclipseWorkspace2/WinAppDriverSample/Config.properties");
		//prop.load(ip);
		
		//Properties pro;
		
		File src = new File("./Configuration/config.properties");

		try {
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("Username"));
		System.out.println(pro.getProperty("Username"));
		
		
		
		} catch (Exception e) {
		System.out.println("Exception is " + e.getMessage());
		}

		
		
		
	}
	
}		
		

	       
	       
	       
	       
	       
