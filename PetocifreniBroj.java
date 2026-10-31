package vjezbe1;
import java.util.Scanner;

public class PetocifreniBroj {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi petocifreni broj: ");
		int n = unos.nextInt();
		int pp = 0;
		int p = 0;
		int zbir = 0;
		
		if ( n >= 10000 && n <= 99999) {
			pp = (n / 10) % 10;
			p = n % 10;
			zbir = pp + p;
			System.out.println(zbir);
		}else {
			 System.out.println("Zahtjev neispravan");
		 }
	}

}
