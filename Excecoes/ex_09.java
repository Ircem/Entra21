package Excecoes;

import java.awt.geom.Area;

public class ex_09 {
public static void main(String[] args) {
	int perimetro = 0;
	int Are = 0;
	try {
	int altira = 9;
	int largura = 50;
	 Are = altira * largura;
	perimetro = largura * 4;
	}catch (ArithmeticException e) {
		System.out.println("olha o erro");
	}
	System.out.println("Area: " + Are +"\nPerimetro " + perimetro);
}
}
