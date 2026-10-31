package vjezbe1;
import java.util.Scanner;

public class ZbirNajmanjeNajvece {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj: ");
		int n = unos.nextInt();
		
		int maxC = 0;
		int minC = 9;
		int cifra =0;
		int zbir = 0;
		
		if (n == 0) {
			minC = 0;
			maxC = 0;
		}
		
		while (n > 0) {
			cifra = n % 10;
			n = n / 10;
			if( cifra > maxC) {
				maxC = cifra;
			}if(cifra < minC) {
				minC = cifra;
			}
		}
		zbir = minC + maxC;
		System.out.println(zbir);
	}

}
