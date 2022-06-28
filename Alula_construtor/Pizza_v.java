package Alula_construtor;

import java.util.Scanner;

public class Pizza_v {
	private String nome;
	private double diametro;
	String sabor;

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		if (sabor == null) {
			this.sabor = "";
		} else
			this.sabor += "\n" + sabor;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank()) {
			this.nome = "ERRO";
		} else
			this.nome = nome;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		if (diametro == 0) {
			this.diametro = 0;
		} else
			this.diametro = diametro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco == 0) {
			this.preco = 0;
		} else
			this.preco = preco;
	}

	private double preco;

	public Pizza_v(String nome, double diametro, double preco) {
		super();
		this.nome = nome;
		this.diametro = diametro;
		this.preco = preco;
	}

	public String escolha_sabor(String escolha) {
		char letra;
		Scanner sc = new Scanner(System.in);
		if (escolha.equalsIgnoreCase("Polenteza")) {
			System.out.println("Os sabores são Peperone\nPepino\nOvos");
			System.out.println("gostaria de trocar algum sabor S ou N");
			letra = sc.next().charAt(0);
			letra = Character.toUpperCase(letra);
			if (letra == 'S') {
				for (int i = 0; i < 3; i++) {
					System.out.println("escolha 3 saboras 1 por vez");
					System.out.println("Peperone" + "\nSuper queijo" + "\nPepino" + "\nOvos" + "\nBrilhos");
					escolha = sc.next();
					setSabor(escolha);
				}
			}
			return "Peperone sabor alterado para " + getSabor();
		}
		if (escolha.equalsIgnoreCase("Pedoreira")) {
			System.out.println("Os sabores são Brilhos\nSuper queijo\nPepino");
			System.out.println("gostaria de trocar algum sabor S ou N");
			letra = sc.next().charAt(0);
			letra = Character.toUpperCase(letra);
			if (letra == 'S') {
				 for (int i = 0; i < 3; i++) {
					System.out.println("escolha 3 saboras 1 por vez");
					System.out.println("Peperone" + "\nSuper queijo" + "\nPepino" + "\nOvos" + "\nBrilhos");
					escolha = sc.next();
					setSabor(escolha);
				}
				
			}
			return "Tubaleza sabor alterado para " + getSabor();
		}
		if (escolha.equalsIgnoreCase("Tubaleza")) {
			System.out.println("Depois do if");
			System.out.println("Os sabores são Peperone\nSuper queijo\nOvos");
			System.out.println("gostaria de trocar algum sabor S ou N");
			letra = sc.next().charAt(0);
			letra = Character.toUpperCase(letra);
				if (letra == 'N') {
					for (int i = 0; i < 3; i++) {
						System.out.println("escolha 3 saboras 1 por vez");
						System.out.println("Peperone" + "\nSuper queijo" + "\nPepino" + "\nOvos" + "\nBrilhos");
						escolha = sc.next();
						setSabor(escolha);
						break;
				}	
				
				
			}
			return "Tubaleza sabor alterado para " + getSabor();
		}
		return "Seu pedido não esta na lista";
	}

}
