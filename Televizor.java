package TatineVjezbe;

public class Televizor {
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	
	public Televizor() {
		brojKanala = 1;
		nazivKanala = "Nepoznato";
		jacinaTona = 0;
	}
	
	
	public String toString() {
		return "Televizor [brojKanala=" + brojKanala + ", nazivKanala=" + nazivKanala + ", jacinaTona=" + jacinaTona
				+ "]";
	}


	public Televizor(int brojKanalaP, String nazivKanalaP, int jacinaTonaP) {
		brojKanala = 1;
		jacinaTona = 0;
		setBrojKanala(brojKanalaP);
		setNazivKanala(nazivKanalaP);
		setJacinaTona(jacinaTonaP);
	}
	
	public int getBrojKanala() {
		return brojKanala;
	}
	public void setBrojKanala(int brojKanalaP) {
		if (brojKanalaP >= 1) {
			this.brojKanala = brojKanalaP;
		}else {
			System.out.println("Greska");
		}
	}
	
	public String getNazivKanala() {
		return nazivKanala;
	}
	public void setNazivKanala(String nazivKanalaP) {
		this.nazivKanala = nazivKanalaP;
	}
	
	public int getJacinaTona() {
		return jacinaTona;
	}
	public void setJacinaTona(int jacinaTonaP) {
		if(jacinaTonaP >= 0 && jacinaTonaP <= 10) {
			this.jacinaTona = jacinaTonaP;
		}else {
			System.out.println("Greska");
		}
	}
	
	public void pojacajTon() {
		if(jacinaTona < 10) {
			jacinaTona++;
		}else {
			System.out.println("Ton je na maksimumu");
		}
	}
	
	public void ispisi() {
		System.out.println("Broj kanala: " + brojKanala);
		System.out.println("Naziv kanala: " + nazivKanala);
		System.out.println("Jacina tona: " + jacinaTona);
	}
	
	
	
	
	
	

}
