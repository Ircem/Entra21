package EMUN;

import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		boolean v = true;
		Scanner sc = new Scanner(System.in);
		
			System.out.println(
					"escolha um entre os planetas para saber mais \nMerc�rio\nV�nus\nTerra\nMarte\nJ�piter\nSaturno\nUrano\nNetuno");
			String opc = sc.next();
			
			if (opc.equalsIgnoreCase("Mercurio")) {

				System.out.println("Planeta " + SISTEMA_SOLAR.Merc�rio + " Posi��o " + SISTEMA_SOLAR.Merc�rio.num);
				System.out.println(
						"o mais pr�ximo do Sol e o menor entre os planetas do Sistema Solar. Ele n�o possui sat�lites,\ntampouco condi��es de vida, sendo especialmente marcado por suas altas temperaturas.\n A sua proximidade do Sol e a sua atmosfera incompleta condicionam suas temperaturas elevad�ssimas.");
			} else if (opc.equalsIgnoreCase("Venus")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Terra + " Posi��o " + SISTEMA_SOLAR.Terra.num);
				System.out.println(
						"apresenta temperaturas ainda mais elevadas do que Merc�rio. Possui uma dimens�o e tamb�m uma constitui��o muito pr�xima da Terra, sendo formado por diversos grupos de rochas.\n Ele � popularmente conhecido como Estrela D�alva em raz�o da sua luminosidade vista da Terra.");
			} else if (opc.equalsIgnoreCase("Terra")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Terra + " Posi��o " + SISTEMA_SOLAR.Terra.num);
				System.out.println(
						"� o �nico planeta que apresenta condi��es de vida entre os constituintes do Sistema Solar. A Terra realiza movimentos ao redor de si mesma,\n rota��o, e em torno do Sol, transla��o. � um planeta rochoso,\n formado por diversos silicatos e basaltos, al�m de possuir atmosfera bem desenvolvida.");
			} else if (opc.equalsIgnoreCase("Marte")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Marte + " Posi��o " + SISTEMA_SOLAR.Marte.num);
				System.out.println(
						" o chamado Planeta Vermelho, composto por silicatos e basaltos, � um dos mais estudados pela astronomia terrestre. Apresenta condi��es clim�ticas adversas, sendo muito frio e seco. H� dois sat�lites artificias em Marte. O planeta,\n assim como a Terra, realiza movimentos de rota��o e transla��o.");
			} else if (opc.equalsIgnoreCase("Jupiter")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.J�piter + " Posi��o " + SISTEMA_SOLAR.J�piter.num);
				System.out.println(
						"o maior planeta do Sistema Solar � formado por diversos gases. Nele,\n h� a ocorr�ncia de in�meros sat�lites naturais,\n conhecidos como as Luas Galileanas (descobertas por Galileu Galilei), que o orbitam.\n Os principais gases encontrados em J�piter s�o hidrog�nio, h�lio e metano.");
			} else if (opc.equalsIgnoreCase("Saturno")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Saturno + " Posi��o " + SISTEMA_SOLAR.Saturno.num);
				System.out.println(
						"� conhecido pelos seus grandes an�is. Essas estruturas s�o formadas por part�culas de gelo e rocha. Em Saturno, h� o predom�nio de gases diversos,\n como hidrog�nio e h�lio.");
			} else if (opc.equalsIgnoreCase("Urano")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Urano + " Posi��o " + SISTEMA_SOLAR.Urano.num);
				System.out.println(
						"est� muito distante do Sol, sendo o segundo em dist�ncia, logo abaixo de Netuno. O planeta � formado por gases diversos. Assim com os outros planetas gasosos,\n possui v�rios sat�lites artificiais e tamb�m realiza movimentos planet�rios.");
			} else if (opc.equalsIgnoreCase("Netuno")) {
				System.out.println("Planeta " + SISTEMA_SOLAR.Netuno + " Posi��o " + SISTEMA_SOLAR.Netuno.num);
				System.out.println(
						"o planeta mais distante do Sol, � formado por diversos gases, como hidrog�nio, h�lio e metano. A cor azul, caracter�stica de planeta,\n � justamente ocasionada pela forma��o gasosa dele.");
			}

		}
	}

