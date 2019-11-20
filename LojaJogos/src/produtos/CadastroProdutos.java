package produtos;

public class CadastroProdutos {
	private RepositorioProdutos produto;

	public CadastroProdutos(RepositorioProdutos repositorio) {
		produto = repositorio;
	}

	public void Cadastrar(Produto produto) throws ProdutoJaCadastradoException {
		if (produto.existe(produto.getId()) == false) {
			throw new ProdutoJaCadastradoException(produto);
		} else {
			produto.inserir(produto);
		}
	}

	public Produto procurar(String id) throws ProdutoNaoCadastradoException {
		if (produto.procurar(id).equals(null)) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			return produto.procurar(id);
		}
	}

	public void remover(String id) throws ProdutoNaoCadastradoException {
		if (produto.procurar(id).equals(null)) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			produto.remover(id);
		}
	}

	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException {
		if (produto.existe(produto.getId())) {
			throw new ProdutoNaoCadastradoException(produto.getId());
		} else {
			return produto.atualizar(produto);
		}
	}
	public boolean existe (String id) throws ProdutoNaoCadastradoException {
		if (produto.existe(id) == false) {
			throw new ProdutoNaoCadastradoException(id);
		} else {
			return produto.existe(id);
		}
	}
	///
}
