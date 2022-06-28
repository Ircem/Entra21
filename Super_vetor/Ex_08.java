package Super_vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int media = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("informe 6 valores inteiro " + (i + 1));
			int entra = sc.nextInt();
			lista.add(entra);
			media += lista.get(i);
		}
		media = media / lista.size();
		for (int i = 0; i < 6; i++) {
			if (lista.get(i) > media) {
				System.out.println("Maior que a media " + lista.get(i));

			}
		}
	}
}
