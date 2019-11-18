package funcionarios;

public class RepositorioFuncionarioArray implements RepositorioFuncionario {

	private Funcionario[] funcionario;
	private int index;

	RepositorioFuncionarioArray(int size) {
		funcionario = new Funcionario[size];
		index = 0;
	}

	public void inserir(Funcionario dados) {
		funcionario[index] = dados;
		index++;
	}

	public Funcionario procurar(String carteiraTrabalho) throws FuncionarioNaoCadastradoException {
		Funcionario resposta = null;
		int index = this.getIndice(carteiraTrabalho);
		if (index == this.index) {
			throw new FuncionarioNaoCadastradoException();
		} else {
			resposta = this.funcionario[index];
		}
		return resposta;
	}

	public void atualizar(Funcionario dados) throws FuncionarioNaoCadastradoException {
		int index = this.getIndice(dados.getCarteiraTrabalho());
		if (index == this.index) {
			throw new FuncionarioNaoCadastradoException();
		} else {
			this.funcionario[index] = dados;
		}
	}

	public void remover(String carteiraTrabalho) throws FuncionarioNaoCadastradoException {
		int index = this.getIndice(carteiraTrabalho);
		if (index == this.index) {
			throw new FuncionarioNaoCadastradoException();
		} else {
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
