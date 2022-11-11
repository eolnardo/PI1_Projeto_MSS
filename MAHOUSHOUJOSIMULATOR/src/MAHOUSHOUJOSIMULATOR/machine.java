package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class machine {
	//System.out.println("\n[Kuriboh]:\n");
	Scanner scan = new Scanner(System.in);
	String mascote;
	int menu, menucombate, luta;
	boolean sair = false, menuc = false, jogadormorto = false, bossHaku = false;
	falasjogador falas = new falasjogador();
	mahoushoujosimulator zero = new mahoushoujosimulator();
	grimorio magias = new grimorio();
	int vilaovidaarredonda;
	/* boolean[] vivo = new boolean[3];
	vivo[0] = true;
	vivo[1] = true;
	vivo[2] = true; */ 


	
	void menu (viloes vilao, viloes vilao1, viloes vilao2,jogador jogador) {
		while(sair==false) {
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.print("\n[Kuriboh]:\nO que você quer fazer agora?\n1. LUTAR!!!!!!!\n2. Sair (fracote!)\nComando: ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				menucombate(vilao, vilao1, vilao2, jogador);
				break;
			case 2:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				
				System.out.println("[Kuriboh]:\nO que?\n                                                                         (pressione enter)");
				scan.nextLine();
				System.out.println("Achou que seria tão fácil assim?");
				falas.falasair(jogador);
				sair = false;
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
		
		vilao.vida = vilao.vidabase;
		
		

		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("\n[Kuriboh]:\nVida do "+ vilao.nome +": [" + vilao.vida + "]");
		System.out.println("\n[Kuriboh]:\nVida do " + jogador.nome + ": [" + jogador.vida + "]");
		System.out.println("\n====================================================S2=========================================================\n");
		while (vilao.vida > 0 && jogador.vida> 0 && menuc == false) {
			if (jogador.vida>0){
			jogador.acoes();
			luta = scan.nextInt();
			scan.nextLine();
			System.out.println("\n====================================================S2=========================================================\n");
			
			
			switch(luta) {
				case 1:
					
					jogador.ataque(vilao);
					if (vilao.vida>0){
						vilao.ataque(jogador);
					}
					if (vilao.vida <=0){
						vilao.vida = 0;
						printarvida(jogador, vilao);
					} else {
						printarvida(jogador, vilao);
					}
					break;
				case 2:
					jogador.defesa(vilao);
					System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]\n");
					System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
					break;
				case 3:
					menuc = true;
					break;
				case 4:
					magias.kuriboh(jogador);
					break;
				default:
					System.out.println("\n[Kuriboh]:\nBATE!! BATE!! BATE!!");
					break;
				}
			}
			

			if (jogador.vida < 0){
				System.out.println("\n====================================================S2=========================================================\n");
				jogador.vida = 0;
				System.out.println("\n[Kuriboh]:\n"+ vilao.nome + " avança até " + jogador.nome +  ", e coloca as duas mãos em seu rosto, num piscar de olhos, \no corpo inteiro do " + jogador.nome + " está em chamas.");
				System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
				jogadormorto = true;
			} 
			
			if (vilao.vida<=0) {
				System.out.println("\n====================================================S2=========================================================\n");
				System.out.println("[Kuriboh]:\n" + jogador.nome + " olha para o " + vilao.nome + " que agora está no chão. \nÉ possível ver que o ódio ainda queima em sua alma. " + jogador.nome + " desfere seu último golpe utilizando seu cetro mágico\no vilão explode espalhando pequenas faíscas pelo lugar.");
				System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
				vilao.vivo = vilao.vivo + 1;
				jogador.viloesDerrotados++;
				break;
			}
		}
		
	}
		
	
	
	/*void mascote () {
		System.out.println("\n[Kuriboh]:\nAh, quase que eu ia me esquecendo... \nantes de você começar a tomar suas próprias decisôes\ntenho que te apresentar um amigo que vai te acompanhar nessa joranda!");
		mascote = scan.next();
	} */
	
	void menucombate (viloes vilao, viloes vilao1, viloes vilao2, jogador jogador) {
		if (vilao.vivo == 0 && vilao1.vivo == 0 && vilao2.vivo == 0) {
				while (menuc == false) {
					System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. HAKU!!\n2. KIARA!!\n3. O esquisitão... digo, o Kenku.\n4. MENU!\n" + jogador.viloesDerrotados + "\nComando aqui: ");
				menucombate = scan.nextInt();
				scan.nextLine();
				switch(menucombate) {
					case 1:
						combate(vilao, jogador);
						break;
					case 2:
						combate(vilao1, jogador);
						break;
					case 3:
						combate(vilao2, jogador);
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
		//(vilao.vivo == false && vilao1.vivo == true && vilao2.vivo == true) 
			while (menuc == false) {
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
		}
		
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
						System.out.print("\n[Kuriboh]:\n1. Vestido Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
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

		void printarvida (jogador jogador, viloes vilao){
			System.out.println("\n[Kuriboh]:\n"+ jogador.nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
						System.out.println("\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
		}
	}
	//HAKU
