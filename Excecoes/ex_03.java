package Excecoes;

import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entra[] = new int[2];
		for (int i = 0; i < entra.length; i++) {

			System.out.println("entre com um numero de 0 a 100");
			entra[i] = sc.nextInt();
			if (entra[i] > 100 || entra[i] < 0) {
				throw new IllegalAccessError("O numero esta fora do limite");
			}
		}
		try {
			System.out.println("Divição " + entra[0] / entra[1]);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("passo mas não pode dividir por zero");
		}
		System.out.println("Soma " + entra[0] + entra[1]);
		System.out.println("Subtração " + (entra[0] - entra[1]));
		System.out.println("Mutiplicação: " + entra[0] + entra[1]);

	}
}
