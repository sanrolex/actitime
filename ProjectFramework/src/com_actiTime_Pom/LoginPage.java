package com_actiTime_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement Intbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath ="//div[text()='Login ']")
	private WebElement loginbx;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

		public void setLogin(String un,String pw)
		{
			Intbx.sendKeys(un);
			pwtbx.sendKeys(pw);
			loginbx.click();
		}
	}
