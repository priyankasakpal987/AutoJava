package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest extends Base
{
@Test
	public void loginTest() throws InterruptedException, IOException
	{
	    Thread.sleep(1000);
		LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		screenshot(driver,"LoginTest");
		
	
	}
	
  
	
}
