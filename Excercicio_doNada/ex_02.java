package Excercicio_doNada;

import java.util.Scanner;

public class ex_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Numero 1");
	int numero1 = sc.nextInt();
	System.out.println("Numero 2 ");
	int numero2 = sc.nextInt();
	System.out.println("1- Soma\n2-Subtra��o\n3- Divi��o\n4-Mutiplica��o");
	int num = sc.nextInt();
	switch(num) {
	case 1:
		System.out.println("Soma: " + (numero1 + numero2));
		break;
		
	case 2:
		System.out.println("Subtra��o: " + (numero1 - numero2));
		break;
		
	case 3:
		if(numero1 == 0 || numero2 == 0) {
			throw new IllegalAccessError("erro de zero");
		}
		System.out.println("Divi��o: " + numero1 / numero2);
		break;
	case 4:
		System.out.println("Mutiplica��o: " + numero1 * numero2);
		break;
	}
}
}
