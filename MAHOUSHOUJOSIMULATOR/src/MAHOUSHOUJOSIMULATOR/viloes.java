package MAHOUSHOUJOSIMULATOR;

public class viloes {
	String nome;
	double ataque = 20, defesa = 20, vida = 30, protecao = (1 + (defesa/100)), mitigacao = ataque/protecao;
	int arredonda = (int) (vida + 0.5f);

	void ataque (jogador jogador){
		jogador.vida = jogador.vida - (ataque / jogador.protecao);
		
	}
}
