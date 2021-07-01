package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Member {
	WebDriver driver;
	  public Member(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
	  
	  @FindBy(xpath="//b[contains(text(),'My Info')]")
	  WebElement m1;
	  @FindBy(xpath="//body/div[@id='wrapper']/div[@id='content']/div[1]/div[1]/ul[1]/li[11]/a[1]")
	  WebElement member;
	  @FindBy(xpath="//input[@id='btnAddMembershipDetail']")
	  WebElement add;
	  @FindBy(id="membership_membership")
	  WebElement ms;
	  @FindBy(id="membership_subscriptionAmount")
	  WebElement amount ;
	 @FindBy(id="btnSaveMembership")
	 WebElement save;
  
  public void membership() {
	  m1.click();
	  member.click();
	  add.click();
	  ms.sendKeys("ACCA");
	  amount.sendKeys("34000");
	  save.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }
}
