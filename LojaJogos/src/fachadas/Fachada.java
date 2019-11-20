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
	
	public Desenvolvedor procurarDesenvolvedor(String cpf) throws DesenvolvedorNaoCadastradoException{
		return this.desenvolvedores.procurar(cpf);
	}
	
	public void atualizarDesenvolvedor(Desenvolvedor desenvolvedor) throws DesenvolvedorNaoCadastradoException{
		this.desenvolvedores.atualiza(desenvolvedor);
	}
	
	public boolean existeDesenvolvedor(String cpf){
		return this.desenvolvedores.existe(cpf);
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
	
	public void inserirProduto(Produto produto) throws ProdutoJaCadastradoException {
		this.produtos.Cadastrar(produto);
		
		this.desenvolvedores.procurar(cnpj).getProdutos().inserirProduto(produto);

		
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

}
