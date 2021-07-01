package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pages.BloodGrp;
import com.pages.LoginPage;

public class Bgrp extends Base{
@Test
  public void bgrp() throws IOException{
	 LoginPage lp = new LoginPage(driver);
		lp.loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     BloodGrp bg=new BloodGrp(driver);
       bg.info1();
       screenshot(driver,"Bgrp");
}
}

