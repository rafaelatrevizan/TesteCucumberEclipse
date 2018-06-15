package br.com.RafaelaTrevizan.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import br.com.Rafaela_Trevizan.FilmeLocadora.Filme;
import br.com.Rafaela_Trevizan.FilmeLocadora.NotaAluguel;
import br.com.Rafaela_Trevizan.FilmeLocadora.TipoAlguel;
import br.com.Rafaela_Trevizan.ServicoAluguel.Alugar;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utils.dateUtils;

public class LocadoraSteps {
	
	private Filme filme;
	private Alugar aluguel = new Alugar();
	private NotaAluguel nota;
	private String erro;
	private TipoAlguel tipoAluguel;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void um_filme_com_estoque_de_unidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
	    
	}

	@Dado("^que o preço do aluguel seja R\\$(\\d+)$")
	public void que_o_preço_do_aluguel_seja_R$(int arg1) throws Throwable {
		filme.setAluguel(arg1);
	    
	}
	
	@Dado("^um filme$")
	public void umFilme(DataTable table) throws Throwable {
	    Map<String, String> map = table.asMap(String.class, String.class);
	    filme = new Filme();
		filme.setEstoque(Integer.parseInt(map.get("estoque")));
		filme.setAluguel(Integer.parseInt(map.get("preco")));	 
		String tipo = map.get("tipo");	 
		tipoAluguel = tipo.equals("semanal")? TipoAlguel.SEMANAL: tipo.equals("estendida")? TipoAlguel.ESTENDIDA: TipoAlguel.COMUM;
	}

	
	@Quando("^alugar$")
	public void alugar() throws Throwable {
		try {
		nota = aluguel.alugarFilme(filme, tipoAluguel);
		}
		catch (RuntimeException e){
			erro = e.getMessage();		
		
		}
	  
	}

	@Então("^o preço do aluguel será R\\$(\\d+)$")
	public void o_preço_do_aluguel_será_R$(int preco) throws Throwable {
		Assert.assertEquals(preco, nota.getPreco());	
	    
	}

	@Então("^a data de entrega será no dia seguinte$")
	public void a_data_de_entrega_será_no_dia_seguinte() throws Throwable {
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, 1);
	    
	    Date dataRetorno = nota.getDataEntrega();
	    Calendar calRetorno = Calendar.getInstance();
	    calRetorno.setTime(dataRetorno);
	    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
	    Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
	    Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}
	
	@Então("^não será possível por falta de estoque$")
	public void nãoSeráPossívelPorFaltaDeEstoque() throws Throwable {
	    Assert.assertEquals("Filme sem estoque", erro);
	}


	@Então("^o estoque do filme será (\\d+) unidade$")
	public void o_estoque_do_filme_será_unidade(int arg1) throws Throwable {
		Assert.assertEquals(arg1, filme.getEstoque());			
	    
	}
	
	@Dado("^que o tipo de aluguel seja (.*)$")
	public void queOTipoDeAluguelSejaExtendido(String tipo) throws Throwable {
		tipoAluguel = tipo.equals("semanal")? TipoAlguel.SEMANAL: tipo.equals("estendida")? TipoAlguel.ESTENDIDA: TipoAlguel.COMUM;
	}

	@Então("^a data de entrega será em (\\d+) dias$")
	public void aDataDeEntregaSeráEmDias(int qtdias) throws Throwable {
		Date dataEsperada = dateUtils.obterDataDiferenca(qtdias);
		Date dataReal  = nota.getDataEntrega();
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");		

		Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
	}

	@Então("^a pontuação recebida será de (\\d+) pontos$")
	public void aPontuaçãoRecebidaSeráDePontos(int arg1) throws Throwable {
	   Assert.assertEquals(arg1, nota.getPontuacao());
	}
	




}
