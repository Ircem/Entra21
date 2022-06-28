package DATA;

import java.time.LocalDate;

public class Aluno extends Pessoa{
private int ano;
private LocalDate data_formacao;
public Aluno(String nome, String id, LocalDate datanacimento, LocalDate dataincreso, int ano, LocalDate data_formacao) {
	super(nome, id, datanacimento, dataincreso);
	setAno(ano);
	setData_formacao(data_formacao);
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public LocalDate getData_formacao() {
	return data_formacao;
}
public void setData_formacao(LocalDate data_formacao) {
	this.data_formacao = data_formacao;
}
public  String anulo(int num,LocalDate data) {
	LocalDate date = LocalDate.now();
	if(date.compareTo(data) > 18) {
		sair();
		return "Sua formatura foi aprovada e sera " + getData_formacao() ;
		
	}
		return "Voce é menor de idade e não pode se formar ainda";
	
}
public void sair() {
	setAno(0);
}
}
