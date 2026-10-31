package vjezbe1;
import java.util.Scanner;

public class CetvorocifrenBroj {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi cetvorocifreni broj: ");
		
		int n = unos.nextInt();
		int sprat = 0;
		
		if ( n >= 1000 && n <= 9999) {
			sprat =(n % 100) / 10;
			System.out.println( "pretposlednja cifra je " + sprat);
		} else {
			System.out.println("REKLA SAM CETVOROCIFRENI BROJ");
		}
		

	}

}
