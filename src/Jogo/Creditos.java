package Jogo;

import java.util.Scanner;

public class Creditos {
	
	public static Scanner entrada = new Scanner(System.in);
	public Menu menu = new Menu();
	
	public void creditos() {

		System.out.println("\nDesenvolvimento por: ");
		System.out.println("Cauê Batista Vieira");
		System.out.println("Guilherme Marques Sabio");
		System.out.println("Gustavo Idalgo Cernev");
		System.out.println("Gustavo Lima");
		System.out.println("Rodrigo Assunção Veloso");
		System.out.println("\r\nAperte 'ENTER' para continuar.");
		entrada.nextLine();
		
		menu.menu();

	}
}
