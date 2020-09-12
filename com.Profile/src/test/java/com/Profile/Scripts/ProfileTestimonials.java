package com.Profile.Scripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.Profile.basicOperations.LoginOperations;
import com.Profile.basicOperations.Screenshots;
import com.Profile.basicOperations.SearchFunction;
import com.Profile.pom.TestimonialsPage;
 

public class ProfileTestimonials extends LoginOperations
{

	@Test
	public static void TestimonialsSearch() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
		
		LoginOperations.LogIn();
		TestimonialsPage tp = new TestimonialsPage(driver);
		SearchFunction.TestimonialsSearch();
		 Screenshots.screenshot();
		 tp.TestimonialLogout();
		 LoginOperations.LogOut();
}
	

}
