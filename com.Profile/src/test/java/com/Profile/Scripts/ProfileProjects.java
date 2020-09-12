package com.Profile.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import com.Profile.basicOperations.LoginOperations;
import com.Profile.basicOperations.Screenshots;
import com.Profile.pom.ProjectPageModalPopup;
import com.Profile.pom.ProjectsPage;

public class ProfileProjects extends LoginOperations
{
	@Test
	public static void ProjectList() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{

		LoginOperations.LogIn();
		ProjectsPage pp = new ProjectsPage(driver);
		ProjectPageModalPopup.ProjectList(); 
		Screenshots.screenshot();
		pp.ProjectLogout();
		LoginOperations.LogOut();

	}

}
