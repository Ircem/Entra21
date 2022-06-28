package EMUN;


public enum Diassemanas {
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);	
	final int numero;

	private Diassemanas(int numero) {
		this.numero = numero;
		/*}
		 * usado para printa de maneira facil vetor Areilist 
		for(SISTEMA_SOLAR sis: SISTEMA_SOLAR.values()) {
			System.out.println(sis);
		}*/
	}
}

