package Heranção;

import java.util.Scanner;

public class cachorro_tes {
public static void main(String[] args) {
	cachoro ai = new cachoro();
	Scanner sc = new Scanner(System.in);
	System.out.println("race do cachorro");
	ai.setEspeci("cachorro");
	ai.setRace(sc.next());
	System.out.println("Estimação Y ou N");
	char letra = sc.next().charAt(0);
	if( letra == 'Y') {
		ai.setEstimacao(true);
	}else
		ai.setEstimacao(false);
	System.out.println("Pesso ao cachorro");
	ai.setPeso(sc.nextInt());
	System.out.println(ai.getEspeci() + " - " + ai.getRace() + "\ndomestico -" + ai.isEstimacao()+
			"\nPeso - " + ai.getPeso());
}
}
