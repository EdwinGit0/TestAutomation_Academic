package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyCorrectForm {
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
	
	
	public verifyCorrectForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public verifyCorrectPage validForm() {
		registro.click();
		formulario.click();
		nombre.sendKeys("Robert");
		apellido.sendKeys("Sarmiento");
		codigoSis.sendKeys("200411111");
		telefono.sendKeys("1000000");
		password.sendKeys("robert2004");
		email.sendKeys("robert@gmail.com");
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
