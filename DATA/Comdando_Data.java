package DATA;

import java.time.LocalDate;
import java.util.Scanner;

public class Comdando_Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionaro en[] = new Funcionaro[1];

		for (int i = 0; i < en.length; i++) {
			en[i] = new Funcionaro(null, null, null, null, i, i);
			System.out.println("Nome funcionario");
			String nome = sc.next();
			System.out.println("Endereço");
			en[i].endereco();
			System.out.println("Coloque em seguemcia ano/mes/dia");
			LocalDate date1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println("Carga Horaria");
			double horas = sc.nextDouble();
			System.out.println("Salario");
			double salario = sc.nextDouble();
			en[i] = new Funcionaro(nome, Integer.toString(i), date1, date1, horas, salario);

		}
		for (int i = 0; i < en.length; i++) {
			System.out.println(en[i].mostras());
		}
		boolean v = true;
		while (v) {
			System.out.println("Escolha um id para aumentar a carga horaria");
			int id = sc.nextInt();
			if (id < 1) {
				System.out.println("Quantos procento você que aumentar");
				int aumenta = sc.nextInt();
				en[id].aumentar_carga(aumenta);
				System.out.println(en[id].mostras());
				v = false;
			} else
				System.out.println("O ID que vc coloco não costa na lista");
		}
		boolean c = true;
		while (c) {
			System.out.println("Escolha um id para demitir");
			int id = sc.nextInt();
			if (id < 1) {
				en[id].demitir();
				System.out.println(en[id].mostras());
				v = false;
			} else
				System.out.println("O ID que vc coloco não costa na lista");
		}
	}
}
