package clientes;

public class RepositorioClienteLista implements RepositorioClientes{
	private Cliente cliente;
	private RepositorioClienteLista proximo;
	public RepositorioClienteLista() {
		this.cliente = null;
		this.proximo = null;
	}
	
	public void inserir(Cliente cliente) {
		if(this.cliente == null) {
			this.cliente = cliente;
			this.proximo = new RepositorioClienteLista();
		}else {
			this.proximo.inserir(cliente);
		}
	}
	
	public void remover(String cpf){
		if(this.cliente != null && this.cliente.getCpf().equals(cpf)) {
			this.cliente = this.proximo.cliente;
			this.proximo = this.proximo.proximo;
		}else if(this.cliente != null){
			this.proximo.remover(cpf);
		}
			
	}
	
	public boolean existe(String cpf) {
		if(this.cliente != null && this.cliente.getCpf().equals(cpf)) {
			return true;
		}else if(this.cliente != null){
			return this.proximo.existe(cpf);
		}
		return false;
	}
	
	public Cliente procurar(String cpf){
		if(this.cliente != null && this.cliente.getCpf().equals(cpf)) {
			return this.cliente;
		}else if(this.cliente != null) {
			return this.proximo.procurar(cpf);
		}
		return null;
			
	}
	
	public void atualizar(Cliente cliente) {
		
		if(this.cliente != null && this.cliente.getCpf().equals(cliente.getCpf())) {
			this.cliente = cliente;
		}else if(this.cliente != null) {
			this.proximo.atualizar(cliente);
		}
	}
	
	
}