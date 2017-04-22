package visao;
import modelo.Cliente;
import modelo.Pagamento;
import modelo.PagamentoCartao;
import modelo.PagamentoCheque;
import modelo.PagamentoDindin;
import modelo.Produto;
import modelo.Venda;

public class Formulario {

	public static void main(String[] args) {

		Cliente cli = new Cliente();
		cli.setCpf("1234");
		cli.setNome("Veloso");
		
		Venda umaVenda = new Venda(cli);
		umaVenda.setCodigo(10);
		
		Produto prod = new Produto();
		prod.setCodigo(1);
		prod.setNome("Playstation 4");
		prod.setValor(200);
		
		umaVenda.adicionarProduto(prod);
		
		prod = new Produto();
		prod.setCodigo(2);
		prod.setNome("Xbox 360");
		prod.setValor(1000);
		
		umaVenda.adicionarProduto(prod);
		
		Pagamento pg = new PagamentoCheque();
		pg = new PagamentoCartao();
//		
		pg = new PagamentoDindin();
		
		boolean retorno = umaVenda.finalizarCompra(pg, 1200.0);
		
		System.out.print(  retorno );
		
		System.out.println(umaVenda);
		  
	}

}
