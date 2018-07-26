package com.acttime.customerTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileUtilsClass;
import com.acttime.objectRepositrylib.CreateNewCustmer;
import com.acttime.objectRepositrylib.Home;
import com.acttime.objectRepositrylib.OpenTask;
import com.acttime.objectRepositrylib.ProjectAndCustomer;
@Listeners(com.acttime.genericlib.SamplelistenerClass.class)
public class CustmerTest extends BaseClass {
	@Test
	public void createCustomerTest() throws Throwable {
		FileUtilsClass lib = new FileUtilsClass();
		String CustomerName = lib.getexcelData("sheet1", 1,1);
		String CustomerNameDiscpn = lib.getexcelData("sheet1", 2, 2);
		//=============
		Home hp= PageFactory.initElements(driver, Home.class);
		hp.navigateToTaskPage();
		//================
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.navigateToProjtAndCustmrPage();
		//=============
		ProjectAndCustomer PandC= PageFactory.initElements(driver, ProjectAndCustomer.class);
		PandC.navigateTocreatCustmer();
		//====================
		CreateNewCustmer cratCust =PageFactory.initElements(driver,CreateNewCustmer.class );
		cratCust.createCustomer(CustomerName, CustomerNameDiscpn);
		
		//===================================================
		String actMsg = PandC.getsucMsg().getTitle();
		String expMsg = "successfully created";
		boolean stat = actMsg.contains(expMsg);
		AssertJUnit.assertTrue(stat);
	}

}
