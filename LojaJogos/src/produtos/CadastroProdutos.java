package produtos;

public class CadastroProdutos {
	private RepositorioProdutos produto;

	public CadastroProdutos(RepositorioProdutos repositorio) {
		this.produto = repositorio;
	}

	public void Cadastrar(Produto produto) throws ProdutoJaCadastradoException {
		if (this.produto.existe(produto.getId()) == false) {
			throw new ProdutoJaCadastradoException(produto);
		} else {
			this.produto.inserir(produto);
		}
	}

	public Produto procurar(String id) throws ProdutoNaoCadastradoException {
		if (this.produto.procurar(id).equals(null)) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			return this.produto.procurar(id);
		}
	}

	public void remover(String id) throws ProdutoNaoCadastradoException {
		if (this.produto.procurar(id).equals(null)) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			this.produto.remover(id);
		}
	}

	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException {
		if (this.produto.existe(produto.getId())) {
			throw new ProdutoNaoCadastradoException(produto.getId());
		} else {
			return this.produto.atualizar(produto);
		}
	}
	public boolean existe (String id) throws ProdutoNaoCadastradoException {
		if (this.produto.existe(id) == false) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			return this.produto.existe(id);
		}
	}
	///
}
