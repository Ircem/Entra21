import java.util.Scanner;

public class Classes_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Classes_02v nome = new Classes_02v();
	System.out.println("Nome ");
	nome.nome = sc.next();
	System.out.println("Sexo");
	nome.indade = sc.next().charAt(0);
	System.out.println("Idade");
	nome.indade = sc.nextInt();
}
}
