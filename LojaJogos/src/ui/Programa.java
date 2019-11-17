package ui;

import clientes.Cliente;
import clientes.RepositorioClienteArray;

public class Programa {
	public static void main(String[] args) {
		Cliente cl = new Cliente("Marcus","mfbm");
		cl.setCpf("192.939.304-59");
		Cliente cl1 = new Cliente("Wilson", "whfdsui");
		cl1.setCpf("1283.39140.-321");
		
		RepositorioClienteArray lista = new RepositorioClienteArray(100);
		lista.inserir(cl);
		lista.inserir(cl1);
		System.out.println(lista.existe("192.939.304-59"));
		System.out.println(lista.existe("1283.39140.-321"));
		//lista.remover("192.939.304-59");
		//System.out.println(lista.existe("192.939.304-59"));
		
		
	}
}
