import java.util.Scanner;

public class Excecicio_10 {
public static void descremento(int num) {
	int amis = num;
	for(int i = 1; i != 21; i++ ){
		amis++;
		System.out.println(" inicio " + num   + " contagem " + i + " apos " + amis);
		
		
	}
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("coloque um numero");
		int numero = input.nextInt();
		descremento(numero);
	}

}
