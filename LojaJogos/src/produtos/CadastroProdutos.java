package produtos;

public class CadastroProdutos {
	private RepositorioProdutos produto;

	public CadastroProdutos(RepositorioProdutos repositorio) {
		this.produto = repositorio;
	}

	public void Cadastrar(Produto produto) throws ProdutoJaCadastradoException {
		if (this.produto.existeProduto(produto.getId()) == false) {
			throw new ProdutoJaCadastradoException(produto);
		} else {
			this.produto.inserirProduto(produto);
		}
	}

	public Produto procurar(String id) throws ProdutoNaoCadastradoException {
		if (this.produto.procurarProduto(id).equals(null)) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			return this.produto.procurarProduto(id);
		}
	}

	public void remover(String id) throws ProdutoNaoCadastradoException {
		if (this.produto.procurarProduto(id).equals(null)) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			this.produto.removerProduto(id);
		}
	}

	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException {
		if (this.produto.existeProduto(produto.getId())) {
			throw new ProdutoNaoCadastradoException(produto.getId());
		} else {
			this.produto.atualizarProduto(produto);
		}
	}
	public boolean existe (String id) throws ProdutoNaoCadastradoException {
		if (this.produto.existeProduto(id) == false) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			return this.produto.existeProduto(id);
		}
	}
	///
}
