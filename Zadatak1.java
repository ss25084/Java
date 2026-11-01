package drugaGrupa;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu katete: ");
		int n = unos.nextInt();
		
		while (n<0) {
			System.out.println("Neispravan zahtjev");
			System.out.println("Unesite duzinu katete: ");
		     n = unos.nextInt();
		}
		
		for(int i = 1; i <= n; i++ ) {
			for(int j = 1; j <=i; j++) {
				System.out.print(i);
			}System.out.println();
		}
		unos.close();
	}

}
