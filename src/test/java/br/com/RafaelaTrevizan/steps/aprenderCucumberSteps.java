package br.com.RafaelaTrevizan.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.com.RafaelaTrevinza.dateConverter.DataConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class aprenderCucumberSteps {

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
	
//	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
//	public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
//	   Calendar cal = Calendar.getInstance();
//	   cal.set(Calendar.DAY_OF_MONTH, dia);
//	   cal.set(Calendar.MONTH, mes -1);
//	   cal.set(Calendar.YEAR, ano);
//	   entrega = cal.getTime();
//	   
//	}
	
	@Dado("^que a entrega é dia (.*)$")
	public void queAEntregaÉDia(@Transform(DataConverter.class) Date data) throws Throwable {
	  	   entrega = data;
	  	   System.out.println(entrega);
	   
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
	
//	private String tkt = null;
//	private int passagemreal = 0;
//	private int passagemcent = 0;
//	private String passageiro = null;
//	private int tel1 = 0;
//	private int tel2 = 0;
	
	@Dado("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) throws Throwable {
	   
	}

	@Dado("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double valor) throws Throwable {
		System.out.println(valor);		
	    
	}

	@Dado("^que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
		
	  
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {
			
	    
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	   
	}

	@Então("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	    
	}


}
