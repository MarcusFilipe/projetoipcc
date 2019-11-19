package ui;

import fachadas.*;
import java.util.Scanner;
import clientes.*;
import produtos.*;
import usuarios.*;
import desenvolvedores.*;
import funcionarios.*;

public class Programa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		Cliente cl = new Cliente("Marcus","mfbm","046.468.694-62","skrix");
		Cliente cl1 = new Cliente("Wilson", "jwcfj", "189.340.503-12","uiusu");
		Cliente cl2 = new Cliente("Alice","abm","046.468.694-62","skrix");
		Cliente cl3 = new Cliente("Pedro","pvlb","105.930.450-89","ÈOuzi");
		Cliente cl4 = new Cliente("Frederico","fbsm","193.149.560-69","Fred");
		
		RepositorioClientes arrayClientes = new RepositorioClienteArray(100);
		RepositorioClientes listaClientes = new RepositorioClienteLista();
		RepositorioDesenvolvedores arrayDesenvolvedores = new RepositorioDesenvolvedorArray(100);
		RepositorioDesenvolvedores listaDesenvolvedores = new RepositorioDesenvolvedorLista();
		RepositorioFuncionario arrayFuncionarios = new RepositorioFuncionarioArray(100);
		RepositorioFuncionario listaFuncionarios = new RepositorioFuncionarioLista();
		
		
		Fachada f = new Fachada(arrayClientes, arrayDesenvolvedores, arrayFuncionarios);
		Fachada f1 = new Fachada(listaClientes, listaDesenvolvedores, listaFuncionarios);
		//array
		
		
		try {
			f.cadastrarCliente(cl);
			f.cadastrarCliente(cl1);
			f.existeCliente("046.468.694-62");
		}catch(ClienteNaoCadastradoException e) {
			System.out.println(e.getMessage());
		}catch(ClienteJaCadastradoException e1) {
			System.out.println(e1.getMessage());
		}
		
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
			if(c != null)
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
		in.close();
	}
}