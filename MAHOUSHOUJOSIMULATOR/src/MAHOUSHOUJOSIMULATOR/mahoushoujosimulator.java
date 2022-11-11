package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class mahoushoujosimulator {
	
	public static void main (String[] args) {
		jogador jogador = new jogador();
		falasjogador falas = new falasjogador();
		machine pc = new machine();
		viloes haku = new viloes();
		viloes kiara = new viloes();
		viloes kenku = new viloes();
		Scanner scan = new Scanner(System.in);
		
		//========================================================== CRIAÇÃO DE VILÕES ============================================================
		haku.nome = "Haku, o Senhor do Fogo"; kiara.nome = "Kiara, a Rainha dos Oceanos"; kenku.nome = "Kenku, o Mestre do Gelo";







		// pc.login(jogador);
		
		// System.out.print("[Kuriboh]:\nTá, tá, agora vamos aos negócios.\nVocê terá que derrotar as três mais mortais criaturas que já pisaram na terra\nO quê? Eu deveria ter falado disso antes?");
		
		// falas.fala1(jogador);
		// System.out.println("\n[Kuriboh]:\nEu só tô brincando!\nAlguns piores já vieram antes, esses são fichinha!");
		// falas.fala2(jogador);
		// System.out.println("\n[Kuriboh]:\nTá bom, fracote! Vamos lá. Existem três seres que você deve eliminar\nSe liga, primeiro tem a Kiara!");
		// scan.nextLine();
		// System.out.println("\n[Kuriboh]:\nKiara é conhecida por dominar a água! Suas habilidades são incríveis!\n(Ela foi inspirada em avatar).");
		// scan.nextLine();
		// System.out.println("\n[Kuriboh]:\nTemos também o meu fav, o Haku\n(quanta criatvidade, jesus!)\nSIM! Ele domina o fogo.");
		// scan.nextLine();
		// System.out.println("\n[Kuriboh]:\nSerá que vem um original? E pra sua e minha surpresa, sim(?)\nTá afim de lutar contra alguém que tem poderes de gelo???\nNão? Pois é, eu também não estaria, mas não é como queremos nhe\nKenku, é o Mestre do GELO*");
		// scan.nextLine();
		// //System.out.println("\n[Kuriboh]:\n");
		
		// System.out.println("\n====================================================S2=========================================================\n");
		

		pc.menu(haku, kiara, kenku, jogador);
		
		System.out.println("\n====================================================S2=========================================================\n");
		
		//VILOEEEEEEEEEEEEEEES
		
		
		scan.close();
	
	}
	
	/*public static void main (String[] args){
		viloes haku = new viloes();
		viloes kiara = new viloes();
		viloes kenku = new viloes();
		jogador player0 = new jogador();
		machine simula = new machine();
		
		//============================= CRIAÇÃO DE VILÕES ===============================
		player0.nome = "Player";
		haku.nome = "Haku";
		kiara.nome = "Kiara";
		kenku.nome = "Kenku";
		//============================= CRIAÇÃO DE VILÕES ===============================
		//simula.login(player0);

		simula.menu (haku, kiara, kenku, player0);
	}*/
}

