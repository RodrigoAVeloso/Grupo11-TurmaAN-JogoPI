package Jogo;

public class Main {
	public static int reputacao;	
	
	public static void main(String[] args) {
		
		reputacao = 0;
		
		Menu menu = new Menu();

		menu.menu();

	}
	
	public int reputacaoRetorno() {
		return this.reputacao;
	}

}
