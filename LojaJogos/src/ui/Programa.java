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

		/*while (!in.hasNext("FIM")) {
			// System.out.println("Voc� deseja utilizar um reposit�rio de array ou lista?");

			String tipo = in.nextLine();
			if (tipo.equals("array")) {
				// System.out.println("O que voc� deseja fazer?");
				String comando = in.nextLine();
				if (comando.equals("inserir cliente")) {
					System.out.println("Digite o nome do cliente, email, cpf e nickname(sempre pulando uma linha)");
					Cliente a = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try {
						f.cadastrarCliente(a);
					} catch (ClienteJaCadastradoException e) {
						System.out.println(e.getMessage());
					}
				} else if (comando.equals("remover cliente")) {
					System.out.println("Digite o cpf do cliente a ser removido");
					try {
						f.removerCliente(in.nextLine());
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				} else if (comando.equals("procurar cliente")) {
					System.out.println("Digite o cpf do cliente a ser procurado");
					try {
						Cliente c = f.procurarCliente(in.nextLine());
						System.out.println("Nome do cliente:" + c.getNome() + "\nEmail do cliente:" + c.getEmail()
								+ "\nNickname do cliente:" + c.getNickname());
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				} else if (comando.equals("atualizar cliente")) {
					System.out.println(
							"Digite o novo nome do cliente,o mesmo cpf, novo email, e novo nickname(sempre pulando uma linha)");
					Cliente b = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try {
						f.atualizarCliente(b);
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}

				} else if (comando.equals("existe cliente")) {
					try {
						if (f.existeCliente(in.nextLine()))
							System.out.println("Cliente Cadastrado");
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}

				}

			} else if (tipo.equals("lista")) {
				String comando = in.nextLine();
				if (comando.equals("inserir cliente")) {
					System.out.println("Digite o nome do cliente, email, cpf e nickname(sempre pulando uma linha)");
					Cliente a = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try {
						f1.cadastrarCliente(a);
					} catch (ClienteJaCadastradoException e) {
						System.out.println(e.getMessage());
					}
				} else if (comando.equals("remover cliente")) {
					System.out.println("Digite o cpf do cliente a ser removido");
					try {
						f1.removerCliente(in.nextLine());
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				} else if (comando.equals("procurar cliente")) {
					System.out.println("Digite o cpf do cliente a ser procurado");
					try {
						Cliente c = f1.procurarCliente(in.nextLine());
						System.out.println("Nome do cliente:" + c.getNome() + "\nEmail do cliente:" + c.getEmail()
								+ "\nNickname do cliente:" + c.getNickname());
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}
				} else if (comando.equals("atualizar cliente")) {
					System.out.println(
							"Digite o novo nome do cliente,o mesmo cpf, novo email, e novo nickname(sempre pulando uma linha)");
					Cliente b = new Cliente(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
					try {
						f1.atualizarCliente(b);
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}

				} else if (comando.equals("existe cliente")) {
					try {
						if (f1.existeCliente(in.nextLine()))
							System.out.println("Cliente Cadastrado");
					} catch (ClienteNaoCadastradoException e) {
						System.out.println(e.getMessage());
					}

				}
			}

		}*/

		in.close();
	}
}
