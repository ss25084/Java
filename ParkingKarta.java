package drugaGrupa;
import java.util.ArrayList;

public class ParkingKarta {
	private String registracija;
	private String vrijemeUlaska;
	private int trajanjeMin;
	private double cijena;
	private int zona;
	
	public ParkingKarta() {
		this.registracija = "Nepoznato";
		this.vrijemeUlaska = "2025-03-01 21:20:12";
		this.trajanjeMin = 0;
		this.cijena = 0.0;
		this.zona = 1;
	}
	
	public ParkingKarta(String registracija, String vrijemeUlaska, int trajanjeMin, double cijena, int zona) {
		this.registracija = registracija;
		this.vrijemeUlaska = vrijemeUlaska;
		this.trajanjeMin = trajanjeMin; 
		this.cijena = cijena;
		setZona(zona);
	}


	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public String getVrijemeUlaska() {
		return vrijemeUlaska;
	}

	public void setVrijemeUlaska(String vrijemeUlaska) {
		this.vrijemeUlaska = vrijemeUlaska;
	}

	public int getTrajanjeMin() {
		return trajanjeMin;
	}

	public void setTrajanjeMin(int trajanjeMin) {
		this.trajanjeMin = trajanjeMin;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		if(zona >= 1 && zona <= 3) {
			this.zona = zona;
		}else {
			this.zona = 1;
		}
	}

	@Override
	public String toString() {
		return "ParkingKarta [registracija=" + registracija + ", vrijemeUlaska=" + vrijemeUlaska + ", trajanjeMin="
				+ trajanjeMin + ", cijena=" + cijena + ", zona=" + zona + "]";
	}
	
	public static ParkingKarta[] dajPodatak(ParkingKarta[] podaci, int brojZone, String datum) {
		ArrayList<ParkingKarta> infoOKarti = new ArrayList<>();
		for (int i = 0; i <podaci.length; i++) {
			String datum1 = datum.substring(0,10);
			if(podaci[i].getZona() == brojZone && podaci[i].getVrijemeUlaska().contains(datum1)) {
				infoOKarti.add(podaci[i]);
			}
		}
		ParkingKarta[] niz = new ParkingKarta[infoOKarti.size()];
		return infoOKarti.toArray(niz);
	}
	
	public static int najduzeTrajanje(ParkingKarta[] podaci, String datum, String gtablice) {
		int theLongest = 0;
		for(int i = 0; i < podaci.length; i++) {
			String datum1 = datum.substring(0,10);
			if(podaci[i].getVrijemeUlaska().contains(datum1) && podaci[i].trajanjeMin > theLongest) {
				theLongest = podaci[i].getTrajanjeMin();
			}	
		}
		return theLongest;
	}
	
	
		





	
	
	
	

}
