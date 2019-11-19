package ui;
import fachadas.*;
import clientes.*;
import produtos.*;
import usuarios.*;
import desenvolvedores.*;
import funcionarios.*;


public class Programa {
	public static void main(String[] args) {
		//testes clientes
		Cliente cl = new Cliente("Marcus","mfbm","192.949.340-53","skrix");
		Cliente cl1 = new Cliente("Wilson", "whfdsui", "189.340.503-12", "uiusu");
		Cliente cl2 = new Cliente("Alice","abm","192.949.340-53","skrix");
		
		RepositorioClientes arrayClientes = new RepositorioClienteArray(100);
		RepositorioClientes listaClientes = new RepositorioClienteLista();
		RepositorioDesenvolvedores listaDesenvolvedores = new RepositorioDesenvolvedorLista();
		RepositorioFuncionario arrayFuncionarios = new RepositorioFuncionarioArray(100);
		

		Fachada f = new Fachada(arrayClientes, listaDesenvolvedores, arrayFuncionarios);
		//array
	
		arrayClientes.inserir(cl1);
		System.out.println(arrayClientes.existe("192.949.340-53"));
		System.out.println(arrayClientes.existe("189.340.503-12"));
		
		try{
			arrayClientes.remover("192.949.340-53");
			arrayClientes.remover("123");
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}
		
		try{
			Cliente c = arrayClientes.procurar("189.340.503-12");
			System.out.println("email-"+ c.getEmail()+"\nnome-"+c.getNome()+"\nnick -"+c.getNickname());
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}
		
		if (arrayClientes.existe("192.949.340-53")) {
			System.out.println("O cliente: 192.949.340-53 -- Existe");
		}else {
			System.out.println("O cliente: 192.949.340-53 -- Nao existe");
		}
		System.out.println("------------------");
		
		//lista
		listaClientes.inserir(cl);
		listaClientes.inserir(cl1);
		System.out.println(listaClientes.existe("192.949.340-53"));
		System.out.println(listaClientes.existe("189.340.503-12"));
		
		try {
			listaClientes.atualizar(cl2);
			listaClientes.remover("189.340.503-12");
			listaClientes.remover("123");
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}
			System.out.println(listaClientes.existe("189.340.503-12"));
		try {
			Cliente c = listaClientes.procurar("192.949.340-53");
			System.out.println("email-"+ c.getEmail()+"\nnome-"+c.getNome()+"\nnick -"+c.getNickname());
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}
		//teste fachada
		try {
		f.cadastrarCliente(cl1);
		}catch(ClienteJaCadastradoException e1) {
			System.out.println(e1.getMessage());
		}
	}
}