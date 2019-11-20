package produtos;



public interface RepositorioProdutos {
	public void inserirProduto(Produto produto);

	public void removerProduto(String id) throws ProdutoNaoCadastradoException;

	public void atualizarProduto(Produto produto) throws ProdutoNaoCadastradoException;

	public Produto procurarProduto(String id) throws ProdutoNaoCadastradoException;

	public boolean existeProduto(String id);
}

///