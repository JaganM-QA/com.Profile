package com.Profile.basicOperations;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import pom.DynamicTable;
 
public class DynamicGrid extends LoginOperations
{
	
	public static void DyanmicTableAddName() throws InterruptedException, EncryptedDocumentException, IOException, InvalidFormatException 
	{
		
	       List<WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
	 
			WebElement empname  = textbox.get(0);
			empname.click();
			String ename= Excel.excelData("Dynamictable", 1, 0);
			empname.sendKeys(ename);
			Thread.sleep(2000);
 
		}
	
	 
	public static void DyanmicTableAddDesig() throws InterruptedException
	{
 
		List<WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
		WebElement empdesig  = textbox.get(1);
		empdesig.click();
		Thread.sleep(2000);
	}
 
	public static void DyanmicTableAddExp() throws InterruptedException
	{
 
		List<WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
		WebElement empdesig  = textbox.get(2);
		empdesig.click();
		Thread.sleep(2000);
	}
 
}
