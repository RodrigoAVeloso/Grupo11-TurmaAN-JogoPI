package Jogo;

import java.util.Scanner;

public class Mapa {
	
	public static Scanner entrada = new Scanner(System.in);
	public static int reputacao;
	
	public void mapa() {
		
		Fim fim = new Fim();
		Campo campo = new Campo();
		Guilda guilda = new Guilda();
		Cidade cidade = new Cidade();
		
		 boolean campoCompleto = false;
		 boolean cidadeCompleto = false;
		 boolean guildaCompleto = false;
		
			int repCampo = campo.reputacaoRetorno();
			System.out.println("\n campo ->"+repCampo + "<- \n");
			
			int repCidade = cidade.reputacaoRetorno();
			System.out.println("\n cidade->"+repCidade+ "<- \n");

			
			int repGuilda = guilda.reputacaoRetorno();
			System.out.println("\n guilda->"+repGuilda + "<- \n");
			
			
			reputacao = repCampo + repGuilda + repCidade;
			System.out.println("\n reputação total: ->"+ reputacao +"<- \n");

		 
		// Escrevendo aqui o sisteminha para ir para diferentes áreas, para já deixar
		// aqui
		
		if (campo.campoCompletoRetorno() == true && cidade.cidadeCompletoRetorno() == true && guilda.guildaCompletoRetorno() == true) {
			System.out.println("Você vai pro fim do jogo, responder a pergunta final e tudo mais.\r\n");
			fim.fim();
		}
				
		String opcao = "";
		do {
		System.out.println("Escolha a área do Reino que deseja ir:\r\n");
		System.out.println("1 - Campo");
		System.out.println("2 - Cidade");
		System.out.println("3 - Guilda\r\n");

		System.out.print("Opção: ");

		opcao = entrada.nextLine();

		if (opcao.equals("1")) {
			campo.campo();
		} else if (opcao.equals("2")) {
			cidade.cidade();
		} else if (opcao.equals("3")) {
			guilda.guilda();
		} else {
			System.out.println("Opção inválida! \nDigite uma opção valida: ");
		}

	} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") );
	}
	
	public  int reputacaoRetorno() {
		return this.reputacao;
	}
}
