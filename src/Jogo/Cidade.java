package Jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cidade {
	
	public Mapa mapa; 	//= new Mapa();
	public static boolean cidadeCompleto = false;
	public static Scanner entrada = new Scanner(System.in);
	public static int reputacao = 0;
	String opcao = "";
	
	public void cidade() {
		mapa = new Mapa();
		
	if (cidadeCompleto == true) {
		System.out.println("Vocáº½ jÃ¡ resolveu todos os problemas daqui!\r\n");
		mapa.mapa();
	}
	
	//String opcao = "";
	
	//Pergunta 1
	System.out.println("VocÃª estÃ¡ na cidade.\r\n");
	do {
		
		this.primeiraPergunta();

	}while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	
	do {
		
		this.segundaPergunta();
		
	}while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	
	do {

		this.terceiraPergunta();
		
	} while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	
	cidadeCompleto = true;
	
	mapa.mapa(); //Aqui sÃ³ para teste

}
	
	public String primeiraPergunta() {
		
		System.out.println("\n(8S - ECONOMIA E COMBATE AOS DESPERDÍCIOS) Chegando na cidade, percebe-se que o comércio está sofrendo muito com o desperdício de alimentos," 
				+ "\nfazendo com que a moeda do reino não seja rentável, e com isso economia começa a cair.\r\n");
		
		System.out.print("* O que você deseja fazer a respeito? *\r\n");
		
		List<String> lista = Arrays.asList("Manter da forma que está, pois seria muito difícil reeducar os cidadãos.", 
				"Punir os cidadãos de forma que os próximos tenham medo de desperdiçar.", 
				"Reeducar o reino para que eles façam valer todo o dinheiro e esforço investido.", 
				"Premiar os cidadãos que não desperdiçarem alimento.");
		
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		
	    System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));
		
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
			System.out.println("Opção inválida!\r\n"
					+ "Digite uma opção valida: \n");							
		}
		return this.opcao;
		
	}
	
	private static void valorPergunta1(int param, List<String> lista) {
		
		if (lista.get(param).equals("Manter da forma que está, pois seria muito difícil reeducar os cidadãos.")) {
			System.out.println("* Como seria uma tarefa difícil, o Rei decide não gastar tempo, e nem recursos para resolver este problema. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (lista.get(param).equals("Punir os cidadãos de forma que os próximos tenham medo de desperdiçar.")) {
			System.out.println("* Alguns foram usados de exemplos para o restante pensar duas vezes antes de desperdiçarem novamente. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (lista.get(param).equals("Reeducar o reino para que eles façam valer todo o dinheiro e esforço investido.")) {
			System.out.println("* Todos foram conscientizados sobre como o desperdício é ruim para o reino, e aqueles que forem pegos desperdiçando qualquer recurso, serão multados *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Premiar os cidadãos que não desperdiçarem alimento")) {
			System.out.println("* O população viu a iniciativa proposta pelo Rei, e decidem não desperdiçar para serem recompensados por isso. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else {
		//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}
	}

	public String segundaPergunta() {
		
		System.out.println("(3S - LIMPEZA) Muitos cidadãos estão acumulando lixo e mantendo seus equipamentos sujos, deixando\n" + 
				"assim a cidade poluída e mal vista nas redondezas do reino.\r\n");
		
		System.out.print("* O que você deseja fazer a respeito? *\r\n");
		
		List<String> lista = new ArrayList<String>();

		
		lista.add("Ensinar os cidadãos como fazer a coleta e o descarte de lixo da forma correta e a como manter os equipamentos limpos e funcionais.");
		lista.add("Contratar funcionários para serem responsáveis pela limpeza do reino e dos equipamentos dos cidadãos.");		 
		lista.add("Deixar da forma que está."); 
		lista.add("Multar os cidadãos que sujam a cidade e deixam seus equipamentos numa má condição de uso.");
		
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		
	    System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));
		
		opcao = entrada.next();
		int opcaoConvert = Integer.parseInt(opcao) - 1;
		
		switch (opcao) {
		case "1":
			valorPergunta2(opcaoConvert, lista);
			break;					
		case "2":
			valorPergunta2(opcaoConvert, lista);
			break;					
		case "3":
			valorPergunta2(opcaoConvert, lista);
			break;				
		case "4":
			valorPergunta2(opcaoConvert, lista);
			break;				
		default:
			System.out.println("Opção inválida!\r\n"
					+ "Digite uma opção valida: \n");	
		}
		
		return this.opcao;
		
	}
	
	public static void valorPergunta2(int param, List<String> lista) {
		
		if (lista.get(param).equals("Ensinar os cidadãos como fazer a coleta e o descarte de lixo da forma "
				+"correta e a como manter os equipamentos limpos e funcionais.")) {
			System.out.println("* Os cidadãos são ensinados a como fazer a limpeza de seus recursos, \ne como descartar seu lixo de forma certa. " 
					+ "Isso fez com que a cidade volte a ser bem falada ao redor do reino. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Contratar funcionários para serem responsáveis pela limpeza do reino e dos\n"
				+"equipamentos dos cidadãos.")) {
			System.out.println("* Recursos foram gastos para a contratação de pessoas responsáveis somente pela limpeza. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param).equals("Deixar da forma que está.")) {
			System.out.println("* Nada foi feito, e a poluição faz com que as pessoas comecem a se mudar para fora da cidade. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (lista.get(param).equals("Multar os cidadãos que sujam a cidade e deixam seus equipamentos numa má\n"
				+ "condição de uso.")) {
			System.out.println("* Com o intuito de acabar com a virose, todos os portadores da doença são executados. *\r\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else {
		//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}
		
	}
	
	public String terceiraPergunta() {
		
		System.out.println("(4S - SAÚDE E HIGIENE) Um bairro da cidade está com uma virose, chamada Vocid-1751, e a cidade está entrando em\n" + 
				"pânico.\r\n");
		
		System.out.print("* O que você deseja fazer a respeito? *\r\n");
		
		List<String> lista = Arrays.asList("Tentar acalmar os cidadãos ensinando sobre a virose em questão.", 
				"Colocar a região em quarentena e medicar os doentes.", "Medicar os cidadãos que estão doentes e manter eles livres pela cidade.", 
				"Erradicar a virose do reino matando os doentes.");
		
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		
	    System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));
		
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
			System.out.println("Opção inválida!\r\n"
					+ "Digite uma opção valida: \n");		
		}
		
		return this.opcao;
	}

	public static void valorPergunta3(int param, List<String> lista) {
		
		if (lista.get(param).equals("Tentar acalmar os cidadãos ensinando sobre a virose em questão. ")) {
			System.out.println("* A população foi instruída sobre as peculiaridades da doença, e as formas de prevenção. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (lista.get(param).equals("Colocar a região em quarentena e medicar os doentes.")) {
			System.out.println("* A região foi isolada, os doentes são medicados, e com isso a doença é contida. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (lista.get(param).equals("Medicar os cidadãos que estão doentes e manter eles livres pela cidade.")) {
			System.out.println("* Todos aqueles que contraíram a doença foram medicados, porem continuam a circular normalmente e não estão curados. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (lista.get(param).equals("Erradicar a virose do reino matando os doentes.\n")) {
			System.out.println("* Com o intuito de acabar com a virose, todos os portadores da doença são executados. *\r\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else {
		//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}
		
	}
	
	public boolean cidadeCompletoRetorno() {
		
		return this.cidadeCompleto;
		
	}

	public int reputacaoRetorno(){
		
		return this.reputacao;
		
	}
	
}
