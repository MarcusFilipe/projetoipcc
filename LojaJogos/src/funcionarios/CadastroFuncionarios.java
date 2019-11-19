package funcionarios;

public class CadastroFuncionarios {
	private RepositorioFuncionario funcionario;

	public CadastroFuncionarios(RepositorioFuncionario repositorio) {
		this.funcionario = repositorio;
	}

	public void cadastrar(Funcionario dados) throws FuncionarioJaCadastradoException {
		if (this.funcionario.existe(dados.getCarteiraTrabalho())) {
			throw new FuncionarioJaCadastradoException(dados);
		} else
			this.funcionario.inserir(dados);
	}

	public void remover(Funcionario dados) throws FuncionarioNaoCadastradoException {
		if (this.funcionario.existe(dados.getCarteiraTrabalho())) {
			this.funcionario.remover(dados.getCarteiraTrabalho());
		} else
			throw new FuncionarioNaoCadastradoException();
	}

	public void atualizar(Funcionario dados) throws FuncionarioNaoCadastradoException {
		if (this.funcionario.existe(dados.getCarteiraTrabalho())) {
			this.funcionario.atualizar(dados);
		} else
			throw new FuncionarioNaoCadastradoException();
	}

}
