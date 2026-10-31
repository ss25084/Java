package vjezbe1;
import java.util.Scanner;

public class TriProizvoda {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi cijenu prvog proizvoda: ");
		float x = unos.nextFloat();
		System.out.println("Unesi cijenu drugog proizvoda: ");
		float  y = unos.nextFloat();
		System.out.println("Unesi cijenu treceg proizvoda: ");
		float  z = unos.nextFloat();
		
		float max = x + y;
		
		if (x + z > max) {
			max = x + z;
		}else {
			max = y + z;
		}
		System.out.println(max);
	}

}
