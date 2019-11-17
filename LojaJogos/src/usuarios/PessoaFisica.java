package usuarios;

public class PessoaFisica extends Usuario {
	private String cpf;
	private Integer idade;
	
	public PessoaFisica(String nome, String email){
		super(nome,email);
		this.cpf = null;
		this.idade = null;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
