package Pages;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(DataDrivenTestRunner.class)
//@DataLoader(filePaths = "InformacoesUsuariosTest.csv")

public class LoginPage extends BasePage {	

	public LoginPage(WebDriver nav) {
		super(nav);
	}

	public LoginPage fillEmail(String email) {
		nav.findElement(By.id("email")).sendKeys(email);
		return new LoginPage(nav);
	}

	public LoginPage fillPassword(String senha) {
		nav.findElement(By.id("senha")).sendKeys(senha);	
		return new LoginPage(nav);
	}

	public HomePage clickButton() {		
		nav.findElement(By.xpath("//button[text() =\"Entrar\"]")).click();
		return new HomePage(nav);
	}
}
