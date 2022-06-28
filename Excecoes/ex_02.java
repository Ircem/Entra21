package Excecoes;

import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entra[] = new int[2];
		for (int i = 0; i < 2; i++) {
			entra[i] = sc.nextInt();
		}
		boolean v = true;
		String opcao = "";
		while (v) {
			try {
				System.out.println("Use os simbolos para clacular + - / * (S)air");
				opcao = sc.next();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (opcao.equalsIgnoreCase("+")) {
				System.out.println("Soma " + entra[0] + entra[1]);
			}
			if (opcao.equalsIgnoreCase("-")) {
				System.out.println("Subtração " + (entra[0] - entra[1]));
			}

			if (opcao.equalsIgnoreCase("/")) {
				try {
					System.out.println("Divição " + entra[0] / entra[1]);
				} catch (ArithmeticException e) {
					e.printStackTrace();
					System.out.println("passo mas não pode dividir por zero");
				}
			}

			if (opcao.equalsIgnoreCase("*")) {
				System.out.println("Mutiplicação: " + entra[0] + entra[1]);
			}
			if (opcao.equalsIgnoreCase("S")) {
				v = false;
			}
		}

	}
}
