package com.Profile.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Profile.basicOperations.LoginOperations;
import com.Profile.basicOperations.Screenshots;
import com.Profile.pom.AboutMe;
 
public class ProfileAboutMe extends LoginOperations
{

	@Test
	public static void AboutMeProfile() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
		//LoginOperations.LogIn();
		AboutMe am = new AboutMe(driver);
		am.AboutMeMenu();
		Screenshots.screenshot();
		 am.AboutMeLogout();
		 LoginOperations.LogOut();
  
	}
}
