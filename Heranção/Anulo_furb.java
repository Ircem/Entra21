package Heranção;

public class Anulo_furb extends Anulo {
private char ingrecao;
private String curso;
public Anulo_furb(char ingrecao, String curso) {	
	setIngrecao(ingrecao); 
	setCurso(curso);
}
public char getIngrecao() {
	return ingrecao;
}
public void setIngrecao(char ingrecao) {	
	
	this.ingrecao = ingrecao;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	if(curso == null) {
		this.curso = null;
	}else
		this.curso = curso;
}

}
