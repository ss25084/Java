package vjezbe1;
import java.util.Scanner;

public class ZbirIliProizvod {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi cetvorocifreni broj: ");
		int n = unos.nextInt();
		int zbir = 0;
		int proizvod = 1;
		int cifra = 0;
		
		if (n >= 1000 && n <= 9999) {
			if (n % 2 == 0) {
		     while (n > 0) {
				cifra = n % 10;
					if (cifra % 2 == 0) {
						zbir += cifra;
					}
			n = n /10;	
		     }
		     System.out.println(zbir);
		   }else {
			   while(n > 0) {
				   cifra = n % 10;
				   if(cifra % 2 != 0) {
					   proizvod *= cifra;
				   }
				   n = n /10;
			   }
			   System.out.println(proizvod);
			}
		}else {
				System.out.println("zahtjev neispravan");
				
		 }
			
		}

	}

