package MAHOUSHOUJOSIMULATOR;

import java.util.Random;
import java.util.Scanner;

public class jogador {
	viloes vilao = new viloes();
	Scanner scan = new Scanner(System.in);
	String nome, desejo;
	int uniforme = 0, acoes;
	double ataque = 10, defesa = 40, vidabase = 20, vida, protecao = (1 + (defesa/100)), mitigacao = ataque/protecao;
	int modoataque;
	int arredonda = (int) (vida + 0.5f);
	Random rand = new Random();

	void ataque (viloes vilao){
		modoataque = rand.nextInt(2);
		if(modoataque == 0){
			System.out.println("\n[Kuriboh]:\n"+ nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
		} else if (ataque == 1) {
			System.out.println("\n[Kuriboh]:\n"+ nome + " salta em direção ao vilão e realiza uma série de ataques com seu cetro mágico " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
		}
		vilao.vida = vilao.vida - (ataque / vilao.protecao);
	}
	
	void defesa (viloes vilao){
		vida = vida - (vilao.ataque / (protecao+4));
	}
	
	void acoes () {
		System.out.println("\n[Kuriboh]:\n1. atacar!! (ataque) | 2. proteger! (defesa) | 3. CURINHA (vida+5) (cura)  | 4. MAS EH UM FRACOTE MESMO! (fugir)");
	}

}
