package Excercicio_doNada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		Corta_tempo03 corta = new Corta_tempo03();
		System.out.println("Converter: (T)emperatura, (P)eso, (C)omprimento ou (V)olume.");
		char opc = sc.next().toUpperCase().charAt(0);
		if (opc == 'T') {
			System.out.println("(C)elsius, (F)ahrenheit ou (K)elvin");
			opc = sc.next().toUpperCase().charAt(0);
			if (opc == 'C') {
				System.out.println("Celsius para (F)ahrenheit ou (K)elvin");
				opc = sc.next().toUpperCase().charAt(0);
				if (opc == 'F') {
					System.out.println("Temperatura: ");
					System.out.println(corta.Celsius(sc.nextDouble(), opc));
				} else if (opc == 'K') {
					System.out.println("Temperatura: ");
					System.out.println(corta.Celsius(sc.nextDouble(), opc));
				}

			} else if (opc == 'F') {
				System.out.println("Fahrenheit para (C)elsius ou (K)elvin");
				opc = sc.next().toUpperCase().charAt(0);
				if (opc == 'C') {
					System.out.println("Temperatura: ");
					System.out.println(corta.Fahrenheit(sc.nextDouble(), opc));
				} else if (opc == 'K') {
					System.out.println("Temperatura: ");
					System.out.println(corta.Fahrenheit(sc.nextDouble(), opc));
				}
			} else if (opc == 'K') {
				System.out.println("Kelvin para (C)elsius ou (F)ahrenheit");
				opc = sc.next().toUpperCase().charAt(0);
				if (opc == 'C') {
					System.out.println("Temperatura: ");
					System.out.println(corta.Kelvin(sc.nextDouble(), opc));
				} else if (opc == 'C') {
					System.out.println("Temperatura: ");
					System.out.println(corta.Kelvin(sc.nextDouble(), opc));
				}
			}
		} else if (opc == 'P') {
			System.out.println("(Q)uilos, (L)ibras ou (O)nças");
			opc = sc.next().toUpperCase().charAt(0);
			if (opc == 'Q') {
				System.out.println("Quilos Para (L)isbras ou (O)nças");
				opc = sc.next().toUpperCase().charAt(0);
				if (opc == 'L') {
					System.out.println("peso: ");
					System.out.println(corta.Quilos(sc.nextDouble(), opc));
				} else if (opc == 'O') {
					System.out.println("peso: ");
					System.out.println(corta.Quilos(sc.nextDouble(), opc));
				}
			} else if (opc == 'L') {
				System.out.println("Libras para (Q)uilos ou (O)nças");
				opc = sc.next().toUpperCase().charAt(0);
				if (opc == 'Q') {
					System.out.println("peso: ");
					System.out.println(corta.Libras(sc.nextDouble(), opc));
				} else if (opc == 'O') {
					System.out.println("peso: ");
					System.out.println(corta.Libras(sc.nextDouble(), opc));
				}
			} else if (opc == 'O') {
				System.out.println("Onças para (Q)uilos ou (L)ibras");
				opc = sc.next().toUpperCase().charAt(0);
				if (opc == 'Q') {
					System.out.println("peso: ");
					System.out.println(corta.Oncas(sc.nextDouble(), opc));
				} else if (opc == 'L') {
					System.out.println("peso: ");
					System.out.println(corta.Oncas(sc.nextDouble(), opc));
				}
			}
		}
	}
}
