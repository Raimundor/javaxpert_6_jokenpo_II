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
			int comp = jog.computador();

			System.out.println("");
			
			if (jogador == comp) {
				System.out.println("Empatou!!!");
			} else if (jogador == 1 && comp == 2) {
				System.out.println("Computador ganhou esta.");
			} else if (jogador == 2 && comp == 3) {
				System.out.println("Computador ganhou esta.");
			} else if (jogador == 3 && comp == 1) {
				System.out.println("Computador ganhou esta.");
			} else if (jogador > 3) {
				System.out.println("");
			} else {
				System.out.println("Você ganhou esta!!!!");
			}

		}

		sc.close();
	}

}