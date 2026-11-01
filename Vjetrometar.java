package zadatak3;
import java.util.ArrayList;

public class Vjetrometar {
	private String nazivMjerneStanice;
	private String datumVrijemeOcitavanja;
	private double maksimalnaBrzinaVjetra;
	private double srednjaBrzinaVjetra;
	private double pravacVjetra;
	
	public Vjetrometar() {
		this.nazivMjerneStanice = "Nepoznato";
		this.datumVrijemeOcitavanja = "2025-03-01 23:12:11";
		this.maksimalnaBrzinaVjetra = 0.0;
		this.srednjaBrzinaVjetra = 0.0;
		this.pravacVjetra = 0.0;
	}
	
	public Vjetrometar(String nazivMjerneStanice, String datumVrijemeOcitavanja, double maksimalnaBrzinaVjetra,
			double srednjaBrzinaVjetra, double pravacVjetra) {
		this.nazivMjerneStanice = nazivMjerneStanice;
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
		this.maksimalnaBrzinaVjetra = maksimalnaBrzinaVjetra;
		this.srednjaBrzinaVjetra = srednjaBrzinaVjetra;
		this.pravacVjetra = pravacVjetra;
	}

	public String getNazivMjerneStanice() {
		return nazivMjerneStanice;
	}

	public void setNazivMjerneStanice(String nazivMjerneStanice) {
		this.nazivMjerneStanice = nazivMjerneStanice;
	}

	public String getDatumVrijemeOcitavanja() {
		return datumVrijemeOcitavanja;
	}

	public void setDatumVrijemeOcitavanja(String datumVrijemeOcitavanja) {
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
	}

	public double getMaksimalnaBrzinaVjetra() {
		return maksimalnaBrzinaVjetra;
	}

	public void setMaksimalnaBrzinaVjetra(double maksimalnaBrzinaVjetra) {
		this.maksimalnaBrzinaVjetra = maksimalnaBrzinaVjetra;
	}

	public double getSrednjaBrzinaVjetra() {
		return srednjaBrzinaVjetra;
	}

	public void setSrednjaBrzinaVjetra(double srednjaBrzinaVjetra) {
		this.srednjaBrzinaVjetra = srednjaBrzinaVjetra;
	}

	public double getPravacVjetra() {
		return pravacVjetra;
	}

	public void setPravacVjetra(double pravacVjetra) {
		this.pravacVjetra = pravacVjetra;
	}

	@Override
	public String toString() {
		return "Vjetrometar [nazivMjerneStanice=" + nazivMjerneStanice + ", datumVrijemeOcitavanja="
				+ datumVrijemeOcitavanja + ", maksimalnaBrzinaVjetra=" + maksimalnaBrzinaVjetra
				+ ", srednjaBrzinaVjetra=" + srednjaBrzinaVjetra + ", pravacVjetra=" + pravacVjetra + "]";
	}
	
	public static Vjetrometar[] podaciStanice(Vjetrometar[] podaci, String nazivStanice) {
		ArrayList <Vjetrometar> podaciMjerneStanice = new ArrayList<>();
		
		for(int i = 0; i < podaci.length; i++) {
			if(podaci[i].getNazivMjerneStanice().equals(nazivStanice)) {
				podaciMjerneStanice.add(podaci[i]);
			}
		}
		Vjetrometar[] niz = new Vjetrometar[podaciMjerneStanice.size()];
		return podaciMjerneStanice.toArray(niz);
	}
	
	public static double maxVjetar(Vjetrometar[] podaci, String datum, String nazivStanice) {
		double max = 0.0;
		for(int i = 0; i < podaci.length; i++) {
			String dan = datum.substring(0,10);
			if(podaci[i].getNazivMjerneStanice().equals(nazivStanice) &&
					podaci[i].getDatumVrijemeOcitavanja().contains(dan)) {
				if(podaci[i].getMaksimalnaBrzinaVjetra() > max) {
					max = podaci[i].getMaksimalnaBrzinaVjetra();
				}
			}
		}
		return max;
	}
	
	
	
	
	
	
	

}
