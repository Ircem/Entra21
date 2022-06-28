import java.util.Scanner;

public class Classes_04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Classes_04v raio = new Classes_04v();
	System.out.println("informe um raio 1 de 5 ");
	raio.raio1 = sc.nextInt();
	System.out.println("informe um raio 2 de 5 ");
	raio.raio2 = sc.nextInt();
	System.out.println("informe um raio 3 de 5 ");
	raio.raio3 = sc.nextInt();
	System.out.println("informe um raio 3 de 5 ");
	raio.raio3 = sc.nextInt();
	System.out.println("informe um raio 4 de 5 ");
	raio.raio4 = sc.nextInt();
	System.out.println("informe um raio 5 de 5 ");
	raio.raio5 = sc.nextInt();
	System.out.println("soma: "+  Math.PI + raio.soma);
	
	
}
}
