package vjezbe1;
import java.util.Scanner;

public class PravougaonikKvadrat {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi duzinu pravougaonika: ");
		int n = unos.nextInt();
		System.out.println("Unesi sirinu pravougaonika: ");
		int m = unos.nextInt();
		
		if(n > 0 && m > 0 && m >= 2 * n ) {
			System.out.println("Moguce je");
		}else {
			System.out.println("Nije moguce");
		}
	}

}
