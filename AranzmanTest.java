package zadatak3;
import java.util.ArrayList;

public class AranzmanTest {

	public static void main(String[] args) {
		Aranzman.setCijenaPoDanu(40);
		
		ArrayList <Aranzman> putovanja = new ArrayList<>();
		putovanja.add(new Aranzman(301, "Rim", 4, 2, true, false));
		putovanja.add(new Aranzman(302, "Budva", 7, 4, false, true));
		putovanja.add(new Aranzman(303, "Antalija", 10, 2, true, true));
		putovanja.add(new Aranzman(304, "Beč", 3, 1, false, false));
		putovanja.add(new Aranzman(305, "Barselona", 8, 3, true, false));
		putovanja.add(new Aranzman(306, "Hurgada", 14, 2, true, true));
		
		System.out.println("Svi aranazmani: ");
		for(int i = 0; i < putovanja.size(); i++) {
			System.out.println(putovanja.get(i).infoOAranzmanu());
		}
		
		System.out.println("Duzi od 7 dana: ");
		for(int i = 0; i < putovanja.size(); i++) {
			if(putovanja.get(i).getBrojDana() > 7) {
				System.out.println(putovanja.get(i).infoOAranzmanu());
			}
		}
		
		double ukupnaVrijednostAranzmana = 0;
		System.out.print("Ukupna vrijednost svih aranzmana: ");
		for(int i = 0; i < putovanja.size(); i++) {
			ukupnaVrijednostAranzmana += putovanja.get(i).izracunajCijenu();
		}System.out.println(ukupnaVrijednostAranzmana);
		
		Aranzman najjeftiniji = putovanja.get(0);
		System.out.print("Najjeftiniji aranzman: ");
		for(int i = 1; i < putovanja.size(); i++) {
			if(putovanja.get(i).izracunajCijenu() < najjeftiniji.izracunajCijenu()) {
				najjeftiniji = putovanja.get(i);
			}
		}System.out.println(najjeftiniji.infoOAranzmanu());
		
		int kolikoAll = 0;
		System.out.print("Aranzmani sa allinclusive: ");
		for(int i = 1; i < putovanja.size(); i++) {
			if(putovanja.get(i).isAllinclusive()) {
			  kolikoAll++;
			}
		}System.out.println(kolikoAll);
		
		
		
		

		
		

	}

}
