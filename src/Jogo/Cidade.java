package Jogo;

import java.util.Scanner;

public class Cidade {
	
	public Mapa mapa = new Mapa();
	public boolean cidadeCompleto = false;
	public static Scanner entrada = new Scanner(System.in);
	public static int reputacao = 0;
	
	public void cidade() {
		
	if (cidadeCompleto == true) {
		System.out.println("Vocáº½ jÃ¡ resolveu todos os problemas daqui!\r\n");
		mapa.mapa();
	}
	
	String opcao = "";
	
	//Pergunta 1
	System.out.println("VocÃª estÃ¡ na cidade.\r\n");
	System.out.println("(8S - ECONOMIA E COMBATE AOS DESPERDÃ�CIOS) Chegando na cidade, percebe-se que o comÃ©rcio estÃ¡ sofrendo muito com o desperdÃ­cio de alimentos," 
			+ "fazendo com que a moeda do reino nÃ£o ser rentÃ¡vel, e com isso economia comeÃ§a a cair.\r\n");
	
	System.out.println("* O que vocÃª deseja fazer a respeito? *\r\n");
	System.out.println("1 - Manter da forma que estÃ¡, pois seria muito difÃ­cil reeducar os cidadÃ£os.");
	System.out.println("2 - Punir os cidadÃ£os de forma que os prÃ³ximos tenham medo de desperdiÃ§ar.");
	System.out.println("3 - Reeducar o reino para que eles faÃ§am valer todo o dinheiro e esforÃ§o \n"  
			+ "investido.");
	System.out.println("4 - Premiar os cidadÃ£os que nÃ£o desperdiÃ§arem alimento. \r\n");
	do {
		opcao = entrada.nextLine();

		if (opcao.equals("1")) {
			System.out.println("* Como seria uma tarefa difÃ­cil, o Rei decide nÃ£o gastar tempo, e nem recursos para resolver este problema. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (opcao.equals("2")) {
			System.out.println("* Alguns foram usados de exemplos para o restante pensar duas vezes antes de desperdiÃ§arem novamente. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (opcao.equals("3")) {
			System.out.println("* Todos foram conscientizados sobre como o desperdÃ­cio Ã© ruim para o reino, e aqueles que forem pegos desperdiÃ§ando qualquer recurso, serÃ£o multados *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (opcao.equals("4")) {
			System.out.println("* O populaÃ§Ã£o viu a iniciativa proposta pelo Rei, e decidem nÃ£o desperdiÃ§ar para serem recompensados por isso. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else {
		System.out.println("OpÃ§Ã£o invÃ¡lida! \nDigite uma opÃ§Ã£o valida: ");
	}
	}while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	
	//Pergunta 2
	System.out.println("(3S - LIMPEZA) Muitos cidadÃ£os estÃ£o acumulando lixo e mantendo seus equipamentos sujos, deixando\n" + 
			"assim a cidade poluÃ­da e mal vista nas redondezas do reino.\r\n");
	
	System.out.println("O que vocÃª deseja fazer a respeito?\r\n");
	System.out.println("1 - Ensinar os cidadÃ£os como fazer a coleta e o descarte de lixo da forma\n" + 
			"correta e a como manter os equipamentos limpos e funcionais. ");
	System.out.println("2 - Contratar funcionÃ¡rios para serem responsÃ¡veis pela limpeza do reino e dos\n" + 
			"equipamentos dos cidadÃ£os.");
	System.out.println("3 - Deixar da forma que estÃ¡.");
	System.out.println("4 - Multar os cidadÃ£os que sujam a cidade e deixam seus equipamentos numa mÃ¡\n" + 
			"condiÃ§Ã£o de uso.\r\n");
	do {
		opcao = entrada.nextLine();

		if (opcao.equals("1")) {
			System.out.println("* Os cidadÃ£os sÃ£o ensinados a como fazer a limpeza de seus recursos, e como descartar seu lixo de forma certa." 
					+ "Isso fez com que a cidade volte a ser bem falada ao redor do reino. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (opcao.equals("2")) {
			System.out.println("* Recursos foram gastos para a contrataÃ§Ã£o de pessoas responsÃ¡veis somente pela limpeza. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (opcao.equals("3")) {
			System.out.println("* Nada foi feito, e a poluiÃ§Ã£o faz com que as pessoas comecem a se mudar para fora da cidade. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if (opcao.equals("4")) {
			System.out.println("* Os cidadÃ£os nÃ£o gostam de ter que ficar sempre limpando suas coisas, mas tambÃ©m nÃ£o querem ser multados. * \r\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else {
		System.out.println("OpÃ§Ã£o invÃ¡lida! \nDigite uma opÃ§Ã£o valida: ");
	}
	
	}while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	
	//Pergunta 3
	System.out.println("(4S - SAÃšDE E HIGIENE) Um bairro da cidade estÃ¡ com uma virose, chamada Vocid-1751, e a cidade estÃ¡ entrando em\n" + 
			"pÃ¢nico.\r\n");
	
	System.out.println("* O que vocÃª deseja fazer a respeito? *\r\n");
	System.out.println("1 - Tentar acalmar os cidadÃ£os ensinando sobre a virose em questÃ£o. ");
	System.out.println("2 - Colocar a regiÃ£o em quarentena e medicar os doentes. ");
	System.out.println("3 - Medicar os cidadÃ£os que estÃ£o doentes e manter eles livres pela cidade.");
	System.out.println("4 - Erradicar a virose do reino matando os doentes.\r\n");
	
	do {
		opcao = entrada.nextLine();

		if (opcao.equals("1")) {
			System.out.println("* A populaÃ§Ã£o foi instruÃ­da sobre as peculiaridades da doenÃ§a, e as formas de prevenÃ§Ã£o. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		} else if (opcao.equals("2")) {
			System.out.println("* A regiÃ£o foi isolada, os doentes sÃ£o medicados, e com isso a doenÃ§a Ã© contida. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		} else if (opcao.equals("3")) {
			System.out.println("* Todos aqueles que contraÃ­ram a doenÃ§a foram medicados, porem continuam a circular normalmente e nÃ£o estÃ£o curados. *\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		} else if (opcao.equals("4")) {
			System.out.println("* Com o intuito de acabar com a virose, todos os portadores da doenÃ§a sÃ£o executados. *\r\n");
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else {
		System.out.println("OpÃ§Ã£o invÃ¡lida! \nDigite uma opÃ§Ã£o valida: ");
	}
	} while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	
	cidadeCompleto = true;
	
	mapa.mapa(); //Aqui sÃ³ para teste

}

	public boolean cidadeCompletoRetorno() {
		
		return this.cidadeCompleto;
		
	}

	public int reputacaoRetorno(){
		
		return this.reputacao;
		
	}

}
