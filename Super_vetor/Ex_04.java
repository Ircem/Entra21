package Super_vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_04 {
public static void main(String[] args) {
	ArrayList<Integer> lista = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < 10; i++) {
		lista.add(i);
		System.out.println("Possi��o " + i + " - " + lista.get(i)); 
	}
	System.out.println("qual possi��o quer alterar para zero");
	int altera = sc.nextInt();
	lista.remove(altera);
	lista.add(altera, 0);
	for (int i = 0; i < 10; i++) {
		System.err.println("Possi��o " + i + " - " + lista.get(i));
	}
}
}
