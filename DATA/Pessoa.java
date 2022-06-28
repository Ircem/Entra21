package DATA;

import java.time.LocalDate;
import java.util.Scanner;

public class Pessoa{
	Scanner sc = new Scanner(System.in);
private String nome;
private String id;
private String endereco;
private LocalDate datanacimento;
private LocalDate dataincreso;
public Pessoa(String nome, String id, LocalDate datanacimento, LocalDate dataincreso) {
	setNome(nome);
	setId(id);
	setDatanacimento(datanacimento);
	setDataincreso(dataincreso);
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public LocalDate getDatanacimento() {
	return datanacimento;
}
public void setDatanacimento(LocalDate datanacimento) {
	this.datanacimento = datanacimento;
}
public LocalDate getDataincreso() {
	return dataincreso;
}
public void setDataincreso(LocalDate dataincreso) {
	this.dataincreso = dataincreso;
}
public void endereco() {
	String n = "\n";
	System.out.println("Rua");
	 n += sc.next();
	 System.out.println("Numero da Residencia");
	 n += " " + sc.next();
	 System.out.println("CEP");
	 n += " " + sc.next();
	 this.endereco = n;
}
}

