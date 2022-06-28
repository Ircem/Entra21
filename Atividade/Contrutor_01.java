import java.util.Scanner;

public class Contrutor_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nome da conta");
		String nome = sc.next();
		System.out.println("valor para saque");
		double valor = sc.nextDouble();
		
		Contrutir_01v sacar = new Contrutir_01v(nome);
		
		System.out.println(sacar.sacar(valor));
		System.out.println(sacar.saldo);
		System.out.println("Depositar");
		valor = sc.nextDouble();
		System.out.println(sacar.depositar(valor));
		
	}
}
