import java.util.Scanner;

public class Matarial_construção {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Material_variavel in = new Material_variavel();
		Material_variavel at = new Material_variavel();
		Material_variavel ot = new Material_variavel();
		
		in.entra();
		at.entra();
		ot.entra();
	
		if(in.getPreco() >= at.getPreco() && in.getPreco() >= ot.getPreco()) {
			System.out.println(in.getNome() + " é o produto mais carro");
				}else if(at.getPreco() >= in.getPreco() && at.getPreco() >= ot.getPreco()) {
					System.out.println(at.getNome() + " é o produto mais carro");
						}else if(ot.getPreco() >= at.getPreco() && ot.getPreco() >= in.getPreco()) {
							System.out.println(ot.getNome() + " é o produto mais carro");
								}else
									System.out.println("Tudos os preços Igual");
		
		if(in.getPeso() <= at.getPeso() && in.getPeso() <= ot.getPeso()) {
			System.out.println(in.getNome() + " é o produto com menor pesso");
				}else if(at.getPeso() <= in.getPeso() && at.getPeso() <= ot.getPeso()) {
					System.out.println(at.getNome() + " é o produto com menor pesso");
						}else if(ot.getPeso() <= in.getPeso() && ot.getPeso() <= at.getPeso()) {
							System.out.println(ot.getNome() + " é o produto com menor pesso");
								}else
									System.out.println("Tudo Igual");
	}
}
