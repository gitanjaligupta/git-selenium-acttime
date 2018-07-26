package com.acttime.objectRepositrylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="username")
	private WebElement usernameEdit;
	@FindBy(name="pwd")
	private WebElement passwordEdit;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	//==============
	public WebElement getusername()
	{return usernameEdit;
		
	}
	public WebElement getupasswordEdit()
	{return getupasswordEdit();
		
	}public WebElement getlogin()
	{return loginButton;
	}
	public void Login(String username , String password)
	
	{ usernameEdit.sendKeys(username);
	 passwordEdit.sendKeys(password);
	 loginButton.click();
		
	}
	

}


