package funcionarios;

public interface RepositorioFuncionario {

	void inserir(Funcionario dados);

	Funcionario procurar(String carteiraTrabalho) throws FuncionarioNaoCadastradoException;

	void atualizar(Funcionario dados) throws FuncionarioNaoCadastradoException;

	void remover(String carteiraTrabalho) throws FuncionarioNaoCadastradoException;

	boolean existe(String carteiraTrabalho);

}
