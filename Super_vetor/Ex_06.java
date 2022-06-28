package Super_vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			lista.add(i);
			if (i % 2 == 0) {
				int par = lista.get(i) * 005;
				lista.remove(i);
				lista.add(i, par);
				
			}
			int impar = lista.get(i) * 002;
			lista.remove(i);
			lista.add(i, impar);
			
			
		}
		lista.sort(null);
		System.out.println(lista);
	}
}