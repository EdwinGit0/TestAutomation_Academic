package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Page.login;
import Page.verifyCorrectForm;
import Page.verifyCorrectPage;

public class VerifyForm_1 {
	String baseUrl = "http://serene-hamlet-22329.herokuapp.com/login";
	public WebDriver driver;
	
	private login loginPage;
	private verifyCorrectForm verCorrectForm_1;
	private verifyCorrectPage verCorrectPage;
	
	@Test
	public void verifyCorrectForm() {
		
		loginPage = new login(driver);							//loguearse
		verCorrectForm_1 = new verifyCorrectForm(driver);		//Verficar el formulario
		loginPage.validloginPage();
		verCorrectForm_1.validForm();
		
		verCorrectPage = new verifyCorrectPage(driver);
	    
	    Assert.assertTrue(verCorrectPage.IsRegisterDisplayed("Personal Academico\n" + 
	    		"Archivo CSV"), "Error");
	    
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

