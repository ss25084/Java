package zadatak1;
import java.util.Scanner;
import java.util.ArrayList;

public class RentACarTest {

	public static void main(String[] args) {
		RentACar.setOsnovnaCijena(20);
		 
	 ArrayList <RentACar> automobili = new ArrayList<>();
	 automobili.add(new RentACar("PG-123-AB", "Volkswagen", 2018, 5, true, false));
	 automobili.add(new RentACar("PG-456-CD", "Toyota", 2022, 5, true, true));
	 automobili.add(new RentACar("BD-789-EF", "Škoda", 2015, 5, false, false));
	 automobili.add(new RentACar("NK-111-GH", "Mercedes", 2024, 7, true, true));
	 automobili.add(new RentACar("BP-222-IJ", "Fiat", 1995, 4, false, false));
	 
	 System.out.println("Svi automobili: ");
	 for(int i = 0; i < automobili.size(); i++) {
		 System.out.println(automobili.get(i).infoOAutomobilu());
	 }
	 
	 System.out.println("Auta automatik: ");
	 for(int i = 0; i < automobili.size(); i++) {
		 if(automobili.get(i).isAutomatik()) {
			 System.out.println(automobili.get(i).infoOAutomobilu());
		 }
	 }
	 
	 System.out.println("Auta proizvedena nakon 2020: ");
	 for(int i = 0; i < automobili.size(); i++) {
		 if(automobili.get(i).getGodinaProizvodnje() > 2020) {
			 System.out.println(automobili.get(i).infoOAutomobilu());
			 System.out.println(automobili.get(i));
		 }
	 }
	 
	 
	 double ukupnaZarada = 0;
	 System.out.print("Ukupna zarada: ");
	 for(int i = 0; i < automobili.size(); i++) {
		 ukupnaZarada += automobili.get(i).izracunajCijenu();
	 }
	 System.out.println(ukupnaZarada);
	 
	 
	 System.out.print("Najskuplje auto za iznajmljivanje: ");
	 RentACar najskuplje = automobili.get(0);
	 for(int i = 1; i < automobili.size(); i++) {
		 if(automobili.get(i).izracunajCijenu() > najskuplje.izracunajCijenu()) {
			 najskuplje = automobili.get(i);
		 }
	 }System.out.println(najskuplje);
	 
	 
	 
		 
	 
		 
		 

	}

}
