 package desenvolvedores;

import produtos.RepositorioProdutoArray;
import produtos.RepositorioProdutos;
import usuarios.PessoaJuridica;

public class Desenvolvedor extends PessoaJuridica
{
	
	private double porcentagemVenda;

	private RepositorioProdutoArray repositorioProdutosArray;

	
	public RepositorioProdutoArray getRepositorioProdutosArray() {
		return repositorioProdutosArray;
	}

	public Desenvolvedor(String nome,String email, String cnpj, double porcentagemVenda,RepositorioProdutoArray repositorioProdutosArray)
	{
		super(nome,email,cnpj);
		this.porcentagemVenda=porcentagemVenda;
		this.repositorioProdutosArray=repositorioProdutosArray;
	}
	
	public Desenvolvedor(String nome,String email, String cnpj, double porcentagemVenda)
	{
		super(nome,email,cnpj);
		this.porcentagemVenda=porcentagemVenda;
	}
	public double getPorcentagemVenda() {
		return porcentagemVenda;
	}

	public void setPorcentagemVenda(double porcentagemVenda) {
		this.porcentagemVenda = porcentagemVenda;
	}
	
}
