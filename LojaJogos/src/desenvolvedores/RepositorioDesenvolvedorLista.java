package desenvolvedores;

public class RepositorioDesenvolvedorLista implements RespositorioDesenvolvedores{
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
			proximo.inserir(desenvolvedor);
	}
	public void remover(String nome)
	{
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getNome().equals(nome))
			{
				this.desenvolvedor=this.proximo.desenvolvedor;
				this.proximo=this.proximo.proximo;
			}
			else
				this.proximo.remover(nome);
		}
		//aqui entra um exception
	}
	public boolean existe(String nome)
	{
		boolean resposta=false;
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getNome().equals(nome))
				resposta=true;
			else
				resposta=this.proximo.existe(nome);
		}
		return resposta;
	}
	public Desenvolvedor procurar(String nome)
	{
		Desenvolvedor resposta=null;
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getNome().equals(nome))
				resposta=this.desenvolvedor;
			else
				resposta=this.proximo.procurar(nome);
		}
		//aqui entra um exception
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
