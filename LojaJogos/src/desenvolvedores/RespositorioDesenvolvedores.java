package desenvolvedores;

public interface RespositorioDesenvolvedores 
{
	public void inserir(Desenvolvedor desenvolvedor);
	public void remover(String nome);
	public boolean existe(String nome);
	public Desenvolvedor procurar(String nome);
	public void atualiza(Desenvolvedor desenvolvedor);

}
