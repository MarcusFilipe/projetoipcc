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
		if(!desenvolvedores.existe(desenvolvedor.getNome()))
			desenvolvedores.inserir(desenvolvedor);
		else
			throw new DesenvolvedorJaCadastradoException(desenvolvedor.getNome());
	}
}
