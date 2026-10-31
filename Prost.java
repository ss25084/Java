package vjezbe1;
import java.util.Scanner;  

public class Prost {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj: ");
		 int n = unos.nextInt();
		 n = Math.abs(n);
		 
		 if (n < 2) {
			 System.out.println("nije definisan");
		 }
		 
		 boolean prost = true;
		 int i = 2;
		 
		 while (i < n/2) {
			 if((n % i) == 0) {
				 prost = false;
				 break;
			 }
			 i++;
		 }
		 
		 if(prost) {
			 System.out.println("PROST");
		 }else {
			 System.out.println("!PROST");
		 }
		 

	}

}
