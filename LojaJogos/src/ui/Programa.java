package ui;

import clientes.Cliente;
import clientes.ClienteNaoCadastradoException;
import clientes.RepositorioClienteArray;
import clientes.RepositorioClienteLista;

public class Programa {
	public static void main(String[] args) {
		//testes clientes
		Cliente cl = new Cliente("Marcus","mfbm","192.949.340-53","skrix");
		Cliente cl1 = new Cliente("Wilson", "whfdsui", "189.340.503-12", "uiusu");
		
		
		RepositorioClienteArray array = new RepositorioClienteArray(100);
		RepositorioClienteLista lista = new RepositorioClienteLista();
		//array
		array.inserir(cl);
		array.inserir(cl1);
		System.out.println(array.existe("192.949.340-53"));
		System.out.println(array.existe("189.340.503-12"));
		
		try{
			array.remover("192.949.340-53");
			array.remover("123");
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}
		
		try{
			Cliente c = array.procurar("189.340.503-12");
			System.out.println("email-"+ c.getEmail()+"\nnome-"+c.getNome()+"\nnick -"+c.getNickname());
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}
		
		if (array.existe("192.949.340-53")) {
			System.out.println("O cliente: 192.949.340-53 -- Existe");
		}else {
			System.out.println("O cliente: 192.949.340-53 -- Nao existe");
		}
		System.out.println("------------------");
		
		//lista
		lista.inserir(cl);
		lista.inserir(cl1);
		System.out.println(lista.existe("192.949.340-53"));
		System.out.println(lista.existe("189.340.503-12"));
		
		Cliente cl2 = new Cliente("Alice","abm","192.949.340-53","skrix");
		lista.atualizar(cl2);
		lista.remover("189.340.503-12");
		System.out.println(lista.existe("189.340.503-12"));
		lista.remover("123");
		Cliente c = lista.procurar("192.949.340-53");
		System.out.println("email-"+ c.getEmail()+"\nnome-"+c.getNome()+"\nnick -"+c.getNickname());
		//
		
		
		
		
		
	}
}