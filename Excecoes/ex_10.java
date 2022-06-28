package Excecoes;

import java.util.Scanner;

public class ex_10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double nota[] = new double[3];
	double media = 0;
	for (int i = 0; i < nota.length; i++) {
		nota[i]= sc.nextDouble();
		if(nota[i] > 10 || nota[i] < 0) {
			throw new IllegalAccessError("A Nota não pode ser maior que 10,0 ou menor que 0");
		}
		media += nota[i];
	}
	System.out.println("Media do anulo: " + media / 3);
}
}
