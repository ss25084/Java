package prvaGrupa;

public class Zadatak2 {
	public static String dajPodatke(String ulaz) {
		String izlaz = "";
		
		int indexS = ulaz.indexOf('s');
		double brzina = Double.parseDouble(ulaz.substring(indexS + 1 , indexS + 4));
		brzina /= 3.6;
		brzina = Math.round(brzina * 10.0) / 10.0;
		izlaz += "{'brzina': " + brzina + ",'napon': ";
		
		int indexV = ulaz.indexOf('v');
		double napon = Double.parseDouble(ulaz.substring(indexV + 1 , indexV + 4));
		napon /= 10;
		izlaz += napon + ",'gorivo': ";
		
		int indexF = ulaz.indexOf('f');
		int gorivo = Integer.parseInt(ulaz.substring(indexF + 1 , indexF + 4));
		izlaz += gorivo + "}";
		
		return izlaz;
	}

	public static void main(String[] args) {
		String ulaz = "t090v128f045s072r2500*3B";
		System.out.println(dajPodatke(ulaz));
	}

}
