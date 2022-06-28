package Excercicio_doNada;

import java.text.DecimalFormat;

public class Corta_tempo03 {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	public String Celsius(double entrada, char entra) {
		if (entra == 'F') {
			System.out.println("Celsius para Fahrenheit");
			double soma = (entrada - 32) * 0.55;
			
			return "Fahrenheit: " + new DecimalFormat("#,##0.00").format(soma); 
		} else if (entra == 'K') {
			System.out.println("Celsius para Kelvin");
			double soma = entrada + 273.15;
			return "Fahrenheit: " + new DecimalFormat("#,##0.00").format(soma);
		} else;
		return "ERRO";
	}
	public String Kelvin(double entrada, char entra) {
		if (entra == 'F') {
			System.out.println("Kelvin para Fahrenheit");
			double soma = (entrada - 273.15) * 1.8 + 32;
			return "Fahrenheit: " + new DecimalFormat("#,##0.00").format(soma);
		} else if (entra == 'C') {
			System.out.println("kelvin para Celsius");
			double soma = entrada - 273.15;
			return "Celsius: " + new DecimalFormat("#,##0.00").format(soma);
		} else;
		return "ERRO";
	}
	public String Fahrenheit(double entrada, char entra) {
		if (entra == 'K') {
			System.out.println("Fahrenheit para Kelvin ");
			double soma = (entrada - 32) * 0.55 + 273.15;
			return "Fahrenheit: " + new DecimalFormat("#,##0.00").format(soma);
		} else if (entra == 'C') {
			System.out.println("Fahrenheit para Celsius");
			double soma = (entrada - 32) * 0.55 ;
			return "Celsius: " + new DecimalFormat("#,##0.00").format(soma);
		} else;
		return "ERRO";
	}
	public String Quilos(double entrada, char entra) {
		if(entra == 'L') {
			double soma = entrada * 2.205;
			return "Libras " + soma;
		}else if(entra == 'O' ) {
			double soma = entrada * 35.274;
			return "Onças " + soma;
		}
		return "Erro";
	}
	public String Libras(double entrada, char entra) {
		if(entra == 'Q') {
			double soma = entrada / 2.205;
			return "Quilos " + soma;
		}else if(entra == 'O' ) {
			double soma = entrada * 16;
			return "Onças " + soma;
		}
		return "Erro";
	}
	public String Oncas(double entrada, char entra) {
		if(entra == 'Q') {
			double soma = entrada / 35.274;
			return "Quilos " + soma;
		}else if(entra == 'L' ) {
			double soma = entrada / 16;
			return "Onças " + soma;
		}
		return "Erro";
	}
}
