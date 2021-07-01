package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class BloodGrp {

  WebDriver driver;
  public BloodGrp(WebDriver driver)
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
  @FindBy(id="btnEditCustom")
  WebElement bg;
  @FindBy(xpath="//body/div[@id='wrapper']/div[@id='content']/div[@id='employee-details']/div[3]/div[2]/form[1]/ol[1]/li[1]/select[1]")
  WebElement drop;
  @FindBy(id="btnEditCustom")
  WebElement save1;
  
  public void info1() {
	  m1.click();
	  edit.click();
	  fn.clear();
	  fn.sendKeys("Radha");
	  ln.clear();
	  ln.sendKeys("Krishna");
	  ei.clear();
	  ei.sendKeys("7654321");
	  gender.click();
	  save.click();
	  bg.click();
	  drop.sendKeys("B+");
	  save1.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}
