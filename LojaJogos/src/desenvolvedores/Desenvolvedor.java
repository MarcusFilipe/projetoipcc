 package desenvolvedores;

import usuarios.PessoaJuridica;

public class Desenvolvedor extends PessoaJuridica
{
	
	private double porcentagemVenda;
	
	public Desenvolvedor(String nome,String email, String cnpj, double porcentagemVenda)
	{
		super(nome,email,cnpj);
		this.porcentagemVenda=porcentagemVenda;
	}
	public double getPorcentagemVenda() {
		return porcentagemVenda;
	}

	public void setPorcentagemVenda(double porcentagemVenda) {
		this.porcentagemVenda = porcentagemVenda;
	}
	
}
