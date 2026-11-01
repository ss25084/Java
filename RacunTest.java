package prvaGrupa;
import java.util.ArrayList;

public class RacunTest {

	public static void main(String[] args) {
		Racun r1 = new Racun("Voli", "2025-12-10", 150.0, 2, "kartica");
		Racun r2 = new Racun("Imperijal", "2025-12-10", 10.0, 2, "gotovina");
		Racun r3 = new Racun("Voli", "2025-12-10", 111.0, 2, "kartica");
		Racun r4 = new Racun("Tabako", "2025-12-10", 1.0, 2, "gotovina");
		Racun r5 = new Racun("Voli", "2025-12-10", 15.0, 2, "gotovina");

		Racun[] podaci = {r1, r2, r3, r4, r5};
		Racun[] rezultat = Racun.odredjeniRacuni(podaci, "Voli", "kartica");
		for(int i = 0; i < rezultat.length; i++) {
			System.out.println(rezultat[i].toString());
		}
		
		double ukupnoZaradjeno = Racun.ukupanPromet(podaci, "Voli", "2025-12-10");
		
		System.out.println(ukupnoZaradjeno);
			
		
	}

}
