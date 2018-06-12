package br.com.Rafaela_Trevizan.TesteCucumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class aprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Eu aqui");

	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor é (\\d+)$")
	public void queOValorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^incrementar em (\\d+)$")
	public void incrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);

	}
	
	Date entrega = new Date();
	
	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
	   Calendar cal = Calendar.getInstance();
	   cal.set(Calendar.DAY_OF_MONTH, dia);
	   cal.set(Calendar.MONTH, mes -1);
	   cal.set(Calendar.YEAR, ano);
	   entrega = cal.getTime();
	   
	}

	@Quando("^a entrega atrasar (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarDias(int arg1, String tempo) throws Throwable {
		   Calendar cal = Calendar.getInstance();
		   cal.setTime(entrega);
		   if (tempo.equals("dias")) {
			   cal.add(Calendar.DAY_OF_MONTH, arg1); 
		   }
		   if (tempo.equals("meses")) {
			   cal.add(Calendar.MONTH, arg1);
		   }
		   entrega = cal.getTime();
	  
	}

	@Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String datafomat = format.format(entrega);
		Assert.assertEquals(data, datafomat );		
	    
	}	
	
	@Dado("^que o ticket é AF(\\d+)$")
	public void queOTicketÉAF(int arg1) throws Throwable {
	    
	}

	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemÉR$(int arg1, int arg2) throws Throwable {
	    
	}

	@Dado("^que o nome do passageiro é \"([^\"]*)\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
	  
	}

	@Dado("^que o telefone do passageiro é (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiroÉ(int arg1, int arg2) throws Throwable {
	    
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	   
	}

	@Então("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	    
	}



}
