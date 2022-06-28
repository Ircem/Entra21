package Excecoes;

import java.util.Scanner;

public class ex_16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	metodo_16_cachoro cao[] = new metodo_16_cachoro[5];
	metodo_16_gato gato[] = new metodo_16_gato[5];
	metodo_16_ave ave[] = new metodo_16_ave[5];
	boolean v = true;
	int c = 0;
	int g = 0;
	int a = 0;
	System.out.println("nome dono: ");
	String nome_dono = sc.next();
	System.out.println("CPF:");
	String cpf = sc.next();
	System.out.println("cep");
	int cep = sc.nextInt();
	System.out.println("N-casa");
	int casaN = sc.nextInt();
	metodo_16_dono dono = new metodo_16_dono(nome_dono, cpf, new metodo_16_endereco(cep, casaN));
	while(v) {
		System.out.println("Registro de animais (C)achoro\n(G)ato\n(A)ve\n(S)air");
		char opca = sc.next().charAt(0);
		opca = Character.toUpperCase(opca); 
		if(opca == 'S') {
			v = false;
			break;
		}
		System.out.println("nome do pet");
		String nome_pet = sc.next();
		System.out.println("Peso do pet");
		double peso_pet = sc.nextDouble();
		System.out.println("Porte \nPequeno \nMedio \n Grande");
		String porte_pet = sc.next();
		if(opca == 'C') {			
				System.out.println("Pelagem do cachoro \nBranco \nPreto");
				String pelo = sc.next();
				cao[c] = new metodo_16_cachoro(nome_pet, peso_pet, porte_pet, pelo);
				c++;
			
			}else if(opca == 'G') {
				System.out.println("Pelo gato \nPreto \nMarrom");
				String pelo = sc.next();
				gato[g] = new metodo_16_gato(nome_pet, peso_pet, porte_pet, pelo);
				g++;
			}else if(opca == 'A') {
				System.out.println("Cor das penas da ave");
				String cor = sc.next();
				String id = "Av: ";
				System.out.println("Id do IBMA");
				id += sc.next();
				ave[a] = new metodo_16_ave(nome_pet, peso_pet, porte_pet, cor, id);
				a++;
			}
			
		}
	}
}

