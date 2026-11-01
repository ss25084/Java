package zadatak3;
import java.util.ArrayList;

public class VjetrometarTest {

	public static void main(String[] args) {
		
		Vjetrometar p1 = new Vjetrometar("Bijelo polje", "2025-03-01 14:25:12", 15.0, 1002.0 , 15);
		Vjetrometar p2 = new Vjetrometar("Podgorica", "2025-04-02 11:25:12", 15.0, 2002.0 , 25 );
		Vjetrometar p3 = new Vjetrometar("Rozaje", "2025-03-20 14:12:12", 15.0, 1082.0 , 11 );
		Vjetrometar p4 = new Vjetrometar("Mojkovac", "2025-06-11 18:28:12", 15.0, 1102.0 , 25 );
		Vjetrometar p5 = new Vjetrometar("Rozaje", "2025-03-20 12:25:12", 18.0, 1032.0 , 15 );
		
		Vjetrometar[] podaci = {p1,p2,p3,p4,p5};
		
		Vjetrometar[] rezultat = Vjetrometar.podaciStanice(podaci, "Rozaje");
		
		for (int i = 0; i < rezultat.length; i++) {
			System.out.println(rezultat[i].toString());
		}
		
		double max = Vjetrometar.maxVjetar(podaci, "2025-03-20 12:25:12", "Rozaje");
		System.out.println("Max brzina vjetra je " + max);
		
		
	}

}
