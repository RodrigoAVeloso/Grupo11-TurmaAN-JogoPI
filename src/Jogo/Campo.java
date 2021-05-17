package Jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Campo {
	
	public static Scanner entrada = new Scanner(System.in);
	public static boolean campoCompleto = false;
	public static int reputacao = 0;
	//public Intro intro = new Intro();
	String opcao = "";
	
	public void campo() {
		Intro intro = new Intro();
		//String nPersonagem = intro.nPersonagemNome();
		
		System.out.println("\n" + intro.nPersonagemNome() + "\n");
		
			Mapa mapa = new Mapa();

			// Depois dar uma ajeitada aqui, colocado apenas para teste

			if (campoCompletoRetorno() == true) {
				System.out.println("Vocẽ já resolveu todos os problemas daqui!\r\n");
				mapa.mapa();
			}

			//String opcao = "";

			// Pergunta 1
			System.out.println("Algumas horas se passam e os problemas do campo começam a surgir, os camponeses estão\n"
					+ "insatisfeitos com algo, então o novo rei" //+ nPersonagem
					+ " decide ir averiguar a situação pessoalmente, \ncom o pensamento de que"
					+ "se ele próprio ir ouvir o que o povo tem a dizer, faria com que a sua reputação aumentasse. \r\n");

			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();

			opcao = "";

			do {
				
				this.primeiraPergunta();				
				
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));

			/*
			 * System.out.
			 * println("(1S - ULTILIZAÇÃO) Chegando no campo as pessoas o cercam para falar dos problemas que estão acontecendo.\r\n"
			 * + "Uma senhora se aproxima e diz:\r\n" +
			 * "- Majestade, a um tempo que isso vem causando revolta no nosso povo, sempre há ferramentas essenciais para o plantio, sumindo.\n"
			 * +
			 * "As pessoas não tem como guardar e organizar os recursos e ferramentas.\r\n"
			 * );
			 * 
			 * 
			 * 
			 * System.out.println("* O que você deseja fazer a respeito? *\r\n");
			 * System.out.println("1 - Deixar da forma que está."); System.out.
			 * println("2 - Fazer cada um dos moradores armazenar seus recursos campestres."
			 * ); System.out.
			 * println("3 - Gastar dinheiro e serviço braçal construindo um grande armazém comunitário."
			 * ); System.out.
			 * println("4 - Tomar posse dos recursos jogados e vender para os moradores que estão\n"
			 * + "interessados.\r\n");
			 * 
			 * do { opcao = entrada.nextLine();
			 * 
			 * if (opcao.equals("1")) {
			 * System.out.println("* O Rei acha que existem problemas mais importantes. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 0; } else if (opcao.equals("2"))
			 * { System.out.
			 * println("* O Rei declara que todos devem guardar e cuidar de seus próprios recursos. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 5; } else if (opcao.equals("3"))
			 * { System.out.
			 * println("* Um investimento é feito para a criação de um armazém comunitário, todos os recursos agora estão guardados\n"
			 * +" e organizados corretamente, e a população está contente. *\n");
			 * System.out.println("Aperte 'ENTER' para continuar..."); entrada.nextLine();
			 * reputacao = reputacao + 10; } else if (opcao.equals("4")) { System.out.
			 * println("* Já que estavam jogados, o Rei pega as ferramentas e recursos em questão e os comercializa. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 3; } else {
			 * System.out.println("Opção inválida! \nDigite uma opção valida: "); }
			 * }while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") &&
			 * !opcao.equals("4"));
			 */

			opcao = "";

			do {
				System.out.println(
						"(7S - TREINAMENTO) Após a morte do Dragão, cujo nome é Dá-grão, o reino passou a prosperar e diversas\n"
								+ "pessoas se interessaram em se mudar para o reino. Nisso, a demanda produtiva \n"
								+ "aumentou drasticamente, fazendo com que a mão de obra atual não ser mais efetiva quanto\n"
								+ "o necessário.\r\n");

				System.out.print("* O que você deseja fazer a respeito? *\r\n");

				List<String> lista = Arrays.asList("Comprar comida de reinos vizinhos. ",
						"Contratar novos agricultores treinados de terras vizinhas.",
						"Acabar com o plantio do reino e investir em outras formas alimentícias.",
						"Treinar camponeses entre os novos colonos para o serviço desejado.");

				Collections.shuffle(lista);
				Collections.shuffle(lista);
				Collections.shuffle(lista);

				System.out.println("1 - " + lista.get(0));
				System.out.println("2 - " + lista.get(1));
				System.out.println("3 - " + lista.get(2));
				System.out.println("4 - " + lista.get(3));

				// System.out.print("* O que você deseja fazer a respeito? *\r\n");
				opcao = entrada.next();

				switch (opcao) {
				case "1":
					if (lista.get(0).equals("Comprar comida de reinos vizinhos. ")) {
						System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else if (lista.get(0).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
						System.out.println("* Agricultores estrangeiros foram contratados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(0)
							.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
						System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 0;
					} else if (lista.get(0).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
						System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				case "2":
					if (lista.get(1).equals("Comprar comida de reinos vizinhos. ")) {
						System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else if (lista.get(1).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
						System.out.println("* Agricultores estrangeiros foram contratados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(1)
							.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
						System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 0;
					} else if (lista.get(1).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
						System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				case "3":
					if (lista.get(2).equals("Comprar comida de reinos vizinhos. ")) {
						System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else if (lista.get(2).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
						System.out.println("* Agricultores estrangeiros foram contratados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(2)
							.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
						System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 0;
					} else if (lista.get(2).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
						System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				case "4":
					if (lista.get(3).equals("Comprar comida de reinos vizinhos. ")) {
						System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else if (lista.get(3).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
						System.out.println("* Agricultores estrangeiros foram contratados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(3)
							.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
						System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 0;
					} else if (lista.get(3).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
						System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				default:
					System.out.println("Opção inválida!\r\n" + "Digite uma opção valida: \n");

				}
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));

			// Pergunta 2
			/*
			 * System.out.
			 * println("(7S - TREINAMENTO) Após a morte do Dragão, cujo nome é Dá-grão, o reino passou a prosperar e diversas\n"
			 * +
			 * "pessoas se interessaram em se mudar para o reino. Nisso, a demanda produtiva \n"
			 * +
			 * "aumentou drasticamente, fazendo com que a mão de obra atual não ser mais efetiva quanto\n"
			 * + "o necessário.\r\n");
			 * 
			 * System.out.println("* O que você deseja fazer a respeito? *\r\n");
			 * System.out.println("1 - Comprar comida de reinos vizinhos. "); System.out.
			 * println("2 - Contratar novos agricultores treinados de terras vizinhas.");
			 * System.out.
			 * println("3 - Acabar com o plantio do reino e investir em outras formas alimentícias."
			 * ); System.out.
			 * println("4 - Treinar camponeses entre os novos colonos para o serviço desejado.\r\n"
			 * );
			 * 
			 * do { opcao = entrada.nextLine();
			 * 
			 * if (opcao.equals("1")) { System.out.
			 * println("* Recursos foram gastos para tentar resolver o problema da comida. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 3; } else if (opcao.equals("2"))
			 * { System.out.println("* Agricultores estrangeiros foram contratados. *\n");
			 * System.out.println("Aperte 'ENTER' para continuar..."); entrada.nextLine();
			 * reputacao = reputacao + 5; } else if (opcao.equals("3")) { System.out.
			 * println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 0; } else if (opcao.equals("4"))
			 * { System.out.
			 * println("* Alguns camponeses foram treinados e designados para o plantio. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 10; } else {
			 * System.out.println("Opção inválida! \nDigite uma opção valida: "); }
			 * }while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") &&
			 * !opcao.equals("4"));
			 */

			opcao = "";

			do {
				System.out.println(
						"(6S - UNIÃO) O Barão Dapi Zadinha não está tendo uma boa relação com um feudo local, atrapalhando a produção em geral,\n"
								+ "já que os camponeses estão insatisfeitos e perto de uma rebelião para colocar o Sr. Dapi Zadinha na guilhotina.\r\n"
								+ "\r\n");

				System.out.print("* O que você deseja fazer a respeito? *\r\n");

				List<String> lista = Arrays.asList("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo. ",
						"Promover uma reunião entre ambas as partes para apaziguar a situação.",
						"Executar os camponeses que estão de acordo com a rebelião como forma de aviso.",
						"Executar Dapi Zadinha em praça pública.\\r\\n");

				Collections.shuffle(lista);
				Collections.shuffle(lista);
				Collections.shuffle(lista);

				System.out.println("1 - " + lista.get(0));
				System.out.println("2 - " + lista.get(1));
				System.out.println("3 - " + lista.get(2));
				System.out.println("4 - " + lista.get(3));

				// System.out.print("* O que você deseja fazer a respeito? *\r\n");
				opcao = entrada.next();

				switch (opcao) {
				case "1":
					if (lista.get(0).equals("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo. ")) {
						System.out.println(
								"* Dapi Zadinha foge para longe, e desde então não se houve falar mais nada sobre ele. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(0)
							.equals("Promover uma reunião entre ambas as partes para apaziguar a situação.")) {
						System.out.println(
								"* Um acordo é feito, onde todas as partes estão satisfeitos, e tudo enfim se normaliza. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else if (lista.get(0)
							.equals("Executar os camponeses que estão de acordo com a rebelião como forma de aviso.")) {
						System.out.println(
								"* Todos os camponeses que estavam planejando a rebelião foram executados em frente a todos, e aqueles que os seguiam se calaram. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao - 10;
					} else if (lista.get(0).equals("Executar Dapi Zadinha em praça pública.\\r\\n")) {
						System.out.println(
								"* Talvez não fosse a melhor opção possível, mas com a morte de Dapi Zadiha a paz volta a reinar em Takeolândia. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				case "2":
					if (lista.get(1).equals("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo. ")) {
						System.out.println(
								"* Dapi Zadinha foge para longe, e desde então não se houve falar mais nada sobre ele. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(1)
							.equals("Promover uma reunião entre ambas as partes para apaziguar a situação.")) {
						System.out.println(
								"* Um acordo é feito, onde todas as partes estão satisfeitos, e tudo enfim se normaliza. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else if (lista.get(1)
							.equals("Executar os camponeses que estão de acordo com a rebelião como forma de aviso.")) {
						System.out.println(
								"* Todos os camponeses que estavam planejando a rebelião foram executados em frente a todos, e aqueles que os seguiam se calaram. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao - 10;
					} else if (lista.get(1).equals("Executar Dapi Zadinha em praça pública.\\r\\n")) {
						System.out.println(
								"* Talvez não fosse a melhor opção possível, mas com a morte de Dapi Zadiha a paz volta a reinar em Takeolândia. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				case "3":
					if (lista.get(2).equals("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo. ")) {
						System.out.println(
								"* Dapi Zadinha foge para longe, e desde então não se houve falar mais nada sobre ele. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(2)
							.equals("Promover uma reunião entre ambas as partes para apaziguar a situação.")) {
						System.out.println(
								"* Um acordo é feito, onde todas as partes estão satisfeitos, e tudo enfim se normaliza. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else if (lista.get(2)
							.equals("Executar os camponeses que estão de acordo com a rebelião como forma de aviso.")) {
						System.out.println(
								"* Todos os camponeses que estavam planejando a rebelião foram executados em frente a todos, e aqueles que os seguiam se calaram. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao - 10;
					} else if (lista.get(2).equals("Executar Dapi Zadinha em praça pública.\\r\\n")) {
						System.out.println(
								"* Talvez não fosse a melhor opção possível, mas com a morte de Dapi Zadiha a paz volta a reinar em Takeolândia. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				case "4":
					if (lista.get(3).equals("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo. ")) {
						System.out.println(
								"* Dapi Zadinha foge para longe, e desde então não se houve falar mais nada sobre ele. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 5;
					} else if (lista.get(3)
							.equals("Promover uma reunião entre ambas as partes para apaziguar a situação.")) {
						System.out.println(
								"* Um acordo é feito, onde todas as partes estão satisfeitos, e tudo enfim se normaliza. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 10;
					} else if (lista.get(3)
							.equals("Executar os camponeses que estão de acordo com a rebelião como forma de aviso.")) {
						System.out.println(
								"* Todos os camponeses que estavam planejando a rebelião foram executados em frente a todos, e aqueles que os seguiam se calaram. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao - 10;
					} else if (lista.get(3).equals("Executar Dapi Zadinha em praça pública.\\r\\n")) {
						System.out.println(
								"* Talvez não fosse a melhor opção possível, mas com a morte de Dapi Zadiha a paz volta a reinar em Takeolândia. *\n");
						System.out.println("Aperte 'ENTER' para continuar...");
						entrada.nextLine();
						reputacao = reputacao + 3;
					} else {
						System.out.println("Opção inválida! \nDigite uma opção valida: ");
					}
					break;
				default:
					System.out.println("Opção inválida!\r\n" + "Digite uma opção valida: \n");

				}
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));

			// Pergunta 3
			/*
			 * System.out.
			 * println("(6S - UNIÃO) O Barão Dapi Zadinha não está tendo uma boa relação com um feudo local, atrapalhando a produção em geral,\n"
			 * +
			 * "já que os camponeses estão insatisfeitos e perto de uma rebelião para colocar o Sr. Dapi Zadinha na guilhotina.\r\n"
			 * + "\r\n");
			 * 
			 * System.out.println("* O que você deseja fazer a respeito? *\r\n");
			 * System.out.
			 * println("1 - Fazer Dapi Zadinha mudar de casa, e ir para longe do campo. ");
			 * System.out.
			 * println("2 - Promover uma reunião entre ambas as partes para apaziguar a situação."
			 * ); System.out.
			 * println("3 - Executar os camponeses que estão de acordo com a rebelião como forma de aviso."
			 * ); System.out.println("4 - Executar Dapi Zadinha em praça pública.\r\n");
			 * 
			 * do { opcao = entrada.nextLine();
			 * 
			 * if (opcao.equals("1")) { System.out.
			 * println("* Dapi Zadinha foge para longe, e desde então não se houve falar mais nada sobre ele. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 5; } else if (opcao.equals("2"))
			 * { System.out.
			 * println("* Um acordo é feito, onde todas as partes estão satisfeitos, e tudo enfim se normaliza. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 10; } else if (opcao.equals("3"))
			 * { System.out.
			 * println("* Todos os camponeses que estavam planejando a rebelião foram executados em frente a todos, e aqueles que os seguiam se calaram. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao - 10; } else if (opcao.equals("4"))
			 * { System.out.
			 * println("* Talvez não fosse a melhor opção possível, mas com a morte de Dapi Zadiha a paz volta a reinar em Takeolândia. *\n"
			 * ); System.out.println("Aperte 'ENTER' para continuar...");
			 * entrada.nextLine(); reputacao = reputacao + 3; } else {
			 * System.out.println("Opção inválida! \nDigite uma opção valida: "); }
			 * }while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") &&
			 * !opcao.equals("4"));
			 */

			campoCompleto = true;
			mapa.mapa();
		

	}

	public String primeiraPergunta() {
		
		// Pergunta 1
		/*System.out.println("Algumas horas se passam e os problemas do campo começam a surgir, os camponeses estão\n"
				+ "insatisfeitos com algo, então" + nPersonagem
				+ "decide ir averiguar a situação pessoalmente, \ncom o pensamento de que"
				+ "se ele próprio ir ouvir o que o povo tem a dizer, faria com que a sua reputação aumentasse. \r\n");

		System.out.println("Aperte 'ENTER' para continuar...");
		entrada.nextLine();

		opcao = "";

		*/
			System.out.println(
					"(1S - ULTILIZAÇÃO) Chegando no campo as pessoas o cercam para falar dos problemas que estão acontecendo.\r\n"
							+ "Uma senhora se aproxima e diz:\r\n"
							+ "- Majestade, a um tempo que isso vem causando revolta no nosso povo, sempre há ferramentas essenciais para o plantio, sumindo.\n"
							+ "As pessoas não tem como guardar e organizar os recursos e ferramentas.\r\n");

			System.out.print("* O que você deseja fazer a respeito? *\r\n");

			List<String> lista = new ArrayList<String>();

			lista.add("Deixar da forma que está.");
			lista.add("Fazer cada um dos moradores armazenar seus recursos campestres.");
			lista.add("Gastar dinheiro e serviço braçal construindo um grande armazém comunitário.");
			lista.add("Tomar posse dos recursos jogados e vender para os moradores que estão interessados.");

			Collections.shuffle(lista);

			System.out.println("1 - " + lista.get(0));
			System.out.println("2 - " + lista.get(1));
			System.out.println("3 - " + lista.get(2));
			System.out.println("4 - " + lista.get(3));

			// System.out.print("* O que você deseja fazer a respeito? *\r\n");
			opcao = entrada.next();
			int opcaoConvert = Integer.parseInt(opcao) - 1;

			switch (opcao) {
			case "1":
				valorePergunta1(opcaoConvert, lista);
				/*if (lista.get(0).equals("Comprar comida de reinos vizinhos. ")) {
					System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 3;
					break;
				} else if (lista.get(0).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
					System.out.println("* Agricultores estrangeiros foram contratados. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 5;
					break;
				} else if (lista.get(0)
						.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
					System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 0;
					break;
				} else if (lista.get(0).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
					System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 10;
					
					break;

				} else {
					//System.out.println("Opção inválida 2! \nDigite uma opção valida: ");
				}
				*/
				break;
			case "2":
				valorePergunta1(opcaoConvert, lista);
				/*
				if (lista.get(0).equals("Comprar comida de reinos vizinhos. ")) {
					System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 3;
				} else if (lista.get(1).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
					System.out.println("* Agricultores estrangeiros foram contratados. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 5;
				} else if (lista.get(2)
						.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
					System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 0;
				} else if (lista.get(3).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
					System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 10;
				} else {
					System.out.println("Opção inválida! \nDigite uma opção valida: ");
				}
				*/
				break;
			case "3":
				valorePergunta1(opcaoConvert, lista);
				/*
				if (lista.get(0).equals("Comprar comida de reinos vizinhos. ")) {
					System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 3;
				} else if (lista.get(1).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
					System.out.println("* Agricultores estrangeiros foram contratados. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 5;
				} else if (lista.get(2)
						.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
					System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 0;
				} else if (lista.get(3).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
					System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 10;
				} else {
					System.out.println("Opção inválida ! \nDigite uma opção valida: ");
				}
				*/
				break;
			case "4":
				valorePergunta1(opcaoConvert, lista);
				/*
				if (lista.get(0).equals("Deixar da forma que está")) {
					System.out.println("* O Rei acha que existem problemas mais importantes. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 3;
				} else if (lista.get(1).equals("Fazer cada um dos moradores armazenar seus recursos campestres.")) {
					System.out
							.println("* O Rei declara que todos devem guardar e cuidar de seus próprios recursos. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 5;
				} else if (lista.get(2)
						.equals("Gastar dinheiro e serviço braçal construindo um grande armazém comunitário.")) {
					System.out.println(
							"* Um investimento é feito para a criação de um armazém comunitário, todos os recursos agora estão guardados\n"
									+ " e organizados corretamente, e a população está contente. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 0;
				} else if (lista.get(3).equals(
						"Tomar posse dos recursos jogados e vender para os moradores que estão interessados.")) {
					System.out.println(
							"* Já que estavam jogados, o Rei pega as ferramentas e recursos em questão e os comercializa. *\n");
					System.out.println("Aperte 'ENTER' para continuar...");
					entrada.nextLine();
					reputacao = reputacao + 10;
				} else {
					System.out.println("Opção inválida! \nDigite uma opção valida: ");
				}
				*/
				break;
			/*
			 * default: System.out.println("Opção inválida!\r\n" +
			 * "Digite uma opção valida: \n");
			 */

			}
			
			return this.opcao;

		
	} 
	
	private static void valorePergunta1(int param, List<String> lista) {

		if (lista.get(param).equals("Deixar da forma que está. ")) {
			System.out.println("* O Rei acha que existem problemas mais importantes *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (lista.get(param).equals("Fazer cada um dos moradores armazenar seus recursos campestres.")) {
			System.out.println("* O Rei declara que todos devem guardar e cuidar de seus próprios recursos *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param)
				.equals("Gastar dinheiro e serviço braçal construindo um grande armazém comunitário.")) {
			System.out.println("* Um investimento é feito para a criação de um armazém comunitário, todos os recursos agora "
					+ "estão guardados e organizados corretamente, e a população está contente *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Tomar posse dos recursos jogados e vender para os moradores que estão interessados.")) {
			System.out.println("* Já que estavam jogados, o Rei pega as ferramentas e recursos em questão e os comercializa *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else {
			//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}

	}

	public boolean campoCompletoRetorno() {
		System.out.println("\n" + campoCompleto+ "\n");
		return this.campoCompleto;
		
	}
	
	public int reputacaoRetorno(){
		
		return this.reputacao;
		
	}

}
