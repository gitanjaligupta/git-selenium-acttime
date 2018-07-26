package com.acttime.genericlib;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileutilCustmerTEST {
public static void main(String[] args) throws Throwable {
	FileUtilsClass flib= new FileUtilsClass();
	Properties pobj = flib.getPropertiessFileobj();
	String URL= pobj.getProperty("url");
	System.out.println(URL);
	String USER= pobj.getProperty("username");
	String PWD= pobj.getProperty("password");
	String customerName= flib.getexcelData("sheet1", 1, 2);
	String customerDsc= flib.getexcelData("sheet1", 1, 3);
	WebDriver driver = new FirefoxDriver();
	driver.get(URL);
	driver.findElement(By.name("username")).sendKeys(USER);
	driver.findElement(By.name("pwd")).sendKeys(PWD);
	driver.findElement(By.id("loginButton")).click();
	
	
	
	
}
		
	}


