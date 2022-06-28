package Excecoes;

import java.time.LocalDate;
import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ano");
		int ano = sc.nextInt();
		String year = Integer.toString(ano);
		if (year.length() < 4 || year.length() > 4) {
			throw new IllegalAccessError("O Ano de " + ano + " é invalido");
		}
		System.out.println("mes");
		int mes = sc.nextInt();
		if (mes < 0 || mes > 12) {
			throw new IllegalAccessError("O mes " + mes + " é invalido");
		}
		System.out.println("dia");
		int dia = sc.nextInt();
		if (dia > 30 || dia < 0 || dia > 29 && mes == 04) {
			throw new IllegalAccessError("Data invalida");

		}
		LocalDate dataDate = LocalDate.of(ano, mes, dia);
		System.out.println(dataDate);
	}
}
