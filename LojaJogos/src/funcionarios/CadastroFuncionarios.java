package funcionarios;

public class CadastroFuncionarios {
	private RepositorioFuncionario funcionario;

	CadastroFuncionarios(RepositorioFuncionario repositorio) {
		this.funcionario = repositorio;
	}

	public void cadastrar(Funcionario dados) throws FuncionarioJaCadastradoException {
		if (this.funcionario.existe(dados.getCarteiraTrabalho())) {
			throw new FuncionarioJaCadastradoException(dados);
		} else
			funcionario.inserir(dados);
	}
	
	public Funcionario procurar(String carteiraTrabalho) throws FuncionarioNaoCadastradoException {
		if (this.funcionario.existe(carteiraTrabalho)) {
			return funcionario.procurar(carteiraTrabalho);
		}else
			throw new FuncionarioNaoCadastradoException();
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
