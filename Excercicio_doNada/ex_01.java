package Excercicio_doNada;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> letra = new ArrayList<>();
		for (int i = 0; i < 10; i++) {

			letra.add(sc.next().toUpperCase().charAt(0));
			
			if (letra.get(i) == 'A' || letra.get(i) == 'E' || letra.get(i) == 'I' || letra.get(i) == 'O' || letra.get(i) == 'U') {
				System.out.println("\n" + letra + " Fogal");
			} else {
				System.out.println("\n" + letra + "Consoante");
			}
		}
	}
}
