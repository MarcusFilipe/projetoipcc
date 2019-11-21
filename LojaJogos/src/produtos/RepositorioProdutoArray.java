package produtos;

public class RepositorioProdutoArray implements RepositorioProdutos {
	private Produto[] produto;
	private int index;

	public RepositorioProdutoArray(int tamanho) {
		this.produto = new Produto[tamanho];
		index = 0;
	}

	public void inserirProduto(Produto dados) {
		this.produto[index] = dados;
		index++;
	}

	public void removerProduto(String id) {
		int index = this.getPosicao(id);
		if (index != this.index) {
			this.index = this.index - 1;
			this.produto[index] = this.produto[this.index];
			this.produto[this.index] = null;
		}
	}

	public void atualizarProduto(Produto id) {
		int index = this.getPosicao(id.getId());
		if (index != this.index) {
			this.produto[index] = id;
		}
	}

	public Produto procurarProduto(String id) {
		Produto resposta = null;
		int index = this.getPosicao(id);
		if (index != this.index) {
			resposta = this.produto[index];
		} 
			return resposta;
			}

	public boolean existeProduto(String id) {
		int index = this.getPosicao(id);
		boolean resposta = false;
		if (index < this.index) {
			resposta = true;
		}
		return resposta;
	}
	
	public String listagemProduto() {
        String resposta="";
        for (int x = 0; x < index; x++) {
            resposta+= this.produto[x].getId();
             if(x!=index-1)
                  resposta+=", ";
        }
        return resposta;
}

	private int getPosicao(String id) {
		int posicao = 0;
		while (posicao<this.index&&!produto[posicao].getId().equals(id)) {
			posicao++;
		}
		return posicao;
	}
///
}
