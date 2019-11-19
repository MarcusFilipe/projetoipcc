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

}
