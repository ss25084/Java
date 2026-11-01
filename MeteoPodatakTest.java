package zadatak3;
import java.util.Scanner;
import java.util.ArrayList;

public class MeteoPodatakTest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		MeteoPodatak podatak1 = new MeteoPodatak("Bijelo polje", "2025-03-01 14:25:12", 15.0, 1002.0 , 15 );
		MeteoPodatak podatak2 = new MeteoPodatak("Podgorica", "2025-04-02 11:25:12", 15.0, 2002.0 , 25 );
		MeteoPodatak podatak3 = new MeteoPodatak("Rozaje", "2025-03-20 14:12:12", 15.0, 1082.0 , 11 );
		MeteoPodatak podatak4 = new MeteoPodatak("Mojkovac", "2025-06-11 18:28:12", 15.0, 1102.0 , 25 );
		MeteoPodatak podatak5 = new MeteoPodatak("Rozaje", "2025-03-20 12:25:12", 18.0, 1032.0 , 15 );
		
		MeteoPodatak[] podaci = {podatak1,podatak2,podatak3, podatak4, podatak5};
		
		MeteoPodatak[] rezultat = MeteoPodatak.podaciMjerneStanice(podaci, "Rozaje");
		
		for(int i =0; i < rezultat.length; i++) {
			System.out.println(rezultat[i].toString());
//			System.out.println(rezultat[i].getNazivMjerneStanice());
//			System.out.println(rezultat[i].getDatumVrijemeOcitavanja());
//			System.out.println(rezultat[i].getTemperatura());
//			System.out.println(rezultat[i].getVazdusniPritisak());
//			System.out.println(rezultat[i].getVlaznostVazduha());
		}
		
		double max = MeteoPodatak.maxTemperatura(podaci, "Rozaje", "2025-03-20 12:25:12");
		System.out.println("Max temperatura je " + max);
		unos.close();
		

	}

}
