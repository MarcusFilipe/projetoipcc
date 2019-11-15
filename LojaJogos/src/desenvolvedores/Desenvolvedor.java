package desenvolvedores;

import usuarios.PessoaJuridica;

public class Desenvolvedor extends PessoaJuridica
{
	
	private double porcentagemVenda;
	
	public Desenvolvedor(String nome,String numero)
	{
		super(nome,numero);
		this.porcentagemVenda=0;
	}
	public double getPorcentagemVenda() {
		return porcentagemVenda;
	}

	public void setPorcentagemVenda(double porcentagemVenda) {
		this.porcentagemVenda = porcentagemVenda;
	}
	
}
