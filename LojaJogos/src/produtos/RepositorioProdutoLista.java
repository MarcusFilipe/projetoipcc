package produtos;

public class RepositorioProdutoLista implements RepositorioProdutos {
	private Produto produtos;
	private RepositorioProdutoLista proximo;

	public void inserirProduto(Produto produto) {
		if (this.produtos == null) {
			this.produtos = produto;
			this.proximo = new RepositorioProdutoLista();
		} else if (this.produtos != null) {
			this.proximo.inserirProduto(produto);
		}
	}

	public void removerProduto(String id) {
		if (this.produtos != null && this.produtos.getId().equals(id)) {
			this.produtos = this.proximo.produtos;
			this.proximo = this.proximo.proximo;
		} else if (this.produtos != null) {
			this.proximo.removerProduto(id);
		}
	}

	public boolean existeProduto(String id) {
		if (this.produtos != null && this.produtos.getId().equals(id)) {
			return true;
		} else if (this.produtos != null) {
			return this.proximo.existeProduto(id);
		} else {
			return false;
		}
	}

	public Produto procurarProduto(String id) {
		if (this.produtos != null && this.produtos.getId().equals(id)) {
			return this.produtos;
		} else if (this.produtos != null) {
			return this.proximo.procurarProduto(id);
		} else {
			return null;
		}
	}

	public void atualizarProduto(Produto produto) {
		if (this.produtos != null && this.produtos.getId().equals(produto.getId())) {
			this.produtos = produto;
		} else if (this.produtos != null) {
			this.proximo.atualizarProduto(produto);
		}
	}
	public String listagemProduto() {
		if (!this.produtos.getId().equals(null)) {
			return this.produtos.getId()+", "+this.proximo.produtos.getId();
		} else {
			return "";
		}
	}

}