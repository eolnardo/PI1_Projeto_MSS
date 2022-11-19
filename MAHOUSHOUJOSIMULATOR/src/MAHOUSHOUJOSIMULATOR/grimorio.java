package MAHOUSHOUJOSIMULATOR;

public class grimorio {
    double magia0;
    String magia1;
    int spell, kuriboh = 3;
    void spells (jogador jogador, viloes vilao){
        System.out.println("[GRIMORIO DO " + jogador.nome + "]\nMagias Atuais: 1. Rajada de Fogo");
        switch (spell) {
            case 1:
                magia0 = 10;
                vilao.vida = (vilao.vida - ((jogador.ataque*2) / vilao.protecao));
                break;

        }
    }


    void kuriboh (jogador player) {
        kuriboh--;
        if (kuriboh>=0){
            System.out.println( player.nome + "  pede ajuda ao Kuriboh! \nKuriboh interfere curando o jogador em +5 de vida.\n\n[Kuriboh]:\nA vida atual do " + player.nome + " é " + (player.arredonda = (int) (player.vida = player.vida + 5)) + "\nRestam " + kuriboh + " curas.");   
        } else {
            System.out.println("[Kuriboh]:\nNão consigo mais te curar!");
        }
    }

    String ataque (jogador player, viloes vilao) {
        return (player.nome + " usa uma magia ofensiva de fogo e ataca diretamente o " + vilao.nome + "\n causando " + magia0 + " de dano mágico.\n\n[Kuriboh]:\nA vida atual do " + vilao.nome + " é " + vilao.vida);

    }
}
