package Excecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> lista = new ArrayList<>();
	for (int i = 0; i < 9; i++) {
		lista.add(i);
		lista.sort(null);
	}
	System.out.println(lista);
	System.out.println("qual posisão que alterar ");			
	int numeros = sc.nextInt();
	for (int j = 0; j < 8; j++) {
		if(lista.get(j) == numeros  ) {
			throw new IllegalAccessError("erro");
		}
	}	
	System.out.println("qual o vaor quer botar");
	int valor =sc.nextInt();
	
	lista.set(numeros,valor);
	System.out.println(lista);
			
}
}
