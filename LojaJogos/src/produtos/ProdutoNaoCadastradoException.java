package produtos;

public class ProdutoNaoCadastradoException extends Exception {
	ProdutoNaoCadastradoException(String nome) {
		super("Produto" + nome + " nao existe");
	}
	//
}
