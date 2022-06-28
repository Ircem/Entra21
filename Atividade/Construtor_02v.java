
public class Construtor_02v {
int n_anulos;
int professor;
int remover_anunos;
public Construtor_02v(int n_anulos, int professor, int remover_anunos) {
	super();
	setN_anulos(n_anulos);
	setProfessor(professor);
	setRemover_anunos(remover_anunos);
}
public int getN_anulos() {
	return n_anulos;
}
public void setN_anulos(int n_anulos) {
	if(n_anulos >= 40) {
		this.n_anulos = 40;		
	}else
		this.n_anulos = n_anulos;
}
public int getProfessor() {
	return professor;
}
public void setProfessor(int professor) {
	if(professor == 0) {
		this.n_anulos = 0;
	}else
		this.professor = professor;
}
public int getRemover_anunos() {
	return remover_anunos;
}
public void setRemover_anunos(int remover_anunos) {
	if(n_anulos == 0) {
		this.remover_anunos = 0;
	}else
		this.n_anulos -= remover_anunos;
}
}
