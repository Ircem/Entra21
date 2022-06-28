package Excecoes;

import java.util.Scanner;

public class ex_08 {
	public static void main(String[] args) {
		metodo_08 a = new metodo_08();
		Scanner sc = new Scanner(System.in);
		System.out.println("escolha a estação de 1 a 4 e descubra a mensagem");
		int entra = sc.nextInt();
		if(entra > 4) {
			throw new IllegalAccessError("não consta essa opição");
		}
		if (entra == 1) {
			System.out.println("Verao " + a.verao());
		} else if (entra == 2) {
			System.out.println("Outono " + a.outono());
		} else if (entra == 3) {
			System.out.println("Inverno " + a.inverno());
		} else {
			System.out.println("Primavera " + a.Primavera());
		}
	}
}
