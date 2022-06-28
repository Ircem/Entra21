
public class Alteradon_eteste {
	private String nome;
	private double salario;
	private double entrada = 0;

	public Alteradon_eteste(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}

	public String saquear(double saque) {
		if(saque > this.salario) {
			return saque + " não consta na conta";
		}
	else if(getSalario() > 0 && getNome().equalsIgnoreCase("leonardo")) {
			setSalario(saque);
			return ("voce sacou " + saque + " da sua conta e soubrou " + salario);
		}
		return "cabo dinheiro";
	}

	public String Deposito(double valor) {
		if (nome.equalsIgnoreCase("leonardo")) {
			this.salario += valor;
			return ("valor depositado com sucesso");
		} else
			return ("O nome de usuario não conta no cadastro");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (this.salario < 0) {
			this.salario = 0;
		} else if (this.salario > salario) {
			this.salario -= salario;

		}

	}
}
