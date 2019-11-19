package clientes;


public class CadastroClientes {
	private RepositorioClientes clientes;
	
	public CadastroClientes(RepositorioClientes rep) {
		this.clientes = rep; 
	}
	
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException{
		if(!clientes.existe(cliente.getCpf())) {
			clientes.inserir(cliente);
		}else 
			throw new ClienteJaCadastradoException();
	}
	
	public void remover(String cpf) throws ClienteNaoCadastradoException{
		if(clientes.existe(cpf)) {
			clientes.remover(cpf);
		}else
			throw new ClienteNaoCadastradoException();
	}
	
	public boolean existe(String cpf)  {
		return clientes.existe(cpf);
	}
	
	public Cliente procurar(String cpf) throws ClienteNaoCadastradoException{
		if(clientes.existe(cpf)) {
			return clientes.procurar(cpf);
		}else
			throw new ClienteNaoCadastradoException();
	}
	
	public void atualizar(Cliente cliente) throws ClienteNaoCadastradoException{
		if(clientes.existe(cliente.getCpf())) {
			clientes.atualizar(cliente);
		}else 
			throw new ClienteNaoCadastradoException();
		
	}
	
	
	
	
}
