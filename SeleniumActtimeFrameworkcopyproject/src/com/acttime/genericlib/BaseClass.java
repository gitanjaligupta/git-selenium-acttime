package com.acttime.genericlib;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acttime.objectRepositrylib.Common;
import com.acttime.objectRepositrylib.Login;

public class BaseClass {
	
	
		public static WebDriver driver;
		FileUtilsClass lib = new FileUtilsClass();
		
		@BeforeClass 
		public void confgBC() throws Throwable
		{
			Properties pobj = lib.getPropertiessFileobj();
			String bName1=pobj.getProperty("browser");
		if(bName1.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(bName1.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\server\\chrome folder.exe");
		driver =new ChromeDriver();}
		}
		//=====================
		@BeforeMethod
		public void confgBM() throws Throwable
		{System.out.println("login");
		Properties pobj= lib.getPropertiessFileobj();
		driver.get(pobj.getProperty("url"));
		Login lp= PageFactory.initElements(driver, Login.class);
		lp.Login(pobj.getProperty("username"), pobj.getProperty("password"));
		        
			}
		//==========================
		
		
		
		@AfterMethod
		public void confgAM()
		{
			System.out.println("logout");
			Common cp =PageFactory.initElements(driver, Common.class);
			cp. logout();
			
		}
		@AfterClass
		public void confgAC()
		{
			System.out.println("====close browser====");
			driver.close();
		}
		

	}
	
