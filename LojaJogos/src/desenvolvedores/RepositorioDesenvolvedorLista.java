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
	public void remover(String nome) throws DesenvolvedorNaoCadastradoException
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
		else
			throw new DesenvolvedorNaoCadastradoException();
		
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
	public Desenvolvedor procurar(String nome)throws DesenvolvedorNaoCadastradoException
	{
		Desenvolvedor resposta=null;
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getNome().equals(nome))
				resposta=this.desenvolvedor;
			else
				resposta=this.proximo.procurar(nome);
		}
		else
			throw new DesenvolvedorNaoCadastradoException();
		
		return resposta;
	}
	public void atualiza(Desenvolvedor desenvolvedor)throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedor!=null)
		{
			if(this.desenvolvedor.getCnpj().equals(desenvolvedor.getCnpj()))
				this.desenvolvedor=desenvolvedor;
			else
				this.proximo.atualiza(desenvolvedor);
		}
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
}
