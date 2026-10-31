package vjezbe1;
import java.util.Scanner;

public class StepenPetlja {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj koji stepenujes: ");
		int n = unos.nextInt();
		System.out.println("Unesi stepen: ");
		int m = unos.nextInt();
		int rezultat = 1;
		
		for (int i = 0; i < m; i++) {
			rezultat *= n;
		}
		
		System.out.println(rezultat);
	}

}
