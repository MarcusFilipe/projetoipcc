package clientes;

import usuarios.PessoaFisica;

public class Cliente extends PessoaFisica {
	private String nickname;
	
	public Cliente(String nome, String email) {
		super(nome,email);
		this.nickname = null;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
