
public class Renda_v {
	String nome[] = new String[5];
	int cpf[] = new int[5];
	String uf[] = new String[5];
	double renda_anual[] = new double[5];
	double paga_renda[] = new double[5];
	public double Renda(double ren) {
		double pagar_imposto;
		if (ren > 0 && ren < 4.000) {
			return pagar_imposto = ren * 0 / 100;
		} else if (ren > 4.001 && ren < 9.000) {
			return pagar_imposto = ren * 5.8 / 100;
		} else if (ren > 9.001 && ren < 25.000) {
			return pagar_imposto = ren * 15 / 100;
		} else if (ren > 25.001 && ren < 35.000) {
			return pagar_imposto = ren * 27.5 / 100;
		} else
			return pagar_imposto = ren * 30 / 100;
		
	}
}	
		
	
	

