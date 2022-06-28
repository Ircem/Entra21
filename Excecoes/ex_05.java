package Excecoes;

import java.util.Scanner;

public class ex_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int vetor[] = new int[5];
	for (int i = 0; i < vetor.length; i++) {
		vetor[i] = i * 2;
		System.out.println("Posição " + i + " - " + vetor[i]);
		
	}
	System.out.println("qual posição vc quer alterar");
	int altera =sc.nextInt();
	System.out.println("qual valor vai botar");
	int valor = sc.nextInt();
	if(altera > vetor.length) {
		throw new IllegalAccessError("O valor não conta no indice");
	}else {
		vetor[altera] = valor;
	}
	
}
}
