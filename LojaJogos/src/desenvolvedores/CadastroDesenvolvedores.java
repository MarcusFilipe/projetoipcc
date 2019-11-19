package desenvolvedores;

public class CadastroDesenvolvedores 
{
	private RepositorioDesenvolvedores desenvolvedores;
	public CadastroDesenvolvedores(RepositorioDesenvolvedores desenvolvedores)
	{
		this.desenvolvedores=desenvolvedores;
	}
	public void cadastrar(Desenvolvedor desenvolvedor)
	{
		if(!desenvolvedores.existe(desenvolvedor.getNome()))
			desenvolvedores.inserir(desenvolvedor);
		//else exception desenvolvedorjacadastrado
	}

}
