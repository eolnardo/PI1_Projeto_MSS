package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class machine {
	//System.out.println("\n[Kuriboh]:\n");
	Scanner scan = new Scanner(System.in);
	String mascote;
	int menu, menucombate = 0, luta, morreuUmaVez = 0;
	boolean sair = false, menuc = false, jogadormorto = false, bossHaku = false;
	falasjogador falas = new falasjogador();
	mahoushoujosimulator zero = new mahoushoujosimulator();
	grimorio magias = new grimorio();
	boolean combate1 = false, combate2 = false, combate3 = false, fim = false;
	

	//---------------------------------------------- MENU PRINCIPAL --------------------------------------------------

	void menu (viloes vilao, viloes vilao1, viloes vilao2, jogador jogador, viloes vilaoespecial) {
		while(sair==false) {
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.print("\n[Kuriboh]:\nO que você quer fazer agora?\n1. LUTAR!!!!!!!\n2. Sair (fracote!)\nComando: ");
			menu = scan.nextInt();
			
			menuc = false;

			switch(menu) {
			case 1:
				menusss(vilao, vilao1, vilao2, jogador, vilaoespecial);
				break;
			case 2:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				
				System.out.println("[Kuriboh]:\nO que?");
				scan.nextLine();
				System.out.println("\n[Kuriboh]:\nAchou que seria tão fácil assim?");
				falas.falasair(jogador);
				System.out.println("\n[Kuriboh]:\nVocê aceitou as consequências quando aceitou o contrato!");
				scan.nextLine();
				sair = false;
				break;
			default:
				System.out.println("\n[Kuriboh]:\nNão entendi...");
				sair = false;
				break;
			}

			
		}
		
		
	}

	//---------------------------------------------------- COMBATE HAKU ---------------------------------------------

	void combate1 (viloes vilao, jogador jogador) {
		jogador.vida = jogador.vidabase;
		vilao.nome = "Haku, o Senhor do Fogo";
		
		if (morreuUmaVez>0){
			magias.kuriboh += 3;
			morreuUmaVez--;
		}

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
							System.out.println("\n[Kuriboh]:\n" + vilao.nome + " dispara uma bola de fogo que atinge " + jogador.nome + ".");
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
						printarvida(jogador, vilao);
						break;
						case 3:
						magias.kuriboh(jogador);
						break;
					case 4:
						menuc = true;
						break;
					default:
						System.out.println("\n[Kuriboh]:\nBATE!! BATE!! BATE!!");
						break;
					}
			}
			

			if (jogador.vida <=0){
				System.out.println("\n====================================================S2=========================================================\n");
				jogador.vida = 0;
				System.out.println("\n[Kuriboh]:\n"+ vilao.nome + " avança até " + jogador.nome +  ", e coloca as duas mãos em seu rosto, num piscar de olhos, \no corpo inteiro do " + jogador.nome + " está em chamas.");
				System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
				morreuUmaVez++;
				menuc = true;
			} 
			
			if (vilao.vida<=0) {
				System.out.println("\n====================================================S2=========================================================\n");
				System.out.println("[Kuriboh]:\n" + jogador.nome + " olha para o " + vilao.nome + " que agora está no chão. \nÉ possível ver que o ódio ainda queima em sua alma. " + jogador.nome + " desfere seu último golpe utilizando seu cetro mágico\no vilão explode espalhando pequenas faíscas pelo lugar.");
				System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
				combate1 = true; magias.kuriboh += 4;
				menuc = true;
			}
		}
	}
		
	
	//================================================ COMBATE KIARA ===================================================

	void combate2 (viloes vilao, jogador jogador){
		vilao.nome = "Kiara, a Rainha dos Oceanos";
		jogador.vida = jogador.vidabase;

		if (morreuUmaVez>0){
			magias.kuriboh += 3;
			morreuUmaVez--;
		}

		vilao.vida = vilao.vidabase;
		vilao.vida += 5;
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
							System.out.println("\n[Kuriboh]:\n" + vilao.nome + " ataca " + jogador.nome + " com um jato d'água.");
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
						break;
						case 3:
						magias.kuriboh(jogador);
						break;
					case 4:
						menuc = true;
						break;
					default:
						System.out.println("\n[Kuriboh]:\nBATE!! BATE!! BATE!!");
						break;
					}
			}
			

			if (jogador.vida <=0){
				System.out.println("\n====================================================S2=========================================================\n");
				jogador.vida = 0;
				System.out.println("\n[Kuriboh]:\numa nuvem se forma em cima de " + jogador.nome +  ", e uma tempestade começa a cair sem parar, uma chuva ácida!\n" + jogador.nome + " começa a derreter.");
				System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
				morreuUmaVez++;
				menuc = true;
			} 
			
			if (vilao.vida<=0) {
				System.out.println("\n====================================================S2=========================================================\n");
				System.out.println("[Kuriboh]:\n" + jogador.nome + " olha para o " + vilao.nome + " que agora está no chão. \nA criatura está se contorcendo de dor. " + jogador.nome + " desfere seu último golpe utilizando seu cetro mágico\no vilão explode espalhando várias gotícolas de água pelo lugar.");
				System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
				combate2 = true; magias.kuriboh += 3;
				menuc = true;
			}
		}

	}




	//============================================== COMBATE KENKU =======================================================
	void combate3 (viloes vilao, jogador jogador){
		vilao.nome = "Kenku, o Mestre do Gelo";
		vilao.ataque += 5; 

		if (morreuUmaVez>0){
			magias.kuriboh += 3;
			morreuUmaVez--;
		}

		jogador.vida = jogador.vidabase;
		vilao.vida = vilao.vidabase;
		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("\n[Kuriboh]:\nVida do "+ vilao.nome +": [" + vilao.vida + "]");
		System.out.println("\n[Kuriboh]:\nVida do " + jogador.nome + ": [" + jogador.vida + "]");
		System.out.println("\n====================================================S2=========================================================\n");
		
		if(combate1 == true && combate2 == true){
			jogador.ataque = 15;
		}

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
							System.out.println("\n[Kuriboh]:\n" + vilao.nome + " dispara vários cristais de gelo na direção de " + jogador.nome + ".");
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
						break;
						case 3:
						magias.kuriboh(jogador);
						break;
					case 4:
						menuc = true;
						break;
					default:
						System.out.println("\n[Kuriboh]:\nBATE!! BATE!! BATE!!");
						break;
					}
			}
			
			
			if (jogador.vida <=0){
				System.out.println("\n====================================================S2=========================================================\n");
				jogador.vida = 0;
				System.out.println("\n[Kuriboh]:\n"+ vilao.nome + " ergue seus dois braços na direção de " + jogador.nome +  ", o chão ao seu redor começa a tremer, \ne num piscar de olhos, um enorme domo se forma em volta de " + jogador.nome + ", que fica preso em um vácuo.");
				System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
				morreuUmaVez++;
				menuc = true;
			} 
			
			if (vilao.vida<=0) {
				System.out.println("\n====================================================S2=========================================================\n");
				System.out.println("[Kuriboh]:\n" + jogador.nome + " olha para o " + vilao.nome + " que agora está no chão\ncomeça a se contorcer e explode espalhando várias cristais de gelo pelo ar.");
				System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
				combate3 = true; magias.kuriboh += 3; 
				menuc = true;
			}
		}



	}


	//================================================== MENU ESCOLHER VILÃO ===========================================

	void menucombate (viloes vilao1, viloes vilao2, viloes vilao3, jogador jogador) {
				while (menuc == false) {
					System.out.println("\n====================================================S2=========================================================\n");
					System.out.print("\n[Kuriboh]:\n1. Haku, O senhor do Fogo" + " | 2. Kiara, a Rainha dos Oceanos" + " | 3. Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
					menucombate = scan.nextInt();
					scan.nextLine();
					switch(menucombate) {
						case 1:
							combate1(vilao1, jogador);
							break;
						case 2:
							combate2(vilao2, jogador);
							break;
						case 3:
							combate3(vilao3, jogador);
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
	
	void menucombate1(viloes vilao, viloes vilao2, viloes vilao3, jogador jogador){	
		while (menuc == false) {
			System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. (eliminado) Haku, O senhor do Fogo | 2. Kiara, a Rainha dos Oceanos" + " | 3. Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						System.out.println("\n[Kuriboh]:\nMorreu já, filhão");
						menuc = false;
						break;
					case 2:
						combate2(vilao2, jogador);
						break;
					case 3:
						combate3(vilao3, jogador);
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

	void menucombate2 (viloes vilao, viloes vilao2, viloes vilao3, jogador jogador){	
		while (menuc == false) {
			System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. (eliminado) Haku, O senhor do Fogo | 2. (eliminado) Kiara, a Rainha dos Oceanos" + " | 3. Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						System.out.println("\n[Kuriboh]:\nMorreu já, filhão");
						menuc = false;
						break;
					case 2:
						System.out.println("\n[Kuriboh]:\nNão está mais entre nós");
						menuc = false;
						break;
					case 3:
						combate3(vilao3, jogador);
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
	
	void menucombate3 (viloes vilao, viloes vilao2, viloes vilao3, jogador jogador){	
		while (menuc == false) {
			System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. Haku, O senhor do Fogo | 2. Kiara, a Rainha dos Oceanos" + " | 3. (eliminado) Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						combate1(vilao, jogador);
						break;
					case 2:
						combate2(vilao2, jogador);
						break;
					case 3:
						System.out.println("\n[Kuriboh]:\nEsse já foi");
						menuc = false;
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
	
	void menucombate4 (viloes vilao, viloes vilao2, viloes vilao3, jogador jogador){	
		while (menuc == false) {
			System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. Haku, O senhor do Fogo | 2. (eliminado) Kiara, a Rainha dos Oceanos" + " | 3. (eliminado) Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						combate1(vilao, jogador);
						break;
					case 2:
						System.out.println("\n[Kuriboh]:\nNão está mais entre nós");
						menuc = true;
						break;
					case 3:
						System.out.println("\n[Kuriboh]:\nEsse já foi");
						menuc = true;
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
	
	void menucombate5 (viloes vilao, viloes vilao2, viloes vilao3, jogador jogador){	
		while (menuc == false) {
			System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. (eliminado) Haku, O senhor do Fogo | 2. Kiara, a Rainha dos Oceanos" + " | 3. (eliminado) Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						System.out.println("\n[Kuriboh]:\nMorreu já, filhão");
						menuc = true;
						break;
					case 2:
						combate2(vilao2, jogador);
						break;
					case 3:
						System.out.println("\n[Kuriboh]:\nEsse já foi");
						menuc = true;
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

	void menucombate6 (viloes vilao, viloes vilao2, viloes vilao3, jogador jogador){	
		while (menuc == false) {
			System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. haku, O senhor do Fogo | 2.(eliminado) Kiara, a Rainha dos Oceanos" + " | 3.Kenku, o Mestre do Gelo" + ". | 4. MENU!\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						combate1(vilao, jogador);
						break;
					case 2:
						System.out.println("\n[Kuriboh]:\nNão está mais entre nós");
						menuc = true;
						break;
					case 3:
						combate3(vilao3, jogador);
						menuc = true;
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

	void menucombateespecial (jogador jogador, viloes vilaespecial){

	}
	//========================================== AÇÕES DO SISTEMA =======================================================

	void printarvida (jogador jogador, viloes vilao){
		if (jogador.vida <0	){
			jogador.vida = 0;
		}

		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + (vilao.arredonda = (int) (vilao.vida + 0.5f)) + "]");
		System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + (jogador.arredonda = (int) (jogador.vida + 0.5f)) + "]");
		System.out.println("\n====================================================S2=========================================================\n");	
		System.out.println();
		}


	void menusss (viloes vilao, viloes vilao1, viloes vilao2, jogador jogador, viloes vilaoespecial){
		if(combate1 == false && combate2 == false && combate3 == false){
			menucombate(vilao1, vilao2, vilao2, jogador);
		} else if (combate1 == true && combate2 == false && combate3 == false){
			menucombate1(vilao1, vilao2, vilao2, jogador);
		} else if (combate1 == true && combate2 == true && combate3 == false){
			menucombate2(vilao1, vilao2, vilao2, jogador);
		} else if (combate1 == false && combate2 == false && combate3 == true){
			menucombate3(vilao1, vilao2, vilao2, jogador);
		} else if (combate1 == false && combate2 == true && combate3 == false){
			menucombate6(vilao1, vilao2, vilao2, jogador);
		}else if (combate1 == false && combate2 == true && combate3 == true) {
			menucombate4(vilao1, vilao2, vilao2, jogador);
		}else if (combate1 == true && combate2 == false && combate3 == true){
			menucombate5(vilao1, vilao2, vilao2, jogador);
		}else if (combate1 == true && combate2 == true && combate3 == true){
			jogador.ataque = jogador.ataque + 40;
			jogador.defesa = jogador.defesa + 110;
			jogador.vidabase += 180;
			System.out.println("\n[Kuriboh]:\nParabéns, você derrotou os vassalos!\nAgora você pode encerrar seu destino se desejar.\nCaso ainda não esteja satisfeito, posso revelar o próximo nível!");
			
			System.out.println("n[Kuriboh]:\nDeseja realizar o seu desejo? (1 - Não || Qualquer coisa - Sim)\nResponder: ");
			int finalizar = scan.nextInt();

			switch(finalizar){
				case 1:
					fim = true;
					break;
				default:
					break;
			
			
			}


			if (fim == true){
				System.out.println("n[Kuriboh]:\nAh, que pena. Espero te ver de novo um dia!");
				sair = true;
			} else {
				menucombateespecial (jogador, vilaoespecial);
			}
		}
	}
	// ========================================= CRIAÇÃO DO PERSONAGEM ====================================================

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
			
			System.out.println("\n====================================================S2=========================================================\n");
		} 
	}
}
