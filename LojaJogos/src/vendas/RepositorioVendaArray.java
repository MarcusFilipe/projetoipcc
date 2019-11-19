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
	public void remover(String id) {
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId()==id) {
				vendas[i]=null;
				Venda aux;
				for (int j = i ; j<this.index-1 ; j+=2) {
					aux=vendas[j];
					vendas[j]=vendas[j+1];
					vendas[j+1]=aux;
				}--index;
			}
		}
	}
	public void atualizar(Venda venda) {
		int aux = getIndex(venda.getId());
		this.vendas[aux]=venda;
	}
	public Venda procurar(String id) {
		Venda aux=null;
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId()==id) {
				aux = vendas[i];
			}
		}return aux;
	}
	public boolean existe(String id) {
		boolean kapa = false;
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId()==id) {
				kapa=true;
			}
		}return kapa;
	}
	private int getIndex(String id) {
		int index = -1;
		for (int i = 0 ; i<this.index ; ++i) {
			if (vendas[i].getId()==id) {
				index=i;
			}
		}return index;
	}
	
}
