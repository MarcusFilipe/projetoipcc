package desenvolvedores;

import usuarios.Usuario;

public class Desenvolvedor extends Usuario
{
	
	private double porcentagemVenda;
	
	public Desenvolvedor(String nome,String numero,double porcentagemVenda)
	{
		super(nome,numero);
		this.porcentagemVenda=this.porcentagemVenda;
	}
	public double getPorcentagemVenda() {
		return porcentagemVenda;
	}

	public void setPorcentagemVenda(double porcentagemVenda) {
		this.porcentagemVenda = porcentagemVenda;
	}
	
}
