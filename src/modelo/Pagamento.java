package modelo;

public interface Pagamento {

	boolean pagar(Venda venda, double valor);
	
	String getDescricao();
}
