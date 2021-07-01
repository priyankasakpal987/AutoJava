package com.testcases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.pages.Qualification;

public class QualifyTest extends Base{
  
  @Test
  public void qfTest() throws IOException {
	  LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Qualification qft=new Qualification(driver);
	     qft.qualify();
	     screenshot(driver,"QualifyTest");
  }
}
