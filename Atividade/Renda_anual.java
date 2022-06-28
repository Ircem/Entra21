import java.util.Scanner;

public class Renda_anual {
	
	public static void main(String[] args) {
		double total = 0;
		Scanner sc = new Scanner(System.in);
		Renda_v renda = new Renda_v();
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome completo: ");
			renda.nome[i] = sc.next();
			System.out.println("Digite seu CPF");
			renda.cpf[i] = sc.nextInt();				
			System.out.println("Seu estado");
			renda.uf[i] = sc.next();
			System.out.println("Diga sua renda");
			renda.renda_anual[i] = sc.nextDouble();
			renda.paga_renda[i] = renda.Renda(renda.renda_anual[i]);
			total += renda.paga_renda[i];
		}
		for (int i = 0; i < 5; i++) {
			if(renda.paga_renda[i] >= renda.paga_renda[4] && renda.paga_renda[i] >= renda.paga_renda[3]
					&& renda.paga_renda[i] >= renda.paga_renda[2] && renda.paga_renda[i] >= renda.paga_renda[1]
						&&	renda.paga_renda[i] >= renda.paga_renda[0]) {
				System.out.println("A " + renda.nome[i] + " vai pagar mais impostos");
				continue;
			}		
			if(renda.paga_renda[i] <= renda.paga_renda[4] && renda.paga_renda[i] <= renda.paga_renda[3]
				&& renda.paga_renda[i] <= renda.paga_renda[2] && renda.paga_renda[i] <= renda.paga_renda[1]
				&&	renda.paga_renda[i] <= renda.paga_renda[0]) {
				System.out.println("A " + renda.nome[i] + " vai pagar mais impostos");
		
			}
			
		}
		System.out.println("o total de imposto pago pelos 5 é de " + total);
		}
	}

