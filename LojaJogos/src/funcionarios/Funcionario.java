package funcionarios;

import usuarios.PessoaFisica;

public class Funcionario extends PessoaFisica {

	private String carteiraTrabalho;

	public Funcionario(String nome, String email, String cpf, String carteiraTrabalho) {
		super(nome, email, cpf);
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

}
