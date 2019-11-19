package ui;
import fachadas.*;
import clientes.*;
import produtos.*;
import usuarios.*;
import desenvolvedores.*;


public class Programa {
	public static void main(String[] args) {
		//testes clientes
		Cliente cl = new Cliente("Marcus","mfbm","192.949.340-53","skrix");
		Cliente cl1 = new Cliente("Wilson", "whfdsui", "189.340.503-12", "uiusu");
		
		
		RepositorioClienteArray arrayClientes = new RepositorioClienteArray(100);
		System.out.println("Qual tipo de repositorio você deseja?");
		
		Fachada f = new Fachada(arrayClientes,arrayDesenvolvedores,arrayVendas);
		RepositorioClienteLista listaClientes = new RepositorioClienteLista();
		//array
		arrayClientes.inserir(cl);
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
		
		Cliente cl2 = new Cliente("Alice","abm","192.949.340-53","skrix");
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
		//
		
	}
}