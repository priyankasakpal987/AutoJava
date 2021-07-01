package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.PerInfo;

public class MyInfo extends Base{
  @Test
  public void myinfo() throws IOException {
	  LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PerInfo pi=new PerInfo(driver);
	    pi.info();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    screenshot(driver,"MyInfo");
  }
}
