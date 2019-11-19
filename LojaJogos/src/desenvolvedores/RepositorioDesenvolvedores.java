package desenvolvedores;

public interface RepositorioDesenvolvedores 
{
	public void inserir(Desenvolvedor desenvolvedor);
	public void remover(String cnpj) ;
	public boolean existe(String cnpj);
	public Desenvolvedor procurar(String cnpj);
	public void atualiza(Desenvolvedor desenvolvedor);

}
