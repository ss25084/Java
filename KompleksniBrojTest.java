package vjezbe3;
import java.util.Scanner;

public class KompleksniBrojTest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi realni i imaginarni dio prvog kompleksnig broja: ");
		float a = unos.nextFloat();
		float b = unos.nextFloat();
		
		KompleksniBroj prviBroj = new KompleksniBroj(a,b);
		
		KompleksniBroj drugiBroj = new KompleksniBroj();
		
		System.out.println("Unesi realni i imaginarni dio drugog kompleksnog broja: ");
		
		drugiBroj.postaviRealniDio(unos.nextFloat());
		drugiBroj.postaviImaginarniDio(unos.nextFloat());
		
		KompleksniBroj rezultat;
		
		rezultat = prviBroj.saberi(drugiBroj);	
		System.out.print("Rezultat sabiranja: ");
		System.out.println(rezultat.dajBroj());
		
		rezultat = prviBroj.oduzmi(drugiBroj);
		System.out.print("Rezultat oduzimanja je: ");
		System.out.println(rezultat.dajBroj());
		
		rezultat = prviBroj.pomnozi(drugiBroj);
		System.out.print("Rezultat mnozenja: ");
		System.out.println(rezultat.dajBroj());
		unos.close();

	}

}
