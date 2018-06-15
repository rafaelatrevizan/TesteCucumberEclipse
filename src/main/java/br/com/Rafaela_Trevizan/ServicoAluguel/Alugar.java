package br.com.Rafaela_Trevizan.ServicoAluguel;


import br.com.Rafaela_Trevizan.FilmeLocadora.Filme;
import br.com.Rafaela_Trevizan.FilmeLocadora.NotaAluguel;
import br.com.Rafaela_Trevizan.FilmeLocadora.TipoAlguel;
import utils.dateUtils;


public class Alugar {
	
	public NotaAluguel alugarFilme(Filme filme, TipoAlguel tipo) {
		if (filme.getEstoque() == 0) 
			throw  new RuntimeException("Filme sem estoque");
		
		NotaAluguel nota = new NotaAluguel();	
		
		switch (tipo) {
		case COMUM:
			nota.setPreco(filme.getAluguel());		
			nota.setDataEntrega(dateUtils.obterDataDiferenca(1));
			nota.setPontuacao(1);		
		break;
		case ESTENDIDA:
			nota.setPreco(filme.getAluguel() * 2);		
			nota.setDataEntrega(dateUtils.obterDataDiferenca(3));
			nota.setPontuacao(2);
			break;
		case SEMANAL:
			nota.setPreco(filme.getAluguel() * 3);		
			nota.setDataEntrega(dateUtils.obterDataDiferenca(7));
			nota.setPontuacao(3);
			break;
			}	
		
		
//		if ("estendida".equals(tipo)){
//			nota.setPreco(filme.getAluguel() * 2);		
//			nota.setDataEntrega(dateUtils.obterDataDiferenca(3));
//			nota.setPontuacao(2);
//		}
//		else if ("semanal".equals(tipo)){
//			nota.setPreco(filme.getAluguel() * 3);		
//			nota.setDataEntrega(dateUtils.obterDataDiferenca(7));
//			nota.setPontuacao(3);
//		}else if ("comum".equals(tipo)){
//			nota.setPreco(filme.getAluguel());		
//			nota.setDataEntrega(dateUtils.obterDataDiferenca(1));
//			nota.setPontuacao(1);
//		} else {
//		nota.setPreco(filme.getAluguel());		
//		nota.setDataEntrega(dateUtils.obterDataDiferenca(1));
//		nota.setPontuacao(1);
//		}
//		

		filme.setEstoque(filme.getEstoque() - 1);
		return nota;

		}
}