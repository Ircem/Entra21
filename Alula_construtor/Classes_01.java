import java.util.Scanner;

public class Classes_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Classes_00 chama = new Classes_00();
		Classes_00 Florianopolis = new Classes_00();
		Classes_00 Blumenau = new Classes_00();
		Classes_00 Joinville = new Classes_00();
		System.out.println("Loja Blumenau");
		System.out.println("N�mero de ma��s vendidas por ano ");
		Blumenau.nvmaca = sc.nextInt();
		System.out.println("Pre�o de venda das ma�as");
		Blumenau.pvmaca = sc.nextInt();
		System.out.println("N�mero de laranjas vendidas por ano");
		Blumenau.nvlaranja = sc.nextInt();
		System.out.println("Pre�o de venda das larajas ");
		Blumenau.pvlaranja = sc.nextInt();
		Blumenau.lucro = Blumenau.pvlaranja + Blumenau.pvmaca;
		Blumenau.lucro_maca = Blumenau.nvmaca * Blumenau.pvmaca;
		Blumenau.lucro_laranja = Blumenau.pvlaranja * Blumenau.nvlaranja;

		System.out.println("Loja Florianopolis");
		System.out.println("N�mero de ma��s vendidas por ano ");
		Florianopolis.nvmaca = sc.nextInt();
		System.out.println("Pre�o de venda das ma�as");
		Florianopolis.pvmaca = sc.nextInt();
		System.out.println("N�mero de laranjas vendidas por ano");
		Florianopolis.nvlaranja = sc.nextInt();
		System.out.println("Pre�o de venda das larajas ");
		Florianopolis.pvlaranja = sc.nextInt();
		Florianopolis.lucro = Florianopolis.pvlaranja + Florianopolis.pvmaca;
		Florianopolis.lucro_maca = Florianopolis.nvmaca * Florianopolis.pvmaca;
		Florianopolis.lucro_laranja = Florianopolis.pvlaranja * Florianopolis.nvlaranja;

		System.out.println("Loja Joinville");
		System.out.println("N�mero de ma��s vendidas por ano ");
		Joinville.nvmaca = sc.nextInt();
		System.out.println("Pre�o de venda das ma�as");
		Joinville.pvmaca = sc.nextInt();
		System.out.println("N�mero de laranjas vendidas por ano");
		Joinville.nvlaranja = sc.nextInt();
		System.out.println("Pre�o de venda das larajas ");
		Joinville.pvlaranja = sc.nextInt();
		Joinville.lucro = Joinville.pvlaranja + Joinville.pvmaca;
		Joinville.lucro_maca = Joinville.nvmaca * Joinville.pvmaca;
		Joinville.lucro_laranja = Joinville.pvlaranja * Joinville.nvlaranja;

		System.out.println("Mais vendido de ma�a � " + chama.Max_venda_maca(Blumenau.lucro_maca, Florianopolis.lucro_maca, Joinville.lucro_maca));
		System.out.println("mais vendido de laranja � " + chama.Max_venda_maca(Blumenau.lucro_laranja, Florianopolis.lucro_laranja, Joinville.lucro_laranja));
		System.out.println("A loja que teve o maior � " + chama.Max_venda_maca(Blumenau.lucro, Florianopolis.lucro, Joinville.lucro));
		System.out.println("A loja com menor venda � " + chama.Menor_venda(Blumenau.lucro, Florianopolis.lucro, Joinville.lucro));
			

				
				
					
	}
}