import java.util.Arrays;
import java.util.Scanner;

public class Desavio_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("crie um vetor de 4 a 25");
		int n = sc.nextInt();
		if (n < 4 || n > 25) {
			throw new IllegalAccessError("Erro o numero escolhodo não esta dentro do paramentero aceitavel");
		}
		int matrix[][] = new int[2][2];
		/*
		 * for (int i = 0; i < matrix.length; i++) { for (int j = 0; j < matrix.length;
		 * j++) { matrix[i][j] = 1; System.out.println(""); } }
		 */
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {				
				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println(" ");
		}
	}
}
