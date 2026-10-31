package vjezbe1;
import java.util.Scanner;  

public class TrocifreniBroj {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi trocifreni broj: ");
		 int n = unos.nextInt();
		 int c1 = 0;
		 int c2 = 0;
		 int c3 = 0;
		 int noviBr = 0;
		 
		 
		 if ( n >= 100 && n <= 999) {
			 c1 = n /100;
			 c2 = (n/10) % 10;
			 c3 = n % 10;
			 noviBr = (c3 *100) + (c2 * 10) + c1;
			 System.out.println(noviBr);
		 }else {
			 System.out.println("Zahtjev neispravan");
		 }
	}

}
