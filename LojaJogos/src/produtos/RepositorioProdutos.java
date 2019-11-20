package produtos;



public interface RepositorioProdutos {
	public void inserir(Produto produto);

	public void remover(String id) throws ProdutoNaoCadastradoException;

	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException;

	public Produto procurar(String id) throws ProdutoNaoCadastradoException;

	public boolean existe(String id);
}

//