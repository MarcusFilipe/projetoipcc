package clientes;


public class CadastroClientes {
	private RepositorioClientes clientes;
	
	public CadastroClientes(RepositorioClientes rep) {
		this.clientes = rep; 
	}
	
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException{
		if(!this.clientes.existe(cliente.getCpf())) {
			this.clientes.inserir(cliente);
		}else 
			throw new ClienteJaCadastradoException();
	}
	
	public void remover(String cpf) throws ClienteNaoCadastradoException{
		if(this.clientes.existe(cpf)) {
			this.clientes.remover(cpf);
		}else
			throw new ClienteNaoCadastradoException();
	}
	
	public boolean existe(String cpf)  throws ClienteNaoCadastradoException{
		if(this.clientes.existe(cpf)) {
			return this.clientes.existe(cpf);
		}else
			throw new ClienteNaoCadastradoException();
	}
	
	public Cliente procurar(String cpf) throws ClienteNaoCadastradoException{
		if(this.clientes.existe(cpf)) {
			return this.clientes.procurar(cpf);
		}else
			throw new ClienteNaoCadastradoException();
	}
	
	public void atualizar(Cliente cliente) throws ClienteNaoCadastradoException{
		if(this.clientes.existe(cliente.getCpf())) {
			clientes.atualizar(cliente);
		}else 
			throw new ClienteNaoCadastradoException();
		
	}
	
	
	
	
}
