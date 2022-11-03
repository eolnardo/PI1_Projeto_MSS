package MAHOUSHOUJOSIMULATOR;

public class grimorio {
    double magia0;
    String magia1;
    int spell;
    void spells (jogador jogador, viloes vilao){
        System.out.println("[GRIMORIO DO " + jogador.nome + "]\nMagias Atuais: 1. Rajada de Fogo");
        switch (spell) {
            case 1:
                magia0 = 10;
                vilao.vida = (vilao.vida - ((jogador.ataque*2) / vilao.protecao));
                break;

        }
    }


    String ataque (jogador player, viloes vilao) {
        return ("O " + player.nome + " usa uma magia ofensiva de fogo e atacar diretamente o " + vilao.nome + "\n causando " + magia0 + " de dano mágico.\n\n[Kuriboh]:\nA vida atual do " + vilao.nome + " é " + vilao.vida);

    }
}
