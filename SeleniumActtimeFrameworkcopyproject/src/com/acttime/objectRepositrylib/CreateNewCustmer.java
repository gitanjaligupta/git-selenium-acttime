package com.acttime.objectRepositrylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdriverUtilsClass;

public class CreateNewCustmer extends  WebdriverUtilsClass {
	@FindBy(name="name")
	private WebElement CustmrNameEdt;
	@FindBy(name="description")
	private WebElement CustmrDiscrptionEdt;
	@FindBy(name="createCustomerSubmit")
	private WebElement CreatcustmrBtn;
	
	public void  createCustomer(String custmoreName) {
		CustmrNameEdt.sendKeys(custmoreName);
		CreatcustmrBtn.click();
	} 

	public void  createCustomer(String custmoreName, String discrptn) {
		CustmrNameEdt.sendKeys(custmoreName);
		 CustmrDiscrptionEdt.sendKeys(discrptn);
		CreatcustmrBtn.click();
	} 

}
