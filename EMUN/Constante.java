package EMUN;


public class Constante {
	private int dias;
	private int ano;
	private boolean bi;
	
	public void Ano(int ano) {
		this.setAno(ano);
	}
	private void setBissexto() {
		if (this.getAno() % 4 == 0
				&& (this.getAno() % 400 == 0 || this.getAno() % 100 != 0)) {
			this.setDias(366);			
			this.setBi(true);
		} else {
			this.setBi(false);
			this.setDias(365);
		}
	}

	
	private void setDias(int dias) {
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setAno(int ano) {
		this.ano = ano;
		
		this.setBissexto();
	}

	public int getAno() {
		return ano;
	}

	
	private void setBi(boolean bi) {
		this.bi = bi;
	}

	public boolean isBi() {
		return bi;
	}

}
