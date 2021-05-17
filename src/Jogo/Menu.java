package Jogo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	public static Scanner entrada = new Scanner(System.in);
	public Instrucoes instrucao;
	public Intro intro;
	public Creditos credito;
	
	public void menu() {
		
		String opcao = "";
		String nome = JOptionPane.showInputDialog("INFORME SEU NOME: ");
		JOptionPane.showMessageDialog(null, "Bem vindo: " + nome);
		do {
			this.frase();
			this.reiFigura();
			System.out.println("                  =========================");
			System.out.println("                  |     1 - Instrucoes    |");
			System.out.println("                  |     2 - Jogar         |");
			System.out.println("                  |     3 - Creditos      |");
			System.out.println("                  |     4 - Sair          |");
			System.out.println("                  =========================\n");

			System.out.print("Opção: ");

			opcao = entrada.next(); //JOptionPane.showInputDialog("Digite uma opção!");

			if (opcao.equals("1")) {
				instrucao = new Instrucoes();
				instrucao.instrucoes();
			} else if (opcao.equals("2")) {
				intro = new Intro();
				intro.intro();
			} else if (opcao.equals("3")) {
				credito = new Creditos();
				credito.creditos();
			} else if (opcao.equals("4")) {
				System.exit(0);
			} else {
				System.out.println("Opção inválida! \nDigite uma opção valida: ");
			}
		} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
	}

	private void frase() {
		System.out.println(
				"  ______    ______   ___      ___     ______         ________  _______   _______       ____  ____  ___      ___       _______    _______   __        \r\n"
						+ " /\" _  \"\\  /    \" \\ |\"  \\    /\"  |   /    \" \\       /\"       )/\"     \"| /\"      \\     (\"  _||_ \" ||\"  \\    /\"  |     /\"      \\  /\"     \"| |\" \\       \r\n"
						+ "(: ( \\___)// ____  \\ \\   \\  //   |  // ____  \\     (:   \\___/(: ______)|:        |    |   (  ) : | \\   \\  //   |    |:        |(: ______) ||  |      \r\n"
						+ " \\/ \\    /  /    ) :)/\\\\  \\/.    | /  /    ) :)     \\___  \\   \\/    |  |_____/   )    (:  |  | . ) /\\\\  \\/.    |    |_____/   ) \\/    |   |:  |      \r\n"
						+ " //  \\ _(: (____/ //|: \\.        |(: (____/ //       __/  \\\\  // ___)_  //      /      \\\\ \\__/ // |: \\.        |     //      /  // ___)_  |.  |      \r\n"
						+ "(:   _) \\\\        / |.  \\    /:  | \\        /       /\" \\   :)(:      \"||:  __   \\      /\\\\ __ //\\ |.  \\    /:  |    |:  __   \\ (:      \"| /\\  |\\     \r\n"
						+ " \\_______)\\\"_____/  |___|\\__/|___|  \\\"_____/       (_______/  \\_______)|__|  \\___)    (__________)|___|\\__/|___|    |__|  \\___) \\_______)(__\\_|_)    \r\n"
						+ "                                                                                                                                                     \r\n"
						+ "  _______  ___      ___       _______   ___  ___         __    __     ______     _______        __        ________                                   \r\n"
						+ " /\"     \"||\"  \\    /\"  |     /\"     \"\\ (: \"||_  |       /\" |  | \"\\   /    \" \\   /\"      \\      /\"\"\\      /\"       )                                  \r\n"
						+ "(: ______) \\   \\  //   |    (__/\\    :)|  (__) :|      (:  (__)  :) // ____  \\ |:        |    /    \\    (:   \\___/                                   \r\n"
						+ " \\/    |   /\\\\  \\/.    |        / ___/  \\____  ||       \\/      \\/ /  /    ) :)|_____/   )   /' /\\  \\    \\___  \\                                     \r\n"
						+ " // ___)_ |: \\.        |       // \\___      _\\ '|       //  __  \\\\(: (____/ //  //      /   //  __'  \\    __/  \\\\                                    \r\n"
						+ "(:      \"||.  \\    /:  |      (:  /  \"\\    /\" \\_|\\     (:  (  )  :)\\        /  |:  __   \\  /   /  \\\\  \\  /\" \\   :)                                   \r\n"
						+ " \\_______)|___|\\__/|___|       \\_______)  (_______)     \\__|  |__/  \\\"_____/   |__|  \\___)(___/    \\___)(_______/                                    \r\n"
						+ "                                                                                                                       ");

	}

	private void reiFigura() {
		System.out.println("                            _.-._\r\n" + "                          .' | | `.\r\n"
				+ "                         /   | |   \\\r\n" + "                        |    | |    |\r\n"
				+ "                        |____|_|____|\r\n" + "                        |____(_)____|\r\n"
				+ "                        /|(o)| |(o)|\\\r\n" + "                       //|   | |   |\\\\\r\n"
				+ "                       '/|  (|_|)  |\\`\r\n" + "                        //.///|\\\\\\.\\\\\r\n"
				+ "                        /////---\\\\\\\\\\ \r\n" + "                        ////|||||\\\\\\\\\r\n"
				+ "                        '//|||||||\\\\`\r\n" + "                          '|||||||`\r\n" + "\r\n");

	}
}
