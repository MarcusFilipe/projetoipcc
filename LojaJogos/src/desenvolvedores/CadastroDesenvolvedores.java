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
		if(!desenvolvedores.existe(desenvolvedor.getCnpj()))
			desenvolvedores.inserir(desenvolvedor);
		else
			throw new DesenvolvedorJaCadastradoException(desenvolvedor);
	}
	public void remover(String cnpj) throws DesenvolvedorNaoCadastradoException
	{
		if(desenvolvedores.existe(cnpj))
			desenvolvedores.remover(cnpj);
		else
			throw new DesenvolvedorNaoCadastradoException();	
	}
	public Desenvolvedor procurar(String cnpj)throws DesenvolvedorNaoCadastradoException
	{
		if(desenvolvedores.existe(cnpj))
			return desenvolvedores.procurar(cnpj);
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
	public void atualiza(Desenvolvedor desenvolvedor)throws DesenvolvedorNaoCadastradoException
	{
		if(desenvolvedores.existe(desenvolvedor.getCnpj()))
			desenvolvedores.atualiza(desenvolvedor);
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
	public boolean existe(String cnpj)
	{
		return desenvolvedores.existe(cnpj);
	}
}
