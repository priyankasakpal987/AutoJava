package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
  WebDriver driver;
  public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement pwd;
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void loginbutton()
	{
		username.sendKeys("Admin");
		pwd.sendKeys("admin123");
		login.click();
	}
	
	
}
