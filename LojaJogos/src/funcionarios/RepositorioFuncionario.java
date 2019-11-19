package funcionarios;


public interface RepositorioFuncionario {

	void inserir(Funcionario dados);

	Funcionario procurar(String carteiraTrabalho);

	void atualizar(Funcionario dados);

	void remover(String carteiraTrabalho);

	boolean existe(String carteiraTrabalho);

}
