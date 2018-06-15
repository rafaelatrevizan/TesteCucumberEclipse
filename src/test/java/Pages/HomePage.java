package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver nav) {
		super(nav);
		
	}
	
	public HomePage clickConta() {
		nav.findElement(By.linkText("Contas")).click();
		return new HomePage(nav);
	}
	
	public ContaPage clickAdd() {
		nav.findElement(By.linkText("Adicionar")).click();
		return new ContaPage(nav);
	}
	
	public HomePage msgSucess() {
		nav.findElement(By.linkText("Contas")).click();
		return new HomePage(nav);
	}
		

}
