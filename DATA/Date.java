package DATA;

import java.time.LocalDate;
import java.util.Scanner;

public class Date {
public static void main(String[] args) {
LocalDate data1 = LocalDate.of(1918, 10, 11); // Criação de uma data especifica
LocalDate date2 = LocalDate.now(); // Criação da data de agora 

System.out.println("Henrique nasceu no dia " + data1);

System.out.println(data1.getDayOfMonth());
System.out.println(data1.getMonthValue());
//Retorna o dia do mes, também funciona para ano, mes e dia da semana

System.out.println(data1.isLeapYear());//true se for ano bissexto, false se não
System.out.println(data1.compareTo(date2));
}
}
