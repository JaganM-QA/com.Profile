package com.Profile.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Profile.basicOperations.AlertMessages;
import com.Profile.basicOperations.ChildBrowser;
import com.Profile.basicOperations.Excel;
import com.Profile.basicOperations.LoginOperations;
import com.Profile.basicOperations.Screenshots;
import com.Profile.pom.ContactEnquriy;
import com.Profile.pom.ContactPage;
 
 
//import pom.FileUploadForm;

public class ProfileContact extends LoginOperations
{

	@Test
	public static void ContactDetails() throws InterruptedException, EncryptedDocumentException, IOException, InvalidFormatException
	{
		 
		 LoginOperations.LogIn();
		
		Thread.sleep(5000);
		ContactPage cp = new ContactPage(driver);
		cp.ContactMenu();
		cp.ContactEnquiry();
		ChildBrowser.ChildBrowserOpen();
		
		Screenshots.screenshot();
		Thread.sleep(2000);
		
		ContactEnquriy ce = new ContactEnquriy(driver);
		String fn = Excel.excelData("EnquiryForm", 1, 0);
		String ln = Excel.excelData("EnquiryForm", 1, 1);
		String cou = Excel.excelData("EnquiryForm", 1, 2);
		String sub = Excel.excelData("EnquiryForm", 1, 3);
		ce.EnquiryRefresh();
		ce.EnquiryCancel();
		AlertMessages.CancelAlert();
		ce.EnquiryFname(fn);
		ce.EnquiryLname(ln);
		ce.EnquiryContry(cou);
		ce.EnquirySubject(sub);
		Screenshots.screenshot();
		Thread.sleep(2000);
		ce.EnquirySubmit();
		 AlertMessages.AcceptAlert();
		 ChildBrowser.ChildBrowserClose();
		 Thread.sleep(2000);
		 cp.ContactLogout();
		 Thread.sleep(2000);
		 LoginOperations.LogOut();
		 
	}
}
