package br.com.RafaelaTrevizan.steps;

import br.com.Rafaela_Trevizan.FilmeLocadora.Filme;
import br.com.Rafaela_Trevizan.ServicoAluguel.Aluguar;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LocadoraSteps {
	
	private Filme filme;
	private Aluguar aluguel;
	
	@Dado("^um filme com estoque  de (\\d+) unidades$")
	public void um_filme_com_estoque_de_unidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
	    
	}

	@Dado("^que o preço do aluguel seja R\\$(\\d+)$")
	public void que_o_preço_do_aluguel_seja_R$(int arg1) throws Throwable {
		aluguel.alugarFilme(filme);
	    
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
	  
	}

	@Então("^o preço do aluguel será R\\$(\\d+)$")
	public void o_preço_do_aluguel_será_R$(int arg1) throws Throwable {
	    
	}

	@Então("^a data de entrega será no dia seguinte$")
	public void a_data_de_entrega_será_no_dia_seguinte() throws Throwable {
	    
	}

	@Então("^o estoque do filme será (\\d+) unidade$")
	public void o_estoque_do_filme_será_unidade(int arg1) throws Throwable {
	    
	}


}
