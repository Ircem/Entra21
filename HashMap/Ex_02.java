package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> id = new HashMap<Integer, String>();
		boolean verd = true;
		int rodados = 0;
		double salario[] = new double[100];
		while (verd) {
			System.out.println("1- entra com um funcionario \n2-alterar funcionario \n3-sair");
			int opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("Quantos vuncionarios você que acresentar");
				int entrada_vup = sc.nextInt();
				entrada_vup += rodados;
				for (int i = 0; i < entrada_vup; i++) {
					rodados++;
					System.out.println("Nome do vuncionario" + " ID " + rodados);
					String nome = sc.next();
					id.put(rodados, nome);
					System.out.println("Salario do " + nome);
					salario[rodados] = sc.nextDouble();
				}

			}
			if (opcao == 2) {				
				System.out.println(id);
				System.out.println("Escolhas um dos id para alterar o nome");
				int troca = sc.nextInt();
				System.out.println("Voce vai alterar o " + id.get(troca) + " Qual o novo nome");
				String nome = sc.next();
				System.out.println("Qual o salario");
				salario[troca] = sc.nextDouble();
				id.replace(troca, nome);
			}
			if(opcao == 3) {
				verd = false;
			}
		}

	}
}
