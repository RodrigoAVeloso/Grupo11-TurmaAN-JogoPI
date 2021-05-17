package Jogo;

import java.util.Scanner;

public class Guilda {
	
	public boolean guildaCompleto = false;
	public static Scanner entrada = new Scanner(System.in);
	public Mapa mapa = new Mapa();
	public static int reputacao = 0;
	
	public void guilda() {
		
		if (guildaCompleto == true) {
			System.out.println("Vocáº½ jÃ¡ resolveu todos os problemas daqui!\r\n");
			mapa.mapa();
		}
		
		String opcao = "";
		
		//Pergunta 1
		System.out.println("VocÃª estÃ¡ na guilda.\r\n");	
		System.out.println("(5S - AUTODISCIPLINA) HÃ¡ muitos anos atrÃ¡s, um dos alquimistas tentou alcanÃ§ar a vida eterna com a \n" + 
				"pedra filosofal, porÃ©m o plano deu errado e parte da Guilda foi destruÃ­da. Os \n" + 
				"alquimistas entÃ£o entraram num consenso e proÃ­biram essa prÃ¡tica com a pedra filosofal.\n" + 
				"PorÃ©m, recentemente um dos alquimistas foi pego tentando concluir tal prÃ¡tica, \n" + 
				"pondo em risco toda a Guilda e todo o Reino.\r\n");
		
		System.out.println("* O que vocÃª deseja fazer a respeito? *\r\n");
		System.out.println("1 - Conscientizar o alquimista sobre sua responsabilidade com o reino e com \n" + 
				"todos os cidadÃ£os, explicando o perigo de suas prÃ¡ticas.");
		System.out.println("2 - Executar o alquimista em praÃ§a pÃºblica.");
		System.out.println("3 - Tomar posse da pedra filosofal para tentar ser imortal.");
		System.out.println("4 - Expulsar o alquimista da Guilda.\r\n");
		
		do {
			opcao = entrada.nextLine();

			if (opcao.equals("1")) {
				System.out.println("* O alquimista compreende o perigo de experimentos e se compromete a colocar a seguranÃ§a do Reino em primeiro lugar. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 10;
			} else if (opcao.equals("2")) {
				System.out.println("* O alquimista Ã© executado por conta de seus prÃ¡ticas perigosas. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 3;
			} else if (opcao.equals("3")) {
				System.out.println("* A pedra filosofia era instÃ¡vel e altamente perigosa. Ao ser ativada, a reaÃ§Ã£o em cadeia destrÃ³i metade do Reino. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao - 100;
			} else if (opcao.equals("4")) {
				System.out.println("* O alquimista Ã© exilado do Reino, livre para continuar sua pesquisa em outro lugar. *\r\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 0;
			} else {
			System.out.println("OpÃ§Ã£o invÃ¡lida! \nDigite uma opÃ§Ã£o valida: ");
		}
		} while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
		
		//Pergunta 2
		System.out.println("(2S - ORDENAÃ‡ÃƒO) A Guilda dos Alquimistas estÃ¡ crescendo e o espaÃ§o onde eles se reÃºnem nÃ£o estÃ¡\n" + 
				"mais conseguindo alocar a todos. AlÃ©m disso, seus equipamentos e materiais nÃ£o estÃ£o sendo suficientes\n" + 
				"para as pesquisas dos novos membros.\r\n");
		
		System.out.println("* O que vocÃª deseja fazer a respeito? *\r\n");
		System.out.println("1 - Alocar os Alquimistas para um local maior e comprar tudo que eles pedem. ");
		System.out.println("2 - Alocar os Alquimistas para um local maior e contratar um tesoureiro pra administrar o controle\n" + 
				"de seus materiais. ");
		System.out.println("3 - Limitar a quantidade de Alquimistas e manter as coisas da forma que estÃ£o. ");
		System.out.println("4 - Fechar temporariamente a Guilda dos Alquimistas.\r\n");
		
		do {
			opcao = entrada.nextLine();

			if (opcao.equals("1")) {
				System.out.println("* A Guilda aproveita de suas novas instalaÃ§Ãµes e seus novos recursos sem fim, talvez atÃ© demais. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 3;
			} else if (opcao.equals("2")) {
				System.out.println("* A Guilda aproveita de suas novas instalaÃ§Ãµes, e usas seus recursos com responsabilidade. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 10;
			} else if (opcao.equals("3")) {
				System.out.println("* A Guilda continua suas operaÃ§Ãµes de forma limitada. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 5;
			} else if (opcao.equals("4")) {
				System.out.println("* A Guilda fecha suas operaÃ§Ãµes temporariamente, acabando com todas as pesquisas cientÃ­ficas do Reino. *\r\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 0;
			} else {
			System.out.println("OpÃ§Ã£o invÃ¡lida! \nDigite uma opÃ§Ã£o valida: ");
		}
		} while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
		
		//Pergunta 3
		System.out.println("(9S - PRINCÃ�PIOS MORAIS E Ã‰TICOS) Uma parte dos alquimistas estÃ£o se rebelando e estÃ£o utilizando de prÃ¡ticas\n" + 
				"proibidas e antiÃ©ticas para benefÃ­cio prÃ³prio e desrespeitando os Mandamentos dos Alquimistas.\r\n");
		
		System.out.println("* O que vocÃª deseja fazer a respeito? *\r\n");
		System.out.println("1 - Queimar os rebeldes numa fogueira em praÃ§a pÃºblica. ");
		System.out.println("2 - Mostrar aos Alquimistas o seu importante papel no desenvolvimento cientifico e econÃ´mico do Reino. ");
		System.out.println("3 - Exilar os rebeldes do reino. ");
		System.out.println("4 - Esconder os rebeldes para conduzirem sua pesquisa secretamente. \r\n");
		
		do {
			opcao = entrada.nextLine();

			if (opcao.equals("1")) {
				System.out.println("* Os Alquimistas rebeldes sÃ£o queimados, servindo de exemplo para o resto da Guilda. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 3;
			} else if (opcao.equals("2")) {
				System.out.println("* Os Alquimistas renegados compreendem sua importÃ¢ncia para o reino e necessidade da conduÃ§Ã£o Ã©tica de suas pesquisas. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 10;
			} else if (opcao.equals("3")) {
				System.out.println("* Os Alquismistas rebeldes sÃ£o exilados, conduzindo suas pesquisas antiÃ©ticas em outras terras. *\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao + 5;
			} else if (opcao.equals("4")) {
				System.out.println("* Os Alquismistas continuam suas pesquisas antiÃ©ticas secretamente, para o 'benefÃ­cio' do Reino. *\r\n");
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
				reputacao = reputacao - 10;
			} else {
			System.out.println("OpÃ§Ã£o invÃ¡lida! \nDigite uma opÃ§Ã£o valida: ");
		}
		} while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
		
		guildaCompleto = true;
		mapa.mapa(); //Aqui sÃ³ para teste

	}
	
	public boolean guildaCompletoRetorno() {
		return this.guildaCompleto;
	}
}
