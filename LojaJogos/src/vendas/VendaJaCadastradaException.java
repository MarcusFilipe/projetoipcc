package vendas;

public class VendaJaCadastradaException extends Exception {
	VendaJaCadastradaException(String id) {
		super("A id informada" + "(" + id +") já foi utilizada.");
	}
}
