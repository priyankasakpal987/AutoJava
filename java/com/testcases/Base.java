package com.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	public static WebDriver driver;

	@BeforeClass
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Java Programs\\Programs\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  
		  
	}
	
	
	@AfterClass
	public void teardown() 
	{
	driver.quit();
	
	}
	
  public void screenshot(WebDriver driver,String tname)throws IOException{	
	TakesScreenshot ts = (TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File target= new File(System.getProperty("user.dir")+ "./ScreenShot/" + tname + ".png");
    FileUtils.copyFile(source, target);
    System.out.println("Screenshot is taken");

	
}   
}
