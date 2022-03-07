package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyRepeatedRegistration {
WebDriver driver;
	
	//datos correctos para el llenado del formulario de registro

	@FindBy(xpath = ".//a[(@href='http://serene-hamlet-22329.herokuapp.com/personalAcademico')]")
	private WebElement registro;
	@FindBy(xpath = ".//a[(@href='http://serene-hamlet-22329.herokuapp.com/personalAcademico/create')]")
	private WebElement formulario;
	@FindBy(xpath = ".//input[(@name='nombre')]")
	private WebElement nombre;
	@FindBy(xpath = ".//input[(@name='apellido')]")
	private WebElement apellido;
	@FindBy(xpath = ".//input[(@name='codigoSis')]")
	private WebElement codigoSis;
	@FindBy(xpath = ".//input[(@name='telefono')]")
	private WebElement telefono;
	@FindBy(xpath = ".//input[(@name='password')]")
	private WebElement password;
	@FindBy(xpath = ".//input[(@name='email')]")
	private WebElement email;
	@FindBy(xpath = ".//select[(@name='rol')]/option[(@value='2')]")
	private WebElement rol;
	@FindBy(xpath = ".//select[(@name='unidad')]/option[(@value='2')]")
	private WebElement unidad;
	@FindBy(xpath = ".//select[(@name='facultad')]/option[(@value='2')]")
	private WebElement facultad;
	@FindBy(xpath = ".//select[(@name='carrera')]/option[(@value='2')]")
	private WebElement carrera;
	@FindBy(xpath = ".//input[(@value='Guardar')]")
	private WebElement guardar;
	
	
	public verifyRepeatedRegistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public verifyCorrectPage validForm_12() {
		registro.click();
		formulario.click();
		nombre.sendKeys("Ana");
		apellido.sendKeys("Ana");
		codigoSis.sendKeys("201603456");
		telefono.sendKeys("99999999999999");
		password.sendKeys("publicaa");
		email.sendKeys("ronaldo@gmail.com");
		rol.click();
		unidad.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		facultad.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		carrera.click();
		
		guardar.click();
		
		return new verifyCorrectPage(driver);
	}
	public verifyCorrectPage validForm_13() {
		registro.click();
		formulario.click();
		nombre.sendKeys("Ana");
		apellido.sendKeys("Ana");
		codigoSis.sendKeys("201706778");
		telefono.sendKeys("99999999999999");
		password.sendKeys("publicaa");
		email.sendKeys("chevycheluis@gmail.com");
		rol.click();
		unidad.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		facultad.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		carrera.click();
		
		guardar.click();
		
		return new verifyCorrectPage(driver);
	}
}
