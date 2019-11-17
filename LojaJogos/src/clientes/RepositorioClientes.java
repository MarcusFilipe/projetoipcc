package clientes;

public interface RepositorioClientes {
	public void inserir(Cliente cliente);
	public void atualizar(Cliente cliente)
		throws ClienteNaoEncontradoException;
	public void remover(String cpf)
		throws ClienteNaoEncontradoException;
	public Cliente procurar(String cpf)
		throws ClienteNaoEncontradoException;
	public boolean existe(String cpf);
	
}