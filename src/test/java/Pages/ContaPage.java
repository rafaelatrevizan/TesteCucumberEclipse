package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContaPage extends BasePage {

	public ContaPage(WebDriver nav) {
		super(nav);
		
	}
	 
	public ContaPage fillNameConta(String conta) {
		nav.findElement(By.id("nome")).sendKeys(conta);
		return new ContaPage(nav);
	}
	
	public HomePage clickSave() {
		nav.findElement(By.xpath("//button[text() = \"Salvar\"]")).click();
		return new HomePage(nav);
	}


}
