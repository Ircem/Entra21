package Super_vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			lista.add(i);
			System.out.println("Possição " + i + " - " + lista.get(i));
		}
			System.out.println("qual possição quer alterar");
			int altera = sc.nextInt();
			lista.remove(altera);
			System.out.println("Qual valor quer acresentar");
			int valor = sc.nextInt();
			lista.add(altera, valor);
			for (int i = 0; i < 10; i++) {
				System.err.println("Possição " + i + " - " + lista.get(i));
			}

			System.out.println("oi");
		}
	}

