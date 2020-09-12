package com.Profile.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Profile.basicOperations.LoginOperations;
import com.Profile.basicOperations.Screenshots;

import com.Profile.basicOperations.ActionClass;
import com.Profile.basicOperations.AlertMessages;
import com.Profile.basicOperations.ChildBrowser;
import com.Profile.basicOperations.FileUpload;
 
import com.Profile.basicOperations.Screenshots;
import com.Profile.basicOperations.SearchFunction;
import com.Profile.pom.FileUploadForm;
import com.Profile.pom.HomeAutoSearch;
import com.Profile.pom.HomeButtons;
import com.Profile.pom.HomeDisableFields;
import com.Profile.pom.HomePage;
import com.Profile.pom.HomePageElements;
import com.Profile.pom.Tutorials;

public class ProfileHomePageMultipleMethods extends LoginOperations
{
	@Test(priority=1)
	public void ProfileHomeAutoSearch() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		 LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageAutosearch();
		//ChildBrowser.ChildBrowserOpen();
		SearchFunction.AutoSearching();
		Screenshots.screenshot();
		HomeAutoSearch has = new HomeAutoSearch(driver);
		has.AutosearchHome();
		// ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		LoginOperations.LogOut();
	}
	
	@Test(priority=2) 
 	public void ProfileHomeButton() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
 	{
		 LoginOperations.LogIn();
		 ActionClass.ActionClassHome();
		 HomePage hp = new HomePage(driver);
		  hp.HomepageButtons();
		 //ChildBrowser.ChildBrowserOpen();
		 
		 HomeButtons hbs = new HomeButtons(driver);
		 hbs.HomeButtonCheckButton1(); 
		 AlertMessages.AcceptAlert();
		 hbs.HomeButtonCheckBox();
		 hbs.HomeButtonCheckButton2();
		 AlertMessages.AcceptAlert();
		 hbs.HomeButtonRadio();
		 Screenshots.screenshot();
		 hbs.ButtonHome();
		// ChildBrowser.ChildBrowserClose();
		 hp.HomePageLogout();
		 LoginOperations.LogOut();
 	}
	
	@Test(priority=3) 
	public  void ProfileHomeDisabledText() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
			{
			  
			LoginOperations.LogIn();
			 ActionClass.ActionClassHome();
			 HomePage hp = new HomePage(driver);
			 hp.HomepageDisabledFields();
			 //ChildBrowser.ChildBrowserOpen();
			 
			 JavascriptExecutor js = (JavascriptExecutor)driver;
		     js.executeScript("document.getElementById('name').value='Jagan'");
		     Thread.sleep(2000);
		     js.executeScript("document.getElementById('mob').value='9945382213'");
		     Thread.sleep(2000);
		     js.executeScript("document.getElementById('email').value='jagan14gee@gmail.com'");
		     Thread.sleep(2000);
		     Screenshots.screenshot();
		      js.executeScript("document.getElementById('name').value=' '");
		     Thread.sleep(2000);
		     
		     js.executeScript("document.getElementById('mob').value=' '");
		     Thread.sleep(2000);
		     
		     js.executeScript("document.getElementById('email').value=' '");
		     Thread.sleep(2000);
		     Screenshots.screenshot();
		   //ChildBrowser.ChildBrowserClose();
		     HomeDisableFields hdf = new HomeDisableFields(driver);
		     hdf.DisabledHome();
		     hp.HomePageLogout();
		     LoginOperations.LogOut();
	       }
	
	@Test(priority=4) 
	 public   void ProfileHomeElementsText() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
		{
		 
		 LoginOperations.LogIn();
		 ActionClass.ActionClassHome();
		 HomePage hp = new HomePage(driver);
		 hp.HomepageElements();
		 //ChildBrowser.ChildBrowserOpen();
		 SearchFunction.ElementText();
		 HomePageElements hpe = new HomePageElements(driver);
		 hpe.ElementHome();
	  //ChildBrowser.ChildBrowserClose();
		 hp.HomePageLogout();
		 LoginOperations.LogOut();
     }
	
	@Test(priority=5)
	public  void ProfileHomeFileUploading() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
	 
		LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageFileUpload();
		//ChildBrowser.ChildBrowserOpen();
		FileUpload.FileUploadCancel();
		Screenshots.screenshot();
		FileUpload.FileUploadAccept();
		Screenshots.screenshot();
		FileUploadForm fu = new FileUploadForm(driver);
		fu.Filename();
		fu.FileHome();
	 //ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		LoginOperations.LogOut();
	}
	@Test(priority=6)
	public  void ProfileVideoTutorials() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		LoginOperations.LogIn(); 
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageTutorials();
		//ChildBrowser.ChildBrowserOpen();
		ActionClass.ActionClassVideo();
		Tutorials tv = new Tutorials(driver);
		tv.TutorialVideoHome();
	   //ChildBrowser.ChildBrowserClose();
	   	hp.HomePageLogout();
		//LoginOperations.LogOut();

	}

}
