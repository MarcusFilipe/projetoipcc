package produtos;

public class RepositorioProdutoArray implements RepositorioProdutos {

	@Override
	public void inserir(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String id) throws ProdutoNaoCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) throws ProdutoNaoCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto procurar(String id) throws ProdutoNaoCadastradoException {
		// TODO Auto-generated method stub
		return new Produto(id, descricao, preco, categoria, nome);
	}

	@Override
	public boolean existe(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
