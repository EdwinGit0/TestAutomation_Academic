package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	
	//datos correctos para el llenado de login

	@FindBy(xpath = ".//input[(@name='email')]")
	private WebElement email;
	@FindBy(xpath = ".//input[(@name='password')]")
	private WebElement password;
	@FindBy(xpath = ".//button[(@type='submit')]")
	private WebElement submit;
	
	
	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Acciones para el llenado y validacion
	public verifyCorrectPage validloginPage() {
		email.sendKeys("admin@gmail.com");
		password.sendKeys("laravel");
		submit.click();
		
		return new verifyCorrectPage(driver);
	}
	
}
