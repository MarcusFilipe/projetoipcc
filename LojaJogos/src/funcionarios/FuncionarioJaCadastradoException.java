package funcionarios;

public class FuncionarioJaCadastradoException extends Exception {

	FuncionarioJaCadastradoException() {
		super("Funcionario ja cadastrado");
	}

}
