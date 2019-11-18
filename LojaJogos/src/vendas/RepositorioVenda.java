package vendas;

public interface RepositorioVenda {
	public void inserir(Venda venda) throws VendaJacadastradaException;
	public void remover(String id) throws VendaInexistenteException;
	public void atualizar(Venda venda);
	public Venda procurar(String id);
	public boolean existe(String id);
}

