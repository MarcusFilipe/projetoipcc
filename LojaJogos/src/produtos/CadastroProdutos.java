package produtos;

public class CadastroProdutos {
	private RepositorioProdutos produto;

	public CadastroProdutos(RepositorioProdutos repositorio) {
		this.produto = repositorio;
	}

	public void Cadastrar(Produto produto) throws ProdutoJaCadastradoException {
		if (this.produto.existeProduto(produto.getId())) {
			throw new ProdutoJaCadastradoException(produto);
		} else {
			this.produto.inserirProduto(produto);
		}
	}

	public Produto procurar(String id) throws ProdutoNaoCadastradoException {
		if (this.produto.existeProduto(id)) {
			return this.produto.procurarProduto(id);
		} else {
			throw new ProdutoNaoCadastradoException(id);
		}
	}

	public void remover(String id) throws ProdutoNaoCadastradoException {
		if (this.produto.existeProduto(id)) {
			this.produto.removerProduto(id);
		} else {
			throw new ProdutoNaoCadastradoException(id);
		}
	}

	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException {
		if (this.produto.existeProduto(produto.getId())) {
			this.produto.atualizarProduto(produto);
		} else {
			throw new ProdutoNaoCadastradoException(produto.getId());
		}
	}
}
