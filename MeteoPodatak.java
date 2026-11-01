package zadatak3;
import java.util.ArrayList;

public class MeteoPodatak {
	private String nazivMjerneStanice;
	private String datumVrijemeOcitavanja;
	private double temperatura;
	private double vazdusniPritisak;
	private double vlaznostVazduha;
	
	public MeteoPodatak(String nazivMjerneStanice, String datumVrijemeOcitavanja, double temperatura,
			double vazdusniPritisak, double vlaznostVazduha) {
		this.nazivMjerneStanice = nazivMjerneStanice;
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
		this.temperatura = temperatura;
		this.vazdusniPritisak = vazdusniPritisak;
		this.vlaznostVazduha = vlaznostVazduha;
	} 

	public String getNazivMjerneStanice() {
		return nazivMjerneStanice; 
	}

	public void setNazivMjerneJedinice(String nazivMjerneStanice) {
		this.nazivMjerneStanice = nazivMjerneStanice;
	}

	public String getDatumVrijemeOcitavanja() {
		return datumVrijemeOcitavanja;
	}

	public void setDatumVrijemeOcitavanja(String datumVrijemeOcitavanja) {
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getVazdusniPritisak() {
		return vazdusniPritisak;
	}

	public void setVazdusniPritisak(double vazdusniPritisak) {
		this.vazdusniPritisak = vazdusniPritisak;
	}

	public double getVlaznostVazduha() {
		return vlaznostVazduha;
	}

	public void setVlaznostVazduha(double vlaznostVazduha) {
		this.vlaznostVazduha = vlaznostVazduha;
	}

	@Override
	public String toString() {
		return "MeteoPodatak [nazivMjerneStanice=" + nazivMjerneStanice + ", datumVrijemeOcitavanja="
				+ datumVrijemeOcitavanja + ", temperatura=" + temperatura + ", vazdusniPritisak=" + vazdusniPritisak
				+ ", vlaznostVazduha=" + vlaznostVazduha + "]";
	}
	
	public static MeteoPodatak[] podaciMjerneStanice(MeteoPodatak[] podaci, String nazivStanice) {
		ArrayList <MeteoPodatak> podaciStanice = new ArrayList<>();
		for(int i = 0; i < podaci.length; i++) {
			if(podaci[i].getNazivMjerneStanice().equals(nazivStanice)) {
				podaciStanice.add(podaci[i]);
			}
		}
		return podaciStanice.toArray(new MeteoPodatak[podaciStanice.size()]);
	}
	 
	public static double maxTemperatura(MeteoPodatak[] podaci, String nazivStanice, String datum) {
		double maxTemp = -100.0;
		for(int i = 0; i < podaci.length; i++) {
		   String dan = datum.substring(0,10);
		   if(podaci[i].getDatumVrijemeOcitavanja().contains(dan)
				   && podaci[i].getNazivMjerneStanice().equals(nazivStanice) ) {
			   if(podaci[i].getTemperatura() > maxTemp) {
				   maxTemp = podaci[i].getTemperatura();
			   }
		   }
		}
		return maxTemp;
	}
	
	 
	

}
