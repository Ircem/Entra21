import java.time.DayOfWeek;
import java.time.LocalDate;

public class Constante {
	public static void main(String[] args) {
		System.out.println((Diassemanas.DOMINGO.numero));
		LocalDate date = LocalDate.now();
		if(date.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
			System.out.println(Diassemanas.TERCA);
			System.out.println(Diassemanas.TERCA.numero);
		}
	
	}
}
