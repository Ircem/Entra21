
public class Floricutura_v {
private String Nome_Flor;
private double Preco_Flor;
private String Nome_Cliente;
private String Compra_Flor;
private String Flor_Presente;


public Floricutura_v(String nome_Flor, double preco_Flor, String nome_Cliente, String compra_Flor,
	String flor_Presente) {
	setNome_Flor(nome_Flor);
	setPreco_Flor(preco_Flor);
	setNome_Cliente(nome_Cliente);
	setCompra_Flor(compra_Flor);
	setFlor_Presente(flor_Presente);
	
	
}


public String getNome_Flor() {
	return Nome_Flor;
}


public void setNome_Flor(String nome_Flor) {
	Nome_Flor = nome_Flor;
}


public double getPreco_Flor() {
	return Preco_Flor;
}


public void setPreco_Flor(double preco_Flor) {
	Preco_Flor = preco_Flor;
}


public String getNome_Cliente() {
	return Nome_Cliente;
}


public void setNome_Cliente(String nome_Cliente) {
	Nome_Cliente = nome_Cliente;
}


public String getCompra_Flor() {
	return Compra_Flor;
}


public void setCompra_Flor(String compra_Flor) {
	Compra_Flor = compra_Flor;
}


public String getFlor_Presente() {
	return Flor_Presente;
}


public void setFlor_Presente(String flor_Presente) {
	Flor_Presente = flor_Presente;
}


}
