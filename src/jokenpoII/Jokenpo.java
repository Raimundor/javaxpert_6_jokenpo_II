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
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("--------------------");
		System.out.println("");
		System.out.print("Qual a sua opção: ");
		int jogador = sc.nextInt();

		System.out.println("");
		if (jogador == 1) {
			System.out.println("Você escolheu PEDRA");
		} else if (jogador == 2) {
			System.out.println("Você escolheu PAPEL");
		} else if (jogador == 3) {
			System.out.println("Você escolheu TESOURA");
		} else {
			System.out.println("Opção incorreta, informe novamente");
		}

		int computador = random.nextInt(3) + 1;
		if (computador == 1) {
			System.out.println("Computador escolheu PEDRA");
		} else if (computador == 2) {
			System.out.println("Computador escolheu PAPEL");
		} else {
			System.out.println("Computador escolheu TESOURA");
		}

		System.out.println("");
		if (jogador == computador) {
			System.out.println("Empatou!!!");
		} else if (jogador == 1 && computador == 2) {
			System.out.println("Computador ganhou.");
		} else if (jogador == 2 && computador == 3) {
			System.out.println("Computador ganhou.");
		} else if (jogador == 3 && computador == 1) {
			System.out.println("Computador ganhou.");
		} else if (jogador > 3) {
			System.out.println("");
		} else {
			System.out.println("Você ganhou esta!!!!");
		}

		sc.close();
	}

}