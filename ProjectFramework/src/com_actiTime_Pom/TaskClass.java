package com_actiTime_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_actiTime_genric.BaseClass;

public class TaskClass extends BaseClass {
	public WebElement getAddbtn() {
		return addbtn;
	}


	public WebElement getAddcustbtn() {
		return addcustbtn;
	}


	public WebElement getEntercusnametxt() {
		return entercusnametxt;
	}


	public WebElement getCustdestxt() {
		return custdestxt;
	}


	public WebElement getSelectcustdd() {
		return selectcustdd;
	}


	public WebElement getSelectbigbangcompny() {
		return selectbigbangcompny;
	}


	public WebElement getCancel() {
		return cancel;
	}


	public WebElement getCreatebtn() {
		return createbtn;
	}


	public WebElement getNewprobtn() {
		return newprobtn;
	}


	public WebElement getEnterprojectname() {
		return enterprojectname;
	}


	public WebElement getClickpronamebtn() {
		return clickpronamebtn;
	}


	public WebElement getSelectprojectbigbang() {
		return selectprojectbigbang;
	}


	public WebElement getProjectdesbtn() {
		return projectdesbtn;
	}


	public WebElement getEntertaskbtn() {
		return entertaskbtn;
	}


	public WebElement getCreateprojectbtn() {
		return createprojectbtn;
	}


	public WebElement getCancelprojectbtn() {
		return cancelprojectbtn;
	}


	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[contains(text(),'+ New Customer')]")
	private WebElement addcustbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entercusnametxt;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement custdestxt;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcustdd;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selectbigbangcompny;
	
	@FindBy(id="customerLightBoxCloseButton")
	private WebElement cancel;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createbtn;
	
	@FindBy(xpath="//div[text()='+ New Project']")
    private WebElement newprobtn;
	
	@FindBy(xpath="//input[@type='text' and @placeholder='Enter Project Name' and @class]")
	private WebElement enterprojectname;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement clickpronamebtn;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class]")
	private WebElement selectprojectbigbang;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Add Project Description']")
	private WebElement projectdesbtn;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name']")
	private WebElement entertaskbtn;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createprojectbtn;
	
	@FindBy(id="closeProjectLightBoxBtn")
	private WebElement cancelprojectbtn;
	
	
	//new customer created  decleration is completed
	
	
	
public TaskClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
