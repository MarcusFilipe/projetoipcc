package ui;

import fachadas.*;
import java.util.Scanner;
import clientes.*;
import produtos.*;
import usuarios.*;
import vendas.*;
import desenvolvedores.*;
import funcionarios.*;
//import orientacaobasica.Cliente;
//import orientacaobasica.ClienteJaCadastradoException;
//import orientacaobasica.ClienteNaoCadastradoException;

import java.util.*;
public class Programa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		Cliente cl = new Cliente("Marcus","mfbm","046.468.694-62","skrix");
		Cliente cl1 = new Cliente("Wilson", "jwcfj", "189.340.503-12","uiusu");
		Cliente cl2 = new Cliente("Alice","abm","046.468.694-62","skrix");
		Cliente cl3 = new Cliente("Pedro","pvlb","105.930.450-89","�Ouzi");
		Cliente cl4 = new Cliente("Frederico","fbsm","193.149.560-69","Fred");
		
		
		
		RepositorioClientes arrayClientes = new RepositorioClienteArray(100);
		RepositorioClientes listaClientes = new RepositorioClienteLista();
		RepositorioDesenvolvedores arrayDesenvolvedores = new RepositorioDesenvolvedorArray(100);
		RepositorioDesenvolvedores listaDesenvolvedores = new RepositorioDesenvolvedorLista();
		RepositorioFuncionario arrayFuncionarios = new RepositorioFuncionarioArray(100);
		RepositorioFuncionario listaFuncionarios = new RepositorioFuncionarioLista();
		RepositorioVenda arrayVendas = new RepositorioVendaArray(100);
		RepositorioVenda listaVendas = new RepositorioVendaLista();
		RepositorioProdutos arrayProdutos = new RepositorioProdutoArray(100);
		RepositorioProdutos listaProdutos = new RepositorioProdutoLista();

		Fachada f = new Fachada(arrayClientes, arrayDesenvolvedores, arrayFuncionarios, arrayVendas, arrayProdutos);
		Fachada f1 = new Fachada(listaClientes, listaDesenvolvedores, listaFuncionarios, listaVendas, listaProdutos);
		
		String acao = "";
		String classeEntrada="";
		while(in.hasNext())
		{
			try
			{
				acao=in.nextLine();
				classeEntrada=in.nextLine();
				switch(acao)
				{
					case("CADASTRAR"):
					{
						switch(classeEntrada)
						{
							case("DESENVOLVEDOR"):
								f1.cadastrarDesenvolvedor(new Desenvolvedor(in.nextLine(),in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine())));
								//f1.cadastrarDesenvolvedor(new Desenvolvedor("Wiusu","wilsin@gamiu.com","400289-22",10.6));
								break;
						}
						break;
					}
					case("REMOVER"):
					{
						switch(classeEntrada)
						{
							case("DESENVOLVEDOR"):
							{
								f1.removerDesenvolvedor(in.nextLine());
								//f1.removerDesenvolvedor("400289-22");
								break;
							}
						}
						break;
					}
					case("PROCURAR"):
					{
						switch(classeEntrada)
						{
							case("DESENVOLVEDOR"):
							{
								f1.procurarDesenvolvedor(in.nextLine());
								//f1.procurarDesenvolvedor("400289-22");
								break;
							}
						}
						break;
					}
					case("ATUALIZAR"):
					{
						switch(classeEntrada)
						{
							case("DESENVOLVEDOR"):
							{
								f1.atualizarDesenvolvedor(new Desenvolvedor(in.nextLine(),in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine())));
								//f1.atualizarDesenvolvedor(new Desenvolvedor("Wiusu","wilsin@gamiu.com","400289-22",10.6));
								break;
							}
						}
						break;
					}
					case("EXISTE"):
					{
						switch(classeEntrada)
						{
							case("DESENVOLVEDOR"):
							{
								System.out.println(f1.existeDesenvolvedor(in.nextLine()));
								//System.out.println(f1.existeDesenvolvedor("400289-22"));
								break;
							}
						}
						break;
					}
				}
			}catch (DesenvolvedorJaCadastradoException e1) {
				e1.printStackTrace();
			}catch (DesenvolvedorNaoCadastradoException e2) {
				e2.printStackTrace();
			}//AQUI ENTRA OS CATCH'S COM OS EXCEPTION DOS OUTROS 
		}
		
		while(!in.hasNext("FIM")) {
			//System.out.println("Voc� deseja utilizar um reposit�rio de array ou lista?");
			
			
			String tipo = in.nextLine();
			if(tipo.equals("array")) {
				//System.out.println("O que voc� deseja fazer?");
				String comando = in.nextLine();
				if(comando.equals("inserir cliente")) {
					System.out.println("Digite o nome do cliente, email, cpf e nickname(sempre pulando uma linha)");
					Cliente a = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try{
						f.cadastrarCliente(a);
					}catch(ClienteJaCadastradoException e) { 
						System.out.println(e.getMessage());
					}
				}else if(comando.equals("remover cliente")) {
					System.out.println("Digite o cpf do cliente a ser removido");
					try{
						f.removerCliente(in.nextLine());
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				}else if(comando.equals("procurar cliente")) {
					System.out.println("Digite o cpf do cliente a ser procurado");
					try{
						Cliente c = f.procurarCliente(in.nextLine());
						System.out.println("Nome do cliente:"+c.getNome()+"\nEmail do cliente:"+c.getEmail()+"\nNickname do cliente:"+c.getNickname());
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				}else if(comando.equals("atualizar cliente")) {
					System.out.println("Digite o novo nome do cliente,o mesmo cpf, novo email, e novo nickname(sempre pulando uma linha)");
					Cliente b = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try{
					f.atualizarCliente(b);
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
					
				}else if(comando.equals("existe cliente")) {
					try{
						if(f.existeCliente(in.nextLine()))
							System.out.println("Cliente Cadastrado");
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
					
				}
					
				
		
			}else if(tipo.equals("lista")) {
				String comando = in.nextLine();
				if(comando.equals("inserir cliente")) {
					System.out.println("Digite o nome do cliente, email, cpf e nickname(sempre pulando uma linha)");
					Cliente a = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try{
						f1.cadastrarCliente(a);
					}catch(ClienteJaCadastradoException e) { 
						System.out.println(e.getMessage());
					}
				}else if(comando.equals("remover cliente")) {
					System.out.println("Digite o cpf do cliente a ser removido");
					try{
						f1.removerCliente(in.nextLine());
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				}else if(comando.equals("procurar cliente")) {
					System.out.println("Digite o cpf do cliente a ser procurado");
					try{
						Cliente c = f1.procurarCliente(in.nextLine());
						System.out.println("Nome do cliente:"+c.getNome()+"\nEmail do cliente:"+c.getEmail()+"\nNickname do cliente:"+c.getNickname());
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				}else if(comando.equals("atualizar cliente")) {
					System.out.println("Digite o novo nome do cliente,o mesmo cpf, novo email, e novo nickname(sempre pulando uma linha)");
					Cliente b = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try{
					f1.atualizarCliente(b);
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
					
				}else if(comando.equals("existe cliente")) {
					try{
						if(f1.existeCliente(in.nextLine()))
							System.out.println("Cliente Cadastrado");
					}catch(ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
					
				}
			}
				
		}
		
		
		
		
		in.close();
	}
}

