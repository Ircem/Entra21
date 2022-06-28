package DATA;

import java.time.LocalDate;
import java.util.Scanner;

public class Formatura {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Aluno an[] = new Aluno[2];
	for (int i = 0; i < an.length; i++) {
		System.out.println("Nome");
		String nome = sc.next();
		System.out.println("Data de nacimento");
		
		LocalDate date1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Data de entrada na escola ano/mes");
		int ano = sc.nextInt();
		LocalDate data2 = LocalDate.ofYearDay(ano, sc.nextInt());
		System.out.println("ano de formatura");
		LocalDate date_foratura = LocalDate.of(sc.nextInt(), 12, 5);
	an[i] = new Aluno(nome, Integer.toString(i), date1, data2, ano, date_foratura);
	}
	for (int i = 0; i < an.length; i++) {
		System.out.println(an[i].anulo(i, an[i].getDatanacimento()));
			
		}
	}
}

