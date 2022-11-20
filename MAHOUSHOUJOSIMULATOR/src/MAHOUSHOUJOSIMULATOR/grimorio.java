package MAHOUSHOUJOSIMULATOR;

public class grimorio {
    double magia0;
    String magia1;
    int spell, kuriboh = 3, mana = 100;
    void spells (jogador jogador, viloes vilao){
        System.out.println("[GRIMORIO DO " + jogador.nome + "]\nMagias Atuais: 1. Rajada de Fogo");
        switch (spell) {
            case 1:
                magia0 = 10;
                vilao.vida = (vilao.vida - ((jogador.ataque*2) / vilao.protecao));
                break;

        }
    }
    boolean boss = false;

    void kuriboh (jogador player) {
       

        if (boss == true){
            if (kuriboh>0){
                kuriboh--;
                System.out.println( player.nome + "  pede ajuda ao Kuriboh! \nKuriboh interfere curando o jogador em +5 de vida.\n\n[Kuriboh]:\nA vida atual do " + player.nome + " é " + (player.arredonda = (int) (player.vida = player.vida + 10)) + "\nRestam " + kuriboh + " curas.");   
            } else {
                System.out.println("[Kuriboh]:\nNão consigo mais te curar!");
            }
        } else {
             if (kuriboh>0){
            kuriboh--;
            System.out.println( player.nome + "  pede ajuda ao Kuriboh! \nKuriboh interfere curando o jogador em +5 de vida.\n\n[Kuriboh]:\nA vida atual do " + player.nome + " é " + (player.arredonda = (int) (player.vida = player.vida + 5)) + "\nRestam " + kuriboh + " curas.");   
            } else {
            System.out.println("[Kuriboh]:\nNão consigo mais te curar!");
        }
        }
    }
    
    void magiadeluz (jogador jogador, viloes boss){
        if (mana>0){
            mana = mana - 50;
            System.out.println("[Kuriboh]:\n" +jogador.nome + " posiciona seu cetro em sua frente, o cetro começa a girar.\n" + jogador.nome + " começa a levitar. Um grande feixe de luz dispara na direção de " + boss.nome);
            boss.vida = boss.vida - ((jogador.ataque*1.5) / boss.protecao);
        }  else {
            System.out.println("[Kuriboh]:\nMana insuficiente!");
        }
    }
    String ataque (jogador player, viloes vilao) {
        return (player.nome + " usa uma magia ofensiva de fogo e ataca diretamente o " + vilao.nome + "\n causando " + magia0 + " de dano mágico.\n\n[Kuriboh]:\nA vida atual do " + vilao.nome + " é " + vilao.vida);

    }
}
