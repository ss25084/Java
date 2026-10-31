package zadatak1;

public class RentACar {
	private String registracija;
	private String marka;
	private int godinaProizvodnje;
	private int brojSjedista;
	private boolean klima;
	private boolean automatik;
	
	public static double osnovnaCijena;
	
	public RentACar(String registracija, String marka, int godinaProizvodnje, int brojSjedista, boolean klima,
			boolean automatik) {
		this.registracija = registracija;
		this.marka = marka;
		setGodinaProizvodnje(godinaProizvodnje);
		this.brojSjedista = brojSjedista;
		this.klima = klima;
		this.automatik = automatik;
	}

	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		if (godinaProizvodnje >= 2000 && godinaProizvodnje <=2026) {
			this.godinaProizvodnje = godinaProizvodnje;
		}else {
			this.godinaProizvodnje = 2000;
		}
		
	}

	public int getBrojSjedista() {
		return brojSjedista;
	}

	public void setBrojSjedista(int brojSjedista) {
		this.brojSjedista = brojSjedista;
	}

	public boolean isKlima() {
		return klima;
	}

	public void setKlima(boolean klima) {
		this.klima = klima;
	}

	public boolean isAutomatik() {
		return automatik;
	}

	public void setAutomatik(boolean automatik) {
		this.automatik = automatik;
	}

	public static double getOsnovnaCijena() {
		return osnovnaCijena;
	}

	public static void setOsnovnaCijena(double osnovnaCijena) {
		RentACar.osnovnaCijena = osnovnaCijena;
	}
	
	public int starostAuta() {
		int starost = 2026 - godinaProizvodnje;
		return starost;
	}
	
	public double izracunajCijenu() {
		double cijena = osnovnaCijena + brojSjedista * 3;
		if(klima) {
			cijena+=5;
		}if(automatik) {
			cijena+=10;
		}
		return cijena;
	}
	

	public String infoOAutomobilu() {
		return "Rent a car [Registracija = " + registracija + ", Marka = " + marka + ", Starost auta = "
				+ starostAuta() + ", Broj sjedista = " + brojSjedista + ", Klima=" + klima + ", Automatik = " + automatik
				+ "]";
	}

	@Override
	public String toString() {
		return "Rent a car [Registracija = " + registracija + ", Marka = " + marka + ", Starost auta = "
				+ starostAuta() + ", Broj sjedista = " + brojSjedista + ", Klima=" + klima + ", Automatik = " + automatik
				+ "]";
	}
	
	
	

}
