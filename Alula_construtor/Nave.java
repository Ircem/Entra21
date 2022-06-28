import java.util.Iterator;
import java.util.Scanner;

public class Nave {
	public static void main(String[] args) {
		
		Nave_dados en = new Nave_dados();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i != 4; i++) {
			System.out.println("Numero de passageiro da " + i + " aeronave");
			en.n_passageiros[i] = sc.nextInt();
			System.out.println("Velocidade maxima da " + i + " aeronave");
			en.v_max[i] = sc.nextDouble();
			System.out.println("Maximo de combustivel da " + i + " aeronave");
			en.max_com[i] = sc.nextDouble();
			System.out.println("Queima de combustivel da " + i + " aeronave");
			en.queima_com[i] = sc.nextDouble();
			en.max_percore_com[i] = en.max_com[i] /  en.queima_com[i];
		}
		for (int i = 0; i != 4; i++) {
			if (en.max_com[i] >= en.max_com[3] && en.max_com[i] >= en.max_com[2] && en.max_com[i] >= en.max_com[1]
					&& en.max_com[i] >= en.max_com[0]) {
				System.out.println("A " + i + " pode voar por mais tempo");
			}
			if (en.n_passageiros[i] >= en.n_passageiros[3] && en.n_passageiros[i] >= en.n_passageiros[2]
					&& en.n_passageiros[i] >= en.n_passageiros[1] && en.n_passageiros[i] >= en.n_passageiros[0]) {
				System.out.println("A " + i + " pode levar mais passageiro");
				}if (en.max_percore_com[i] >= en.max_percore_com[3] && en.max_percore_com[i] >= en.max_percore_com[2]
						&& en.max_percore_com[i] >= en.max_percore_com[1] && en.max_percore_com[i] >= en.max_percore_com[0]) {
					System.out.println("o avião " + i + " pode voar por mais tempo");
				}
				
			}
		}
}
