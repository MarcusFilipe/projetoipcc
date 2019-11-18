package clientes;

public class ClienteJaCadastradoException extends Exception {
	
	
	public ClienteJaCadastradoException(Cliente cliente) {
		
		super("Cliente"+cliente.getNickname()+"ja cadastrado");
	}
	
}