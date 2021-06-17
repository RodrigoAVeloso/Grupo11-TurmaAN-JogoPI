package Jogo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Fim {
	
	public static Scanner entrada = new Scanner(System.in);
	public static int reputacao = 0;
	String opcao = "";
	
	public void fim() {
		Main main = new Main();
		Intro intro = new Intro();
		Mapa mapa = new Mapa();
		reputacao = mapa.reputacaoRetorno(); 
		
		System.out.println("\n Reputacão Total ->" + reputacao + "<- \n");
		
		System.out.println("Ao final do dia, as pessoas observam um estranho objeto pairando sobre o reino, era enorme e quase tão grande quanto o temido Dà-grão. \n"
				+ "Ao se aproximarem viram que realmente se tratava de um novo dragão. De primeiro momento ele parecia pacifico, \n"
				+ "já que exigiu que um representante real viesse até ele para haver um diálogo entre ambos.\r\n"); 
				
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();
		
		System.out.println("O Rei mandou um representante para conversar com essa criatura, ele estava tremendo de medo pois sabia que se tratava de Dá-grãozinho, \n"
				+ "o filho do tão feroz Dá-Grão, que foi morto na sua frente de seu próprio filho, e o mesmo foi poupado pelo Rei porque ele era apenas um filhote. \n"
				+ "Dá-grãozinho disse que queria a cabaça do Rei, em troca ele não destruiria Takeolândia. " + intro.nPersonagemNome() + " já branco de tanto medo, \n"
				+ "se esconde para que a besta não o encontre...\r\n"); 
						
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();	
				
				System.out.println("                    ___====-_  _-====___ \n" + 
						"              __--^^^      //     \\\\     ^^^--_\n" + 
						"             _-^         // (    ) \\\\         ^-_\n" + 
						"            -           //  |\\^^/|  \\\\           -\n" + 
						"          _/           //   (0::0)   \\\\            \\_\n" + 
						"         /            ((     \\\\//     ))             \\ \n" + 
						"       -               \\\\    (oo)    //               -\n" + 
						"      -                 \\\\  / \\/ \\  //                 -\n" + 
						"     -                   \\\\/      \\//                   -\n" + 
						"   / /|           /\\      (        )      /\\           |\\ \\\n" + 
						"   |/ | /\\_/\\_/\\_/  \\_/\\  (   /\\   )  /\\_/  \\_/\\_/\\_/\\ | \\|\n" + 
						"   `  |/  V  V  `    V  \\_(| |  | |)_/  V    '  V  V  \\|  '\n" + 
						"      `   `  `       `   / | |  | | \\   '       '  '   '\n" + 
						"                       <(  | |  | |  )>             \n" + 
						"                      <__\\_| |  | |_\\__>           \n" + 
						"                      ^^^^ ^^^  ^^^ ^^^^^\n" + 
						""); 		
				
				System.out.println("Aperte 'ENTER' para continuar...");
				entrada.nextLine();	

		
		do {

			perguntaFinal();
			
		}while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
		
		if (reputacao <= 50) {

			System.out.println("Você não está apto para governar um reino, sua cabeça foi cortada e queimada em praça pública.\n" + intro.nPetNome() +
					" foi solto para voltar a viver livremente. Obrigado por jogar. :)");
			//main.main(null);
			
		} else if (reputacao > 50 && reputacao <= 75) {
			
			System.out.println("Sua jornada foi concluída aventureiro, Takeolândia ainda passa por algumas dificuldades, mas sobrevive.\n" + 
					"Você e " + intro.nPetNome() + " foram convidados para se retirar da administração do Reino. Obrigado por jogar.");
			//main.main(null);
			
		} else if (reputacao > 75) {
			
			System.out.println("Takeolândia continua a crescer," + intro.nPersonagemNome() + "tem herdeiros com Sofia e vivem uma vida tranquila,\n" + intro.nPetNome() + 
					" envelhece e é aposentado se tornando a mascote oficial do Reino. Obrigado por jogar.\n");
			//main.main(null);
	
		}
		
		entrada.close();
		System.exit(0);

	}
	
	public String perguntaFinal() {
		
		System.out.println("(10S - RESPONSABILIDADE SOCIAL) Como forma de aviso, Dá-grãoziho utiliza toda sua força e poder e coloca uma enorme pedra no canal que abastece todo o reino. \n"
				+ "Isto é só o começo da sua vingança pela morte de seu pai.");

		
		List<String> lista = Arrays.asList("Buscar água em terras distantes. ", "Utilizar de uma força tarefa para fazer para fazer um canal secundário para o reino voltar a ser abastecido de água.", 
				 "Matar Dá-Grãozinho e evitar problemas futuros.", "Conversar com Dá-grãozinho e mostrar para ele tudo que seu pai fez contra o reino e todo o terror que ele causou durante seu tempo de vida e o convencer a tirar a barragem.");
		
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		Collections.shuffle(lista);
		
	    System.out.println("1 - " + lista.get(0));
		System.out.println("2 - " + lista.get(1));
		System.out.println("3 - " + lista.get(2));
		System.out.println("4 - " + lista.get(3));
		
		
		System.out.print("* O que você deseja fazer a respeito? *\r\n");
		 opcao = entrada.next();
		 int opcaoConvert = Integer.parseInt(opcao) -1;
		
		switch (opcao) {
		case "1":

			valorPergunta(opcaoConvert, lista);
			
			break;
		case "2":

			valorPergunta(opcaoConvert, lista);
			
			break;
		case "3":

			valorPergunta(opcaoConvert, lista);

			break;
		case "4":

			valorPergunta(opcaoConvert, lista);

			break;
		default:
			System.out.println("Opção inválida!\r\n"
					+ "Digite uma opção valida: \n");
		
		}
		return this.opcao;
}
	
	public void valorPergunta(int param, List<String> lista) {
		Intro intro = new Intro();
		
		if (lista.get(param).equals("Buscar água em terras distantes. ")) {
			System.out.println("\r\n* A longo prazo isso será um problema. * \r\n");
			
			entrada.nextLine();
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 0;
		} else if(lista.get(param).equals("Utilizar de uma força tarefa para fazer para fazer um canal secundário para o reino voltar a ser abastecido de água.")){
			System.out.println("\r\n* Pela primeira vez, Takeolândia une forças em prol de um problema em comum. * \r\n");
			
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 5;
		}else if(lista.get(param).equals("Matar Dá-Grãozinho e evitar problemas futuros.")) {
			System.out.println("\r\n* A fera é abatida, porém muitas vidas são perdidas. * \r\n");
			
			entrada.nextLine();
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 3;
		}else if(lista.get(param).equals("Conversar com Dá-grãozinho e mostrar para ele tudo que seu pai fez contra o reino e todo o terror que ele causou durante seu tempo de vida e o convencer a tirar a barragem.\n")) {
			System.out.println("\r\n" + intro.nPersonagemNome() +" toma coragem e da as caras para conversar com o herdeiro de Dá-grão, e nisso se inicia uma longa conversa,\n"
					+ "o Rei pede desculpas de joelhos para Dá-grãozinho, mostrando-lhe que a morte de seu pai foi necessária para o bem estar de muitas vidas inocentes,\n"
					+ "que estavam sendo ameaçadas constantemente com o terror e pânico que seu pai causava. Dá-grãozinho se sensibiliza, e com um aperto no peito decide não atacar o reino,\n"
					+ "pois viu que tudo o que " + intro.nPersonagemNome() + " fez era em defesa do reino e naqueles que ele amava. Após a negociação, Dá-grãozinho retirar a pedra do canal,\n"
					+ "e a água volta a fluir nas terras do reino, as pessoas ficam imensamente agradecidas a ele, e pedem desculpas pela morte de seu pai,\n"
					+ "Dá-grãozinho percebe que seu poder é importante para aquelas pessoas e decide proteger o Reino.\n" + 
					"\r\n");
			
			entrada.nextLine();
			System.out.println("Aperte 'ENTER' para continuar...");
			entrada.nextLine();
			reputacao = reputacao + 10;
		}else {
			//System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}

	}
	
	int retornoReputcao() {
		return this.reputacao;
	}

}
