package clientes;

public class RepositorioClienteArray implements RepositorioClientes {
	private Cliente[] clientes;
	private int indice;
	
	public RepositorioClienteArray(int tam) {
		clientes = new Cliente[tam];
		indice = 0;
	}
	
	public void inserir(Cliente cliente) {
		clientes[indice] = cliente;
		indice += 1;
	}
	
	private int getIndice(String cpf) {
		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.indice)) {
			n = clientes[i].getCpf();
			if (n.equals(cpf)) {
				achou = true;
			} else {
				i ++;
			}
		}
		return i;
	}

	public void remover(String cpf) {
		int i = this.getIndice(cpf);
		if(i != this.indice) {
			this.indice = this.indice - 1;
			this.clientes[i] = this.clientes[this.indice];
			this.clientes[this.indice] = null;
		}
	}
	
	public boolean existe(String cpf) {
		int i = this.getIndice(cpf);
		return (i != this.indice);
	}
	
	public void atualizar(Cliente cliente){
		int i = this.getIndice(cliente.getCpf());
		if (i != this.indice) {
			this.clientes[i] = cliente;
		}
	}
	
	public Cliente procurar(String cpf) {
		Cliente resposta = null;
		int i = this.getIndice(cpf);
		if (i != this.indice) {
			resposta = this.clientes[i];
		}
		return resposta;
	}
	
	
}

