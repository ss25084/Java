package zadatak2;
import java.util.Scanner;
import java.util.ArrayList;

public class BibliotekaTest {

	public static void main(String[] args) {
		Biblioteka.setCijenaPoStranici(0.15	);
		
		ArrayList <Biblioteka> knjige = new ArrayList<>();
		knjige.add(new Biblioteka(1001, "Na Drini ćuprija", "Ivo Andrić", 320, 1945, true));
		knjige.add(new Biblioteka(1002, "Gorski vijenac", "Petar II Petrović Njegoš", 180, 1847, false));
		knjige.add(new Biblioteka(1003, "Clean Code", "Robert C. Martin", 464, 2008, true));
		knjige.add(new Biblioteka(1004, "Effective Java", "Joshua Bloch", 412, 2018, true));
		knjige.add(new Biblioteka(55, "Mali princ", "Antoine de Saint-Exupéry", 96, 2015, false));
		
		System.out.println("Sve knjige: ");
		for(int i = 0; i < knjige.size(); i++) {
			System.out.println(knjige.get(i).infoOKnjizi());
		}
		
		System.out.println("Dostupne knjige: ");
		for(int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).isDostupna()) {
				System.out.println(knjige.get(i).infoOKnjizi());
			}
		}
		
		System.out.println("Knjige koje imaju vise od 300 strana: ");
		for(int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getBrojStranica() > 300) {
				System.out.println(knjige.get(i).infoOKnjizi());
			}
		}
		
		double ukupnaCijena = 0;
		System.out.print("Ukupna vrijednost knjiga: ");
		for(int i = 0; i < knjige.size(); i++) {
			ukupnaCijena += knjige.get(i).izracunajCijenu();
		}System.out.println(ukupnaCijena);
		
		
		System.out.print("Najstarija knjiga: ");
		Biblioteka najstarija = knjige.get(0);
		for(int i = 1; i < knjige.size(); i++) {
			if(knjige.get(i).dajStarost() > najstarija.dajStarost()) {
				najstarija = knjige.get(i);
			}
		}System.out.println(najstarija.infoOKnjizi());
		
		
		System.out.print("Prosjecna vrijednost knjiga: ");
//		int brKnjiga = 0;
//		for(int i = 0; i < knjige.size(); i++) {
//			brKnjiga++;
//		}
		
		double as = ukupnaCijena / knjige.size();
		System.out.println(as);

	}

}
