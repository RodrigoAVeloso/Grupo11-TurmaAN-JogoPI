package Jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Guilda {
	
	public static Scanner entrada = new Scanner(System.in);
	public static boolean guildaCompleto = false;
	public static int reputacao = 0;
	String opcao = "";
	
	public void guilda() {
		
		Intro intro = new Intro();
		//lima é lindo
		Mapa mapa = new Mapa();
		
		if (guildaCompletoRetorno() == true) {
			System.out.println("Você já resolveu todos os problemas daqui!\r\n");
			mapa.mapa();
		}
		
		System.out.println("Intro da guilda aqui!");

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


		guildaCompleto = true;
		mapa.mapa();		
	}
	
	public String primeiraPergunta() {
		
		System.out.println("(5S - AUTODISCIPLINA) Há muitos anos atrás, um dos alquimistas tentou alcançar a vida eterna com a\n"
						+ "pedra filosofal, porém o plano deu errado e parte da Guilda foi destruída. Os \n"
						+ "alquimistas então entraram num consenso e proíbiram essa prática com a pedra filosofal.\n"
						+ "Porém, recentemente um dos alquimistas foi pego tentando concluir tal prática,\n"
						+ "pondo em risco toda a Guilda e todo o Reino.\r\n");

		System.out.print("* O que você deseja fazer a respeito? *\r\n");

		List<String> lista = new ArrayList<String>();

		lista.add("Conscientizar o alquimista sobre sua responsabilidade com o reino e com"
				+ "todos os cidadãos, explicando o perigo de suas práticas.");
		lista.add("Executar o alquimista em praça pública.");
		lista.add("Tomar posse da pedra filosofal para tentar ser imortal.");
		lista.add("Expulsar o alquimista da Guilda");

		Collections.shuffle(lista);

		System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));

		System.out.print("Opção: ");
		opcao = entrada.nextLine();
		
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
			System.err.println("Opção inválida!\r\n" + "Digite uma opção valida! \n");
		}		
		return this.opcao;		
} 

	private static void valorPergunta1(int param, List<String> lista) {

		if (lista.get(param).equals("Conscientizar o alquimista sobre sua responsabilidade com o reino e com"
				+ "todos os cidadãos, explicando o perigo de suas práticas.")) {
			System.out.println("* O alquimista compreende o perigo de experimentos e se compromete a colocar a segurança do Reino em primeiro lugar. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Executar o alquimista em praça pública.")) {
			System.out.println("* O alquimista é executado por conta de seus práticas perigosas. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (lista.get(param).equals("Tomar posse da pedra filosofal para tentar ser imortal.")) {
			System.out.println("* A pedra filosofia era instável e altamente perigosa. Ao ser ativada, a reação em cadeia destrói metade do Reino. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao - 100;
		} else if (lista.get(param).equals("Expulsar o alquimista da Guilda")) {
			System.out.println("* O alquimista é exilado do Reino, livre para continuar sua pesquisa em outro lugar. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} 

	}
	
	public String segundaPergunta() {
		
		System.out.println("(2S - ORDENAÇÃO) A Guilda dos Alquimistas está crescendo e o espaço onde eles se reúnem não está\n" + 
					"mais conseguindo alocar a todos. Além disso, seus equipamentos e materiais não estão sendo suficientes\n" + 
					"para as pesquisas dos novos membros.\r\n");

		System.out.print("* O que você deseja fazer a respeito? *\r\n");

		List<String> lista = Arrays.asList("Alocar os Alquimistas para um local maior e comprar tudo que eles pedem.",
				"Alocar os Alquimistas para um local maior e contratar um tesoureiro pra administrar o controle"
				+ "de seus materiais.",
				"Limitar a quantidade de Alquimistas e manter as coisas da forma que estão.",
				"Fechar temporariamente a Guilda dos Alquimistas.");

		Collections.shuffle(lista);
		Collections.shuffle(lista);
		Collections.shuffle(lista);

		System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));

		System.out.print("Opção: ");
		opcao = entrada.nextLine();
		
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
			System.err.println("Opção inválida!\r\n"
					+ "Digite uma opção valida! \n");							
		}
		
		return this.opcao;

	}
	
	public static void valorPegunta2(int param, List<String> lista) {
		
		if (lista.get(param).equals("Alocar os Alquimistas para um local maior e comprar tudo que eles pedem.")) {
			System.out.println("* A Guilda aproveita de suas novas instalações e seus novos recursos sem fim, talvez até demais. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (lista.get(param).equals("Alocar os Alquimistas para um local maior e contratar um tesoureiro pra administrar o controle"
				+ "de seus materiais.")) {
			System.out.println("* A Guilda aproveita de suas novas instalações, e usas seus recursos com responsabilidade. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param)
				.equals("Limitar a quantidade de Alquimistas e manter as coisas da forma que estão.")) {
			System.out.println("* A Guilda continua suas operações de forma limitada. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param).equals("Fechar temporariamente a Guilda dos Alquimistas.")) {
			System.out.println("* A Guilda fecha suas operações temporariamente, acabando com todas as pesquisas científicas do Reino. *\r\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} 

	}
		
	public String terceiraPergunta() {
		
		System.out.println("(9S - PRINCÍPIOS MORAIS E ÉTICOS) Uma parte dos alquimistas estão se rebelando e estão utilizando práticas\n"
					+ "proibidas e antiéticas para benefício próprio e desrespeitando os Mandamentos dos Alquimistas.\r\n");

		System.out.print("* O que você deseja fazer a respeito? *\r\n");

		List<String> lista = Arrays.asList("Queimar os rebeldes numa fogueira em praça pública.",
				"Mostrar aos Alquimistas o seu importante papel no desenvolvimento cientifico e econômico do Reino.",
				"Exilar os rebeldes do reino.",
				"Esconder os rebeldes para conduzirem sua pesquisa secretamente.");

		Collections.shuffle(lista);
		Collections.shuffle(lista);
		Collections.shuffle(lista);

		System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));

		System.out.print("Opção: ");
		opcao = entrada.nextLine();
		
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
			System.err.println("Opção inválida!\r\n"
					+ "Digite uma opção valida! \n");							
		}
		
		return this.opcao;
	}
	
	public static void valorPergunta3(int param, List<String> lista) {
		
		if (lista.get(param).equals("Queimar os rebeldes numa fogueira em praça pública.")) {
			System.out.println("* Os Alquimistas rebeldes são queimados, servindo de exemplo para o resto da Guilda. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (lista.get(param).equals("Mostrar aos Alquimistas o seu importante papel no desenvolvimento cientifico e econômico do Reino.")) {
			System.out.println("* Os Alquimistas renegados compreendem sua importância para o reino e necessidade da condução ética de suas pesquisas. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Exilar os rebeldes do reino.")) {
			System.out.println("* Os Alquismistas rebeldes são exilados, conduzindo suas pesquisas antiéticas em outras terras. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param).equals("Esconder os rebeldes para conduzirem sua pesquisa secretamente.")) {
			System.out.println("* Os Alquismistas continuam suas pesquisas antiéticas secretamente, para o 'benefício' do Reino. *\n");
			System.out.println("Aperte 'ENTER' para continuar...\n");
			entrada.nextLine();
			reputacao = reputacao - 10;
		} 
	}
	
	public boolean guildaCompletoRetorno() {
		
		return this.guildaCompleto;
		
	}
	
	public int reputacaoRetorno(){
		
		return this.reputacao;
		
	}
	
}
