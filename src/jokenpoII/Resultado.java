package jokenpoII;

import java.util.Random;

public class Resultado {

	public void jogador(int jogador) {
		if (jogador == 1) {
			System.out.println("Você escolheu PEDRA");
		} else if (jogador == 2) {
			System.out.println("Você escolheu PAPEL");
		} else if (jogador == 3) {
			System.out.println("Você escolheu TESOURA");
		} else {
			System.out.println("Opção incorreta, informe novamente");
		}
	}

	public int computador() {
		Random random = new Random();
		int computador = random.nextInt(3) + 1;
		if (computador == 1) {
			System.out.println("Computador escolheu PEDRA");
		} else if (computador == 2) {
			System.out.println("Computador escolheu PAPEL");
		} else {
			System.out.println("Computador escolheu TESOURA");
		}
		return computador;
	}

}
