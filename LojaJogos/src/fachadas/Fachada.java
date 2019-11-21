package fachadas;

import clientes.*;
import desenvolvedores.*;
import funcionarios.*;
import vendas.*;
import produtos.*;

public class Fachada {
	private CadastroClientes clientes;
	private CadastroDesenvolvedores desenvolvedores;
	private CadastroFuncionarios funcionarios;
	private CadastroVenda vendas;
	private CadastroProdutos produtos;
	
	public Fachada(RepositorioClientes repClientes, RepositorioDesenvolvedores repDesenvolvedores,
			RepositorioFuncionario repFuncionarios, RepositorioVenda repVendas, RepositorioProdutos repProdutos){
		this.clientes = new CadastroClientes(repClientes);
		this.desenvolvedores = new CadastroDesenvolvedores(repDesenvolvedores);
		this.funcionarios = new CadastroFuncionarios(repFuncionarios);
		this.vendas=new CadastroVenda(repVendas);
		this.produtos = new CadastroProdutos(repProdutos);

		
	}
	
	//cliente
	public void cadastrarCliente(Cliente cliente) throws ClienteJaCadastradoException{
		this.clientes.cadastrar(cliente);
	}
	
	public void removerCliente(String cpf) throws ClienteNaoCadastradoException{
		this.clientes.remover(cpf);
	}
	
	public Cliente procurarCliente(String cpf) throws ClienteNaoCadastradoException{
		return this.clientes.procurar(cpf);
	}
	
	public void atualizarCliente(Cliente cliente) throws ClienteNaoCadastradoException{
		this.clientes.atualizar(cliente);
	}
	
	public boolean existeCliente(String cpf) throws ClienteNaoCadastradoException{
		return this.clientes.existe(cpf);
	}
	
	//desenvolvedor
	public void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor) throws DesenvolvedorJaCadastradoException{
		this.desenvolvedores.cadastrar(desenvolvedor);
	}
	
	public void removerDesenvolvedor(String cnpj) throws DesenvolvedorNaoCadastradoException{
		this.desenvolvedores.remover(cnpj);
	}
	
	public Desenvolvedor procurarDesenvolvedor(String cnpj) throws DesenvolvedorNaoCadastradoException{
		return this.desenvolvedores.procurar(cnpj);
	}
	
	public void atualizarDesenvolvedor(Desenvolvedor desenvolvedor) throws DesenvolvedorNaoCadastradoException{
		this.desenvolvedores.atualiza(desenvolvedor);
	}
	
	public boolean existeDesenvolvedor(String cnpj){
		return this.desenvolvedores.existe(cnpj);
	}
	
	public Produto procuraProdutoDesenvolvedor(String cnpj,String id) throws DesenvolvedorNaoCadastradoException, ProdutoNaoCadastradoException{
		return desenvolvedores.procuraProduto(cnpj, id);
	}
	public boolean existeProdutoDesenvolvedor(String cnpj,String id) throws DesenvolvedorNaoCadastradoException{
		return desenvolvedores.existeProduto(cnpj, id);
	}
	public void cadastrarProdutoDesenvolvedor(String cnpj,Produto produto) throws DesenvolvedorNaoCadastradoException, ProdutoJaCadastradoException {
		desenvolvedores.cadastrarProduto(cnpj, produto);
	}
	public void removerProdutoDesenvolvedor(String cnpj,String id)throws DesenvolvedorNaoCadastradoException, ProdutoNaoCadastradoException{
		desenvolvedores.removerProduto(cnpj, id);
	}
	public void atualizarProdutoDesenvolvedor(String cnpj,Produto produto) throws ProdutoNaoCadastradoException, DesenvolvedorNaoCadastradoException{
		desenvolvedores.atualizarProduto(cnpj, produto);
	}
	//funcionario
	
	public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException{
		this.funcionarios.cadastrar(funcionario);
	}
	
	public void removerFuncionario(String carteiraTrabalho) throws FuncionarioNaoCadastradoException{
		this.funcionarios.remover(carteiraTrabalho);
	}
	
	public Funcionario procurarFuncionario(String carteiraTrabalho) throws FuncionarioNaoCadastradoException{
		return this.funcionarios.procurar(carteiraTrabalho);
	}
	
	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoCadastradoException{
		this.funcionarios.atualizar(funcionario);
	}
	
	
	//venda
	
	public void inserirVenda(Venda venda) throws VendaJaCadastradaException {
		this.vendas.inserir(venda);
	}
	public void removerVenda(String id) throws VendaInexistenteException {
		this.vendas.remover(id);
	}
	public void atualizarVenda(Venda venda) throws VendaInexistenteException {
		this.vendas.atualizar(venda);
	}
	public Venda procurarVenda(String id) throws VendaInexistenteException {
		return this.vendas.procurar(id);
	}
	public boolean existeVenda(String id) {
		return this.vendas.existe(id);
	}
	
	//produtos
	public void inserirProduto(Produto produto) throws ProdutoJaCadastradoException{
		this.produtos.Cadastrar(produto);
	}

	public void removerProduto(String id) throws ProdutoNaoCadastradoException{
		this.produtos.remover(id);
	}

	public void atualizarProduto(Produto produto) throws ProdutoNaoCadastradoException{
		this.produtos.atualizar(produto);
	}

	public Produto procurarProduto(String id) throws ProdutoNaoCadastradoException{
		return this.produtos.procurar(id);
	}
	public String listagemProduto() {
        return this.produtos.listagem();
    }
	

}
