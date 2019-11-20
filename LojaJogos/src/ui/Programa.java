package ui;

import fachadas.*;
import java.util.Scanner;
import clientes.*;
import produtos.*;
import usuarios.*;
import desenvolvedores.*;
import funcionarios.*;
import java.util.*;
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
		in.close();
	}
}

