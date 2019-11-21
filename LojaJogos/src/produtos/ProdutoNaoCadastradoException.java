package produtos;

public class ProdutoNaoCadastradoException extends Exception {
	public ProdutoNaoCadastradoException(String id) {
		super("O produto com o id: " + id + " nao existe");
	}
	///
}
