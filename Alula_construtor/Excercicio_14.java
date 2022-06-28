import java.util.Scanner;

public class Excercicio_14 {
	public static void numero_quadrado(int num1, int num2) {
		if(num1 == 5) {
			num1 += 5 * 2;
			System.out.println("soma " + num1 + " - "  + num2 * 2);
		}if(num2 == 5) {
			num2 += 5 * 2;
			System.out.println("soma " + num2 + " - " + num1 * 2);
		}System.out.println("soma " + num1 * 2 + " - " + num2 * 2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("coleque um numero");
		int numero = input.nextInt();
		System.out.println("coleque outro numero");
		int numero2 = input.nextInt();
		numero_quadrado(numero, numero2);
	}
}
