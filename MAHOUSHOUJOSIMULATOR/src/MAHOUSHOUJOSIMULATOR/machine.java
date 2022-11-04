package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class machine {
	//System.out.println("\n[Kuriboh]:\n");
	Scanner scan = new Scanner(System.in);
	String mascote;
	int menu, menucombate, luta;
	boolean sair = false, menuc = false, jogadormorto = false, bossHaku = false;
	mahoushoujosimulator zero = new mahoushoujosimulator();
	grimorio magias = new grimorio();
	int vilaovidaarredonda;
	/* boolean[] vivo = new boolean[3];
	vivo[0] = true;
	vivo[1] = true;
	vivo[2] = true; */ 


	
	void menu (viloes vilao, jogador jogador) {
		while(sair==false) {
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.print("\n[Kuriboh]:\nO que você quer fazer agora?\n1. LUTAR!!!!!!!\n2. Sair (fracote!)\nComando: ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
			/*menucombate(vilao, jogador);*/
				break;
			case 2:
				sair = true;
				break;
			default:
				System.out.println("\n[Kuriboh]:\nNão entendi...");
				sair = false;
				break;
			}
		}
		
		
	}

	
	void combate (viloes vilao, jogador jogador) {
		jogador.vida = jogador.vidabase;
		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("\n[Kuriboh]:\nVida do "+ vilao.nome +": [" + vilao.vida + "]");
		System.out.println("\n[Kuriboh]:\nVida do " + jogador.nome + ": [" + jogador.vida + "]");
		System.out.println("\n====================================================S2=========================================================\n");
		while (vilao.vida > 0 && jogador.vida> 0 || menuc == false) {
			
			
			System.out.println("\n[Kuriboh]:\n1.BATER!! (ataque)\n2. AIAIAI (defesa)\n3.MAS EH UM FRACOTE MESMO! (fugir)");
			luta = scan.nextInt();
			System.out.println("\n====================================================S2=========================================================\n");
			switch(luta) {
				case 1:
					vilao.vida = vilao.vida - (jogador.ataque / vilao.protecao);
					if (vilao.vida <=0){
						vilao.vida = 0;
						System.out.println("\n[Kuriboh]:\n"+ jogador.nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.vida+ "]");
						System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + jogador.vida + "]");
					} else if (jogador.vida <= 0){
						jogador.vida = 0;
						System.out.println("\n[Kuriboh]:\n"+ jogador.nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.arredonda + "]");
						System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + jogador.vida + "]");
					} else {
						System.out.println("\n[Kuriboh]:\n"+ jogador.nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.arredonda + "]");
						System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + jogador.vida + "]");
					}
					break;


				case 2:
					jogador.vida = jogador.vida + (jogador.defesa - vilao.ataque);
					System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + vilao.vida + "]\n");
					System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + jogador.vida + "]");
					break;


				case 3:
					menuc = true;
					break;


				case 4:
					magias.ataque(jogador, vilao);
					break;


				default:
					System.out.println("\n[Kuriboh]:\nBATE!! BATE!! BATE!!");
					break;
				}
			if (vilao.vida<=0) {
				jogador.viloesDerrotados++;
				break;
			} else if (jogador.vida<=0) {
				jogadormorto = true;
				break;
			}
		}
		
	}
		
	
	
	/*void mascote () {
		System.out.println("\n[Kuriboh]:\nAh, quase que eu ia me esquecendo... \nantes de você começar a tomar suas próprias decisôes\ntenho que te apresentar um amigo que vai te acompanhar nessa joranda!");
		mascote = scan.next();
	} */
	
	/*void menucombate (viloes vilao, jogador jogador) {
		if (vivo[0] == true && vivo [1] == true && vivo[2] == true) {
				while (menuc == false) {
					System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. HAKU!!\n2. KIARA!!\n3. O esquisitão... digo, o Kenku.\n4. MENU!\n" + jogador.viloesDerrotados + "\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						combate(vilao, jogador);
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						menuc = true;
						break;
					default:
						System.out.println("\n[Kuriboh]:\nVai lutar ou não? Não enche!");
						menuc = false;
						break;
					}
			}
		} else {
			while (vivo[0] == false && vivo [1] == true && vivo[2] == true) {
					System.out.println("\n====================================================S2=========================================================\n");
						System.out.print("\n[Kuriboh]:\n1. HAKU!! (eliminado)\n2. KIARA!!\n3. O esquisitão... digo, o Kenku.\n4. MENU!\nComando aqui: ");
						menucombate = scan.nextInt();
						switch(menucombate) {
							case 1:
							System.out.println("\n[Kuriboh]:\nmorreu já, filhão");
								break;
							case 2:
								combate(vilao, jogador);
								break;
							case 3:
								break;
							case 4:
								menuc = true;
								break;
							default:
								System.out.println("\n[Kuriboh]:\nVai lutar ou não? Não enche!");
								menuc = false;
								break;
					}
				} 
			} 
		}*/
		
		void login (jogador player) {
			System.out.println("====================================================S2=========================================================\n");
			System.out.println("[Kuriboh]:\nOlá! Seja bem-vindo ao Mahou Shoujo Simulator. \nAqui você irá enfrentar criaturas elementais e escolher o melhor uniforme!\n");
			System.out.println("[Kuriboh]:\nEu sou o Kuriboh! Uma criatura fofa e adorável. \n...Sim, meu visual foi inspirado no kuriboh de yu-gi-oh! T.T");
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.print("[Kuriboh]:\nPrimeiro, digite o seu nome: ");
			player.nome = scan.nextLine();
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.println("[Kuriboh]:\nCerto... " + player.nome + "\nAgora, qual é o seu MAIOR desejo? ");
			System.out.print("\n[" + player.nome + "]:\n"); 
			player.desejo = scan.nextLine(); 
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.println("[Kuriboh]:\nParabéns! Você acaba de se tornar uma garota mágica!\nAgora você precisa decidir qual será seu uniforme de batalha!");
			System.out.print("[Kuriboh]:\n1. Vestido Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
			
			
			
			while(player.uniforme != 1 || player.uniforme != 2 || player.uniforme != 3) {
				player.uniforme = scan.nextInt();
				System.out.println("\n====================================================S2=========================================================\n");
				boolean saida = false;
				switch(player.uniforme) {
					case 1:
						System.out.println("[Kuriboh]:\nAqui temos um belo vestido colegial... \nÓtima escolha, eu particularmente prefiro esse.\nAposto que vai derrotar todos!!");
						saida = true;
						break;
					case 2:
						System.out.println("[Kuriboh]:\nUma ótima escolha. Diretamente da SHEIN, né?\nSem personalidade...");
						saida = true;
						break;
					case 3:
						System.out.println("[Kuriboh]:\nMuito tosco! \nAcho que você não tem muita criatividade, mas tudo bem.");
						saida = true;
						break;
					case 4:
						System.out.println("[Kuriboh]:\nHaha, thats funny, você quase me pegou\n(tradução: que engraçado)");
						System.out.print("\n[Kuriboh]:\n1. Vesitdo Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
						break;
					default:
						System.out.println("[Kuriboh]:\nOlha, eu preciso que você escolha uma roupa logo...");
						System.out.print("\n[Kuriboh]:\n1. Vesitdo Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
						
						break;
				}
				if (saida == true) {
					break;
				}
			}
			System.out.println("\n====================================================S2=========================================================\n");
	}
	}
	//HAKU
