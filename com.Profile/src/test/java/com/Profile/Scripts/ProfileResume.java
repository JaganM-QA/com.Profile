package com.Profile.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Profile.basicOperations.LoginOperations;
import com.Profile.basicOperations.Screenshots;
import com.Profile.pom.ResumePage;
 

public class ProfileResume extends LoginOperations
{

	@Test
	public static void ResumeProfile() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		 LoginOperations.LogIn();
		ResumePage rp = new ResumePage(driver);
		rp.ResumeMenu();
		Screenshots.screenshot();
		Thread.sleep(2000);
		rp.ResumeLogout();
		LoginOperations.LogOut();
	 
	}
}
