package zadatak2;

public class Biblioteka {
	private int sifra;
	private String naziv;
	private String autor;
	private int brojStranica;
	private int godinaIzdanja;
	private boolean dostupna;
	
	public static double cijenaPoStranici;
	
	public Biblioteka(int sifra, String naziv, String autor, int brojStranica, int godinaIzdanja, boolean dostupna) {
		setSifra(sifra);
		this.naziv = naziv;
		this.autor = autor;
		setBrojStranica(brojStranica);
		this.godinaIzdanja = godinaIzdanja;
		this.dostupna = dostupna;
	}
	
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra >= 1000 && sifra <= 9999) {
			this.sifra = sifra;
		}else {
			this.sifra = 0;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getBrojStranica() {
		return brojStranica;
	}

	public void setBrojStranica(int brojStranica) {
		if(brojStranica > 0) {
			this.brojStranica = brojStranica;
		}else {
			this.brojStranica = 1;
		}
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public boolean isDostupna() {
		return dostupna;
	}

	public void setDostupna(boolean dostupna) {
		this.dostupna = dostupna;
	}

	public static double getCijenaPoStranici() {
		return cijenaPoStranici;
	}

	public static void setCijenaPoStranici(double cijenaPoStranici) {
		Biblioteka.cijenaPoStranici = cijenaPoStranici;
	}
	
	public int dajStarost() {
		int starost = 2026 - godinaIzdanja;
		return starost;
	}
	
	public double izracunajCijenu() {
		double cijena = brojStranica * cijenaPoStranici;
		if(godinaIzdanja < 2010) {
			cijena = cijena * 0.80;
		}
		return cijena;
	}

	public String infoOKnjizi()  {
		return "Biblioteka [Sifra = " + sifra + ", Naziv = " + naziv + ", Autor = " + autor + ", Broj stranica = " + brojStranica
				+ ", Starost knjige=" + dajStarost() + ", Dostupna = " + dostupna + "]";
	}
	
	
	

}
