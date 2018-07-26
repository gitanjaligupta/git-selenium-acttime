package com.acttime.objectRepositrylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdriverUtilsClass;

public class OpenTask extends  WebdriverUtilsClass {
	@FindBy(linkText="Projects & Customers")
	private WebElement ProjAndCustmrLink;
	public void navigateToProjtAndCustmrPage()
	{ProjAndCustmrLink.click();}

}
