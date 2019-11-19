package desenvolvedores;

public class DesenvolvedorJaCadastradoException extends Exception 
{
	public DesenvolvedorJaCadastradoException(String nome)
	{
		super("O desenvolvedor "+nome+" ja esta cadastrado");
	}
}
