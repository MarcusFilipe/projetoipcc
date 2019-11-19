package desenvolvedores;

public interface RepositorioDesenvolvedores 
{
	public void inserir(Desenvolvedor desenvolvedor);
	public void remover(String nome) throws DesenvolvedorNaoCadastradoException;
	public boolean existe(String nome);
	public Desenvolvedor procurar(String nome)throws DesenvolvedorNaoCadastradoException;
	public void atualiza(Desenvolvedor desenvolvedor) throws DesenvolvedorNaoCadastradoException;

}
