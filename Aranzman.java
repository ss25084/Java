package zadatak3;

public class Aranzman {
	private int sifra;
	private String destinacija;
	private int brojDana;
	private int brojOsoba;
	private boolean avion;
	private boolean allinclusive;
	
	public static double cijenaPoDanu;
	

	public Aranzman(int sifra, String destinacija, int brojDana, int brojOsoba, boolean avion, boolean allinclusive) {
		setSifra(sifra);
		this.destinacija = destinacija;
		setBrojDana(brojDana);
		setBrojOsoba(brojOsoba);
		this.avion = avion;
		this.allinclusive = allinclusive;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if(sifra >= 100 && sifra <=999) {
			this.sifra = sifra;
		}else {
			this.sifra = 100;
		}
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public int getBrojDana() {
		return brojDana;
	}

	public void setBrojDana(int brojDana) {
		if(brojDana >= 1 && brojDana <= 30) {
			this.brojDana = brojDana;
		}else {
			this.brojDana = 1;
		}
	}

	public int getBrojOsoba() {
		return brojOsoba;
	}

	public void setBrojOsoba(int brojOsoba) {
		if(brojOsoba > 0) {
			this.brojOsoba = brojOsoba;
		}else {
			this.brojOsoba = 1;		}
	}

	public boolean isAvion() {
		return avion;
	}

	public void setAvion(boolean avion) {
		this.avion = avion;
	}

	public boolean isAllinclusive() {
		return allinclusive;
	}

	public void setAllinclusive(boolean allinclusive) {
		this.allinclusive = allinclusive;
	}

	public static double getCijenaPoDanu() {
		return cijenaPoDanu;
	}

	public static void setCijenaPoDanu(double cijenaPoDanu) {
		Aranzman.cijenaPoDanu = cijenaPoDanu;
	}
	
	public double izracunajCijenu() {
		double cijena = brojDana * cijenaPoDanu * brojOsoba;
		if(avion) {
			cijena += 100 * brojOsoba;
		}if (allinclusive) {
			cijena += 20 * brojOsoba * brojDana;
		}
		return cijena;
	}
	
	public String dajTipPutovanja() {
		if(brojDana <= 5) {
			return "Kratko putovanje";
		}else {
			return "Dugo putovanje";
		}
	}

	public String infoOAranzmanu() {
		return "Aranzman [Sifra=" + sifra + ", Destinacija=" + destinacija + ", Broj Dana=" + brojDana + ", Broj osoba="
				+ brojOsoba + ", avion=" + avion + ", allinclusive=" + allinclusive + "]";
	}
	
	
	
	
	
	

}
