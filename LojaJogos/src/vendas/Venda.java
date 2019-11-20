package vendas;
import produtos.RepositorioProdutos;
public class Venda {
	private String id;
	private RepositorioProdutos produto;
	private double valor;
	public Venda(String id, RepositorioProdutos produto, double valor){
		this.id=id;
		this.produto=produto;
		this.valor=valor;
	}
	public String getId() {
		return this.id;
	}
	public RepositorioProdutos getProduto() {
		return this.produto;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor=valor;
	}
	public void setProduto(RepositorioProdutos produto) {
		this.produto=produto;
	}
}
