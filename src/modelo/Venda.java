package modelo;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private double valorTotal;
	
	private int codigo;
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	private Cliente cliente;
	
	private Pagamento pagamento;
	
	public Venda(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean finalizarCompra(Pagamento pagamento,
			       					double valorPago
			                  ){
		
		this.pagamento = pagamento;
		
		for(Produto prod : produtos){
			this.valorTotal += prod.getValor();
		}
		
		return this.pagamento.pagar(this, valorPago);
		
	}
	
	public void adicionarProduto(Produto produto){
		produtos.add(produto);
	}
	
	
	public double getValorTotal() {
		return valorTotal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String toString(){
		return "Cliente: " + cliente.getNome()
				+ " Valor venda:" + this.valorTotal
				+ "Forma pagamento: " + this.pagamento.getDescricao();
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
}
