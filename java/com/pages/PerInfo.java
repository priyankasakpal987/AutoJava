package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class PerInfo {

  WebDriver driver;
  public PerInfo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
  
  @FindBy(xpath="//b[contains(text(),'My Info')]")
  WebElement m1;
  @FindBy(xpath="//input[@id='btnSave']")
  WebElement edit;
  @FindBy(id="personal_txtEmpFirstName")
  WebElement fn ;
  @FindBy(id="personal_txtEmpLastName")
  WebElement ln ;
  @FindBy(id="personal_txtEmployeeId")
  WebElement ei ;
  @FindBy(id="personal_optGender_2")
  WebElement gender ;
  @FindBy(id="btnSave")
  WebElement save;
  
  public void info() {
	  m1.click();
	  edit.click();
	  fn.clear();
	  fn.sendKeys("Riya");
	  ln.clear();
	  ln.sendKeys("Singh");
	  ei.clear();
	  ei.sendKeys("3452678");
	  gender.click();
	  save.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
}


