package com.screenshot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;

public class AsesertionTest {
	public class AssertionTest extends BaseClass
	{
		@Test
		public void verfyHomepage()
		{
			String expTitle = "actiTIME - Enter Time-Track";
		    String actTitle = driver.getTitle();
		    Assert.assertEquals(actTitle, expTitle);
		}
		@Test
		public void verifyHomepagelogo()
		{boolean Imgstat= driver.findElement(By.linkText("//a[@class='content tt_selected selected']")).isDisplayed();
		Assert.assertTrue(Imgstat);
		
		}

	}
}
