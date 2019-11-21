package produtos;



public interface RepositorioProdutos {
	public void inserirProduto(Produto produto);

	public void removerProduto(String id);

	public void atualizarProduto(Produto produto);

	public Produto procurarProduto(String id);

	public boolean existeProduto(String id);
	
	public String listagemProduto();
}

///