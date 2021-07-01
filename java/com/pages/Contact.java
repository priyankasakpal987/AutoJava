package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class Contact {
  
  WebDriver driver;
  public Contact(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
  
  @FindBy(xpath="//b[contains(text(),'My Info')]")
  WebElement m1;
  @FindBy(xpath="//a[contains(text(),'Contact Details')]")
  WebElement cd;
  @FindBy(xpath="//input[@id='btnSave']")
  WebElement edit;
  @FindBy(id="contact_street1")
  WebElement address1;
  @FindBy(id="contact_street2")
  WebElement address2 ;
  @FindBy(id="contact_city")
  WebElement city ;
  @FindBy(id="contact_emp_mobile")
  WebElement mobile ;
  @FindBy(id="contact_emp_work_email")
  WebElement email ;
  @FindBy(id="btnSave")
  WebElement save;

  public void contact() {
	  m1.click();
	  cd.click();
	  edit.click();
	  address1.clear();
	  address1.sendKeys("Undri");
	  address2.clear();
	  address2.sendKeys("NIBM");
	  city.clear();
	  city.sendKeys("Pune");
	  mobile.clear();
	  mobile.sendKeys("9534526178");
	  email.clear();
	  email.sendKeys("radha@gmail.com");
	  save.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
}
