package desenvolvedores;

import produtos.Produto;
import produtos.ProdutoNaoCadastradoException;
import produtos.RepositorioProdutoArray;

public class CadastroDesenvolvedores 
{
	private RepositorioDesenvolvedores desenvolvedores;
	public CadastroDesenvolvedores(RepositorioDesenvolvedores desenvolvedores)
	{
		this.desenvolvedores=desenvolvedores;
	}
	public void cadastrar(Desenvolvedor desenvolvedor)throws DesenvolvedorJaCadastradoException
	{
		if(!this.desenvolvedores.existe(desenvolvedor.getCnpj()))
			this.desenvolvedores.inserir(desenvolvedor);
		else
			throw new DesenvolvedorJaCadastradoException(desenvolvedor);
	}
	public void remover(String cnpj) throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedores.existe(cnpj))
			this.desenvolvedores.remover(cnpj);
		else
			throw new DesenvolvedorNaoCadastradoException();	
	}
	public Desenvolvedor procurar(String cnpj)throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedores.existe(cnpj))
			return this.desenvolvedores.procurar(cnpj);
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
	public void atualiza(Desenvolvedor desenvolvedor)throws DesenvolvedorNaoCadastradoException
	{
		if(this.desenvolvedores.existe(desenvolvedor.getCnpj()))
			this.desenvolvedores.atualiza(desenvolvedor);
		else
			throw new DesenvolvedorNaoCadastradoException();
	}
	public boolean existe(String cnpj)
	{
		return this.desenvolvedores.existe(cnpj);
	}
	public String listagemProdutos(String cnpj) throws DesenvolvedorNaoCadastradoException{
		String resposta = this.procurar(cnpj).getRepositorioProdutosArray().listagemProduto();
		if(resposta==null)
			resposta="Lista Vazia!";
		return resposta;
	}
	public Produto procuraProduto(String cnpj,String id) throws DesenvolvedorNaoCadastradoException, ProdutoNaoCadastradoException{
		Produto resposta= this.procurar(cnpj).getRepositorioProdutosArray().procurarProduto(id);
		if(resposta!=null)
			return resposta;
		else
			throw new ProdutoNaoCadastradoException(id);
	}
	public boolean existeProduto(String cnpj,String id) throws DesenvolvedorNaoCadastradoException{
		return this.procurar(cnpj).getRepositorioProdutosArray().existeProduto(id);
	}
}
