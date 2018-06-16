package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ContaPage;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class srBarrigaConta{
	private WebDriver nav;
//	private LoginPage Login;
//	public LoginPage Login  = new LoginPage(nav);
	
	
	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laercio\\Documents\\Automação\\Chrome Driver\\chromedriver.exe");
		nav = new ChromeDriver();
		nav.get("http://srbarriga.herokuapp.com/cadastro");
		nav.findElement(By.linkText("Login")).click();
	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String email) throws Throwable {
		LoginPage Login  = new LoginPage(nav);
		Login.fillEmail(email);	    
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String senha) throws Throwable {		
		LoginPage Login  = new LoginPage(nav);
		 Login.fillPassword(senha);	 
	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {
		LoginPage Login  = new LoginPage(nav);
		Login.clickButton();	    
	}

	@Então("^visualizo a página inicial$")
	public void visualizoAPáginaInicial() throws Throwable {
		String bemVindo = nav.findElement(By.xpath("//div[@class = \"alert alert-success\"]")).getText();
		Assert.assertEquals("Bem vindo, Rafaela!", bemVindo);
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
		HomePage home= new HomePage(nav);
		home.clickConta();
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
		HomePage home= new HomePage(nav);
		home.clickAdd();
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
	    ContaPage conta = new ContaPage(nav);
	    conta.fillNameConta(arg1);
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
		ContaPage conta = new ContaPage(nav);
	    conta.clickSave();
	}

	@Então("^a conta é inserida com sucesso$")
	public void aContaÉInseridaComSucesso() throws Throwable {
		String sucessConta = nav.findElement(By.xpath("//div[@class = \"alert alert-success\"]")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", sucessConta);
	}
	
	@Então("^vou notificar que o nome da conta é obrigatório$")
	public void souNotificarQueONomeDaContaÉObrigatório() throws Throwable {
		String obg = nav.findElement(By.xpath("//div[@class = \"alert alert-danger\"]")).getText();
		Assert.assertEquals("Informe o nome da conta", obg);
	    
	}
	
	@Então("^sou notificado que já existe uma conta com esse nome$")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() throws Throwable {
		String nomeExist = nav.findElement(By.xpath("//div[@class = \"alert alert-danger\"]")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", nomeExist);
	}
 
	@After
    public void tearDown (){
        nav.quit();
    }


}
