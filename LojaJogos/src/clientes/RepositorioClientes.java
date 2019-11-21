package clientes;

public interface RepositorioClientes {
	public void inserir(Cliente cliente)
		throws ClienteJaCadastradoException;
	public void atualizar(Cliente cliente)
		throws ClienteNaoCadastradoException;
	public void remover(String cpf)
		throws ClienteNaoCadastradoException;
	public Cliente procurar(String cpf)
		throws ClienteNaoCadastradoException;
	public boolean existe(String cpf);
	
}