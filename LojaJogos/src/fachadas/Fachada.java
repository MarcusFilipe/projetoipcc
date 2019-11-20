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
	
	public Fachada(RepositorioClientes repClientes, RepositorioDesenvolvedores repDesenvolvedores,
			RepositorioFuncionario repFuncionarios, RepositorioVenda repVendas){
		this.clientes = new CadastroClientes(repClientes);
		this.desenvolvedores = new CadastroDesenvolvedores(repDesenvolvedores);
		this.funcionarios = new CadastroFuncionarios(repFuncionarios);
		this.vendas=new CadastroVenda(repVendas);
		//adicionar repositorios produtos(fred)
		
	}
	
	//cliente
	public void cadastrarCliente(Cliente cliente) throws ClienteJaCadastradoException{
		clientes.cadastrar(cliente);
	}
	
	public void removerCliente(String cpf) throws ClienteNaoCadastradoException{
		clientes.remover(cpf);
	}
	
	public Cliente procurarCliente(String cpf) throws ClienteNaoCadastradoException{
		return clientes.procurar(cpf);
	}
	
	public void atualizarCliente(Cliente cliente) throws ClienteNaoCadastradoException{
		clientes.atualizar(cliente);
	}
	
	public boolean existeCliente(String cpf) throws ClienteNaoCadastradoException{
		return clientes.existe(cpf);
	}
	
	//desenvolvedor
	public void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor) throws DesenvolvedorJaCadastradoException{
		desenvolvedores.cadastrar(desenvolvedor);
	}
	
	public void removerDesenvolvedor(String cnpj) throws DesenvolvedorNaoCadastradoException{
		desenvolvedores.remover(cnpj);
	}
	
	public Desenvolvedor procurarDesenvolvedor(String cpf) throws DesenvolvedorNaoCadastradoException{
		return desenvolvedores.procurar(cpf);
	}
	
	public void atualizarDesenvolvedor(Desenvolvedor desenvolvedor) throws DesenvolvedorNaoCadastradoException{
		desenvolvedores.atualiza(desenvolvedor);
	}
	
	public boolean existeDesenvolvedor(String cpf){
		return desenvolvedores.existe(cpf);
	}
	//funcionario
	
	//produto
	
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
	
	
	
}
