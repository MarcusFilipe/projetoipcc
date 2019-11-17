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
			this.inserir(cliente);
			this.proximo = new RepositorioClienteLista();
		}else {
			this.proximo.inserir(cliente);
		}
	}
	
	public void remover(String cpf) {
		if(this.cliente != null && this.cliente.getCpf().equals(cpf)) {
			this.cliente = this.proximo.cliente;
			this.proximo = this.proximo.proximo;
		}else {
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
	
	public Cliente procurar(String cpf) {
		if(this.cliente != null && this.cliente.getCpf().equals(cpf)) {
			return this.cliente;
		}else if(this.cliente != null) {
			return this.proximo.cliente;
		}
		return null;
	}
	//terminar
	public void atualizar(Cliente cliente) {
		
	}
	
	
}
