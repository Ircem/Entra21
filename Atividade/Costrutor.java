import java.util.Scanner;

public class Costrutor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("diga a altura do retangulo");
	int are = sc.nextInt();
	System.out.println("diga a largura do retangulo");
	int peri = sc.nextInt();
	Costrutor0 area = new Costrutor0(are, peri);
	are = area.area();
	peri = area.perimetro();
	System.out.println("Area do Retangulo é " + are + "\n O perimetro é " + peri);

	
	}
}



