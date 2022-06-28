package DATA;

import java.time.LocalDate;
import java.util.Scanner;

public class Endereço extends Pessoa{
	Scanner sc = new Scanner(System.in);
	String rua;
	String numero_casa;
	String cep;
	
	

	public Endereço(String nome, String id, LocalDate datanacimento, LocalDate dataincreso, Scanner sc, String rua,
			String numero_casa, String cep) {
		super(nome, id, datanacimento, dataincreso);
		this.sc = sc;
		this.rua = rua;
		this.numero_casa = numero_casa;
		this.cep = cep;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getNumero_casa() {
		return numero_casa;
	}



	public void setNumero_casa(String numero_casa) {
		this.numero_casa = numero_casa;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}

	public String volta() {
		return "Rua: " + getRua() + " Numero: " + getNumero_casa() + " CEP: " + getCep();
	}

	public void ende() {
		String n = "\n";
		System.out.println("Rua");
		 setRua(sc.next());
		 System.out.println("Numero da Residencia");
		 setNumero_casa(sc.next());
		 System.out.println("CEP");
		 setCep(sc.next());
		
}
}