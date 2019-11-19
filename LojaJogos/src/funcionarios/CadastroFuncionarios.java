package funcionarios;

public class CadastroFuncionarios {
	private RepositorioFuncionario funcionario;

	CadastroFuncionarios(RepositorioFuncionario repositorio) {
		funcionario = repositorio;
	}

	public void cadastrar(Funcionario dados) throws FuncionarioJaCadastradoException {
		if (funcionario.existe(dados.getCarteiraTrabalho())) {
			throw new FuncionarioJaCadastradoException(dados);
		} else
			funcionario.inserir(dados);
	}

	public void remover(Funcionario dados) throws FuncionarioNaoCadastradoException {
		if (funcionario.existe(dados.getCarteiraTrabalho())) {
			funcionario.remover(dados.getCarteiraTrabalho());
		} else
			throw new FuncionarioNaoCadastradoException();
	}

	public void atualizar(Funcionario dados) throws FuncionarioNaoCadastradoException {
		if (funcionario.existe(dados.getCarteiraTrabalho())) {
			funcionario.atualizar(dados);
		} else
			throw new FuncionarioNaoCadastradoException();
	}

}
