package br.com.Rafaela_Trevizan.ServicoAluguel;

import java.util.Calendar;
import java.util.Date;

import br.com.Rafaela_Trevizan.FilmeLocadora.Filme;
import utils.dateUtils;

public class Alugar {
	
	public NotaAluguel alugarFilme(Filme filme, String tipo) {
		if (filme.getEstoque() == 0) 
			throw  new RuntimeException("Filme sem estoque");
		
		NotaAluguel nota = new NotaAluguel();
		if ("extendida".equals(tipo)) {
			nota.setPreco(filme.getAluguel() * 2);
			nota.setDataEntrega(dateUtils.obterDataDiferenca(3));
			nota.setPontuacao(2);
		} else {
			nota.setPreco(filme.getAluguel());		
			nota.setDataEntrega(dateUtils.obterDataDiferenca(1));
			nota.setPontuacao(1);
		}		
		

		filme.setEstoque(filme.getEstoque() - 1);
		return nota;

		}
}