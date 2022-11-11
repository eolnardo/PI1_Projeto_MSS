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
	
	void defesa (viloes vilao){
		vida = vida - (vilao.ataque / (protecao+4));
	}
	
	void acoes () {
		System.out.println("\n[Kuriboh]:\n1. atacar!! (ataque) | 2. proteger! (defesa) | 3. CURINHA (vida+5) (cura)  | 4. MAS EH UM FRACOTE MESMO! (fugir)");
	}

}
