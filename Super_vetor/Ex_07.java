package Super_vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_07 {
public static void main(String[] args) {
	ArrayList<Integer> lista = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int valor = 0;
	boolean v = true;
	while(v) {
	System.out.println("entre com o valor de 1 a 100");
	valor = sc.nextInt();
	if(valor <= 100) {
		v = false;
	}else
		System.err.println(valor + " acima de 100");
	}
	for (int i = 0; i < 101; i++) {
		lista.add(i + 1);
		if(valor == lista.get(i)) {
		System.out.println("seu valor de entrada esta na posição " + i);
		}
	}
}
}
