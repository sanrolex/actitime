package com_actiTime_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClass {
	@FindBy(id="container_tasks")
	private WebElement taskbtn;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	public HomeClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setTaskbtn()
	{
	taskbtn.click();
	}

	public void setLogout()
	{
	logoutbtn.click();
	}
	
	

}
