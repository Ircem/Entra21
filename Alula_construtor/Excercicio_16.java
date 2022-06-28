import java.util.Scanner;

public class Excercicio_16 {
	public static void letras(String leia) {
		if(leia.length() % 2 == 0) {
			System.out.println(leia.charAt(0));
		}else
			System.out.println(leia.charAt(1));
	}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String palafra = input.next();
	letras(palafra);
	
}
}
