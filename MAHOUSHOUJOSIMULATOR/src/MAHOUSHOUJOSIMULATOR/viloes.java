package MAHOUSHOUJOSIMULATOR;

public class viloes {
	String nome;
	double ataque = 10, defesa = 60, vida , vidabase = 30, protecao = (1 + (defesa/100)), mitigacao = ataque/protecao;
	int arredonda = (int) (vida + 0.5f);
	int vivo = 0;
	void ataque (jogador jogador){
		jogador.vida = jogador.vida - (ataque / jogador.protecao);
	}
}
