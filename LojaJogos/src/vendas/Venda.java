package vendas;
import produtos.RepositorioProduto;
public class Venda {
	private String id;
	private RepositorioProduto produto;
	private double valor;
	public Venda(String id, RepositorioProduto produto, double valor){
		this.id=id;
		this.produto=produto;
		this.valor=valor;
	}
	public String getId() {
		return this.id;
	}
	public RepositorioProduto getProduto() {
		return this.produto;
	}
	public double getValor() {
		return this.valor;
	}
}
