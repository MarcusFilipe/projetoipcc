package usuarios;

public class PessoaFisica extends Usuario {
	private String cpf;
	
	public PessoaFisica(String nome, String email, String cpf){
		super(nome,email);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
