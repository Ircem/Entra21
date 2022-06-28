import java.util.Scanner;

public class Alterado_etestando {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("seu nome");
		String nome = sc.next();

		Alteradon_eteste teste = new Alteradon_eteste(nome, 0);
		System.out.println("Voce que depositar dinheiro \n1- sim \n2- Não");
		double deposito = sc.nextDouble();

		if (deposito == 1) {
			System.out.println("quando que depositar");
			deposito = sc.nextDouble();
			System.out.println(teste.Deposito(deposito));
		}

		System.out.println("valor para saque");
		double valor = sc.nextDouble();
		System.out.println(teste.saquear(valor));
		Alteradon_eteste teste1 = new Alteradon_eteste(nome, valor);
		if (teste.getSalario() == 0) {
			System.out.println("voce não tem dinheiro para sacar");
		} else if (teste.getSalario() > 0) {
			System.out.println(teste.getNome() + " " + teste.getSalario());
		}

	}
}
