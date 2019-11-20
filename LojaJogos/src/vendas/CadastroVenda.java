package vendas;

public class CadastroVenda {
	private RepositorioVenda vendas;
	public CadastroVenda(RepositorioVenda vendas) {
		this.vendas = vendas;
	}
	public void inserir(Venda venda) throws VendaJaCadastradaException {
		if (!existe(venda.getId())) {
			this.vendas.inserir(venda);
		}else
			throw new VendaJaCadastradaException(venda.getId());
	}
	public void remover(String id) throws VendaInexistenteException{
		if (existe(id)) {
			this.vendas.remover(id);
		}else
			throw new VendaInexistenteException(id);

	}
	public void atualizar(Venda venda) throws VendaInexistenteException{
		if (existe(venda.getId())) {
			this.vendas.atualizar(venda);
		}else
			throw new VendaInexistenteException(venda.getId());
	}
	public Venda procurar(String id) throws VendaInexistenteException{
		if (existe(id)) {
			return this.vendas.procurar(id);
		}else
			throw new VendaInexistenteException(id);
	}
	public boolean existe(String id) {
		return this.vendas.existe(id);
	}
}
