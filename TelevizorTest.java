package TatineVjezbe;
import java.util.Scanner;

public class TelevizorTest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		 System.out.println("Unesi broj kanala, naziv kanala i jacinu tona: ");
		 int broj = unos.nextInt();
		 String naziv = unos.next();
		 int ton = unos.nextInt();
		 
		 Televizor tv = new Televizor(broj, naziv, ton);
		 tv.ispisi();
		 
		 Televizor tv2 = new Televizor();
		  tv2.setBrojKanala(5);
		  tv2.setNazivKanala("RTCG");
		  tv2.setJacinaTona(8);
		  
		  System.out.println(tv2.toString());
		  
		  tv2.pojacajTon();
		  tv2.pojacajTon();
		  tv2.pojacajTon();
		  
		  tv2.toString();
		  unos.close();
	}

}
