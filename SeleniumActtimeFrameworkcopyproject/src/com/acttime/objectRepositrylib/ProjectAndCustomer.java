package com.acttime.objectRepositrylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdriverUtilsClass;

public class ProjectAndCustomer extends  WebdriverUtilsClass  {
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustmrBtn;
	public void navigateTocreatCustmer()
	{createNewCustmrBtn.click();
	}
	public WebDriver getsucMsg() {
		// TODO Auto-generated method stub
		return null;
	}

}
