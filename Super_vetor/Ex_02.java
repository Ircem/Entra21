package Super_vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int i = -1;
		int num = 0;
		boolean v = true;
		while (v) {
			System.out.println("escreva qualquer coisa");			
			int numeros = sc.nextInt();		
			lista.add(numeros);
			i++;
			System.out.println("N para sair");
			char numero = sc.next().charAt(0);
			numero = Character.toUpperCase(numero);
			if (numero == 'N') {
				v = false;
				numero = 1;
			}

		}
		System.out.println(lista);
		lista.sort(null);
		System.out.println("O menor valor é " + lista.get(0) + "\nO maior valor é " + lista.get(i));
		for (int j = 0; j < args.length; j++) {
			num +=  lista.get(j);
			System.out.println("media " + num / lista.size());
		}
	}
}
