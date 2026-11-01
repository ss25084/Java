package zadatak1;
import java.util.Scanner;

public class Zadatak1b {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi duzinu katete: ");
		int n = unos.nextInt();
		
		while(n < 0) {
			System.out.println("Broj mora biti pozitivan");
			System.out.println("Unesi duzinu katete: ");
		     n = unos.nextInt();
		}

		for (int i = n; i >= 1; i--) {
			for(int k = 1; k <= (n- i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
			}System.out.println();
	    }
		
//		for (int i = n; i >= 1; i--) {
//			for(int j = 1; j <= i ; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
		
		unos.close();
	}

}
