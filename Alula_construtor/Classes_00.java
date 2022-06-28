
public class Classes_00 {
int nvmaca;
int pvmaca;
int nvlaranja;
int pvlaranja;
int lucro = pvmaca + pvlaranja;
int lucro_maca = nvmaca * pvmaca;
int lucro_laranja = nvlaranja *  pvlaranja;
public String Max_venda_maca(int num1,int num2, int num3) {
	if (num1 > num2 && num1 > num3) {
		return "Blumenau teve " + num1;
	} else if (num2 > num1 && num2 > num3) {
		return "Florialopolis teve " + num2;
	} else if (num3 > num1 && num3 > num2) {
		return "joinvile teve " + num3;
	}else
		return "tudo igual";
}
	public String Menor_venda(int num1,int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			return "Blumenau teve " + num1;
		} else if (num2 < num1 && num2 < num3) {
			return "Florialopolis teve " + num2;
		} else if (num3 < num1 && num3 < num2) {
			return "joinvile teve " + num3;
		}else
			return "tudo igual";
		
}
}

