package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pages.Econtact;
import com.pages.LoginPage;
public class ECTest extends Base {
  @Test
  public void ecTest() {
	  LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Econtact econ=new Econtact(driver);
	    econ.econtact();
	    try {
			screenshot(driver,"ECTest");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
