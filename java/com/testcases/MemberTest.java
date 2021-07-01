package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.pages.Member;

public class MemberTest extends Base {
  @Test
  public void mtest() throws IOException {
	  LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Member mss=new Member(driver);
	     mss.membership();
	     screenshot(driver,"MemberTest");
  }
}
