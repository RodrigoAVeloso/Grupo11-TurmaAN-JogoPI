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
	String opcao = "";
	
	public void campo() {
		    Intro intro = new Intro();
		
			Mapa mapa = new Mapa();

			// Depois dar uma ajeitada aqui, colocado apenas para teste

			if (campoCompletoRetorno() == true) {
				System.out.println("Vocẽ já resolveu todos os problemas daqui!\r\n");
				mapa.mapa();
			}

			System.out.println("Algumas horas se passam e os problemas do campo começam a surgir, os camponeses estão\n"
					+ "insatisfeitos com algo, então o " + intro.nPersonagemNome() + " decide ir averiguar a situação pessoalmente, " 
					+"\ncom o pensamento de que"
					+ "se ele próprio ir ouvir o que o povo tem a dizer, faria com que a sua reputação aumentasse. \r\n");

			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();

			opcao = "";

			do {
				
				this.primeiraPergunta();				
				
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));

			opcao = "";

			do {
				
				this.segundaPergunta();
				
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));

			opcao = "";

			do {
				
				this.terceiraPergunta();
				
			} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));


			campoCompleto = true;
			mapa.mapa();		
	}

	public String primeiraPergunta() {
		
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
				valorPergunta1(opcaoConvert, lista);

				break;
			case "2":
				valorPergunta1(opcaoConvert, lista);

				break;
			case "3":
				valorPergunta1(opcaoConvert, lista);

				break;
			case "4":
				valorPergunta1(opcaoConvert, lista);

				break;
			default:
				System.out.println("Opção inválida!\r\n" + "Digite uma opção valida: \n");
			}		
			return this.opcao;		
	} 
	
	private static void valorPergunta1(int param, List<String> lista) {

		if (lista.get(param).equals("Deixar da forma que está. ")) {
			System.out.println("* O Rei acha que existem problemas mais importantes *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (lista.get(param).equals("Fazer cada um dos moradores armazenar seus recursos campestres.")) {
			System.out.println("* O Rei declara que todos devem guardar e cuidar de seus próprios recursos *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param)
				.equals("Gastar dinheiro e serviço braçal construindo um grande armazém comunitário.")) {
			System.out.println("* Um investimento é feito para a criação de um armazém comunitário, todos os recursos agora "
					+ "estão guardados e organizados corretamente, e a população está contente *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Tomar posse dos recursos jogados e vender para os moradores que estão interessados.")) {
			System.out.println("* Já que estavam jogados, o Rei pega as ferramentas e recursos em questão e os comercializa *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else {
			//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}

	}

	public String segundaPergunta() {
		
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
		int opcaoConvert = Integer.parseInt(opcao) - 1;
		switch (opcao) {
		case "1":
			valorPegunta2(opcaoConvert, lista);		
			break;
		case "2":
			valorPegunta2(opcaoConvert, lista);	
			break;
		case "3":
			valorPegunta2(opcaoConvert, lista);	
			break;
		case "4":
			valorPegunta2(opcaoConvert, lista);	
			break;
		default:
			System.out.println("Opção inválida!\r\n" + "Digite uma opção valida: \n");

		}
		
		return this.opcao;

	}
	
	public static void valorPegunta2(int param, List<String> lista) {
		if (lista.get(param).equals("Comprar comida de reinos vizinhos. ")) {
			System.out.println("* Recursos foram gastos para tentar resolver o problema da comida. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (lista.get(param).equals("Contratar novos agricultores treinados de terras vizinhas.")) {
			System.out.println("* Agricultores estrangeiros foram contratados. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param)
				.equals("Acabar com o plantio do reino e investir em outras formas alimentícias.")) {
			System.out.println("* Todas as plantações foram destruídas, e novos recursos foram plantados. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (lista.get(param).equals("Treinar camponeses entre os novos colonos para o serviço desejado.")) {
			System.out.println("* Alguns camponeses foram treinados e designados para o plantio. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else {
			System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}

	}
	
	public String terceiraPergunta() {
		
		System.out.println(
				"(6S - UNIÃO) O Barão Dapi Zadinha não está tendo uma boa relação com um feudo local, atrapalhando a produção em geral,\n"
						+ "já que os camponeses estão insatisfeitos e perto de uma rebelião para colocar o Sr. Dapi Zadinha na guilhotina.\r\n"
						+ "\r\n");

		System.out.print("* O que você deseja fazer a respeito? *\r\n");

		List<String> lista = Arrays.asList("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo.",
				"Promover uma reunião entre ambas as partes para apaziguar a situação.",
				"Executar os camponeses que estão de acordo com a rebelião como forma de aviso.",
				"Executar Dapi Zadinha em praça pública.");

		Collections.shuffle(lista);
		Collections.shuffle(lista);
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
			valorPergunta3(opcaoConvert, lista);
			break;
		case "2":
			valorPergunta3(opcaoConvert, lista);
			break;
		case "3":
			valorPergunta3(opcaoConvert, lista);
		break;
		case "4":
			valorPergunta3(opcaoConvert, lista);
			break;
		default:
			System.out.println("Opção inválida!\r\n" + "Digite uma opção valida: \n");
		}
		
		return this.opcao;
	}
	
	public static void valorPergunta3(int param, List<String> lista) {
		
		if (lista.get(param).equals("Fazer Dapi Zadinha mudar de casa, e ir para longe do campo.")) {
			System.out.println(
					"* Dapi Zadinha foge para longe, e desde então não se houve falar mais nada sobre ele. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param)
				.equals("Promover uma reunião entre ambas as partes para apaziguar a situação.")) {
			System.out.println(
					"* Um acordo é feito, onde todas as partes estão satisfeitos, e tudo enfim se normaliza. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Executar os camponeses que estão de acordo com a rebelião como forma de aviso.")) {
			System.out.println(
					"* Todos os camponeses que estavam planejando a rebelião foram executados em frente a todos, e aqueles que os seguiam se calaram. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao - 10;
		} else if (lista.get(param).equals("Executar Dapi Zadinha em praça pública.")) {
			System.out.println(
					"* Talvez não fosse a melhor opção possível, mas com a morte de Dapi Zadiha a paz volta a reinar em Takeolândia. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else {
			//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}	
	}
	
	public boolean campoCompletoRetorno() {
	
		return this.campoCompleto;
		
	}
	
	public int reputacaoRetorno(){
		
		return this.reputacao;
		
	}

}
