package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pages.Depend;
import com.pages.LoginPage;
public class DependTest extends Base {
  @Test
  public void dpTest() throws IOException {
	  LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Depend dt=new Depend(driver);
	     dt.dependent();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     screenshot(driver,"DependTest");
     
  }
}
