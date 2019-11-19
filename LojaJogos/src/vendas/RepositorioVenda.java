package vendas;

public interface RepositorioVenda {
	public void inserir(Venda venda);
	public void remover(String id);
	public void atualizar(Venda venda);
	public Venda procurar(String id);
	public boolean existe(String id);
}

