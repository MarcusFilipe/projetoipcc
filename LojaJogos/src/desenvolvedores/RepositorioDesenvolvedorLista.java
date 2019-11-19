package desenvolvedores;

public class RepositorioDesenvolvedorLista implements RepositorioDesenvolvedores{
	private Desenvolvedor desenvolvedor;
	private RepositorioDesenvolvedorLista proximo;
	public RepositorioDesenvolvedorLista()
	{
		this.desenvolvedor=null;
		this.proximo=null;
	}
	public void inserir(Desenvolvedor desenvolvedor)
	{
		if(this.desenvolvedor==null)
		{
			this.desenvolvedor=desenvolvedor;
			this.proximo= new RepositorioDesenvolvedorLista();
		}
		else
			this.proximo.inserir(desenvolvedor);
	}
	public void remover(String cnpj)
	{
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getCnpj().equals(cnpj))
			{
				this.desenvolvedor=this.proximo.desenvolvedor;
				this.proximo=this.proximo.proximo;
			}
			else
				this.proximo.remover(cnpj);
		}
		
	}
	public boolean existe(String cnpj)
	{
		boolean resposta=false;
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getCnpj().equals(cnpj))
				resposta=true;
			else
				resposta=this.proximo.existe(cnpj);
		}
		return resposta;
	}
	public Desenvolvedor procurar(String cnpj)
	{
		Desenvolvedor resposta=null;
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getCnpj().equals(cnpj))
				resposta=this.desenvolvedor;
			else
				resposta=this.proximo.procurar(cnpj);
		}
		return resposta;
	}
	public void atualiza(Desenvolvedor desenvolvedor)
	{
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getCnpj().equals(desenvolvedor.getCnpj()))
				this.desenvolvedor=desenvolvedor;
			else
				this.proximo.atualiza(desenvolvedor);
		}
	}
}
