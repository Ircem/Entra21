package EMUN;

public enum SISTEMA_SOLAR {
	Mercúrio(1) , Vênus(2), Terra(3), Marte(4), Júpiter(5), Saturno(6), Urano(7), Netuno(8);
	
	final int num;

	private SISTEMA_SOLAR(int num) {
		this.num = num;
	}
	
}
