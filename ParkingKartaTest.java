package drugaGrupa;

public class ParkingKartaTest {

	public static void main(String[] args) {
		ParkingKarta k1 = new ParkingKarta("BABM203" , "2025-03-01 21:20:12", 60, 30.0, 1);
		ParkingKarta k2 = new ParkingKarta("PGBZ326" , "2025-03-01 21:22:12", 60, 30.0, 2);
		ParkingKarta k3 = new ParkingKarta("BABM203" , "2025-03-01 21:25:12", 80, 30.0, 3);
		ParkingKarta k4 = new ParkingKarta("BPBZ852" , "2025-03-01 21:28:12", 60, 30.0, 2);
		ParkingKarta k5 = new ParkingKarta("ROPZ654" , "2025-03-01 21:33:12", 60, 30.0, 1);
		
		ParkingKarta[] podaci = {k1, k2,k3,k4,k5};
		ParkingKarta[] rezultat = ParkingKarta.dajPodatak(podaci, 1, "2025-03-01 21:20:12");
		for(int i =0; i<rezultat.length;i++) {
			System.out.println(rezultat[i].toString()); 
		}
		
		int najduzeVrijeme = ParkingKarta.najduzeTrajanje(podaci,"2025-03-01 21:20:12","BABM203" );
		System.out.println("Najduze vrijeme parkiranja za odredjeni datum i registraciju je " + najduzeVrijeme + " minuta");

	}

}
