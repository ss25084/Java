package prvaGrupa;
import java.util.ArrayList;

public class Racun {
	private String nazivProdavnice;
	private String datumVrijemeIzdavanja;
	private double iznos;
	private int brojArtikala;
	private String nacinPlacanja;
	
	public Racun() {
		this.nazivProdavnice = "Nepoznato";
		this.datumVrijemeIzdavanja = "2025-12-11 12:11:10";
		this.iznos = 10.0;
		this.brojArtikala = 2;
		this.nacinPlacanja = "kartica";
	}
	
	public Racun(String nazivProdavnice, String datumVrijemeIzdavanja, double iznos, int brojArtikala,
			String nacinPlacanja) {
		this.nazivProdavnice = nazivProdavnice;
		this.datumVrijemeIzdavanja = datumVrijemeIzdavanja;
		this.iznos = iznos;
		this.brojArtikala = brojArtikala;
		setNacinPlacanja(nacinPlacanja);
	}
	
	public String getNazivProdavnice() {
		return nazivProdavnice;
	}
	public void setNazivProdavnice(String nazivProdavnice) {
		this.nazivProdavnice = nazivProdavnice;
	}
	public String getDatumVrijemeIzdavanja() {
		return datumVrijemeIzdavanja;
	}
	public void setDatumVrijemeIzdavanja(String datumVrijemeIzdavanja) {
		this.datumVrijemeIzdavanja = datumVrijemeIzdavanja;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	public int getBrojArtikala() {
		return brojArtikala;
	}
	public void setBrojArtikala(int brojArtikala) {
		this.brojArtikala = brojArtikala;
	}
	public String getNacinPlacanja() {
		return nacinPlacanja;
	}
	public void setNacinPlacanja(String nacinPlacanja) {
		if(nacinPlacanja == "kartica" || nacinPlacanja == "gotovina") {
			this.nacinPlacanja = nacinPlacanja;
		}else {
			this.nacinPlacanja = "gotovina";
		}
	}
	
	@Override
	public String toString() {
		return "Racun [nazivProdavnice=" + nazivProdavnice + ", datumVrijemeIzdavanja=" + datumVrijemeIzdavanja
				+ ", iznos=" + iznos + ", brojArtikala=" + brojArtikala + ", nacinPlacanja=" + nacinPlacanja + "]";
	}
	
	public static Racun[] odredjeniRacuni(Racun[] podaci, String ime, String placanje) {
		ArrayList<Racun> infoRacuna = new ArrayList<>();
		for(int i = 0; i < podaci.length; i++) {
			if(podaci[i].getNazivProdavnice().equals(ime) && 
					podaci[i].getNacinPlacanja().equals(placanje)) {
				infoRacuna.add(podaci[i]);
			}
		}
		Racun[] niz = new Racun[infoRacuna.size()];
		return infoRacuna.toArray(niz);
	}
	
	public static double ukupanPromet(Racun[] podaci, String ime, String datum) {
		double ukupno = 0;
		for (int i = 0; i < podaci.length; i++) {
			String dan = datum.substring(0,10);
			if (podaci[i].getNazivProdavnice().equals(ime) && podaci[i].getDatumVrijemeIzdavanja().contains(dan)) {
				ukupno+=podaci[i].getIznos();
			}
		}
		return ukupno;
	}
	 
	
	

}
