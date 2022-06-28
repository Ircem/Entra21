import java.util.Scanner;

public class Excercicio_12 {
	public static void nome_wars(String nome, String sobrenome , String mae_sobrenome , String cidade) {
		System.out.println("Seu nome na serie wars " + sobrenome.charAt(0) + nome.charAt(0) + nome.charAt(1)
		 + " " + sobrenome.charAt(1) + nome.charAt(0) + nome.charAt(1) + " " +
				sobrenome.charAt(2) + nome.charAt(0) + nome.charAt(1) + " " + mae_sobrenome.charAt(0) + 
				cidade.charAt(0) + cidade.charAt(1) + cidade.charAt(2) + mae_sobrenome.charAt(1) + 
				cidade.charAt(0) + cidade.charAt(1) + cidade.charAt(2) + mae_sobrenome.charAt(3) + 
						cidade.charAt(0) + cidade.charAt(1) + cidade.charAt(2));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Seu nome");
		String nome = input.next();
		System.out.println("Seu sobrenome");
		String sobrenome = input.next();
		System.out.println("sobrenome mae");
		String mae_sobrenome = input.next();
		System.out.println("Nome cidade");
		String cidade = input.next();
		nome_wars(nome, sobrenome, mae_sobrenome, cidade);
		
	}
}