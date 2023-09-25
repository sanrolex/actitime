package com_actiTime_TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com_actiTime_Pom.HomeClass;
import com_actiTime_Pom.TaskClass;
import com_actiTime_genric.BaseClass;
@Listeners(com_actiTime_genric.ListnerImplimentation.class)

public class CustomerModel extends BaseClass {
	@Test
	public void testCreatecustomer() throws EncryptedDocumentException, IOException, InterruptedException { 
	Reporter.log("Createcustomer",true);
	String customername = f.getexceldata("createcustomer", 1, 2);
	String des = f.getexceldata("createcustomer", 1, 3);
	HomeClass l=new HomeClass(driver);
	l.setTaskbtn();
	TaskClass t=new TaskClass(driver);
	t.getAddbtn().click();
	t.getAddcustbtn().click();
	t.getEntercusnametxt().sendKeys(customername);
	t.getCustdestxt().click();
	t.getSelectcustdd().click();
	Thread.sleep(2000);
	t.getSelectbigbangcompny().click();
	Thread.sleep(2000);
	t.getCreatebtn().click();
	Thread.sleep(2000);
	
	}
}
