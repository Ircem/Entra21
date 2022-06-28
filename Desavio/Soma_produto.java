import java.util.Random;
import java.util.Scanner;

public class Soma_produto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random aleatori = new Random();
		System.out.println("Insira o numero B");
		double b = input.nextDouble();
		b = b;
		System.out.println("Insira o numero C");
		double c = input.nextDouble();
		double a = 1;
		double x1 = -b / a;
		double x2 = c / a;
		double resp1 = x1;
		double resp2 = x1;
		resp1 = resp1 + x2;
		resp2 *= x2;
		double soma = resp1 + resp2;
		while (true) {
			
			int n = aleatori.nextDouble(-c,c);
			int n1 = aleatori.next-c,c);
			
			System.out.println(n + " = " + n1);
			int resposta1 = n + n1;
			int resposta2 = n * n1;
			if (resposta1 == x1 && resposta2 == x2) {
				
				System.out.println("valor soma " + resposta1 + "\n valor produto: " + resposta2);
				break;
			}

		}
	}
}
}
