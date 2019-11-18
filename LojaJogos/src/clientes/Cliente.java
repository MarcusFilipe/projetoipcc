package clientes;

import usuarios.PessoaFisica;

public class Cliente extends PessoaFisica {
	private String nickname;
	
	
	public Cliente(String nome, String email, String cpf, String nickname) {
		super(nome,email, cpf);
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
