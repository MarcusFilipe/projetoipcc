package produtos;

public class ProdutoJaCadastradoException extends Exception {
	public ProdutoJaCadastradoException(Produto dados) {
		super("Produto " + dados.getNome() + " de ID " + dados.getId() + " ja cadastrado");
	}
	///
}
