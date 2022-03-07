package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Page.login;
import Page.verifyRepeatedRegistration;
import Page.verifyCorrectPage;

public class VerifyForm_12 {
	String baseUrl = "http://serene-hamlet-22329.herokuapp.com/login";
	public WebDriver driver;
	
	private login loginPage;
	private verifyRepeatedRegistration verCorrectForm_12;
	private verifyCorrectPage verCorrectPage;
	
	@Test
	public void verifyCorrectForm() {
		
		loginPage = new login(driver);							//loguearse
		verCorrectForm_12 = new verifyRepeatedRegistration(driver);		//Verficar el formulario
		loginPage.validloginPage();
		verCorrectForm_12.validForm_12();
		
		verCorrectPage = new verifyCorrectPage(driver);
	    
	    Assert.assertTrue(verCorrectPage.IsMessageEmpty("Codigo Sis ya registrado",19), "Error");
	}
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");					
		driver = new ChromeDriver();					  									
		driver.get(baseUrl);
		
	}
	
    @AfterTest
    public void quit() {   	
    	driver.close();	
    }
}

