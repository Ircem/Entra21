package Heranção;

import java.util.HashMap;
import java.util.Scanner;

public class Anulos_intervace {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = sc.next();
		System.out.println("Idade");
		int idade = sc.nextInt();

		System.out.println("Ano de entrada no ensino medio ");
		Aulono_ensino_medio a1 = new Aulono_ensino_medio(sc.nextInt());
		System.out.println("Increção por \n(V)estibular\n(E)nem\n(S)seletivo especial"
				+ "\n(T)rasferenci externa\nTrasferencia (I)nterna");
		char entra = sc.next().charAt(0);
		entra = Character.toUpperCase(entra);
		if (entra == 'V' || entra == 'E' || entra == 'S' || entra == 'T' || entra == 'I')
			System.out.println("Curso que ira fazer");
		String curso = sc.next();
		Anulo_furb af1 = new Anulo_furb(entra, curso);
		a1.setNome(nome);
		a1.setIdade(idade);
		System.out.println("Nome: " + a1.getNome() + " Idede: " + a1.getIdade() + "\nAno de termino do ensino medio "
				+ a1.getAno() + "\nentrou na furb por " + af1.getIngrecao() + "\nCurso: " + af1.getCurso());
	}
}
