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
	
	public Fachada(RepositorioClientes repClientes, RepositorioDesenvolvedores repDesenvolvedores,
			RepositorioFuncionario repFuncionarios){
		this.clientes = new CadastroClientes(repClientes);
		this.desenvolvedores = new CadastroDesenvolvedores(repDesenvolvedores);
		this.funcionarios = new CadastroFuncionarios(repFuncionarios);
		
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
	
	
	
}
