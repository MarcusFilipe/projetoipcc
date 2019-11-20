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
		this.vendas[index]=venda;
		++this.index;
	}
	public void remover(String id) {
		int aux = getIndex(id);
		if (aux != this.index) {
			this.index = this.index - 1;
			this.vendas[index] = this.vendas[this.index];
			this.vendas[this.index] = null;
		}
	}
	public void atualizar(Venda venda) {
		int aux = getIndex(venda.getId());
		this.vendas[aux]=venda;
	}
	public Venda procurar(String id) {
		Venda aux=null;
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId().contentEquals(id)) {
				aux = vendas[i];
			}
		}return aux;
	}
	public boolean existe(String id) {
		boolean kapa = false;
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId().contentEquals(id)) {
				kapa=true;
			}
		}return kapa;
	}
	private int getIndex(String id) {
		int index = -1;
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId().contentEquals(id)) {
				index=i;
			}
		}return index;
	}
	
}
