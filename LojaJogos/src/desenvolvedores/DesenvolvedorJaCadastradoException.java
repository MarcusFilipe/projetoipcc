package desenvolvedores;

public class DesenvolvedorJaCadastradoException extends Exception 
{
	public DesenvolvedorJaCadastradoException(Desenvolvedor desenvolvedor)
	{
		super("O desenvolvedor "+desenvolvedor.getNome()+" com o cnpj: "+desenvolvedor.getCnpj()+" ja esta cadastrado");
	}
}
