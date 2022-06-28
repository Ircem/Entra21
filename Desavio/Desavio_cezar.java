import java.util.Scanner;

public class Desavio_cezar {
	public static String encriptar(String texto) {
		StringBuilder textoCifrado = new StringBuilder();
		int tamanhoTexto = texto.length();

		for (int i = 0; i < tamanhoTexto; i++) {
			
			int CifradaASCII = ((int) texto.charAt(i)) + 3;

			while (CifradaASCII >= 90 &&  CifradaASCII < 65) {
				CifradaASCII -= 25;
			}

			textoCifrado.append((char) CifradaASCII);
		}

		return textoCifrado.toString();
	}

	public static String decriptar(String textoCifrado) {
		StringBuilder texto = new StringBuilder();
		int tamanhoTexto = textoCifrado.length();

		for (int i = 0; i < tamanhoTexto; i++) {
			int letraDecifradaASCII = ((int) textoCifrado.charAt(i)) - 3;

			while (letraDecifradaASCII <= 65 && letraDecifradaASCII >= 90) {
				letraDecifradaASCII += 25;
			}

			texto.append((char) letraDecifradaASCII);
		}

		return texto.toString();
	}

}
