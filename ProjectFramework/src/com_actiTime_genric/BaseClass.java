package com_actiTime_genric;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com_actiTime_Pom.HomeClass;
import com_actiTime_Pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static FileLib f=new FileLib();
	
	@BeforeTest
	public void OpenBrowser() 
	{
		Reporter.log("open the browser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		String url=f.getproperty("url");
		String un=f.getproperty("username");
		String pw=f.getproperty("password");
		driver.get(url);
		LoginPage a=new LoginPage(driver);
		a.setLogin(un, pw);
		Reporter.log("page succefuly logined",true);
		
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout the application",true);
		HomeClass h=new HomeClass(driver);
		h.setLogout();
	}
	
	@AfterTest
	public void CloseBrowser() 
	{
		Reporter.log("close the Browser",true);
		driver.close();
	}

}
