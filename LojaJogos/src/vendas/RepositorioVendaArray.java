package vendas;
import produtos.Produto;
public class RepositorioVendaArray implements RepositorioVenda {
	private Venda[] vendas;
	private int index;
	public RepositorioVendaArray(int n) {
		vendas = new Venda[n];
		index = 0;
	}
	public void inserir(Venda venda) {
		vendas[index]=venda;
		++index;
	}
	public void remover(String id) throws VendaInexistenteException {
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId()==id) {
				
			}
		}
	}
	public void atualizar(Venda venda) {
		// TODO Auto-generated method stub
		
	}
	public Venda procurar(String id) {
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId()==id) {
				return vendas[i];
			}
		}
	}
	public boolean existe(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
