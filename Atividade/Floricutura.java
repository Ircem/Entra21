import java.util.Scanner;

public class Floricutura {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Floricutura_v Com[] = new Floricutura_v[4];
		Com[0] = new Floricutura_v("", 0.0, "", "", "");
		Com[1] = new Floricutura_v("", 0.0, "", "", "");
		Com[2] = new Floricutura_v("", 0.0, "", "", "");
		Com[3] = new Floricutura_v("", 0.0, "", "", "");

		for (int i = 0; i < 4; i++) {
			System.out.println("Nome da flor:");
			String nome_flor = sc.next();
			Com[i].setNome_Flor(nome_flor);
			System.out.println("Preço da flor");
			double preco = sc.nextDouble();
			Com[i].setPreco_Flor(preco);
			System.out.println("Nome do comprador");
			nome_flor = sc.next();
			Com[i].setNome_Cliente(nome_flor);
			System.out.println("Para presente Y ou N");
			char presente = sc.next().charAt(0);
			presente = Character.toUpperCase(presente);
			if (presente == 'Y') {
				Com[i].setFlor_Presente("YES");
			} else
				Com[i].setFlor_Presente("NOT");
		}
		for (int i = 0; i < 4; i++) {

			if (Com[i].getPreco_Flor() >= Com[3].getPreco_Flor() && Com[i].getPreco_Flor() >= Com[2].getPreco_Flor()
					&& Com[i].getPreco_Flor() >= Com[1].getPreco_Flor()
					&& Com[i].getPreco_Flor() >= Com[0].getPreco_Flor()) {
				System.out.println("Compro a flor mais cara  " + Com[i].getNome_Cliente());
				System.out.println("A flor mais cara é " + Com[i].getNome_Flor());
			}
		}
	}
}
