package funcionarios;

public class FuncionarioJaCadastradoException extends Exception {

	FuncionarioJaCadastradoException(Funcionario funcionario) {
		super("Funcionario: " + funcionario.getNome() + " portador da carteira de trabalho: "
				+ funcionario.getCarteiraTrabalho() + " ja cadastrado");
	}

}
