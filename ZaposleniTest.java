package TatineVjezbe;
import java.util.Scanner;

public class ZaposleniTest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		 Zaposleni z1 = new Zaposleni("Marko", "Markovic", 12, 750);
		 Zaposleni z2 = new Zaposleni("Ana", "Bikaj", 5, 700);
		 
		 Zaposleni z3 = new Zaposleni();
		 System.out.println("Unesi ime, prezime, godine staza i platu treceg zaposlenog: ");
		 z3.setIme(unos.next());
		 z3.setPrezime(unos.next());
		 z3.setGodineStaza(unos.nextInt());
		 z3.setPlata(unos.nextDouble());
		 
		System.out.println(z1.toString()); 
		System.out.println(z2.toString()); 
		System.out.println(z3.toString()); 
		
		 z2.setGodineStaza(11);
		 z2.setPlata(750);
		 System.out.println("Nakon izmjene: " + z2.getIme() + " ima " + z2.getGodineStaza()
		 + " godina staza i platu " + z2.getPlata());
		 
		 z2.provjeraPlate();
		 unos.close();
		 
	}

}
