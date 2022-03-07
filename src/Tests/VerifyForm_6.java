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

public class VerifyForm_6 {
	String baseUrl = "http://serene-hamlet-22329.herokuapp.com/login";
	public WebDriver driver;
	
	private login loginPage;
	private verifyEmptyForm verCorrectForm_6;
	private verifyCorrectPage verCorrectPage;
	
	@Test
	public void verifyCorrectForm() {
		
		loginPage = new login(driver);							//loguearse
		verCorrectForm_6 = new verifyEmptyForm(driver);		//Verficar el formulario
		loginPage.validloginPage();
		verCorrectForm_6.validForm_6();
		
		verCorrectPage = new verifyCorrectPage(driver);
	    
	    Assert.assertTrue(verCorrectPage.IsMessageEmpty("El campo es requerido",26), "Error");
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

