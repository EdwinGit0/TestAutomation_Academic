package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Page.login;
import Page.verifyCorrectPage;
import Page.verifyEmptyForm;

public class VerifyForm_3 {
	String baseUrl = "http://serene-hamlet-22329.herokuapp.com/login";
	public WebDriver driver;
	
	private login loginPage;
	private verifyEmptyForm verCorrectForm_3;
	private verifyCorrectPage verCorrectPage;
	
	@Test
	public void verifyCorrectForm() {
		
		loginPage = new login(driver);							//loguearse
		verCorrectForm_3 = new verifyEmptyForm(driver);		//Verficar el formulario
		loginPage.validloginPage();
		verCorrectForm_3.validForm_3();
		
		verCorrectPage = new verifyCorrectPage(driver);
	    
	    Assert.assertTrue(verCorrectPage.IsMessageEmpty("El campo es requerido",16), "Error");
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

