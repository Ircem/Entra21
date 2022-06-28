package Excercicio_doNada;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_06 {
public static void main(String[] args) {
	ArrayList<String> lista = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	lista.add("leo");
	lista.add("yuri");
	lista.add("pedro");
	lista.add("martheus");
	lista.add("louva deus");
	lista.add("bistaca");
	for(String x: lista) {
		String nome = sc.next();
		if(nome.equalsIgnoreCase(x)) {
			System.out.println("lista nome " + x + "\nnome digitado: " + nome);
		}
	}
}
}
