package produtos;

public class RepositorioProdutoLista {
	private Produto produtos;
	private RepositorioProdutoLista proximo;

	public void inserir(Produto produto) {
		if (this.produtos == null) {
			this.produtos = produto;
			this.proximo = new RepositorioProdutoLista();
		} else if (this.produtos != null) {
			this.proximo.inserir(produto);
		}
	}

	public void remover(String id) throws ProdutoNaoCadastradoException {
		if (this.produtos != null && this.produtos.getId().equals(id)) {
			this.produtos = this.proximo.produtos;
			this.proximo = this.proximo.proximo;
		} else if (this.produtos != null) {
			this.proximo.remover(id);
		} else
			id = "";
	}

	public boolean existe(String id) {
		if (this.produtos != null && this.produtos.getId().equals(id)) {
			return true;
		} else if (this.produtos != null) {
			return this.proximo.existe(id);
		} else {
			return false;
		}
	}

	public Produto procurar(String id) throws ProdutoNaoCadastradoException {
		if (this.produtos != null && this.produtos.getId().equals(id)) {
			return this.produtos;
		} else if (this.produtos != null) {
			return this.proximo.procurar(id);
		} else {
			return null;
		}
	}

	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException {
		if (this.produtos != null && this.produtos.getId().equals(produto.getId())) {
			this.produtos = produto;
		} else if (this.produtos != null) {
			this.proximo.atualizar(produto);
		} else {
			produto = null;
		}

	}
	
//
}