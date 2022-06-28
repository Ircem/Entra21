
public class Costrutor0 {
	int altura;
	int largura;

	public Costrutor0(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}
	public int area(){
		return altura * largura;
	}
	public int perimetro() {
		return 2 * (altura + largura);
	}

}
