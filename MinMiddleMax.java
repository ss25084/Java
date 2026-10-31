package vjezbe1;
import java.util.Scanner;

public class MinMiddleMax {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi prvi broj: ");
		int x = unos.nextInt();
		System.out.println("Unesi drugi broj: ");
		int  y = unos.nextInt();
		System.out.println("Unesi treci broj: ");
		int  z = unos.nextInt();
		
		int min = x;
		int max = x;
		
		if(y < min) {
			min = y;
		}
		if(z < min) {
			min = z;
		}
		
		if(y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		
		int middle = x + y + z - min - max;
		
		System.out.println(middle+ " " + min +" "+ max);
		
		
		
		

	}

}
