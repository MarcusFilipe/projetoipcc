package usuarios;

public class PessoaJuridica extends Usuario {
	private String cnpj;

	public PessoaJuridica(String nome,String email, String cnpj)
	{
		super(nome,email);
		this.cnpj=cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
