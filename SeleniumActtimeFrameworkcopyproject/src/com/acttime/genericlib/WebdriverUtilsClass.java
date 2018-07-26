package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtilsClass {
	public void waitforpageToLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	public void waitForElementPresent(WebElement wb)
	{ WebDriverWait wait= new WebDriverWait(BaseClass.driver, 20);		
	}
}
