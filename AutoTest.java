package vjezbe3m;
import java.util.Scanner;
import java.util.ArrayList;

public class AutoTest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		Auto a1 = new Auto("mercedes", 1987, 100, false, 80, true);
		Auto a2 = new Auto("skoda", 1981, 116, false, 80, false);
		Auto a3 = new Auto("opel", 1999, 162, true, 80, true);
		
		Auto a4 = new Auto();
		System.out.println("Unesi marku auta, godiste proizvodnje, snagu motora, vrijednost da li je prodato, "
				+ "kubikazu motora i vrijednost da li je registrovano ");
		 a4.setMarkaAuta(unos.next());
		 a4.setGodisteAuta(unos.nextInt());
		 a4.setSnagaMotora(unos.nextInt());
		 a4.setProdato(unos.nextBoolean());
		 a4.setKubikazaMotora(unos.nextInt());
		 a4.setRegistrovan(unos.nextBoolean());
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		
		ArrayList <Auto> auta = new ArrayList<>();
		auta.add(a1);
		auta.add(a2);
		auta.add(a3);
		auta.add(a4);
		
		for(int i = 0; i < auta.size(); i++){
			System.out.println(auta.get(i).toString());
		}
		
		System.out.println("Broj prodatih automobila: " + Auto.getBrojProdatih());
		
		System.out.println("Auta za registraciju: ");
		
		ArrayList <Auto> ZaRegistraciju = Auto.autaZaRegistraciju(auta);
		for (int i = 0; i < ZaRegistraciju.size(); i++) {
			System.out.println(ZaRegistraciju.get(i).toString());
		}
		
		System.out.println("Ukupan iznos registracija je: " + Auto.ukupnaRegistracija(auta));	
		
//		ArrayList <Auto> pojedinacnaRegistracija = Auto.autaZaRegistraciju(auta);
//		for(int i = 0; i < pojedinacnaRegistracija.size(); i++) {
//			System.out.println(pojedinacnaRegistracija.get(i).toString());
//		}
		 
		 
		 
		 
		 
		 
	}
	
	 
	
	  
	    
	    
	

}
