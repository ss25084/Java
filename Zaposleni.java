package TatineVjezbe;

public class Zaposleni {
	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;
	
	public Zaposleni() {
		ime = "";
		prezime = "";
		godineStaza = 0;
		plata = 0;	
	}
	
	public Zaposleni(String imeP,String prezimeP, int godineStazaP, double plataP) {
		ime = imeP;
		prezime = prezimeP;
		godineStaza = godineStazaP;
		plata = plataP;
		setGodineStaza(godineStazaP);
		setPlata(plataP);    //zato sto za ovo dvoje imamo if pa se za njih vrsi provjera
	}

	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public int getGodineStaza() {
		return godineStaza;
	}
	public void setGodineStaza(int godineStazaP) {
		if (godineStazaP >= 0) {
			this.godineStaza = godineStazaP;
		}else {
			 System.out.println("Greska: godine staza ne mogu biti negativne!");
	    }	
	}
	
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plataP) {
		if(plataP > 0) {
			this.plata = plataP;
		}else {
			 System.out.println("Greska: plata mora biti veca od 0!");
		}
	}

	public String toString() {
		return "Zaposleni [ime=" + ime + ", prezime=" + prezime + ", godineStaza=" + godineStaza + "]";
	}
	
	public void provjeraPlate() {
		if (plata < 800 && godineStaza > 10) {
			plata = plata * 1.06;
			 System.out.println("Plata zaposlenog" + ime + " " + prezime+" je uvecana za 6%% i sada iznosi" + plata);
		}else {
			 System.out.println("Plata zaposlenog " + ime + " " + prezime + " se ne mijenja.");
		}
		
	}
	
	
	
	
	

}
