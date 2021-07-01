package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Qualification {
  
  WebDriver driver;
  public Qualification(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
  
  @FindBy(xpath="//b[contains(text(),'My Info')]")
  WebElement m1;
  @FindBy(xpath="//body/div[@id='wrapper']/div[@id='content']/div[1]/div[1]/ul[1]/li[10]/a[1]")
  WebElement qf;
  @FindBy(xpath="//input[@id='addEducation']")
  WebElement add;
  @FindBy(id="education_code")
  WebElement level;
  @FindBy(id="education_institute")
  WebElement inst;
  @FindBy(id="education_year")
  WebElement yr;
 @FindBy(xpath="//input[@id='btnEducationSave']")
 WebElement save;
 
 public void qualify() {
	 m1.click();
	 qf.click();
	 add.click();
	 level.sendKeys("Bachelor's Degree");
	 inst.sendKeys("2000");
	 save.click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
  }
}
