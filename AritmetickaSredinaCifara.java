package vjezbe1;
import java.util.Scanner;

public class AritmetickaSredinaCifara {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj: ");
		int n = unos.nextInt();
		
		int cifra = 0;
		int zbir = 0;
		int brCifara = 0;
		float as = 0;
		
		while (n > 0) {
			cifra = n % 10;
			zbir += cifra;
			brCifara++;
			n = n / 10;
		}
		
		as = (float) zbir / brCifara;
		System.out.println(as);
	}

}
