package com.acttime.objectRepositrylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {

      @FindBy(linkText="logout")
       private WebElement logout;
      public void logout() {
    	  logout.click();
      }
}
