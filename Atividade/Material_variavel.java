import java.util.Scanner;

public class Material_variavel {
	private String nome;
	private String descricao;
	private double preco;
	private double peso;
	private String estoque;
	
	
	public String entra(){		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do produto");
		String nome = sc.next();
		setNome(nome);
		System.out.println("Descrição do produto");
		String des = sc.next();
		setDescricao(des);
		System.out.println("preco do produto");
		double preco = sc.nextDouble();
		setPreco(preco);
		System.out.println("peso do produto");
		double peso = sc.nextDouble();
		setPeso(peso);
		
		return "Dados cadastrados com sucesso";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null) {
			this.nome = "ERRO";
		}else
			this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao == null) {
			this.descricao ="Erro";
		}
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco == 0) {
			this.preco = 0;
		} else
			this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso == 0) {
			this.peso = 0;
		} else
			this.peso = peso;
	}

	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		if (estoque == null) {
			this.estoque = "ERRO";
		} else
			this.estoque = estoque;
	}

	

	}


