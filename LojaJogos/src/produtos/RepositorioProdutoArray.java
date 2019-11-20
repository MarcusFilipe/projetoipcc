package produtos;

public class RepositorioProdutoArray implements RepositorioProdutos {
	private Produto[] produto;
	private int index;

	public RepositorioProdutoArray(int tamanho) {
		produto = new Produto[tamanho];
		index = 0;
	}

	public void inserir(Produto dados) {
		produto[index] = dados;
		index++;
	}

	public void remover(String id) {
		int index = this.getPosicao(id);
		if (index != this.index) {
			this.index = this.index - 1;
			this.produto[index] = this.produto[this.index];
			this.produto[this.index] = null;
		}
	}

	public void atualizar(Produto id) {
		int index = this.getPosicao(id.getId());
		if (index != this.index) {
			this.produto[index] = id;
		}
	}

	public Produto procurar(String id) {
		Produto resposta = null;
		int index = this.getPosicao(id);
		if (index != this.index) {
			resposta = this.produto[index];
		} 
			return resposta;
			}

	public boolean existe(String id) {
		int index = this.getPosicao(id);
		boolean resposta = false;
		if (index < this.index) {
			resposta = true;
		}
		return resposta;
	}

	private int getPosicao(String id) {
		int posicao = 0;
		while (!produto[posicao].getId().equals(id) && posicao < this.index) {
			posicao++;
			return posicao;
		}
		return posicao;
	}
///
}
