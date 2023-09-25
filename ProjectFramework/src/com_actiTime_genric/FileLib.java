package com_actiTime_genric;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	
	public String getproperty(String key) throws IOException 
	{
	FileInputStream fis=new FileInputStream("./Data/commondata.property");
	Properties p= new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
	}
	
	public String getexceldata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
	
	{
		FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public void setexceldata(String sheet,int row,int cell,String text) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(text);
		FileOutputStream fos= new FileOutputStream("./Data/testscript.xlsx");
		wb.write(fos);
	}
}
		

