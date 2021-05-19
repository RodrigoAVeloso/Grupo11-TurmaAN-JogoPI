package Jogo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Intro {

	public static Scanner entrada = new Scanner(System.in);
	public Mapa mapa;
	public static String nPersonagem = "";
	public static String nPet;
	//String nHeroi;

	public void intro() {
		
		//String nPersonagem;
		
		String opcao = "";

		System.out.println("Seja bem vindo a Como ser um rei em 24h.");
		System.out.println("\nPara começar nossa história devemos primeiro falar um pouco do nosso herói.");
		System.out.println("O jovem...");
		System.out.print("Escolha um nome para nosso héroi: ");
		nPersonagem = entrada.next();
		//nHeroi = nPersonagem;//this.nPersonagemNome();//JOptionPane.showInputDialog("Escolha um nome para nosso héroi: ");
		
		System.out.println(nPersonagem + ", é um jovem plebeu que vivia em uma humilde residência em um reino distante,"
				+ "\nseus pais eram servos da nobreza. Inconformado com a situação de pobreza que sua \nfamília passava,"
				+ "o jovem então decidiu juntar suas coisas e sair em uma aventura.\r\n"
				+ "Seguiu para o Norte para recomeçar sua vida, no caminho nosso aventureiro se depara com uma tempestade "
				+ "\nque vinha chegando, para se proteger " + nPersonagem + " se abriga dentro de uma caverna e"
				+ " \nlá fica até a tempestade se dissipar, após isso ele escuta um som próximo e decide investigar,"
				+ " \nao chegar no local de onde vinha o tal barulho o jovem se depara com um cavalo preso em meio a uns"
				+ " \narbustos de espinhos. O animal aparentava ter fugido de algum lugar pois havia uma rédia em seu pescoço,"
				+ " \n" + nPersonagem + " se aproxima com cautela porque o cavalo estava ferido e um pouco assustado. "
				+ "\n" + nPersonagem
				+ " cuida dos ferimentos do pobre animal e ganha a sua confiança, logo depois ele diz:\r\n"
				+ "- Acho que você precisa de um nome... Ah! Já sei, seu nome será...\r\n");
		System.out.println("\r\n" + "                                 |\\    /|\r\n"
				+ "                              ___| \\,,/_/\r\n" + "                           ---__/ \\/    \\\r\n"
				+ "                          __--/     (O)  \\\r\n" + "                          _ -/    (_      \\\r\n"
				+ "                         // /       \\_ /  -\\\r\n"
				+ "   __-------_____--___--/           / \\_ o o)\r\n"
				+ "  /                                 /   \\__/\r\n" + " /                                 /\r\n"
				+ "||          )                   \\_/\\\r\n" + "||         /              _      /  |\r\n"
				+ "| |      /--______      ___\\    /\\  :\r\n" + "| /   __-  - _/   ------    |  |   \\ \\\r\n"
				+ " |   -  -   /                | |     \\ )\r\n" + " |  |   -  |                 | )     | |\r\n"
				+ "  | |    | |                 | |    | |\r\n" + "  | |    < |                 | |   |_/\r\n"
				+ "  < |    /__\\                <  \\\r\n" + "  /__\\                       /___\\" + "\r\n");
		System.out.print("Qual será o nome do cavalo do nosso herói? \nNome: ");
		nPet = entrada.next(); //JOptionPane.showInputDialog("Qual será o nome do cavalo do nosso herói? ");
		System.out.println("Uma bela amizade se inicia e " + nPersonagem + " junto com " + nPet
				+ " partem juntos em busca " + "de novos horizontes.");
		System.out.println(
				"Após muitas luas viajando nossa dupla se depara com uma carruagem muito bela e bem feita, que estava sendo\r\n"
						+ "abordada por uma dupla de ladrões, nosso herói partiu rapidamente para o socorro da carruagem. "
						+ nPersonagem + " tinha um\r\n"
						+ "breve conhecimento em combate porque já havia servido em um breve período no serviço militar do Reino onde vivera, \r\n"
						+ "ele os derrotou com uma certa facilidade, mas os bandidos conseguiram fugir. Quando tudo estava seguro uma pessoa desce da \r\n"
						+ "carruagem, uma bela moça de olhos esverdeados e cabelos dourados, sua vestimenta \r\n"
						+ "era feita dos melhores tecidos e sua voz era suave e doce, seu nome era Sofia Skizarnotha. E como forma de \r\n"
						+ "agradecimento por ter a salvado ela o convida para o Reino onde ela é a Princesa, muito surpreso e \r\n"
						+ "sem palavras ele aceita o convite e vai junto a ela para o Reino de Takeolândia, e lá ela o apresenta o Rei, \r\n"
						+ "seu nome é Hodrick Skirzanotha. O Rei era um homem velho que estava doente, uma doença sem cura e com isso \r\n"
						+ "ele mal andava, mas estava imensamente agradecido por nosso herói ter salvado sua tão amada filha, Hodrick contou a \r\n"
						+ nPersonagem
						+ "a situação atual do Reino, e que havia uma ameaça constante ao Reino porque um dragão que estava adormecido \r\n"
						+ "despertou a alguns meses numa floresta não muito distante, sua fome era enorme pois estava adormecido há \r\n"
						+ "cerca de duzentos anos, de acordo com a história que Hodrick contou, este dragão causou muito caos e destruição \r\n"
						+ "aos antepassados do Rei, mas foi derrotado e desde então a paz reina em Takeolândia. Coma o despertar do dragão o \r\n"
						+ "terror se instalou e não havia como o Rei fazer algo porque já era velho e seu poder militar era precário, então \r\n"
						+ "o rei faz a seguinte proposta para " + nPersonagem + ":\r\n");

		System.out.println("Aperte 'ENTER' para continuar...");
		entrada.nextLine();

		System.out.println(
				"- Ora meu jovem, sei que estou velho e não tenho mais condições de defender meu lar...logo irei morrer e só tenho \r\n"
						+ "Sofia como herdeira, ela me contou o seu ato de bravura ao salva-la dos bandidos, então eu lhe peço um favor. \r\n"
						+ "Eu Hodrick Skizarnotha peço que você jovem guerreiro derrote o temido dragão e como recompensa você se casará \r\n"
						+ "com minha amada filha e será o novo Rei de Takeolândia. E este será meu último desejo como Rei, \r\n"
						+ "por favor salve a todos.\r\n");

		System.out.println("Aperte 'ENTER' para continuar...");
		entrada.nextLine();

		System.out.println("Cerca de um mês se passa, e em meio a esse tempo " + nPersonagem
				+ " estava treinando para ir ao \r\n"
				+ "encontro do seu desafio. As primeiras folhas começam a cair, sinal de que o outono vinha \r\n"
				+ "chegando, e nesse instante se inicia a procura do temido dragão, a floresta onde ele \r\n"
				+ "habita não é muito distante de Takeolândia mas em compensação era vasta, e com alguns \r\n"
				+ "dias de procura a morada do dragão é encontrada, uma caverna grande e escura no pé de \r\n"
				+ "uma montanha localizada dentro da floresta. Após isso não se teve mais notícias do \r\n"
				+ "bravo guerreiro a duas semanas e nesse meio tempo as criadas que cuidavam da limpeza \r\n"
				+ "do castelo encontram Hodrick já sem vida deitado em sua cama, com a morte do pai e sem \r\n"
				+ "notícias de seu salvador, Sofia começa a ficar preocupada achando que tudo deu errado \r\n" + "e "
				+ nPersonagem + "também havia morrido. Quando tudo parecia estar perdido as pessoas se reúnem \r\n"
				+ "no portão e olham ao horizonte uma pessoa montada em um cavalo vindo em direção ao reino, este ser \r\n"
				+ "tinha algo em mãos de tamanho considerável e quando se aproxima virão que era " + nPersonagem
				+ " com \r\n"
				+ "suas vestes todas rasgadas e cobertas de sangue que nem se sabe se era só do corajoso jovem, ele \r\n"
				+ "estava montado em seu fiel amigo nPet e em sua mão direita a sua espada banhada em sangue e na outra \r\n"
				+ "mão a cabeça do temido dragão. Nosso herói para em frente a todos, desce de seu cavalo, \r\n"
				+ "levanta a cabeça do dragão para o céu e como comemoração grita:\r\n");

		System.out.println("Aperte 'ENTER' para continuar...");
		entrada.nextLine();

		System.out.println("- EU CONSEGUI!!! DERROTEI O DRAGÃO COM MINHAS PROPRIAS MÃOS, \r\n"
				+ "E LHES TRAGO A CABEÇA DO MONSTRO COMO PROVA QUE ESTAMOS A SALVO E O REINO DE \r\n"
				+ "TAKEOLÂNDIA PODE CRESCER E PROSPERAR.\r\n");

		System.out.println("Aperte 'ENTER' para continuar...");
		entrada.nextLine();

		System.out.println("O povo muito feliz e agradecido começa a cantar e dançar envolta \r\n" + "de " + nPersonagem
				+ " para comemorar todos juntos, Sofia se aproxima e uma \r\n"
				+ "troca de olhares intensa é trocada entre nosso herói com a princesa, eles se \r\n"
				+ "abraçam e com um beijo apaixonado Sofia agradece mais um ato de bravura feito pelo o \r\n"
				+ "jovem. Como combinado caso a missão fosse bem sucedida " + nPersonagem
				+ " se casaria com Sofia e se \r\n"
				+ "tornaria o novo Rei, dois meses após a morte do dragão os preparativos para o casório haviam se concluído,\r\n"
				+ " e um dia depois a coroação de nPersonagem e feita. Todos muitos felizes gritam:\r\n"
				+ "- VIDA LONGA AO REI!!! VIDA LONGA AO REI " + nPersonagem + "!.\r\n"
				+ "O Reino cresce e se fortalece, a paz se estabelece por um tempo, e " + nPersonagem + "tinha em \r\n"
				+ "sua cabeça que o mais difícil havia passado, e mal sabia ele que o maior desafio apenas começado...\r\n");

		System.out.println("Aperte 'ENTER' para continuar...");
		entrada.nextLine();
		
		mapa = new Mapa();
		mapa.mapa();
	}
	
	//String nHeroi = nPersonagem;
	
	public String nPersonagemNome() {
		
		return this.nPersonagem;
	}

	public String nPetNome() {
		return this.nPet;
	}
}
