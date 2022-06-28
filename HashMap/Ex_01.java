package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> entra = new HashMap<Integer, String>();
		boolean verdade = true;
		
		while (verdade) {
			System.out.println("Entre com o numero para saber se ele e par ou impar");
			int numero = sc.nextInt();
			if (numero == 0) {
				verdade = false;
				break;
			}
			if (numero % 2 == 0) {
				entra.put(numero, "Par");
			} else
				entra.put(numero, "Impar");
		}

		System.out.println(entra);
	}
}
