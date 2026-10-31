package vjezbe3m;
import java.util.ArrayList;

public class Auto {
	private String markaAuta;
	private int godisteAuta;
	private int snagaMotora;
	private boolean prodato;
	private int kubikazaMotora;
	private boolean registrovan;
	private static int brojProdatih = 0; 
	
	public Auto() {
		this.markaAuta = "";
		this.godisteAuta = 0;
		this.snagaMotora = 0;
		this.prodato = false;
		this.kubikazaMotora = 0;
		this.registrovan = false;
	}
	
	public Auto(String markaAutaP,int godisteAutaP, int snagaMotoraP, boolean prodatoP,
			int kubikazaMotoraP, boolean registrovanP ) {
		this.markaAuta = markaAutaP;
		this.godisteAuta = godisteAutaP;
		this.snagaMotora = snagaMotoraP;
		this.prodato = prodatoP;
		if(prodatoP) {
			brojProdatih++;
		}
		this.kubikazaMotora = kubikazaMotoraP;
		if(godisteAutaP < 1985) {
			this.registrovan = false;
		}else {
			this.registrovan = registrovanP;
		}
	}
	
	public static int getBrojProdatih() {
		return brojProdatih;
	}
	
	public String getMarkaAuta() {
		return markaAuta;
	}
	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}
	
	public int getGodisteAuta() {
		return godisteAuta;
	}
	public void setGodisteAuta(int godisteAutaP) {
		this.godisteAuta = godisteAutaP;
	}
	
	public int getSnagaMotora() {
		return snagaMotora;
	}
	public void setSnagaMotora(int snagaMotoraP) {
		this.snagaMotora = snagaMotoraP;
	}
	
	public boolean isProdato() {
		return prodato;
	}
	public void setProdato(boolean prodatoP) {
		this.prodato = prodatoP;
	}
	
	public int getKubikazaMotora() {
		return kubikazaMotora;
	}
	public void setKubikazaMotora(int kubikazaMotoraP) {
		this.kubikazaMotora = kubikazaMotoraP;
	}
	
	public boolean isRegistrovan() {
		return registrovan;
	}
	public void setRegistrovan(boolean registrovanP) {
		  if (godisteAuta < 1985) {
			     this.registrovan = false;
		 } else {
		      this.registrovan = registrovanP;
	      }
	}

	@Override
	public String toString() {
		return "Auto [markaAuta=" + markaAuta + ", godisteAuta=" + godisteAuta + ", snagaMotora=" + snagaMotora
				+ ", prodato=" + prodato + ", kubikazaMotora=" + kubikazaMotora + ", registrovan=" + registrovan + "]";
	}
	
	public static ArrayList <Auto> autaZaRegistraciju(ArrayList <Auto> auta){
		ArrayList <Auto> autaZaRegistraciju = new ArrayList<>();
		for(int i = 0; i < auta.size(); i++) {
			if(auta.get(i).getGodisteAuta() >= 1985 && !auta.get(i).isRegistrovan() ) {
				autaZaRegistraciju.add(auta.get(i));
			}
		}
		return autaZaRegistraciju;
	}
	
	public static double iznosRegistracije(int godisteAuta, int snagaMotora, int kubikazaMotora) {
		double koeficijentGodista = 0.0;
		if ( godisteAuta  >= 1985 && godisteAuta <= 2000) {
			koeficijentGodista = 3.0;
		}else if(godisteAuta >= 2001 && godisteAuta <= 2010) {
			koeficijentGodista = 2.0;
		}else if (godisteAuta >= 2011) {
	        koeficijentGodista = 1.5;
	    }
		double cijenaRegistracije = koeficijentGodista * kubikazaMotora * snagaMotora;
		return cijenaRegistracije;
	}
	
	public static double ukupnaRegistracija(ArrayList <Auto> auta) {
		double ukupno = 0.0;
		
		for (int i = 0; i < auta.size(); i++) {
			ukupno =+ iznosRegistracije(auta.get(i).getGodisteAuta(),
					auta.get(i).getKubikazaMotora(), auta.get(i).getSnagaMotora());
		}
		
		return ukupno;
	}

	
	
	
	
	
	
	
	
	
	

}
