package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataReader.PropertyFileReader;

public class ASAPEPLoginPage {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws IOException {
		
		driver = new FirefoxDriver();
		driver.get(PropertyFileReader.getFile().getProperty("URL"));
	}
	
	@Test
	public void login() {
		
		
	}

}
