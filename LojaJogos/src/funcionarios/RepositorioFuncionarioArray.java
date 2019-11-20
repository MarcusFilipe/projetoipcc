package funcionarios;

public class RepositorioFuncionarioArray implements RepositorioFuncionario {

	private Funcionario[] funcionario;
	private int index;

	public RepositorioFuncionarioArray(int size) {
		this.funcionario = new Funcionario[size];
		index = 0;
	}

	public void inserir(Funcionario dados) {
		this.funcionario[index] = dados;
		index++;
	}

	public Funcionario procurar(String carteiraTrabalho) {
		Funcionario resposta = null;
		int index = this.getIndice(carteiraTrabalho);
		if (index != this.index) {
			resposta = this.funcionario[index];
		}
		return resposta;
	}

	public void atualizar(Funcionario dados) {
		int index = this.getIndice(dados.getCarteiraTrabalho());
		if (index != this.index) {
			this.funcionario[index] = dados;
		}
	}

	public void remover(String carteiraTrabalho) {
		int index = this.getIndice(carteiraTrabalho);
		if (index != this.index) {
			this.index = this.index - 1;
			this.funcionario[index] = this.funcionario[this.index];
			this.funcionario[this.index] = null;
		}
	}

	public boolean existe(String carteiraTrabalho) {
		int index = this.getIndice(carteiraTrabalho);
		return (index != this.index);
	}

	private int getIndice(String carteiraTrabalho) {
		String things;
		boolean existe = false;
		int indice = 0;

		for (int i = 0; !(existe) && i < this.index; i++) {
			things = funcionario[i].getCarteiraTrabalho();
			if (things.equals(carteiraTrabalho)) {
				existe = true;
				indice = i;
			}
		}
		return indice;
	}
	

}
