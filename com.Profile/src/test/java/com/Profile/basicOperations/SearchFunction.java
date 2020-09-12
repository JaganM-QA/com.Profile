package com.Profile.basicOperations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.Profile.pom.HomePageElements;

 
 

public class SearchFunction extends LoginOperations
{
	
	public static void AutoSearching () throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		 
		com.Profile.pom.HomeAutoSearch has = new com.Profile.pom.HomeAutoSearch(driver);
		 for(int i = 1;  i<=2; i++)
			{
		 
			 int row = i;
			 String stxt = Excel.excelData("AutoSearch", row, 0);
			  
			 has.HomeAutoSearchText(stxt);
			 Screenshots.screenshot();
			 Thread.sleep(2000);
			 has.AutosearchSubmit();
			 Screenshots.screenshot();
	 
		}
		 
		 //has.AutosearchHome();
		 //ChildBrowser.BrowserClose();
	 
	}
	
	public static void TestimonialsSearch() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
		
		com.Profile.pom.TestimonialsPage tp = new com.Profile.pom.TestimonialsPage(driver);
		for(int i = 1;  i<=2; i++)
		{
	 
		 int row = i;
		 String stxt = Excel.excelData("Testimonial", row, 0);
		 tp.TestimonialMenu();
		 tp.SearchText(stxt);
		 tp.SearchSubmit();
		 Screenshots.screenshot();
		 Thread.sleep(2000);
 
	   }
	}
	
//	public static void DisabledText() throws EncryptedDocumentException, IOException, InterruptedException
//	{
//	 
//		HomeDisableFields hdf = new HomeDisableFields(driver);
//		for(int i = 1;  i<=2; i++)
//		{
//	 
//		 int row = i;
//		 String nm = Excel.excelData("Disabled", row, 0);
//		 String mob = Excel.excelData("Disabled", row, 1);
//		 String em = Excel.excelData("Disabled", row, 2);
//		  hdf.DisabledName(nm);
//		  hdf.DisabledMobile(mob);
//		  hdf.DisabledEmail(em);
//		  driver.navigate().refresh();
//		  Screenshots.screenshot();
//		 Thread.sleep(2000);
// 
//	}
//	hdf.DisabledHome();
//	 
//}
	 
	public static void ElementText() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
		
		HomePageElements hpe = new HomePageElements(driver);
		for(int i = 1;  i<=2; i++)
		{
	 
		 int row = i;
		 String un = Excel.excelData("Elements", row, 0);
		 String pass = Excel.excelData("Elements", row, 1);
		 String padd = Excel.excelData("Elements", row, 2);
		 String cadd = Excel.excelData("Elements", row, 3);
		  
		 hpe.ElementUserName(un);
		 hpe.ElementPassword(pass);
		 hpe.ElementLocation();
		 hpe.ElementCheckbox();
		 hpe.ElementRadio();
		 hpe.ElementPAddress(padd);
		 hpe.ElementCAddress(cadd);
		  
		 Screenshots.screenshot();
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();

	   }
		
	 
	}
}
	 