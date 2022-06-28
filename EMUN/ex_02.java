package EMUN;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		LocalDate dat = LocalDate.now();
		Constante com = new Constante();
		int mes = 0;
		int dia = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ano");
		int ano = sc.nextInt();
		com.Ano(ano);
		boolean j = true;
		while (j) {
			System.out.println("Mes");
			mes = sc.nextInt();
			if (mes <= 12 & mes > 0) {
				j = false;

			} else {
				System.out.println("Mes Invalido");
			}
		}
		if (com.isBi() == true && mes == 4) {
			Boolean v = true;
			while (v) {
				System.out.println("Dia Bisesto");
				 dia = sc.nextInt();
				if (dia <= 29 && dia > 0) {
					v = false;

				} else {
					System.out.println("Dia Invalido");
				}
			}

		}
		if (com.isBi() == false) {
			System.out.println("Dia");
			boolean p = true;
			while (p) {
				 dia = sc.nextInt();
				if (dia <= 31 && dia > 0) {
					p = false;
				} else {
					System.out.println("Dia Invalido");
				}
			}
		}
		try {
			dat = LocalDate.of(ano, mes, dia);
		} catch (Exception e) {
			throw new IllegalAccessError("A data esta errada");
		}
		if(dat.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
			System.out.println(Diassemanas.QUINTA);
			System.out.println(Diassemanas.QUINTA.numero);
			}
		if(dat.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			System.out.println(Diassemanas.SEGUNDA);
			System.out.println(Diassemanas.SEGUNDA.numero);
			}
		if(dat.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println(Diassemanas.SEXTA);
			System.out.println(Diassemanas.SEXTA.numero);
			}
		if(dat.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
		System.out.println(Diassemanas.SABADO);
		System.out.println(Diassemanas.SABADO.numero);
		}
		if(dat.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println(Diassemanas.DOMINGO);
			System.out.println(Diassemanas.DOMINGO.numero);
		}
		if(dat.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
			System.out.println(Diassemanas.TERCA);
			System.out.println(Diassemanas.TERCA.numero);
		}
		if(dat.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
			System.out.println(Diassemanas.QUARTA);
			System.out.println(Diassemanas.QUARTA.numero);
		}
	}
}
