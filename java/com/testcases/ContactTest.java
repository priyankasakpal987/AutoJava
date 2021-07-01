package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pages.Contact;
import com.pages.LoginPage;

public class ContactTest extends Base {
  @Test
  public void ctest() throws IOException {
	  LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Contact ct=new Contact(driver);
         ct.contact();
         screenshot(driver,"ContactTest");
	  
  }
}
