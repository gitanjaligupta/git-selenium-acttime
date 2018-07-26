package com.acttime.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Custmerfiletest {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumActtimeFramework\\testdata.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String URL = pobj.getProperty("ulr");
		String USER = pobj.getProperty("username");
		String PSWD = pobj.getProperty("password");
		
		System.out.println(USER);
		System.out.println(PSWD);
		System.out.println(URL);
		WebDriver driver = new FirefoxDriver(); 
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(USER);
		driver.findElement(By.name("pwd")).sendKeys(PSWD);
	}



}
