package Jogo;

import java.util.Scanner;

public class Instrucoes {
	
	public static Scanner entrada = new Scanner(System.in);
	public Menu menu = new Menu();
	
	public void instrucoes() {

		System.out.print(
				"Bem vindo as instruções de Como ser rei em 24h, o jogo funciona com pergutas de multiplas escolhas, ");
		System.out.print(
				"\ntendo uma respota certa que vai te dar pontos com o reino e outras que irão tirar pontos com o reino.");
		System.out.println("\r\nAperte 'ENTER' para continuar.");
		entrada.nextLine();
		
		menu.menu();

	}

}
