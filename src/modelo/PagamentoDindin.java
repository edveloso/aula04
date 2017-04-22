package modelo;


public class PagamentoDindin extends PagamentoDefault {

	public PagamentoDindin() {
		super("Pagamento em dinheiro");
	}
	 
	public boolean pagar(Venda venda, double valorPago) {
		
		venda.setValorTotal(venda.getValorTotal() * .9);
		System.out.println("novo valor da venda: " + venda.getValorTotal());
		
		return super.pagar(venda, valorPago);
		
	}
	
	
}
