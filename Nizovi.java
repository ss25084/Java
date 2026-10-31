package TatineVjezbe;
import java.util.Scanner;
import java.util.Random;

public class Nizovi {
	

	public static void prikazNiza(double[] niz) {
		for (double element : niz) {
			System.out.print(element + " ");
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int n = unos.nextInt();
		
		Random random = new Random();
		double[] niz = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			int broj = random.nextInt(20);
			niz [i] = broj;
			
		}
		prikazNiza(niz);
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if(niz[i] % 2 == 0) {
				niz[i] *= -1;
			}else {
				niz[i] = 1 / niz[i];
			}
		}
		prikazNiza(niz);
		unos.close();
		

	}

}
