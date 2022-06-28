package Heranção;

public class calculo_circulo_cilindro {
public static void main(String[] args) {
	cilindro calculo = new cilindro();
	calculo.setCor("verde");
	calculo.setRaio(30);
	calculo.setAltura(10);
	System.out.println("calculo " + (calculo.getRaio() + calculo.getAltura()));
}
}
