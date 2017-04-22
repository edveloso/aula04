package modelo;

import java.util.HashMap;
import java.util.Map;

public class PagamentoDefault implements Pagamento {
	
	private String descricao;
	
	public PagamentoDefault(String descricao) {
		this.descricao = descricao;
	}
	
	
	private Map<Integer, Double> banco = new HashMap<Integer, Double>();

	public boolean pagar(Venda venda, double valorPago){
		
		banco.put(venda.getCodigo(), venda.getValorTotal());
		
		if(venda.getValorTotal() <= valorPago){
			return true;	
		}
		return false;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
