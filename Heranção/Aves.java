package Heranção;

import java.util.Scanner;

public class Aves extends Zoologico_pai {
	private String cor_pena;
	private String alimento;

	public Aves(String raca, String identificacao, String porte, String habitat, String pais_origem, String cor_pena,
			String alimento) {
		super(raca, identificacao, porte, habitat, pais_origem);
		setCor_pena(cor_pena);
		setAlimento(alimento);
	}

	public String getCor_pena() {
		return cor_pena;
	}

	public void setCor_pena(String cor_pena) {
		this.cor_pena = cor_pena;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void completa() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Raca: ");
		setRaca(sc.next());
		System.out.println("identificação: ");
		setIdentificacao(sc.next());
		System.out.println("Porte(pequno, medio, grande");
		setPorte(sc.next());
		System.out.println("Habitac");
		setHabitat(sc.next());
		System.out.println("pais de origem");
		setPais_origem(sc.next());
		System.out.println("Cor das penas");
		setCor_pena(sc.next());
		System.out.println("Aliemento");
		setAlimento(sc.next());
	}

	public String Mostra() {
		return "Raça: " + getRaca() + "\nIdentificação: " + getIdentificacao() + "\nPorte: " + getPorte()
				+ "\nHabitat: " + getHabitat() + "\nPais de Origem: " + getPais_origem() + "\nPenas cor: "
				+ getCor_pena() + "\nAlimento: " + getAlimento();
	}
}
