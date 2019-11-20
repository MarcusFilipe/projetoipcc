package ui;

import fachadas.*;
import java.util.Scanner;
import clientes.*;
import produtos.*;
import vendas.*;
import desenvolvedores.*;
import funcionarios.*;
import java.util.*;


public class Programa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		

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
		String classeEntrada = "";
		String tipo = new String();
		while (in.hasNext()) {
			try {

				tipo = in.nextLine();
				acao = in.nextLine();
				classeEntrada = in.nextLine();
				//PARA LISTA
				if (tipo.equals("lista")) {

					switch (acao) {
					case "CADASTRAR": {
						switch (classeEntrada) {
						case "DESENVOLVEDOR":
							f1.cadastrarDesenvolvedor(new Desenvolvedor(in.nextLine(), in.nextLine(), in.nextLine(),
									Double.parseDouble(in.nextLine())));
							System.out.println("Desenvolvedor cadastrado com sucesso");
							break;
						case "CLIENTE":
							f1.cadastrarCliente(new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
							System.out.println("Cliente cadastrado com sucesso");
							break;
						case "FUNCIONARIO":
							f1.cadastrarFuncionario(
									new Funcionario(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
							System.out.println("Funcionario cadastrado com sucesso");
							break;
						case "PRODUTO":
							f1.inserirProduto(new Produto(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), in.nextLine(), in.nextLine()));
							System.out.println("Produto cadastrado com sucesso");
							break;
						
						}
						break;
					}
					case "REMOVER": {
						switch (classeEntrada) {
						case "DESENVOLVEDOR": 
							f1.removerDesenvolvedor(in.nextLine());
							System.out.println("Desenvolvedor removido com sucesso");
							break;
						
						case "CLIENTE":
							f1.removerCliente(in.nextLine());
							System.out.println("Cliente removido com sucesso");
							break;
							
						case "FUNCIONARIO":
							f1.removerFuncionario(in.nextLine());
							System.out.println("Funcionario removido com sucesso");
							break;
						case "PRODUTO":
							f1.removerProduto(in.nextLine());
							System.out.println("Produto removido com sucesso");
							break;
						
						}
						break;
					}
					case "PROCURAR": {
						switch (classeEntrada) {
						case "DESENVOLVEDOR": 
							Desenvolvedor a = f1.procurarDesenvolvedor(in.nextLine());
							System.out.println("nome -" +a.getNome() +"\nemail -"+ a.getEmail());
							break;
						case "CLIENTE":
							Cliente b = f1.procurarCliente(in.nextLine());
							System.out.println("nome -" +b.getNome() +"\nemail -"+ b.getEmail());
							break;
						case "FUNCIONARIO":
							Funcionario c = f1.procurarFuncionario (in.nextLine());
							System.out.println("nome -" +c.getNome() +"\nemail -"+ c.getEmail());
							break;
						case "PRODUTO":
							Produto d = f1.procurarProduto(in.nextLine());
							System.out.println("nome -" +d.getNome() +"\ncategoria -"+ d.getCategoria()+"\npreco -"+d.getPreco());
							break;
						}
						break;
					}
					case "ATUALIZAR": {
						switch (classeEntrada) {
						case "DESENVOLVEDOR": 
							f1.atualizarDesenvolvedor(new Desenvolvedor(in.nextLine(), in.nextLine(), in.nextLine(),
									Double.parseDouble(in.nextLine())));
							System.out.println("Desenvolvedor atualizado com sucesso");
							break;
						case "CLIENTE":
							f1.atualizarCliente(new Cliente(in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine()));
							System.out.println("Cliente atualizado com sucesso");
							break;
						case "FUNCIONARIO":
							f1.atualizarFuncionario(new Funcionario(in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine()));
							System.out.println("Funcionario atualizado com sucesso");
							break;
						case "PRODUTO":
							f1.atualizarProduto(new Produto(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), in.nextLine(), in.nextLine()));
							System.out.println("Produto atualizado com sucesso");
							break;
						}
						break;
					}
					case "EXISTE": {
						switch (classeEntrada) {
						case "DESENVOLVEDOR": 
							System.out.println(f1.existeDesenvolvedor(in.nextLine()));
							// System.out.println(f1.existeDesenvolvedor("400289-22"));
							break;
						case "CLIENTE":
							System.out.println(f1.existeCliente(in.nextLine()));
							break;
						
						}
						break;
					}
				}
					
				//PARA ARRAY
				} else if (tipo.equals("array")) {

					switch (acao) {
						case "CADASTRAR": {
							switch (classeEntrada) {
							case "DESENVOLVEDOR":
								f.cadastrarDesenvolvedor(new Desenvolvedor(in.nextLine(), in.nextLine(), in.nextLine(),
										Double.parseDouble(in.nextLine())));
								System.out.println("Desenvolvedor cadastrado com sucesso");
								break;
							case "CLIENTE":
								f.cadastrarCliente(new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
								System.out.println("Cliente cadastrado com sucesso");
								break;
							case "FUNCIONARIO":
								f.cadastrarFuncionario(
										new Funcionario(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
								System.out.println("Funcionario cadastrado com sucesso");
								break;
							case "PRODUTO":
								f.inserirProduto(new Produto(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), in.nextLine(), in.nextLine()));
								System.out.println("Produto cadastrado com sucesso");
								break;
							
							}
							break;
						}
						case "REMOVER": {
							switch (classeEntrada) {
							case "DESENVOLVEDOR": 
								f.removerDesenvolvedor(in.nextLine());
								System.out.println("Desenvolvedor removido com sucesso");
								break;
							
							case "CLIENTE":
								f.removerCliente(in.nextLine());
								System.out.println("Cliente removido com sucesso");
								break;
								
							case "FUNCIONARIO":
								f.removerFuncionario(in.nextLine());
								System.out.println("Funcionario removido com sucesso");
								break;
							case "PRODUTO":
								f.removerProduto(in.nextLine());
								System.out.println("Produto removido com sucesso");
								break;
							
							}
							break;
						}
						case "PROCURAR": {
							switch (classeEntrada) {
							case "DESENVOLVEDOR": 
								Desenvolvedor a = f.procurarDesenvolvedor(in.nextLine());
								System.out.println("nome -" +a.getNome() +"\nemail -"+ a.getEmail());
								break;
							case "CLIENTE":
								Cliente b = f.procurarCliente(in.nextLine());
								System.out.println("nome -" +b.getNome() +"\nemail -"+ b.getEmail());
								break;
							case "FUNCIONARIO":
								Funcionario c = f.procurarFuncionario (in.nextLine());
								System.out.println("nome -" +c.getNome() +"\nemail -"+ c.getEmail());
								break;
							case "PRODUTO":
								Produto d = f.procurarProduto(in.nextLine());
								System.out.println("nome -" +d.getNome() +"\ncategoria -"+ d.getCategoria()+"\npreco -"+d.getPreco());
								break;
							}
							break;
						}
						case "ATUALIZAR": {
							switch (classeEntrada) {
							case "DESENVOLVEDOR": 
								f.atualizarDesenvolvedor(new Desenvolvedor(in.nextLine(), in.nextLine(), in.nextLine(),
										Double.parseDouble(in.nextLine())));
								System.out.println("Desenvolvedor atualizado com sucesso");
								break;
							case "CLIENTE":
								f.atualizarCliente(new Cliente(in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine()));
								System.out.println("Cliente atualizado com sucesso");
								break;
							case "FUNCIONARIO":
								f.atualizarFuncionario(new Funcionario(in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine()));
								System.out.println("Funcionario atualizado com sucesso");
								break;
							case "PRODUTO":
								f.atualizarProduto(new Produto(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), in.nextLine(), in.nextLine()));
								System.out.println("Produto atualizado com sucesso");
								break;
							}
							break;
						}
						case "EXISTE": {
							switch (classeEntrada) {
							case "DESENVOLVEDOR": 
								System.out.println(f.existeDesenvolvedor(in.nextLine()));
								// System.out.println(f1.existeDesenvolvedor("400289-22"));
								break;
							case "CLIENTE":
								System.out.println(f.existeCliente(in.nextLine()));
								break;
							
							}
							break;
						}
					}

				}
			} catch (DesenvolvedorJaCadastradoException e1) {
				e1.printStackTrace();
			} catch (DesenvolvedorNaoCadastradoException e2) {
				e2.printStackTrace();
			} catch (ClienteNaoCadastradoException e3) {
				e3.printStackTrace();
			} catch (ClienteJaCadastradoException e4) {
				e4.printStackTrace();
			} catch (FuncionarioJaCadastradoException e5) {
				e5.printStackTrace();
			} catch(FuncionarioNaoCadastradoException e6) {
				e6.printStackTrace();
			} catch(ProdutoJaCadastradoException e7) {
				e7.printStackTrace();
			} catch (ProdutoNaoCadastradoException e8) {
				e8.printStackTrace();
			}
		}


		in.close();
	}
}
