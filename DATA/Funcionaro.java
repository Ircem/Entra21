package DATA;

import java.time.LocalDate;

public class Funcionaro extends Pessoa{
	private double cargahoraria;
	private double salario;
	
	public Funcionaro(String nome, String id, LocalDate datanacimento, LocalDate dataincreso, double cargahoraria,
			double salario) {
		super(nome, id, datanacimento, dataincreso);
		setCargahoraria(cargahoraria);;
		setSalario(salario);
	}

	public double getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(double cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentar_carga(int num) {
		double aumenta = getCargahoraria() * num/100;
		this.cargahoraria += aumenta;
	}
	public void demitir() {
		setId("Demitido");
		setSalario(0);
	}
	public String mostras() {
		return "ID: " + getId() + "\nNome: " + getNome() + "\nCarga horaria: " + getCargahoraria() +
				"\nSalario: " + getSalario(); 
	}
}
