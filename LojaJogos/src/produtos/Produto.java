package produtos;

public class Produto {
	private String id;
	private String descricao;
	private double preco;
	private String categoria;
	private String nome;

	public Produto(String nome, String id, double preco, String categoria, String descricao) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String identidade) {
		this.id = identidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	///
}
