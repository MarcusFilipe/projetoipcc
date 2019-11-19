package vendas;

public class VendaInexistenteException extends Exception {
	VendaInexistenteException(String id) {
		super("A id informada" + "(" + id +") não corresponde a nenhuma venda.");
	}
}
