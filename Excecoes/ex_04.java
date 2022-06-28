package Excecoes;

import java.util.Scanner;

public class ex_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura[] = new double[5];
		double media = 0;
		for (int i = 0; i < altura.length; i++) {
			System.out.println("altura da pessoa " + i);
			altura[i] = sc.nextDouble();
			String convere = Double.toString(altura[i]);
			if(convere.length() > 3) {
				throw new IllegalAccessError("altura errada ");
			}
			media += altura[i];
		}
	}
}
