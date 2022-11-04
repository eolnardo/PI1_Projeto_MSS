package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class jogador {
	viloes vilao = new viloes();
	Scanner scan = new Scanner(System.in);
	String nome, desejo;
	int uniforme = 0, acoes;
	double ataque = 10, defesa = 10, vidabase = 20, vida, protecao = (1 + (defesa/100)), mitigacao = ataque/protecao;
	int viloesDerrotados = 0;
	int arredonda = (int) (vida + 0.5f);
	
	
	void ataque (viloes vilao){
		vilao.vida = vilao.vida - (ataque / vilao.protecao);
					if (vilao.vida <=0){
						vilao.vida = 0;
						System.out.println("\n[Kuriboh]:\n"+ nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.vida+ "]");
						System.out.println("\n[Kuriboh]:\nVida de " + nome + ": [" + vida + "]");
					} else if (vida <= 0){
						vida = 0;
						System.out.println("\n[Kuriboh]:\n"+ nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.arredonda + "]");
						System.out.println("\n[Kuriboh]:\nVida de " + nome + ": [" + vida + "]");
					} else {
						System.out.println("\n[Kuriboh]:\n"+ nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.arredonda + "]");
						System.out.println("\n[Kuriboh]:\nVida de " + nome + ": [" + vida + "]");
					}
	}
	
	
	void acoes () {
		switch(acoes) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			
		}
	}

}
