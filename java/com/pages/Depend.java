package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Depend {
  
  WebDriver driver;
  public Depend(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
  
  @FindBy(xpath="//b[contains(text(),'My Info')]")
  WebElement m1;
  @FindBy(xpath="//a[contains(text(),'Dependents')]")
  WebElement dp;
  @FindBy(xpath="//input[@id='btnAddDependent']")
  WebElement add;
  @FindBy(id="dependent_name")
  WebElement n;
  @FindBy(id="dependent_relationshipType")
  WebElement rl ;
 @FindBy(id="btnSaveDependent")
 WebElement save;
  
 public void dependent() {
	 m1.click();
	 dp.click();
	 add.click();
	 n.sendKeys("Shri");
	 rl.sendKeys("Father");
	 save.click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
 }
}
