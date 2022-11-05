package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class jogador {
	viloes vilao = new viloes();
	Scanner scan = new Scanner(System.in);
	String nome, desejo;
	int uniforme = 0, acoes;
	double ataque = 10, defesa = 40, vidabase = 20, vida, protecao = (1 + (defesa/100)), mitigacao = ataque/protecao;
	int viloesDerrotados = 0;
	int arredonda = (int) (vida + 0.5f);
	
	


	void ataque (viloes vilao){
		vilao.vida = vilao.vida - (ataque / vilao.protecao);
	}
	
	
	
	void acoes () {
		System.out.println("\n[Kuriboh]:\n1. BATER!! (ataque) | 2. AIAIAI (defesa) | 3. MAS EH UM FRACOTE MESMO! (fugir) | 4. UIUI CURINHA (cura)");
	}

}
