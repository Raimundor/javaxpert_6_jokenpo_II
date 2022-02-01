package jokenpoII;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("--------------------");
		System.out.println("      JOKENPO   ");
		System.out.println("--------------------");
		System.out.print("Quantas partidas? ");
		int partidas = sc.nextInt();
		System.out.println("");

		System.out.println("--------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("--------------------");
		System.out.println("");

		String continua;
		int comp = 0;
		int joga = 0;
		int contador = 1;
		while (contador <= partidas) {
			System.out.println("");
			System.out.println("Partida " + contador);
			contador = contador + 1;

			System.out.print("Qual a sua opção: ");
			int jogador = sc.nextInt();

			System.out.println("");

			Resultado jog = new Resultado();
			jog.jogador(jogador);
			int com = jog.computador();

			System.out.println("");

			if (jogador == com) {
				System.out.println("Empatou!!!");
			} else if (jogador == 1 && com == 2) {
				System.out.println("Computador ganhou esta.");
				comp++;
			} else if (jogador == 2 && com == 3) {
				System.out.println("Computador ganhou esta.");
				comp++;
			} else if (jogador == 3 && com == 1) {
				System.out.println("Computador ganhou esta.");
				comp++;
			} else if (jogador > 3) {
				System.out.println("");
			} else {
				System.out.println("Você ganhou esta!!!!");
				joga++;
			}

		}
		System.out.println("");
		if (joga < comp) {
			System.out.println("COMPUTADOR VENCEU O DESAFIO POR " + comp + " X " + joga);
		} else if (comp < joga) {
			System.out.println("VOCÊ VENCEU O DESAFIO POR " + joga + " X " + comp);
		} else {
			System.out.println("DESAFIO EMPATADO " + comp + " X " + joga);
		}
		
		sc.close();
		
		System.out.println("");
		System.out.print("Jogar novamente(S/N): ");

	}

}