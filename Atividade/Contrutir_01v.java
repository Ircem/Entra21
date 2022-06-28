
public class Contrutir_01v {
	String nome = "leonardo";
	double saldo = 100;

	public Contrutir_01v(String nome) {
		this.nome = nome;

	}

	public String sacar(double saque) {
		if (saldo <= 0) {
			return "sem saldo na conta";
		} else if (saldo > 0 && nome.equalsIgnoreCase("leonardo")) {
			saldo = saldo - saque;
			return "valor sacado com sucesso";
		} else
			return "voce Não tem permição para sacar";
	}

	public String depositar(double deposito) {
		saldo += deposito;
		return "saldo depositado com sucesso " + deposito;
	}
}
