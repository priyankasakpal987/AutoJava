package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Econtact {
  
  WebDriver driver;
  public Econtact(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
  

  @FindBy(xpath="//b[contains(text(),'My Info')]")
  WebElement m1;
  @FindBy(xpath="//a[contains(text(),'Emergency Contacts')]")
  WebElement ec;
  @FindBy(xpath="//input[@id='btnAddContact']")
  WebElement add;
  @FindBy(id="emgcontacts_name")
  WebElement name;
  @FindBy(id="emgcontacts_relationship")
  WebElement rel ;
  @FindBy(id="emgcontacts_mobilePhone")
  WebElement mobile ;
 @FindBy(id="btnSaveEContact")
 WebElement save;
  
 public void econtact() {
	 m1.click();
	 ec.click();
	 add.click();
	 name.sendKeys("Hari");
	 rel.sendKeys("Father");
	 mobile.sendKeys("9856742345");
	 save.click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
}
