package Alula_construtor;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza_v zz = new Pizza_v("Polenteza", 40.9, 89.99);
		Pizza_v zzi = new Pizza_v("Tubaleza", 60.1, 65.9);
		Pizza_v zop = new Pizza_v("Pedoreira", 90.99, 200.31);
		System.out.println("Qual pizza vc quer Polenteza \nTubaleza \nPedoreira");
		if(zz.getPreco() <= zzi.getPreco() && zz.getPreco() <= zop.getPreco()) {
			System.out.println("A pizza mais barata � " + zz.getNome() + "\nDiametro: " + zz.getDiametro() + "\nPre�o: " + 
				zz.getPreco());
		}
		if(zzi.getPreco() <= zz.getPreco() && zzi.getPreco() <= zop.getPreco()) {
			System.out.println("A pizza mais barata � " + zzi.getNome() + "\nDiametro: " + zzi.getDiametro() + "\nPre�o: " +
					zzi.getPreco());
		}
		if(zop.getPreco() <= zzi.getPreco() && zop.getPreco() <= zz.getPreco()) {
			System.out.println("A pizza mais barata � " + zop.getNome() + "\nDiametro: " + zop.getDiametro() + "\nPre�o: " +
					zop.getPreco());
		}
		String escolhe = sc.next();
		System.out.println(zz.escolha_sabor(escolhe));		
		
		
	}
}
