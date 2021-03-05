package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import configuration.Configuration;
import functionLibrary.ApplicationLibrary;

public class CallDetailsValidation {
	
	@Test
	public void test1()
	{
		ApplicationLibrary lib= new ApplicationLibrary();
		
		WebDriver dr=lib.launchBrowser("Chrome");
		dr.get(Configuration.url);
	}

}
