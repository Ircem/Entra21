import java.util.Scanner;

public class Construtor_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos anunos ir�o para o passeio");
		int anulos = sc.nextInt();
		System.out.println("quantos professor ir�o para o passeio");
		int professor = sc.nextInt();
		System.out.println("quer remover alunos");
		int retira_anuno = sc.nextInt();
		if(retira_anuno == 1) {
			System.out.println("quantos vc quer retirar");
			retira_anuno = sc.nextInt();
		}else
			retira_anuno = 0;
		Construtor_02v anunos = new Construtor_02v(anulos, professor, retira_anuno);
		System.out.println("v�o cerca de " + anunos.getN_anulos() +
				"\n e vao cerca de " + anunos.getProfessor() + " Professor\n� vc retirou cerca de "  + anunos.getRemover_anunos() + " anunos");
	}
}
