package vjezbe1;
import java.util.Scanner;  

public class KvadratZbira {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi cetvorocifreni broj: ");
		 int n = unos.nextInt();
		 int c1 = 0;
		 int c2 = 0;
		 int c3 = 0;
		 int c4 = 0;
		 int zbir = 0;
		 int rezultat = 1;
		 
		 if ( n >= 1000 && n <= 9999) {
			 c1 = n /1000;
			 c2 = (n / 100) % 10;
			 c3 = (n % 100) / 10;
			 c4 = n % 10;
			 zbir = c1 + c2 + c3 + c4;
			 rezultat = zbir * zbir;
			 System.out.println("Kvadrat zbira cifara je: " + rezultat);
		 }else {
			 System.out.println("Zahtjev neispravan");
		 }

	}

}
