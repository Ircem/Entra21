package EMUN;

import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		boolean v = true;
		Scanner sc = new Scanner(System.in);
		
			System.out.println(
					"escolha um entre os planetas para saber mais \nMercúrio\nVênus\nTerra\nMarte\nJúpiter\nSaturno\nUrano\nNetuno");
			String opc = sc.next();
			
			if (opc.equalsIgnoreCase("Mercurio")) {

				System.out.println("Planeta " + SISTEMA_SOLAR.Mercúrio + " Posição " + SISTEMA_SOLAR.Mercúrio.num);
				System.out.println(
						"o mais próximo do Sol e o menor entre os planetas do Sistema Solar. Ele não possui satélites,\ntampouco condições de vida, sendo especialmente marcado por suas altas temperaturas.\n A sua proximidade do Sol e a sua atmosfera incompleta condicionam suas temperaturas elevadíssimas.");
			} else if (opc.equalsIgnoreCase("Venus")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Terra + " Posição " + SISTEMA_SOLAR.Terra.num);
				System.out.println(
						"apresenta temperaturas ainda mais elevadas do que Mercúrio. Possui uma dimensão e também uma constituição muito próxima da Terra, sendo formado por diversos grupos de rochas.\n Ele é popularmente conhecido como Estrela D’alva em razão da sua luminosidade vista da Terra.");
			} else if (opc.equalsIgnoreCase("Terra")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Terra + " Posição " + SISTEMA_SOLAR.Terra.num);
				System.out.println(
						"é o único planeta que apresenta condições de vida entre os constituintes do Sistema Solar. A Terra realiza movimentos ao redor de si mesma,\n rotação, e em torno do Sol, translação. É um planeta rochoso,\n formado por diversos silicatos e basaltos, além de possuir atmosfera bem desenvolvida.");
			} else if (opc.equalsIgnoreCase("Marte")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Marte + " Posição " + SISTEMA_SOLAR.Marte.num);
				System.out.println(
						" o chamado Planeta Vermelho, composto por silicatos e basaltos, é um dos mais estudados pela astronomia terrestre. Apresenta condições climáticas adversas, sendo muito frio e seco. Há dois satélites artificias em Marte. O planeta,\n assim como a Terra, realiza movimentos de rotação e translação.");
			} else if (opc.equalsIgnoreCase("Jupiter")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Júpiter + " Posição " + SISTEMA_SOLAR.Júpiter.num);
				System.out.println(
						"o maior planeta do Sistema Solar é formado por diversos gases. Nele,\n há a ocorrência de inúmeros satélites naturais,\n conhecidos como as Luas Galileanas (descobertas por Galileu Galilei), que o orbitam.\n Os principais gases encontrados em Júpiter são hidrogênio, hélio e metano.");
			} else if (opc.equalsIgnoreCase("Saturno")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Saturno + " Posição " + SISTEMA_SOLAR.Saturno.num);
				System.out.println(
						"é conhecido pelos seus grandes anéis. Essas estruturas são formadas por partículas de gelo e rocha. Em Saturno, há o predomínio de gases diversos,\n como hidrogênio e hélio.");
			} else if (opc.equalsIgnoreCase("Urano")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Urano + " Posição " + SISTEMA_SOLAR.Urano.num);
				System.out.println(
						"está muito distante do Sol, sendo o segundo em distância, logo abaixo de Netuno. O planeta é formado por gases diversos. Assim com os outros planetas gasosos,\n possui vários satélites artificiais e também realiza movimentos planetários.");
			} else if (opc.equalsIgnoreCase("Netuno")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Netuno + " Posição " + SISTEMA_SOLAR.Netuno.num);
				System.out.println(
						"o planeta mais distante do Sol, é formado por diversos gases, como hidrogênio, hélio e metano. A cor azul, característica de planeta,\n é justamente ocasionada pela formação gasosa dele.");
			}

		}
	}

