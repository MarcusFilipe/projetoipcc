package desenvolvedores;

public class DesenvolvedorJaCadastradoException extends Exception 
{
	public DesenvolvedorJaCadastradoException(Desenvolvedor desenvolvedor)
	{
		super("O cnpj: "+desenvolvedor.getCnpj()+" ja esta cadastrado");
	}
}
