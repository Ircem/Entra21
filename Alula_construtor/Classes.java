import java.util.Scanner;

public class Classes {
	public static void main(String[] args) {
Classes_00 num = new Classes_00();
Scanner input = new Scanner(System.in);
	num.numero_01 = input.nextInt();
	num.numero_02 = input.nextInt();
	num.numero_03 = input.nextInt();
	System.out.println( "soma " + (num.soma += (num.numero_01 + num.numero_02) * num.numero_03));
	System.out.println(num.soma);
	}
}
