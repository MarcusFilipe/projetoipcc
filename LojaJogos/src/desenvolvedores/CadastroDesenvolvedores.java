package desenvolvedores;

public class CadastroDesenvolvedores 
{
	private RepositorioDesenvolvedores desenvolvedores;
	public CadastroDesenvolvedores(RepositorioDesenvolvedores desenvolvedores)
	{
		this.desenvolvedores=desenvolvedores;
	}
	public void cadastrar(Desenvolvedor desenvolvedor)throws DesenvolvedorJaCadastradoException
	{
		if(!this.desenvolvedores.existe(desenvolvedor.getCnpj()))
			this.desenvolvedores.inserir(desenvolvedor);
		else
			throw new DesenvolvedorJaCadastradoException(desenvolvedor);
	}
	public void remover(String cnpj) throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedores.existe(cnpj))
			this.desenvolvedores.remover(cnpj);
		else
			throw new DesenvolvedorNaoCadastradoException();	
	}
	public Desenvolvedor procurar(String cnpj)throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedores.existe(cnpj))
			return this.desenvolvedores.procurar(cnpj);
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
	public void atualiza(Desenvolvedor desenvolvedor)throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedores.existe(desenvolvedor.getCnpj()))
			this.desenvolvedores.atualiza(desenvolvedor);
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
	public boolean existe(String cnpj)
	{
		return this.desenvolvedores.existe(cnpj);
	}
}
