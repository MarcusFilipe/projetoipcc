package funcionarios;

public class RepositorioFuncionarioLista implements RepositorioFuncionario {

	private Funcionario funcionario;
	private RepositorioFuncionarioLista proximo;

	public RepositorioFuncionarioLista() {
		this.funcionario = null;
		this.proximo = null;
	}

	public void inserir(Funcionario dados) {
		if (this.funcionario == null) {
			this.funcionario = dados;
			this.proximo = new RepositorioFuncionarioLista();
		} else if (this.funcionario != null) {
			this.proximo.inserir(dados);
		}

	}

	public Funcionario procurar(String carteiraTrabalho) {
		if (this.funcionario != null && this.funcionario.getCarteiraTrabalho().equals(carteiraTrabalho)) {
			return this.funcionario;
		} else if (this.funcionario != null) {
			return this.proximo.procurar(carteiraTrabalho);
		}
		return null;

	}

	public void atualizar(Funcionario dados) {
		if (this.funcionario != null && this.funcionario.getCarteiraTrabalho().equals(dados.getCarteiraTrabalho())) {
			this.funcionario = dados;
		} else if (this.funcionario != null) {
			this.proximo.atualizar(dados);
		}
	}

	public void remover(String carteiraTrabalho) {
		if (this.funcionario != null && this.funcionario.getCarteiraTrabalho().equals(carteiraTrabalho)) {
			this.funcionario = this.proximo.funcionario;
			this.proximo = this.proximo.proximo;
		} else if (this.funcionario != null) {
			this.proximo.remover(carteiraTrabalho);
		}
	}

	public boolean existe(String carteiraTrabalho) {
		if (this.funcionario != null && this.funcionario.getCarteiraTrabalho().equals(carteiraTrabalho))
			return true;
		else if (this.funcionario != null) {
			return this.proximo.existe(carteiraTrabalho);
		} else {
			return false;
		}
	}
	

}
