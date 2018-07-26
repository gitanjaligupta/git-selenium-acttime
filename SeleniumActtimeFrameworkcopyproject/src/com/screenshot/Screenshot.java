package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void takescreenshotTest() throws IOException
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://127.0.0.1:5050/login.do");
		// capture the screenshot
		EventFiringWebDriver eDriver  = new EventFiringWebDriver(driver);
		File srcImg =eDriver.getScreenshotAs(OutputType.FILE);
		// create new file F drive
		File dstFile =new File("F:\\screenshot.png");
		FileUtils.copyFile(srcImg, dstFile);
	}

}
