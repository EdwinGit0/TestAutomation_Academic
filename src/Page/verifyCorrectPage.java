package Page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyCorrectPage {
	 WebDriver driver;
	
	public verifyCorrectPage(WebDriver driver) {
		this.driver = driver;
	}
	 public boolean IsTitleDisplayed(String message) {
	    	return driver.getTitle().equals(message);
	    } 
	 public boolean IsMessageEmpty(String message,int n) {
		    List<WebElement> div = driver.findElements(By.tagName("div"));
		    System.out.println(div.get(n).getText());
			    return div.get(n).getText().equals(message);
	 } 
	 public boolean IsRegisterDisplayed(String message) {
		 List<WebElement> div = driver.findElements(By.tagName("h2"));
		 System.out.println(div.get(0).getText());
		 	return div.get(0).getText().equals(message);
	    } 
}
